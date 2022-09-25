package com.google.android.libraries.p10982ad;

import android.view.animation.AnimationUtils;

/* renamed from: com.google.android.libraries.ad.d */
/* compiled from: PG */
public final class C147440d {

    /* renamed from: a */
    public final C147438b f397988a = new C147438b();

    /* renamed from: b */
    final /* synthetic */ C147443g f397989b;

    public C147440d(C147443g gVar) {
        this.f397989b = gVar;
    }

    /* renamed from: a */
    public final void mo124171a() {
        C147443g gVar = this.f397989b;
        C147438b bVar = this.f397988a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = gVar.f398003i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                long j = currentAnimationTimeMillis + bVar.f397985a;
                float a = C147439c.m240363a(bVar);
                C147448l lVar = gVar.f397997c;
                C147451o a2 = gVar.f397995a.mo124197a(j);
                gVar.f397995a.mo124199c(new C147449m(j, a2.f398015b + a2.mo124190a(j), a, lVar));
            } else if (i2 == 1) {
                long j2 = currentAnimationTimeMillis + bVar.f397985a;
                float a3 = C147439c.m240363a(bVar);
                C147448l lVar2 = gVar.f397997c;
                C147451o a4 = gVar.f397995a.mo124197a(j2);
                float a5 = a4.mo124190a(j2) + a4.f398015b;
                C147449m mVar = new C147449m(j2, a5, a3, lVar2);
                float f = mVar.f398015b;
                float f2 = gVar.f397998d;
                if (a5 <= f2) {
                    C147442f fVar = new C147442f(bVar);
                    fVar.f397994c = f2;
                    if (a3 <= 0.0f) {
                        gVar.mo124180f(j2, fVar);
                    } else if (a5 < f2 && f < f2) {
                        gVar.mo124180f(j2, fVar);
                    }
                } else {
                    float f3 = gVar.f397999e;
                    if (a5 >= f3) {
                        C147442f fVar2 = new C147442f(bVar);
                        fVar2.f397994c = f3;
                        if (a3 >= 0.0f) {
                            gVar.mo124180f(j2, fVar2);
                        } else if (a5 > f3 && f > f3) {
                            gVar.mo124180f(j2, fVar2);
                        }
                    }
                }
                gVar.f397995a.mo124199c(mVar);
                float f4 = gVar.f397998d;
                if (f < f4) {
                    long c = mVar.mo124192c(f4);
                    float f5 = gVar.f397998d;
                    gVar.f397995a.mo124199c(new C147455s(c, f5, f5, mVar.mo124191b(c), gVar.f397996b));
                } else {
                    float f6 = gVar.f397999e;
                    if (f > f6) {
                        long c2 = mVar.mo124192c(f6);
                        float f7 = gVar.f397999e;
                        gVar.f397995a.mo124199c(new C147455s(c2, f7, f7, mVar.mo124191b(c2), gVar.f397996b));
                    }
                }
            }
            gVar.f397995a.f398017a.f398016c = bVar.f397987c;
            gVar.mo124178d(false);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo124172b(float f) {
        new C147441e(this.f397989b, this.f397988a).mo124174a(f);
    }

    /* renamed from: c */
    public final C147441e mo124173c(C147454r rVar) {
        C147441e eVar = new C147441e(this.f397989b, this.f397988a);
        eVar.f397990a.f397993b = rVar;
        return eVar;
    }
}
