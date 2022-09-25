package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afj */
/* compiled from: PG */
public final class afj {

    /* renamed from: a */
    private final WindowManager f20561a;

    /* renamed from: b */
    private final afi f20562b;

    /* renamed from: c */
    private final afh f20563c;

    /* renamed from: d */
    private long f20564d;

    /* renamed from: e */
    private long f20565e;

    /* renamed from: f */
    private long f20566f;

    /* renamed from: g */
    private long f20567g;

    /* renamed from: h */
    private long f20568h;

    /* renamed from: i */
    private boolean f20569i;

    /* renamed from: j */
    private long f20570j;

    /* renamed from: k */
    private long f20571k;

    /* renamed from: l */
    private long f20572l;

    public afj() {
        this((Context) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m18629e() {
        Display defaultDisplay = this.f20561a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f20564d = j;
            this.f20565e = (j * 80) / 100;
        }
    }

    /* renamed from: f */
    private final boolean m18630f(long j, long j2) {
        return Math.abs((j2 - this.f20570j) - (j - this.f20571k)) > 20000000;
    }

    /* renamed from: a */
    public final void mo14663a() {
        this.f20569i = false;
        if (this.f20561a != null) {
            this.f20562b.mo14659b();
            afh afh = this.f20563c;
            if (afh != null) {
                afh.mo14654a();
            }
            m18629e();
        }
    }

    /* renamed from: b */
    public final void mo14664b() {
        if (this.f20561a != null) {
            afh afh = this.f20563c;
            if (afh != null) {
                afh.mo14655b();
            }
            this.f20562b.mo14660c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo14665c(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f20569i
            if (r2 == 0) goto L_0x0042
            long r2 = r10.f20566f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.f20572l
            r4 = 1
            long r2 = r2 + r4
            r10.f20572l = r2
            long r2 = r10.f20568h
            r10.f20567g = r2
        L_0x0019:
            long r2 = r10.f20572l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.f20571k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f20567g
            long r2 = r2 + r4
            boolean r4 = r10.m18630f(r2, r13)
            if (r4 == 0) goto L_0x0033
            r10.f20569i = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r10.f20570j
            long r4 = r4 + r2
            long r6 = r10.f20571k
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r10.m18630f(r0, r13)
            if (r2 == 0) goto L_0x0042
            r10.f20569i = r6
        L_0x0042:
            r4 = r13
            r2 = r0
        L_0x0044:
            boolean r6 = r10.f20569i
            if (r6 != 0) goto L_0x0053
            r10.f20571k = r0
            r10.f20570j = r13
            r13 = 0
            r10.f20572l = r13
            r13 = 1
            r10.f20569i = r13
        L_0x0053:
            r10.f20566f = r11
            r10.f20568h = r2
            com.google.ads.interactivemedia.v3.internal.afi r11 = r10.f20562b
            if (r11 == 0) goto L_0x008e
            long r12 = r10.f20564d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0067
            goto L_0x008e
        L_0x0067:
            long r11 = r11.f20556a
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r13 = r10.f20564d
            long r0 = r4 - r11
            long r0 = r0 / r13
            long r0 = r0 * r13
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x007d
            long r13 = r11 - r13
            goto L_0x0081
        L_0x007d:
            long r13 = r13 + r11
            r8 = r11
            r11 = r13
            r13 = r8
        L_0x0081:
            long r0 = r11 - r4
            long r4 = r4 - r13
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r11 = r13
        L_0x008a:
            long r13 = r10.f20565e
            long r11 = r11 - r13
            return r11
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.afj.mo14665c(long, long):long");
    }

    public afj(Context context) {
        DisplayManager displayManager;
        afh afh = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f20561a = (WindowManager) context.getSystemService("window");
        } else {
            this.f20561a = null;
        }
        if (this.f20561a != null) {
            if (aeu.f20466a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                afh = new afh(this, displayManager);
            }
            this.f20563c = afh;
            this.f20562b = afi.m18625a();
        } else {
            this.f20563c = null;
            this.f20562b = null;
        }
        this.f20564d = -9223372036854775807L;
        this.f20565e = -9223372036854775807L;
    }
}
