package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.C42279be;
import com.google.android.libraries.social.populous.core.C42284bj;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42436o;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.e.k */
/* compiled from: PG */
final class C42546k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42549n f111591a;

    /* renamed from: b */
    final /* synthetic */ C42279be f111592b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f111593c;

    /* renamed from: d */
    final /* synthetic */ C42554s f111594d;

    /* renamed from: e */
    final /* synthetic */ C42547l f111595e;

    public C42546k(C42547l lVar, C42549n nVar, C42279be beVar, C60870cx cxVar, C42554s sVar) {
        this.f111595e = lVar;
        this.f111591a = nVar;
        this.f111592b = beVar;
        this.f111593c = cxVar;
        this.f111594d = sVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C42279be beVar = this.f111592b;
        C60870cx cxVar = this.f111593c;
        int d = this.f111594d.mo45373d();
        if (C69314v.m100612c()) {
            C42550o oVar = new C42550o();
            oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            oVar.f111626e = C42284bj.m74440a(th);
            oVar.f111627f = d;
            ((C42436o) beVar).f111346a.mo45489b(oVar.mo45556a());
        } else if (!cxVar.isCancelled() && !(th instanceof CancellationException)) {
            C42550o oVar2 = new C42550o();
            oVar2.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            oVar2.f111626e = C42284bj.m74440a(th);
            oVar2.f111627f = d;
            ((C42436o) beVar).f111346a.mo45489b(oVar2.mo45556a());
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        ((C42436o) this.f111592b).f111346a.mo45489b(this.f111595e.mo45551d((C42551p) obj, this.f111591a));
    }
}
