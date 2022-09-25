package androidx.media3.exoplayer.video.p153a;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2608ag;
import androidx.media3.exoplayer.video.C3301h;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.media3.exoplayer.video.a.m */
/* compiled from: PG */
public final class C3288m implements C3301h, C3276a {

    /* renamed from: a */
    public final AtomicBoolean f9879a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f9880b = new AtomicBoolean(true);

    /* renamed from: c */
    public final C3286k f9881c = new C3286k();

    /* renamed from: d */
    public final C3278c f9882d = new C3278c();

    /* renamed from: e */
    public final C2608ag f9883e = new C2608ag((byte[]) null);

    /* renamed from: f */
    public final C2608ag f9884f = new C2608ag((byte[]) null);

    /* renamed from: g */
    public final float[] f9885g = new float[16];

    /* renamed from: h */
    public final float[] f9886h = new float[16];

    /* renamed from: i */
    public int f9887i;

    /* renamed from: j */
    public SurfaceTexture f9888j;

    /* renamed from: k */
    private volatile int f9889k = 0;

    /* renamed from: l */
    private int f9890l = -1;

    /* renamed from: m */
    private byte[] f9891m;

    /* renamed from: a */
    public final void mo6580a(long j, float[] fArr) {
        this.f9882d.f9845c.mo6177e(j, fArr);
    }

    /* renamed from: b */
    public final void mo6581b() {
        this.f9883e.mo6178f();
        C3278c cVar = this.f9882d;
        cVar.f9845c.mo6178f();
        cVar.f9846d = false;
        this.f9880b.set(true);
    }

    /* renamed from: c */
    public final void mo6582c(long j, long j2, C2680x xVar, MediaFormat mediaFormat) {
        int i;
        float f;
        float f2;
        int i2;
        C2680x xVar2 = xVar;
        this.f9883e.mo6177e(j2, Long.valueOf(j));
        byte[] bArr = xVar2.f7506x;
        int i3 = xVar2.f7507y;
        byte[] bArr2 = this.f9891m;
        int i4 = this.f9890l;
        this.f9891m = bArr;
        if (i3 == -1) {
            i3 = 0;
        }
        this.f9890l = i3;
        if (i4 != i3 || !Arrays.equals(bArr2, this.f9891m)) {
            byte[] bArr3 = this.f9891m;
            C3283h a = bArr3 != null ? C3284i.m9534a(bArr3, this.f9890l) : null;
            if (a == null || !C3286k.m9537a(a)) {
                int i5 = this.f9890l;
                float radians = (float) Math.toRadians(180.0d);
                float radians2 = (float) Math.toRadians(360.0d);
                float f3 = radians / 36.0f;
                float f4 = radians2 / 72.0f;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < 36; i8 = i) {
                    float f5 = radians / 2.0f;
                    i = i8 + 1;
                    float f6 = (((float) i) * f3) - f5;
                    float f7 = (((float) i8) * f3) - f5;
                    int i9 = i6;
                    int i10 = 0;
                    while (i10 < 73) {
                        int i11 = i;
                        int i12 = 0;
                        while (i12 < 2) {
                            if (1 != i12) {
                                f2 = f7;
                                f = f6;
                            } else {
                                f2 = f6;
                                f = f2;
                            }
                            float f8 = ((float) i10) * f4;
                            int i13 = i7 + 1;
                            float f9 = f4;
                            double d = (double) ((f8 + 3.1415927f) - (radians2 / 2.0f));
                            int i14 = i10;
                            double d2 = (double) f2;
                            int i15 = i5;
                            float f10 = radians;
                            fArr[i7] = -((float) (Math.sin(d) * 50.0d * Math.cos(d2)));
                            int i16 = i13 + 1;
                            int i17 = i15;
                            fArr[i13] = (float) (Math.sin(d2) * 50.0d);
                            i7 = i16 + 1;
                            fArr[i16] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                            int i18 = i9 + 1;
                            fArr2[i9] = f8 / radians2;
                            int i19 = i18 + 1;
                            fArr2[i18] = (((float) (i8 + i12)) * f3) / f10;
                            if (i14 == 0) {
                                i2 = i14;
                                if (i12 != 0) {
                                    i9 = i19;
                                    i12++;
                                    f4 = f9;
                                    long j3 = j2;
                                    i10 = i2;
                                    i5 = i17;
                                    f6 = f;
                                    radians = f10;
                                }
                            } else {
                                i2 = i14;
                                if (i2 == 72) {
                                    if (i12 != 1) {
                                    }
                                }
                                i9 = i19;
                                i12++;
                                f4 = f9;
                                long j32 = j2;
                                i10 = i2;
                                i5 = i17;
                                f6 = f;
                                radians = f10;
                            }
                            System.arraycopy(fArr, i7 - 3, fArr, i7, 3);
                            i7 += 3;
                            System.arraycopy(fArr2, i19 - 2, fArr2, i19, 2);
                            i19 += 2;
                            i9 = i19;
                            i12++;
                            f4 = f9;
                            long j322 = j2;
                            i10 = i2;
                            i5 = i17;
                            f6 = f;
                            radians = f10;
                        }
                        float f11 = f4;
                        float f12 = f6;
                        i10++;
                        long j4 = j2;
                        i5 = i5;
                        i = i11;
                        radians = radians;
                    }
                    long j5 = j2;
                    i6 = i9;
                }
                C3281f fVar = new C3281f(new C3282g(0, fArr, fArr2, 1));
                a = new C3283h(fVar, fVar, i5);
            }
            this.f9884f.mo6177e(j2, a);
        }
    }
}
