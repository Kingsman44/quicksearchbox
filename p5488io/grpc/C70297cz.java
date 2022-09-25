package p5488io.grpc;

import com.google.common.base.C58838bb;
import com.google.common.base.C58880cq;
import com.google.common.base.C58913w;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* renamed from: io.grpc.cz */
/* compiled from: PG */
public abstract class C70297cz {

    /* renamed from: d */
    private static final BitSet f187369d;

    /* renamed from: a */
    public final String f187370a;

    /* renamed from: b */
    public final byte[] f187371b;

    /* renamed from: c */
    public final Object f187372c;

    /* renamed from: e */
    private final String f187373e;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        f187369d = bitSet;
    }

    public C70297cz(String str, boolean z, Object obj) {
        C58838bb.m90866a(str, "name");
        this.f187373e = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C58838bb.m90866a(lowerCase, "name");
        C58838bb.m90869d(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            C70334de.f187479a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (f187369d.get(charAt)) {
                i++;
            } else {
                throw new IllegalArgumentException(C58880cq.m90965a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f187370a = lowerCase;
        this.f187371b = lowerCase.getBytes(C58913w.f156752a);
        this.f187372c = obj;
    }

    /* renamed from: c */
    public static C70297cz m102495c(String str, C70293cv cvVar) {
        return new C70292cu(str, cvVar);
    }

    /* renamed from: d */
    public static C70297cz m102496d(String str, C70294cw cwVar) {
        return new C70330da(str, cwVar);
    }

    /* renamed from: e */
    static C70297cz m102497e(String str, boolean z, C70333dd ddVar) {
        return new C70332dc(str, z, ddVar);
    }

    /* renamed from: a */
    public abstract Object mo61979a(byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo61980b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f187370a.equals(((C70297cz) obj).f187370a);
    }

    /* renamed from: f */
    public boolean mo61983f() {
        return false;
    }

    public final int hashCode() {
        return this.f187370a.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.f187370a + "'}";
    }
}
