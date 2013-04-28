/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.someexamples.generated;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public class My_Choice {

	public byte[] code = null;
	public My_Choice2 my_choice2 = null;

	public BerBoolean myboolean = null;

	public My_Choice() {
	}

	public My_Choice(byte[] code) {
		this.code = code;
	}

	public My_Choice(My_Choice2 my_choice2, BerBoolean myboolean) {
		this.my_choice2 = my_choice2;
		this.myboolean = myboolean;
	}

	public int encode(BerByteArrayOutputStream berOStream, boolean explicit) throws IOException {
		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				berOStream.write(code[i]);
			}
			return code.length;

		}
		int codeLength = 0;
		if (myboolean != null) {
			codeLength += myboolean.encode(berOStream, true);
			return codeLength;

		}
		
		if (my_choice2 != null) {
			codeLength += my_choice2.encode(berOStream, true);
			return codeLength;

		}
		
		throw new IOException("Error encoding BerChoice: No item in choice was selected.");
	}

	public int decode(InputStream iStream, BerIdentifier berIdentifier) throws IOException {
		int codeLength = 0;
		int choiceDecodeLength = 0;
		BerIdentifier passedIdentifier = berIdentifier;
		if (berIdentifier == null) {
			berIdentifier = new BerIdentifier();
			codeLength += berIdentifier.decode(iStream);
		}
		my_choice2 = new My_Choice2();
		choiceDecodeLength = my_choice2.decode(iStream, berIdentifier);
		if (choiceDecodeLength != 0) {
			codeLength += choiceDecodeLength;
			return codeLength;
		}
		else {
			my_choice2 = null;
		}

		if (berIdentifier.equals(BerBoolean.identifier)) {
			myboolean = new BerBoolean();
			codeLength += myboolean.decode(iStream, false);
			return codeLength;
		}

		if (passedIdentifier != null) {
			return 0;
		}
		throw new IOException("Error decoding BerChoice: Identifier matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream berOStream = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(berOStream, false);
		code = berOStream.getArray();
	}
}

