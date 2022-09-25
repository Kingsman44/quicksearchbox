package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.speech.setupwizard.C92653e;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.av */
/* compiled from: PG */
public final /* synthetic */ class C110472av implements C69464a {

    /* renamed from: a */
    public final /* synthetic */ C110473aw f307971a;

    public /* synthetic */ C110472av(C110473aw awVar) {
        this.f307971a = awVar;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        String str;
        C110473aw awVar = this.f307971a;
        boolean u = awVar.f307979h.u();
        ((C59052c) ((C59052c) C110473aw.f307972a.mo56224b()).mo56372aa(26412)).mo56389s("getContentSequence: isOpaEligible = %b", Boolean.valueOf(u));
        if (!u) {
            return C83875ai.f228524a;
        }
        C110439a aVar = (C110439a) awVar.f307983l;
        if (aVar.f307891f != 15 || (str = aVar.f307888c) == null) {
            StringBuilder sb = new StringBuilder();
            if ((aVar.f307891f & 1) == 0) {
                sb.append(" isMinorAccount");
            }
            if ((aVar.f307891f & 2) == 0) {
                sb.append(" isUnicornAccount");
            }
            if (aVar.f307888c == null) {
                sb.append(" accountGivenName");
            }
            if ((aVar.f307891f & 4) == 0) {
                sb.append(" accountStandardGender");
            }
            if ((aVar.f307891f & 8) == 0) {
                sb.append(" biometricsDisabledByAdmin");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C110477b bVar = new C110477b(aVar.f307886a, aVar.f307887b, str, aVar.f307889d, aVar.f307890e);
        C110451aa aaVar = (C110451aa) awVar.f307980i.mo27525b();
        C110475ay ayVar = (C110475ay) aaVar.f307925a.mo17428b();
        ayVar.getClass();
        C92653e eVar = (C92653e) aaVar.f307926b.mo17428b();
        eVar.getClass();
        C92486a aVar2 = (C92486a) aaVar.f307927c.mo17428b();
        aVar2.getClass();
        C89994f fVar = (C89994f) aaVar.f307928d.mo17428b();
        fVar.getClass();
        C109789ai aiVar = (C109789ai) aaVar.f307929e.mo17428b();
        aiVar.getClass();
        C86124t tVar = (C86124t) aaVar.f307930f.mo17428b();
        tVar.getClass();
        C114540i iVar = (C114540i) aaVar.f307931g.mo17428b();
        iVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) aaVar.f307932h).f184585a);
        a.getClass();
        C92533a aVar3 = (C92533a) aaVar.f307933i.mo17428b();
        aVar3.getClass();
        return new C110500x(bVar, ayVar, eVar, aVar2, fVar, aiVar, tVar, iVar, a, aVar3);
    }
}
