package androidx.media3.extractor.p161h;

import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.h.c */
/* compiled from: PG */
class C3416c {

    /* renamed from: d */
    public final int f10463d;

    public C3416c(int i) {
        this.f10463d = i;
    }

    /* renamed from: e */
    public static int m9893e(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    /* renamed from: f */
    public static String m9894f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return m9894f(this.f10463d);
    }
}
