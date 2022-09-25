package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.location.C74631a;
import com.google.android.apps.gsa.location.C74635ab;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.location.ad;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p417d.p418a.C8587n;
import com.google.p395al.p417d.p418a.C8588o;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.b */
/* compiled from: PG */
final class C116503b extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ String f323024a;

    /* renamed from: b */
    final /* synthetic */ C116505d f323025b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116503b(C116505d dVar, String str) {
        super("onLocationPromptMetadata", 2, 0);
        this.f323025b = dVar;
        this.f323024a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C116505d.f323026a.mo56225c()).mo56382g(th)).mo56372aa(31839)).mo56386p("Failed to check whether to disable classic location prompting.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        long j;
        String str;
        if (!((Boolean) obj).booleanValue()) {
            C116505d dVar = this.f323025b;
            String str2 = this.f323024a;
            Query query = dVar.f323027b.f323784p;
            if (query != null) {
                str = C39191a.m68623b(query.f252749G);
                j = dVar.f323027b.f323784p.f252747E;
            } else {
                str = null;
                j = 0;
            }
            C8587n nVar = (C8587n) C8588o.f29719c.createBuilder();
            nVar.copyOnWrite();
            C8588o oVar = (C8588o) nVar.instance;
            oVar.f29721a |= 1;
            oVar.f29722b = 0;
            C74635ab e = ImproveLocationRequest.m120650e();
            e.mo71008d((C8588o) nVar.build());
            ((C74631a) e).f208820b = 2;
            ad a = e.mo71005a();
            a.e(str2);
            a.g(str);
            a.h(Long.valueOf(j));
            dVar.f323030e.mo85142g(dVar.f323029d.mo78373e(dVar.f323027b.f323784p.f252749G, e.mo71015f(), dVar.f323028c), new C116504c());
        }
    }
}
