package androidx.media3.exoplayer.p138b;

import com.google.common.p4575r.C60757n;

/* renamed from: androidx.media3.exoplayer.b.an */
/* compiled from: PG */
public final class C2797an implements C2786ac {
    protected C2797an() {
    }

    /* renamed from: a */
    protected static int m7678a(int i, int i2, int i3) {
        return C60757n.m92740a(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* renamed from: b */
    protected static int m7679b(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
