package main.java.bindings.bit64;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import main.java.bindings.bit64.GS16AO64_eDriver_C_64Library.U32;
import main.java.bindings.bit64.GS16AO64_eDriver_C_64Library.U64;
/**
 * <i>native declaration : lib/66-16AO64/AO64eintface.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GS_NOTIFY_OBJECT extends Structure {
	/**
	 * Magic number to determine validity<br>
	 * C type : U32
	 */
	public U32 IsValidTag;
	/**
	 * -- INTERNAL -- Wait object used by the driver<br>
	 * C type : U64
	 */
	public U64 pWaitObject;
	/**
	 * User event handle (HANDLE can be 32 or 64 bit)<br>
	 * C type : U64
	 */
	public U64 hEvent;
	public GS_NOTIFY_OBJECT() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("IsValidTag", "pWaitObject", "hEvent");
	}
	/**
	 * @param IsValidTag Magic number to determine validity<br>
	 * C type : U32<br>
	 * @param pWaitObject -- INTERNAL -- Wait object used by the driver<br>
	 * C type : U64<br>
	 * @param hEvent User event handle (HANDLE can be 32 or 64 bit)<br>
	 * C type : U64
	 */
	public GS_NOTIFY_OBJECT(U32 IsValidTag, U64 pWaitObject, U64 hEvent) {
		super();
		this.IsValidTag = IsValidTag;
		this.pWaitObject = pWaitObject;
		this.hEvent = hEvent;
	}
	public GS_NOTIFY_OBJECT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends GS_NOTIFY_OBJECT implements Structure.ByReference {
		
	};
	public static class ByValue extends GS_NOTIFY_OBJECT implements Structure.ByValue {
		
	};
}