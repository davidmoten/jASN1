/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.someexamples.generated;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import java.io.UnsupportedEncodingException;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public class ImplUniversalString extends BerUniversalString {

	public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.APPLICATION_CLASS, BerIdentifier.PRIMITIVE, 3);

	public ImplUniversalString() {
		id = identifier;
	}

	public ImplUniversalString(byte[] octetString) {
		id = identifier;
		this.octetString = octetString;
	}

}
