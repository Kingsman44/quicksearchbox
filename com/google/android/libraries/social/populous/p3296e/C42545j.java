package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.C42279be;
import com.google.android.libraries.social.populous.core.C42284bj;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42436o;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.e.j */
/* compiled from: PG */
final class C42545j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42549n f111586a;

    /* renamed from: b */
    final /* synthetic */ C42279be f111587b;

    /* renamed from: c */
    final /* synthetic */ C42554s f111588c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f111589d;

    /* renamed from: e */
    final /* synthetic */ C42547l f111590e;

    public C42545j(C42547l lVar, C42549n nVar, C42279be beVar, C42554s sVar, C60870cx cxVar) {
        this.f111590e = lVar;
        this.f111586a = nVar;
        this.f111587b = beVar;
        this.f111588c = sVar;
        this.f111589d = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (C69314v.m100612c()) {
            C42279be beVar = this.f111587b;
            C42550o oVar = new C42550o();
            oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            oVar.f111626e = C42284bj.m74440a(th);
            oVar.f111627f = this.f111588c.mo45373d();
            ((C42436o) beVar).f111346a.mo45489b(oVar.mo45556a());
        } else if (!this.f111589d.isCancelled() && !(th instanceof CancellationException)) {
            C42279be beVar2 = this.f111587b;
            C42550o oVar2 = new C42550o();
            oVar2.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            oVar2.f111626e = C42284bj.m74440a(th);
            oVar2.f111627f = this.f111588c.mo45373d();
            ((C42436o) beVar2).f111346a.mo45489b(oVar2.mo45556a());
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        ((C42436o) this.f111587b).f111346a.mo45489b(this.f111590e.mo45551d((C42551p) obj, this.f111586a));
    }
}
