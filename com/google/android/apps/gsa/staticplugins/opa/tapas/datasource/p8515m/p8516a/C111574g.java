package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112030ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112031ai;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112032aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112033ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112034al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112035am;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112050m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112052o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112053p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112054q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48576aj;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4522b.C58495hd;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.a.g */
/* compiled from: PG */
public final class C111574g implements C111571d {

    /* renamed from: a */
    private final C112037ao f310298a;

    public C111574g(C112037ao aoVar) {
        this.f310298a = aoVar;
    }

    /* renamed from: a */
    public final Optional mo99174a(C48578al alVar) {
        C112037ao aoVar = this.f310298a;
        C48570ad adVar = ((C48576aj) alVar.f125509c.get(0)).f125500e;
        if (adVar == null) {
            adVar = C48570ad.f125481d;
        }
        C112036an a = aoVar.mo99348a(adVar);
        C58495hd a2 = C113148bf.m187154a(alVar);
        String str = alVar.f125508b;
        if (a.f311211b.mo79746e(C90063do.f249401co)) {
            int i = a.f311210a.f125483a;
        }
        C48570ad adVar2 = a.f311210a;
        if ((adVar2.f125483a & 1) == 0) {
            return Optional.empty();
        }
        C61752n nVar = adVar2.f125484b;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        Stream c = C112050m.m185897c(nVar, "Destination");
        C61752n nVar2 = a.f311210a.f125484b;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        return Stream.CC.concat(c, C112050m.m185897c(nVar2, "Location")).filter(C112030ah.f311203a).map(C112031ai.f311204a).filter(C112032aj.f311205a).map(C112033ak.f311206a).map(C112034al.f311207a).flatMap(C112035am.f311208a).map(new C112052o(a2)).filter(C112053p.f311227a).map(C112054q.f311228a).findFirst();
    }
}
