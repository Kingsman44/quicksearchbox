package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122465t;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122762b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.libraries.mdi.C29690f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61909bs;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61924cg;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61925ch;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61949de;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61951dg;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61967j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61970m;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C122638ar implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122641au f339843a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f339844b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f339845c;

    /* renamed from: d */
    public final /* synthetic */ Optional f339846d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f339847e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f339848f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f339849g;

    /* renamed from: h */
    public final /* synthetic */ Optional f339850h;

    /* renamed from: i */
    public final /* synthetic */ C60870cx f339851i;

    /* renamed from: j */
    public final /* synthetic */ Optional f339852j;

    /* renamed from: k */
    public final /* synthetic */ C60870cx f339853k;

    /* renamed from: l */
    public final /* synthetic */ C122959k f339854l;

    /* renamed from: m */
    public final /* synthetic */ C122959k f339855m;

    /* renamed from: n */
    public final /* synthetic */ C122959k f339856n;

    public /* synthetic */ C122638ar(C122641au auVar, C60870cx cxVar, C122959k kVar, C60870cx cxVar2, Optional optional, C60870cx cxVar3, C122959k kVar2, C60870cx cxVar4, C122959k kVar3, C60870cx cxVar5, Optional optional2, C60870cx cxVar6, Optional optional3, C60870cx cxVar7) {
        this.f339843a = auVar;
        this.f339844b = cxVar;
        this.f339854l = kVar;
        this.f339845c = cxVar2;
        this.f339846d = optional;
        this.f339847e = cxVar3;
        this.f339855m = kVar2;
        this.f339848f = cxVar4;
        this.f339856n = kVar3;
        this.f339849g = cxVar5;
        this.f339850h = optional2;
        this.f339851i = cxVar6;
        this.f339852j = optional3;
        this.f339853k = cxVar7;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122665u uVar;
        C122964p pVar;
        C122641au auVar = this.f339843a;
        C60870cx cxVar = this.f339844b;
        C122959k kVar = this.f339854l;
        C60870cx cxVar2 = this.f339845c;
        Optional optional = this.f339846d;
        C60870cx cxVar3 = this.f339847e;
        C122959k kVar2 = this.f339855m;
        C60870cx cxVar4 = this.f339848f;
        C122959k kVar3 = this.f339856n;
        C60870cx cxVar5 = this.f339849g;
        Optional optional2 = this.f339850h;
        C60870cx cxVar6 = this.f339851i;
        Optional optional3 = this.f339852j;
        C60870cx cxVar7 = this.f339853k;
        C123001av avVar = auVar.f339868k;
        Optional optional4 = (Optional) C60856cj.m92909r(cxVar);
        C29690f fVar = (C29690f) C60856cj.m92909r(cxVar2);
        Optional optional5 = (Optional) C60856cj.m92909r(cxVar4);
        Optional of = Optional.m71637of(kVar3);
        Optional optional6 = (Optional) C60856cj.m92909r(cxVar5);
        Optional optional7 = (Optional) C60856cj.m92909r(cxVar6);
        Optional optional8 = (Optional) C60856cj.m92909r(cxVar7);
        String str = fVar.f80411b;
        AtomicReference atomicReference = new AtomicReference();
        C123001av avVar2 = avVar;
        C122639as asVar = new C122639as(atomicReference);
        AtomicReference atomicReference2 = atomicReference;
        C122642av avVar3 = auVar.f339873p;
        Objects.requireNonNull(avVar3);
        Optional optional9 = of;
        C61920cc a = auVar.mo105710a(new C122663s(avVar3), Optional.m71637of(kVar), Optional.m71637of(fVar), asVar);
        C122642av avVar4 = auVar.f339873p;
        Objects.requireNonNull(avVar4);
        C61920cc a2 = auVar.mo105710a(new C122664t(avVar4), optional, (Optional) C60856cj.m92909r(cxVar3), asVar);
        C122642av avVar5 = auVar.f339873p;
        Objects.requireNonNull(avVar5);
        C122665u uVar2 = new C122665u(avVar5);
        try {
            WebrefAndPkgModelProvider webrefAndPkgModelProvider = new WebrefAndPkgModelProvider((C61961dq) null, (C61910bt) null, false);
            C122964p pVar2 = new C122964p(auVar.f339876s);
            try {
                C122641au.m202045e(webrefAndPkgModelProvider, optional5, uVar2, pVar2);
                pVar = pVar2;
                uVar = uVar2;
            } catch (IOException e) {
                pVar = pVar2;
                uVar = uVar2;
                ((C59052c) ((C59052c) ((C59052c) C122641au.f339858a.mo56226d()).mo56382g(e)).mo56372aa(34901)).mo56386p("Could not load webref model");
            }
            if (optional4.isPresent()) {
                try {
                    C122641au.m202043c(webrefAndPkgModelProvider, (String) optional4.get(), auVar.f339866i);
                } catch (IOException e2) {
                    ((C59052c) ((C59052c) ((C59052c) C122641au.f339858a.mo56226d()).mo56382g(e2)).mo56372aa(34900)).mo56386p("Could not load pkg model");
                }
            }
            WebrefAndPkgModelProvider webrefAndPkgModelProvider2 = webrefAndPkgModelProvider;
            AtomicReference atomicReference3 = atomicReference2;
            Optional optional10 = optional4;
            C61920cc ccVar = a2;
            C122665u uVar3 = uVar;
            C61920cc ccVar2 = ccVar;
            Optional optional11 = optional9;
            Optional optional12 = optional3;
            kVar2.mo105795d(new C122621aa(auVar, kVar2, webrefAndPkgModelProvider2, uVar3, pVar, asVar));
            C122642av avVar6 = auVar.f339873p;
            Objects.requireNonNull(avVar6);
            C61920cc a3 = auVar.mo105710a(new C122666v(avVar6), optional11, optional6, asVar);
            C122642av avVar7 = auVar.f339873p;
            Objects.requireNonNull(avVar7);
            C61920cc a4 = auVar.mo105710a(new C122667w(avVar7), optional2, optional7, asVar);
            C122642av avVar8 = auVar.f339873p;
            Objects.requireNonNull(avVar8);
            C61920cc a5 = auVar.mo105710a(new C122668x(avVar8), optional12, optional8, asVar);
            C61949de p = C61951dg.m94620p();
            C61970m mVar = (C61970m) p;
            mVar.f167465a = a;
            mVar.f167469e = ccVar2;
            WebrefAndPkgModelProvider webrefAndPkgModelProvider3 = webrefAndPkgModelProvider2;
            mVar.f167468d = webrefAndPkgModelProvider3;
            mVar.f167470f = a4;
            mVar.f167471g = a5;
            C61924cg k = C61925ch.m94598k();
            k.mo58367f(true);
            k.mo58365d(true);
            k.mo58364c(true);
            k.mo58363b(true);
            k.mo58366e(true);
            k.mo58368g(true);
            ((C61967j) k).f167445a = a3;
            C122465t tVar = auVar.f339859b.f339496b;
            if (tVar == null) {
                tVar = C122465t.f339501d;
            }
            k.mo58370i(C58485gu.m89842j(tVar.f339504b));
            k.mo58369h(auVar.f339870m);
            mVar.f167473i = k.mo58362a();
            C61951dg a6 = p.mo58393a();
            C122645ay ayVar = auVar.f339874q;
            Context context = ayVar.f339883a;
            TextClassifierLibImpl textClassifierLibImpl = new TextClassifierLibImpl(context, a6, new C61909bs(context), C58833ax.m90834k(ayVar.f339884b));
            Objects.requireNonNull(textClassifierLibImpl);
            C122620a aVar = new C122620a(textClassifierLibImpl, new C122644ax(textClassifierLibImpl));
            TextClassifierLib textClassifierLib = aVar.f339804a;
            C122660p pVar3 = auVar.f339867j;
            C122644ax axVar = aVar.f339805b;
            C122669y yVar = new C122669y(auVar, optional10, webrefAndPkgModelProvider3);
            C122762b bVar = (C122762b) pVar3.f339907a.mo17428b();
            bVar.getClass();
            C60887da daVar = (C60887da) pVar3.f339908b.mo17428b();
            daVar.getClass();
            C60887da daVar2 = (C60887da) pVar3.f339909c.mo17428b();
            daVar2.getClass();
            C122659o oVar = new C122659o(textClassifierLib, axVar, yVar, bVar, daVar, daVar2);
            oVar.f339900c.mo105733a(oVar);
            atomicReference3.set(oVar);
            C60870cx j = C60856cj.m92901j(((TextClassifierLibImpl) textClassifierLib).f167272b);
            C122670z zVar = new C122670z(textClassifierLib, oVar);
            return avVar2.mo105821d(21002, C60922j.m93044g(j, C47810es.m84963c(zVar), C60826bg.f164896a));
        } catch (IOException e3) {
            throw new C122872ec("TclibFactory", "Webref model ctor failed", e3);
        }
    }
}
