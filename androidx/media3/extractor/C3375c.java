package androidx.media3.extractor;

/* renamed from: androidx.media3.extractor.c */
/* compiled from: PG */
public final class C3375c {

    /* renamed from: a */
    public static final int[] f10200a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f10201b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f10202c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f10203d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f10204e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f10205f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m9762a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f10201b[i];
        if (i4 == 44100) {
            int i5 = f10205f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f10204e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
