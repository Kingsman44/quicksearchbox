package com.google.android.apps.search.pronunciationlearning.p10630c.p10632b;

import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141339f;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141340g;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141341h;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141344k;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141345l;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141346m;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10631a.C141348o;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10634d.C141359a;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.pronunciationlearning.c.b.g */
/* compiled from: PG */
public final class C141355g implements C141349a {

    /* renamed from: a */
    public final C46778cv f383740a;

    /* renamed from: b */
    public final C141345l f383741b;

    /* renamed from: c */
    public final C141359a f383742c;

    /* renamed from: d */
    public C141357i f383743d = C141357i.f383748c;

    /* renamed from: e */
    private final C46723bg f383744e;

    /* renamed from: f */
    private final Executor f383745f;

    /* renamed from: g */
    private final C60887da f383746g;

    /* renamed from: h */
    private final C141354f f383747h;

    public C141355g(C46723bg bgVar, C46778cv cvVar, C141346m mVar, C60887da daVar, C141359a aVar) {
        C141354f fVar = new C141354f(this);
        this.f383747h = fVar;
        this.f383744e = bgVar;
        this.f383740a = cvVar;
        C37419bx bxVar = (C37419bx) mVar.f383724a.mo17428b();
        bxVar.getClass();
        C37482d dVar = (C37482d) mVar.f383725b.mo17428b();
        dVar.getClass();
        C60887da daVar2 = (C60887da) mVar.f383726c.mo17428b();
        daVar2.getClass();
        C60887da daVar3 = (C60887da) mVar.f383727d.mo17428b();
        daVar3.getClass();
        C141348o oVar = (C141348o) mVar.f383728e.mo17428b();
        oVar.getClass();
        this.f383741b = new C141345l(bxVar, dVar, daVar2, daVar3, oVar, fVar);
        this.f383746g = daVar;
        this.f383745f = new C60904dr(daVar);
        this.f383742c = aVar;
    }

    /* renamed from: a */
    public final C46689ag mo116379a() {
        return new C46719bc(this.f383744e, new C141353e(this), "PronunciationRecognitionUpdate");
    }

    /* renamed from: b */
    public final C60870cx mo116380b() {
        return this.f383741b.mo116377b();
    }

    /* renamed from: c */
    public final C60870cx mo116381c(List list) {
        C141345l lVar = this.f383741b;
        C60870cx cxVar = lVar.f383720k;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        lVar.f383720k = C47633f.m84733g(lVar.mo116376a()).mo51516i(new C141339f(lVar), lVar.f383714e).mo51516i(C141340g.f383704a, lVar.f383714e).mo51516i(new C141341h(lVar), lVar.f383714e);
        C60870cx cxVar2 = lVar.f383720k;
        C141344k kVar = new C141344k(lVar);
        C60856cj.m92911t(cxVar2, C47810es.m84974n(kVar), lVar.f383714e);
        return C47633f.m84733g(lVar.f383720k).mo51516i(new C141350b(this), this.f383746g).mo51516i(new C141351c(this, list), this.f383746g);
    }

    /* renamed from: d */
    public final void mo116382d() {
        this.f383741b.mo116376a();
    }

    /* renamed from: e */
    public final void mo116384e(C141357i iVar) {
        this.f383745f.execute(C47810es.m84977q(new C141352d(this, iVar)));
    }
}
