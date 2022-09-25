package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112029ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4214f.C56030d;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ai */
/* compiled from: PG */
public final class C111654ai implements C111674k {

    /* renamed from: a */
    private static final C59071e f310422a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ai");

    /* renamed from: b */
    private final C112037ao f310423b;

    public C111654ai(C112037ao aoVar) {
        this.f310423b = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        Optional optional;
        Optional c = C113148bf.m187156c(alVar);
        C112037ao aoVar = this.f310423b;
        Objects.requireNonNull(aoVar);
        C112036an anVar = (C112036an) c.map(new C111652ag(aoVar)).orElse(null);
        if (anVar == null) {
            C59104x d = f310422a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaComplProc");
            ((C59052c) ((C59052c) d).mo56372aa(27344)).mo56386p("Not creating media suggestion for completion - no NLU intent.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C58495hd a = C113148bf.m187154a(alVar);
        if (anVar.f311211b.mo79746e(C90063do.f249401co)) {
            C56030d dVar = anVar.f311210a.f125485c;
            if (dVar == null) {
                dVar = C56030d.f149209c;
            }
            Optional findFirst = C112036an.m185880i(dVar, "media_object").findFirst();
            Objects.requireNonNull(a);
            optional = findFirst.map(new C112029ag(a));
        } else {
            Optional g = anVar.mo99344g(a, "title");
            if (g.isPresent()) {
                optional = g;
            } else {
                optional = anVar.mo99344g(a, "artist");
                if (!optional.isPresent()) {
                    optional = Optional.empty();
                }
            }
        }
        if (optional.isEmpty()) {
            C59104x d2 = f310422a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaComplProc");
            ((C59052c) ((C59052c) d2).mo56372aa(27343)).mo56386p("Not creating media suggestion for completion - missing entity.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C65379d dVar2 = (C65379d) optional.get();
        if (dVar2.f177779b.isEmpty()) {
            C59104x d3 = f310422a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MediaComplProc");
            ((C59052c) ((C59052c) d3).mo56372aa(27346)).mo56386p("Media entity in completion missing entity name.");
        } else if (!Collection.EL.stream(dVar2.f177782e).allMatch(C111653ah.f310421a)) {
            return C60856cj.m92900i(C58485gu.m89846n(C113188cs.m187210d(dVar2, alVar, C48672ag.TAPAS_SERVER)));
        } else {
            C59104x d4 = f310422a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "MediaComplProc");
            ((C59052c) ((C59052c) d4).mo56372aa(27345)).mo56386p("Media entity in completion missing thumbnail.");
        }
        C59104x d5 = f310422a.mo56226d();
        d5.mo56378ag(C58975e.f156826a, "MediaComplProc");
        ((C59052c) ((C59052c) d5).mo56372aa(27342)).mo56386p("Not creating media suggestion for completion - missing critical entity information");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
