package androidx.media3.exoplayer.p152l;

/* renamed from: androidx.media3.exoplayer.l.c */
/* compiled from: PG */
public final class C3264c {

    /* renamed from: a */
    public static final Object f9799a = new Object();

    /* renamed from: b */
    public static final Object f9800b = new Object();

    /* renamed from: c */
    public static boolean f9801c;

    /* renamed from: d */
    public static long f9802d;

    /* renamed from: a */
    public static long m9496a(byte[] bArr, int i) {
        long c = m9498c(bArr, i);
        long c2 = m9498c(bArr, i + 4);
        if (c == 0) {
            if (c2 == 0) {
                return 0;
            }
            c = 0;
        }
        return ((c - 2208988800L) * 1000) + ((c2 * 1000) / 4294967296L);
    }

    /* renamed from: b */
    public static boolean m9497b() {
        boolean z;
        synchronized (f9800b) {
            z = f9801c;
        }
        return z;
    }

    /* renamed from: c */
    private static long m9498c(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }
}
