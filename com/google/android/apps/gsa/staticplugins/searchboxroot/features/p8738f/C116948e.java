package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19168bb;
import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;
import com.google.android.libraries.assistant.p1594s.p1597b.C19178f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19181i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.e */
/* compiled from: PG */
public final class C116948e extends C88582c implements C89196a, C89200e {

    /* renamed from: a */
    public C88543c f324674a;

    /* renamed from: b */
    private final C86124t f324675b;

    /* renamed from: c */
    private final C19178f f324676c;

    /* renamed from: d */
    private final C116944a f324677d;

    /* renamed from: e */
    private final C21370a f324678e;

    public C116948e(C86124t tVar, C19178f fVar, C116944a aVar, C21370a aVar2) {
        this.f324675b = tVar;
        this.f324676c = fVar;
        this.f324677d = aVar;
        this.f324678e = aVar2;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324674a = ((C88614r) obj).f239530a;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        C19178f fVar = this.f324676c;
        C19168bb bbVar = (C19168bb) C19169bc.f53691g.createBuilder();
        String bk = ((C88616t) aVar).f239556a.mo84352bk();
        bbVar.copyOnWrite();
        C19169bc bcVar = (C19169bc) bbVar.instance;
        bk.getClass();
        bcVar.f53693a |= 1;
        bcVar.f53694b = bk;
        C48674ai aiVar = C48674ai.GEMINI;
        bbVar.copyOnWrite();
        C19169bc bcVar2 = (C19169bc) bbVar.instance;
        bcVar2.f53696d = aiVar.f125923f;
        bcVar2.f53693a |= 8;
        C19167ba a = this.f324677d.mo103065a();
        bbVar.copyOnWrite();
        C19169bc bcVar3 = (C19169bc) bbVar.instance;
        a.getClass();
        bcVar3.f53697e = a;
        bcVar3.f53693a |= 16;
        long c = this.f324678e.mo26871c();
        bbVar.copyOnWrite();
        C19169bc bcVar4 = (C19169bc) bbVar.instance;
        bcVar4.f53693a |= 32;
        bcVar4.f53698f = c;
        C60870cx g = C60922j.m93044g(C70876o.m103760a(fVar.f189039a.mo39510a(C19181i.m36584b(), fVar.f189040b), (C19169bc) bbVar.build()), new C116946c(), C60826bg.f164896a);
        C60856cj.m92911t(g, new C116947d(this, aVar), C60826bg.f164896a);
        return this.f324675b.mo79746e(C90085ej.f250170au) ? C60856cj.m92900i(new C41626a(C58485gu.m89845m())) : g;
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        if (this.f324675b.mo79746e(C90085ej.f250108L)) {
            C88616t tVar = (C88616t) aVar;
            if (!tVar.f239556a.mo84407cn() || TextUtils.isEmpty(tVar.f239556a.mo84352bk()) || tVar.f239557b != 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
