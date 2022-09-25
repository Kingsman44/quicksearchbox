package com.google.android.apps.gsa.staticplugins.p7643cc;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6596bk.C84882a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7643cc.p7644a.C97521c;
import com.google.android.apps.gsa.staticplugins.p7643cc.p7644a.C97522d;
import com.google.android.apps.gsa.staticplugins.webview.C118247f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.cc.a */
/* compiled from: PG */
public final class C97518a extends C86734a implements C84882a {

    /* renamed from: a */
    private final C97522d f272343a;

    /* renamed from: b */
    private final C118247f f272344b;

    public C97518a(C97522d dVar, C118247f fVar) {
        super(C118575h.WORKER_NON_SEARCH_PAGE, "nonsearchpage");
        this.f272343a = dVar;
        this.f272344b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo78558a(Query query, C86498a aVar, C89356b bVar, C60870cx cxVar) {
        Object obj;
        if (!query.mo84373cF()) {
            return C60856cj.m92898g();
        }
        if (query.mo84436dQ()) {
            obj = this.f272344b.f328273b;
        } else {
            C97522d dVar = this.f272343a;
            C86054o oVar = (C86054o) dVar.f272407a.mo17428b();
            oVar.getClass();
            C89859i iVar = (C89859i) dVar.f272408b.mo17428b();
            iVar.getClass();
            C21370a aVar2 = (C21370a) dVar.f272409c.mo17428b();
            aVar2.getClass();
            C89911f fVar = (C89911f) dVar.f272410d.mo17428b();
            fVar.getClass();
            C89012aj ajVar = (C89012aj) dVar.f272411e.mo17428b();
            ajVar.getClass();
            C89037bh bhVar = (C89037bh) dVar.f272412f.mo17428b();
            bhVar.getClass();
            C22871g gVar = (C22871g) dVar.f272413g.mo17428b();
            gVar.getClass();
            C22871g gVar2 = (C22871g) dVar.f272414h.mo17428b();
            gVar2.getClass();
            C86124t tVar = (C86124t) dVar.f272415i.mo17428b();
            tVar.getClass();
            C90479a aVar3 = (C90479a) dVar.f272416j.mo17428b();
            aVar3.getClass();
            obj = new C97521c(bVar, oVar, iVar, aVar2, fVar, ajVar, bhVar, gVar, gVar2, tVar, aVar3);
        }
        C86498a aVar4 = aVar;
        C86577w i = aVar4.mo80185i(query, C60856cj.m92900i(obj), cxVar, bVar);
        i.mo80180a();
        return C60856cj.m92900i(i);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
