package com.google.android.libraries.p10982ad;

import android.animation.TimeAnimator;
import android.view.animation.AnimationUtils;

/* renamed from: com.google.android.libraries.ad.g */
/* compiled from: PG */
public abstract class C147443g {

    /* renamed from: a */
    public final C147452p f397995a = new C147452p();

    /* renamed from: b */
    public C147454r f397996b = new C147454r(500.0f, 1.0f);

    /* renamed from: c */
    public final C147448l f397997c = new C147448l(this.f397996b);

    /* renamed from: d */
    public float f397998d = -3.4028235E38f;

    /* renamed from: e */
    public float f397999e = Float.MAX_VALUE;

    /* renamed from: f */
    public boolean f398000f = true;

    /* renamed from: g */
    public long f398001g;

    /* renamed from: h */
    public int f398002h;

    /* renamed from: i */
    public int f398003i = 1;

    /* renamed from: j */
    private final TimeAnimator f398004j;

    /* renamed from: k */
    private final C147450n f398005k = new C147450n();

    public C147443g(TimeAnimator timeAnimator) {
        this.f398004j = timeAnimator;
        timeAnimator.setTimeListener(new C147437a(this));
    }

    /* renamed from: a */
    public final float mo124175a() {
        if (this.f398000f) {
            return mo124176b();
        }
        C147450n nVar = this.f398005k;
        long j = nVar.f398013b;
        long j2 = this.f398001g;
        if (j == j2) {
            return nVar.f398012a;
        }
        C147451o b = this.f397995a.mo124198b(j2);
        float a = b.f398015b + b.mo124190a(this.f398001g);
        C147450n nVar2 = this.f398005k;
        long j3 = this.f398001g;
        nVar2.f398012a = a;
        nVar2.f398013b = j3;
        return a;
    }

    /* renamed from: b */
    public final float mo124176b() {
        return this.f397995a.f398017a.f398015b;
    }

    /* renamed from: c */
    public abstract void mo124177c();

    /* renamed from: d */
    public final void mo124178d(boolean z) {
        if (this.f398000f != z) {
            this.f398000f = z;
            if (z) {
                this.f398004j.end();
            } else {
                this.f398004j.start();
            }
        }
    }

    /* renamed from: e */
    public final void mo124179e(float f) {
        new C147440d(this).mo124172b(f);
    }

    /* renamed from: g */
    public final boolean mo124181g() {
        return this.f398002h > 5;
    }

    /* renamed from: h */
    public final C147440d mo124182h(long j) {
        C147440d dVar = new C147440d(this);
        dVar.f397988a.f397985a = j;
        return dVar;
    }

    /* renamed from: i */
    public final C147440d mo124183i(float f) {
        C147440d dVar = new C147440d(this);
        dVar.f397988a.f397986b = Float.valueOf(f);
        return dVar;
    }

    /* renamed from: j */
    public final C147440d mo124184j(C147453q qVar) {
        C147440d dVar = new C147440d(this);
        dVar.f397988a.f397987c = qVar;
        return dVar;
    }

    /* renamed from: k */
    public final C147441e mo124185k(C147454r rVar) {
        return new C147440d(this).mo124173c(rVar);
    }

    /* renamed from: l */
    public final void mo124186l(float f) {
        this.f397995a.mo124199c(new C147447k(AnimationUtils.currentAnimationTimeMillis(), f));
        mo124178d(true);
        mo124177c();
    }

    /* renamed from: m */
    public final void mo124187m(float f, float f2) {
        this.f397998d = f;
        this.f397999e = f2;
        this.f398003i = 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124180f(long r10, com.google.android.libraries.p10982ad.C147442f r12) {
        /*
            r9 = this;
            com.google.android.libraries.ad.b r0 = r12.f397992a
            long r0 = r0.f397985a
            long r3 = r10 + r0
            float r10 = r12.f397994c
            int r11 = r9.f398003i
            int r0 = r11 + -1
            if (r11 == 0) goto L_0x005b
            r11 = 1
            if (r0 == r11) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            float r11 = r9.f397998d
            float r0 = r9.f397999e
            int r1 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x001c
            r5 = r11
            goto L_0x0023
        L_0x001c:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0022
            r5 = r0
            goto L_0x0023
        L_0x0022:
            r5 = r10
        L_0x0023:
            com.google.android.libraries.ad.p r10 = r9.f397995a
            com.google.android.libraries.ad.o r10 = r10.mo124197a(r3)
            float r11 = r10.f398015b
            float r0 = r10.mo124190a(r3)
            float r6 = r11 + r0
            float r10 = r10.mo124191b(r3)
            com.google.android.libraries.ad.b r11 = r12.f397992a
            java.lang.Float r11 = r11.f397986b
            if (r11 == 0) goto L_0x003f
            float r10 = r11.floatValue()
        L_0x003f:
            r7 = r10
            com.google.android.libraries.ad.r r10 = r9.f397996b
            com.google.android.libraries.ad.r r11 = r12.f397993b
            if (r11 == 0) goto L_0x0048
            r8 = r11
            goto L_0x0049
        L_0x0048:
            r8 = r10
        L_0x0049:
            com.google.android.libraries.ad.s r10 = new com.google.android.libraries.ad.s
            r2 = r10
            r2.<init>(r3, r5, r6, r7, r8)
            com.google.android.libraries.ad.b r11 = r12.f397992a
            com.google.android.libraries.ad.q r11 = r11.f397987c
            r10.f398016c = r11
            com.google.android.libraries.ad.p r11 = r9.f397995a
            r11.mo124199c(r10)
            return
        L_0x005b:
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10982ad.C147443g.mo124180f(long, com.google.android.libraries.ad.f):void");
    }
}
