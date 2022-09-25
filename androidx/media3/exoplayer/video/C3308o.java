package androidx.media3.exoplayer.video;

import android.view.Display;
import android.view.Surface;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.video.o */
/* compiled from: PG */
public final class C3308o {

    /* renamed from: a */
    public final C3295b f9981a = new C3295b();

    /* renamed from: b */
    public final C3304k f9982b;

    /* renamed from: c */
    public final C3307n f9983c;

    /* renamed from: d */
    public boolean f9984d;

    /* renamed from: e */
    public Surface f9985e;

    /* renamed from: f */
    public float f9986f;

    /* renamed from: g */
    public float f9987g;

    /* renamed from: h */
    public int f9988h;

    /* renamed from: i */
    public long f9989i;

    /* renamed from: j */
    public long f9990j;

    /* renamed from: k */
    public long f9991k;

    /* renamed from: l */
    public long f9992l;

    /* renamed from: m */
    public long f9993m;

    /* renamed from: n */
    public long f9994n;

    /* renamed from: o */
    public long f9995o;

    /* renamed from: p */
    private float f9996p;

    /* renamed from: q */
    private float f9997q;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3308o(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            androidx.media3.exoplayer.video.b r0 = new androidx.media3.exoplayer.video.b
            r0.<init>()
            r3.f9981a = r0
            r0 = 0
            if (r4 == 0) goto L_0x0038
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            int r1 = androidx.media3.exoplayer.video.C3306m.f9972a
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L_0x0025
            androidx.media3.exoplayer.video.m r2 = new androidx.media3.exoplayer.video.m
            r2.<init>(r1)
            goto L_0x0026
        L_0x0025:
            r2 = r0
        L_0x0026:
            if (r2 != 0) goto L_0x0039
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L_0x0038
            androidx.media3.exoplayer.video.l r2 = new androidx.media3.exoplayer.video.l
            r2.<init>(r4)
            goto L_0x0039
        L_0x0038:
            r2 = r0
        L_0x0039:
            r3.f9982b = r2
            if (r2 == 0) goto L_0x003f
            androidx.media3.exoplayer.video.n r0 = androidx.media3.exoplayer.video.C3307n.f9975a
        L_0x003f:
            r3.f9983c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f9989i = r0
            r3.f9990j = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f9986f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f9987g = r4
            r4 = 0
            r3.f9988h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3308o.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo7293a() {
        Surface surface;
        if (C2612ak.f7249a >= 30 && (surface = this.f9985e) != null && this.f9988h != Integer.MIN_VALUE && this.f9997q != 0.0f) {
            this.f9997q = 0.0f;
            C3303j.m9593a(surface, 0.0f);
        }
    }

    /* renamed from: b */
    public final void mo7294b() {
        this.f9991k = 0;
        this.f9994n = -1;
        this.f9992l = -1;
    }

    /* renamed from: c */
    public final void mo7295c(Display display) {
        if (display != null) {
            double refreshRate = (double) display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f9989i = j;
            this.f9990j = (j * 80) / 100;
            return;
        }
        C2633u.m7050e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f9989i = -9223372036854775807L;
        this.f9990j = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (java.lang.Math.abs(r0 - r10.f9996p) >= r2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r10.f9981a.f9928e >= 30) goto L_0x008f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7296d() {
        /*
            r10 = this;
            int r0 = androidx.media3.common.p136b.C2612ak.f7249a
            r1 = 30
            if (r0 < r1) goto L_0x0098
            android.view.Surface r0 = r10.f9985e
            if (r0 != 0) goto L_0x000c
            goto L_0x0098
        L_0x000c:
            androidx.media3.exoplayer.video.b r0 = r10.f9981a
            androidx.media3.exoplayer.video.a r0 = r0.f9924a
            boolean r0 = r0.mo7263d()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0037
            androidx.media3.exoplayer.video.b r0 = r10.f9981a
            androidx.media3.exoplayer.video.a r3 = r0.f9924a
            boolean r3 = r3.mo7263d()
            if (r3 == 0) goto L_0x0034
            androidx.media3.exoplayer.video.a r0 = r0.f9924a
            long r3 = r0.mo7260a()
            double r3 = (double) r3
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            java.lang.Double.isNaN(r3)
            double r5 = r5 / r3
            float r0 = (float) r5
            goto L_0x0039
        L_0x0034:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0039
        L_0x0037:
            float r0 = r10.f9986f
        L_0x0039:
            float r3 = r10.f9996p
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0040
            return
        L_0x0040:
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0083
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0083
            androidx.media3.exoplayer.video.b r1 = r10.f9981a
            androidx.media3.exoplayer.video.a r1 = r1.f9924a
            boolean r1 = r1.mo7263d()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0076
            androidx.media3.exoplayer.video.b r1 = r10.f9981a
            androidx.media3.exoplayer.video.a r3 = r1.f9924a
            boolean r3 = r3.mo7263d()
            if (r3 == 0) goto L_0x0065
            androidx.media3.exoplayer.video.a r1 = r1.f9924a
            long r6 = r1.f9831b
            goto L_0x006a
        L_0x0065:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006a:
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x0076
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x0076:
            float r1 = r10.f9996p
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x008e
            goto L_0x008f
        L_0x0083:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0093
            androidx.media3.exoplayer.video.b r2 = r10.f9981a
            int r2 = r2.f9928e
            if (r2 < r1) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            if (r4 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            return
        L_0x0093:
            r10.f9996p = r0
            r10.mo7297e(r5)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3308o.mo7296d():void");
    }

    /* renamed from: e */
    public final void mo7297e(boolean z) {
        Surface surface;
        if (C2612ak.f7249a >= 30 && (surface = this.f9985e) != null && this.f9988h != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f9984d) {
                float f2 = this.f9996p;
                if (f2 != -1.0f) {
                    f = this.f9987g * f2;
                }
            }
            if (z || this.f9997q != f) {
                this.f9997q = f;
                C3303j.m9593a(surface, f);
            }
        }
    }
}
