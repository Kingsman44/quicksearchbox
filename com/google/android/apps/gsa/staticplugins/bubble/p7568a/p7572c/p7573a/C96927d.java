package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.p7573a;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96891k;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96897q;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96914n;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96915o;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96916p;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96917q;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96918r;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a.C96974d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a.C96977g;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a.C96978h;
import com.google.common.p4522b.C58526ih;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C96927d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96934k f270929a;

    public /* synthetic */ C96927d(C96934k kVar) {
        this.f270929a = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96934k kVar = this.f270929a;
        C96897q qVar = kVar.f270942c;
        C90875ai.m148465b(C96930g.f270936a, qVar.f270880a.mo46039a(new C96891k(kVar.f270944e.mo26870b()), qVar.f270883d.mo85210c("UpdateSuccessFetchRequestTimestamp")), kVar.f270943d, "UpdateSuccessFetchRequestTimestamp").mo85223a(C96931h.f270937a);
        C96914n nVar = kVar.f270941b;
        C58526ih ihVar = new C58526ih();
        for (C96978h hVar : ((C96974d) obj).f271016a) {
            C96915o oVar = (C96915o) C96918r.f270908d.createBuilder();
            C96916p pVar = (C96916p) C96917q.f270902c.createBuilder();
            C96977g gVar = hVar.f271026b;
            if (gVar == null) {
                gVar = C96977g.f271018b;
            }
            C88474x xVar = gVar.f271020a;
            if (xVar == null) {
                xVar = C88474x.f239172h;
            }
            pVar.copyOnWrite();
            C96917q qVar2 = (C96917q) pVar.instance;
            xVar.getClass();
            qVar2.f270906b = xVar;
            qVar2.f270905a |= 1;
            oVar.copyOnWrite();
            C96918r rVar = (C96918r) oVar.instance;
            C96917q qVar3 = (C96917q) pVar.build();
            qVar3.getClass();
            rVar.f270912c = qVar3;
            rVar.f270910a |= 4;
            long j = hVar.f271025a;
            oVar.copyOnWrite();
            C96918r rVar2 = (C96918r) oVar.instance;
            rVar2.f270910a |= 2;
            rVar2.f270911b = j;
            ihVar.mo55373c((C96918r) oVar.build());
        }
        C90875ai.m148465b(C96932i.f270938a, nVar.mo90377a(ihVar.mo55486f()), kVar.f270943d, "ScheduleBubbleResult").mo85223a(C96933j.f270939a);
    }
}
