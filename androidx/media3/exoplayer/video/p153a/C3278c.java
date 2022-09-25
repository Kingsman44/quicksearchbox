package androidx.media3.exoplayer.video.p153a;

import android.opengl.Matrix;
import androidx.media3.common.p136b.C2608ag;

/* renamed from: androidx.media3.exoplayer.video.a.c */
/* compiled from: PG */
public final class C3278c {

    /* renamed from: a */
    public final float[] f9843a = new float[16];

    /* renamed from: b */
    public final float[] f9844b = new float[16];

    /* renamed from: c */
    public final C2608ag f9845c = new C2608ag((byte[]) null);

    /* renamed from: d */
    public boolean f9846d;

    /* renamed from: a */
    public static void m9532a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
