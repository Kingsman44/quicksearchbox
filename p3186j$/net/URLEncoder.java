package p3186j$.net;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;
import p3186j$.sun.security.action.C40954a;
import p3186j$.util.Objects;

/* renamed from: j$.net.URLEncoder */
public class URLEncoder {

    /* renamed from: a */
    static BitSet f107228a = new BitSet(256);

    /* renamed from: b */
    static String f107229b;

    static {
        String str;
        for (int i = 97; i <= 122; i++) {
            f107228a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f107228a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f107228a.set(i3);
        }
        f107228a.set(32);
        f107228a.set(45);
        f107228a.set(95);
        f107228a.set(46);
        f107228a.set(42);
        if (System.getSecurityManager() == null) {
            str = System.getProperty("file.encoding");
        } else {
            str = (String) AccessController.doPrivileged(new C40954a());
        }
        f107229b = str;
    }

    /* renamed from: a */
    public static String m71109a(String str, Charset charset) {
        BitSet bitSet;
        int i;
        char charAt;
        Objects.requireNonNull(charset, "charset");
        StringBuilder sb = new StringBuilder(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i2 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            char charAt2 = str.charAt(i2);
            if (f107228a.get(charAt2)) {
                if (charAt2 == ' ') {
                    charAt2 = '+';
                    z = true;
                }
                sb.append((char) charAt2);
                i2++;
            } else {
                do {
                    charArrayWriter.write(charAt2);
                    if (charAt2 >= 55296 && charAt2 <= 56319 && (i = i2 + 1) < str.length() && (charAt = str.charAt(i)) >= 56320 && charAt <= 57343) {
                        charArrayWriter.write(charAt);
                        i2 = i;
                    }
                    i2++;
                    if (i2 >= str.length()) {
                        break;
                    }
                    bitSet = f107228a;
                    charAt2 = str.charAt(i2);
                } while (!bitSet.get(charAt2));
                charArrayWriter.flush();
                byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(charset);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    sb.append('%');
                    char forDigit = Character.forDigit((bytes[i3] >> 4) & 15, 16);
                    if (Character.isLetter(forDigit)) {
                        forDigit = (char) (forDigit - ' ');
                    }
                    sb.append(forDigit);
                    char forDigit2 = Character.forDigit(bytes[i3] & 15, 16);
                    if (Character.isLetter(forDigit2)) {
                        forDigit2 = (char) (forDigit2 - ' ');
                    }
                    sb.append(forDigit2);
                }
                charArrayWriter.reset();
                z = true;
            }
        }
        return z ? sb.toString() : str;
    }

    public static String encode(String str) {
        try {
            return encode(str, f107229b);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String encode(String str, String str2) {
        if (str2 != null) {
            try {
                return m71109a(str, Charset.forName(str2));
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                throw new UnsupportedEncodingException(str2);
            }
        } else {
            throw new NullPointerException("charsetName");
        }
    }
}
