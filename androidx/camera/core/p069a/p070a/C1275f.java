package androidx.camera.core.p069a.p070a;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: androidx.camera.core.a.a.f */
/* compiled from: PG */
final class C1275f {

    /* renamed from: a */
    static final Charset f3681a = StandardCharsets.US_ASCII;

    /* renamed from: b */
    static final String[] f3682b = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: c */
    static final int[] f3683c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: d */
    public final int f3684d;

    /* renamed from: e */
    public final int f3685e;

    /* renamed from: f */
    public final byte[] f3686f;

    public C1275f(int i, int i2, byte[] bArr) {
        this.f3684d = i;
        this.f3685e = i2;
        this.f3686f = bArr;
    }

    /* renamed from: b */
    public static C1275f m3448b(String str) {
        if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
            byte[] bytes = str.getBytes(f3681a);
            return new C1275f(1, bytes.length, bytes);
        }
        return new C1275f(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
    }

    /* renamed from: c */
    public static C1275f m3449c(String str) {
        byte[] bytes = (str + 0).getBytes(f3681a);
        return new C1275f(2, bytes.length, bytes);
    }

    /* renamed from: d */
    public static C1275f m3450d(long j, ByteOrder byteOrder) {
        return m3451e(new long[]{j}, byteOrder);
    }

    /* renamed from: e */
    public static C1275f m3451e(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f3683c[4] * r0)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C1275f(4, jArr.length, wrap.array());
    }

    /* renamed from: a */
    public final int mo4131a() {
        return f3683c[this.f3684d] * this.f3685e;
    }

    public final String toString() {
        return "(" + f3682b[this.f3684d] + ", data length:" + this.f3686f.length + ")";
    }
}
