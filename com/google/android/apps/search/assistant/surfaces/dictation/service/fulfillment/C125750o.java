package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.gsa.binaries.satin.app.C74264ru;
import com.google.android.apps.gsa.binaries.satin.app.C74265rv;
import com.google.android.apps.gsa.binaries.satin.app.C74266rw;
import com.google.android.apps.gsa.binaries.satin.app.C74267rx;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122418bj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.C125712a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125727f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a.C125719g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a.C125720h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a.C125721i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125668au;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125687t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125688u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125691x;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125695b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125696c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.C125707c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126313av;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52382pr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.BiFunction;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.o */
/* compiled from: PG */
public final class C125750o {

    /* renamed from: g */
    private static final C59071e f346554g = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.o");

    /* renamed from: a */
    public final C125707c f346555a;

    /* renamed from: b */
    public final C125712a f346556b;

    /* renamed from: c */
    public final Executor f346557c;

    /* renamed from: d */
    public final C125522a f346558d;

    /* renamed from: e */
    public final C125702i f346559e;

    /* renamed from: f */
    public final C126181j f346560f;

    /* renamed from: h */
    private final boolean f346561h;

    /* renamed from: i */
    private final C126313av f346562i;

    public C125750o(Locale locale, bj bjVar, C126181j jVar, C126313av avVar, C125688u uVar, C74266rw rwVar, C125707c cVar, C74267rx rxVar, Executor executor) {
        Locale locale2 = locale;
        C126313av avVar2 = avVar;
        C125688u uVar2 = uVar;
        C74266rw rwVar2 = rwVar;
        C74267rx rxVar2 = rxVar;
        this.f346555a = cVar;
        this.f346556b = new C125721i(locale, bjVar, (C126174c) rxVar2.f207981a.b.f198027a.f199305cX.mo17428b(), rxVar2.f207981a.c.g(), (C125727f) rxVar2.f207981a.b.f198027a.f199645it.mo17428b(), rxVar2.f207981a.c.d(), ((C46897i) rxVar2.f207981a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45369906").mo50907f(), (Executor) rxVar2.f207981a.a.n.mo17428b());
        this.f346557c = executor;
        boolean a = avVar2.mo107524a(locale2);
        this.f346561h = a;
        this.f346562i = avVar2;
        C69664n.m101061g(locale2, "locale");
        C74264ru ruVar = uVar2.f346411b;
        C69464a aVar = (C69464a) uVar2.f346410a.get(locale.getLanguage());
        C125687t tVar = aVar != null ? (C125687t) aVar.mo17428b() : null;
        this.f346558d = new C125691x(tVar == null ? new C125668au(locale2) : tVar, (C74265rv) ruVar.f207978a.c.n.mo17428b(), (C71422aw) ruVar.f207978a.a.H.mo17428b());
        C125702i iVar = new C125702i(locale, (C122472a) rwVar2.f207980a.b.f198151cR.mo17428b(), (C71422aw) rwVar2.f207980a.a.H.mo17428b(), new C125696c(rwVar2.f207980a.c.k()), ((C46897i) rwVar2.f207980a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45368882").mo50903b());
        this.f346559e = iVar;
        this.f346560f = jVar;
        if (a) {
            C122549e eVar = iVar.f346459g;
            Locale locale3 = iVar.f346454b;
            C122417bi biVar = (C122417bi) C122419bk.f339392l.createBuilder();
            C69664n.m101060f(biVar, "newBuilder()");
            C122421bm a2 = C69664n.m101061g(biVar, "builder");
            long j = iVar.f346457e;
            C122417bi biVar2 = a2.f339405a;
            biVar2.copyOnWrite();
            ((C122419bk) biVar2.instance).f339394a = (int) j;
            String languageTag = locale3.toLanguageTag();
            C69664n.m101060f(languageTag, "spokenLocale.toLanguageTag()");
            a2.mo105624c(languageTag);
            a2.mo105625d(iVar.f346458f);
            C122417bi biVar3 = a2.f339405a;
            biVar3.copyOnWrite();
            ((C122419bk) biVar3.instance).f339403j = true;
            C122418bj bjVar2 = C122418bj.DICTATION;
            C69664n.m101061g(bjVar2, "value");
            C122417bi biVar4 = a2.f339405a;
            biVar4.copyOnWrite();
            ((C122419bk) biVar4.instance).f339404k = bjVar2.getNumber();
            C125696c cVar2 = iVar.f346456d;
            C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
            C69664n.m101060f(ewVar, "newBuilder()");
            C52382pr a3 = C69664n.m101061g(ewVar, "builder");
            a3.mo53848b();
            C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
            blVar.copyOnWrite();
            C51715bm bmVar = (C51715bm) blVar.instance;
            bmVar.f135664a |= 2;
            bmVar.f135666c = "OPA_AGSA";
            C51771cx cxVar = (C51771cx) C51772cy.f135824p.createBuilder();
            C58528ij<String> w = ((C58495hd) cVar2.f346433b).keySet();
            ArrayList arrayList = new ArrayList(C69540x.m100804k(w, 10));
            for (String str : w) {
                C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
                czVar.copyOnWrite();
                C51785da daVar = (C51785da) czVar.instance;
                str.getClass();
                daVar.f135877a |= 1;
                daVar.f135878b = str;
                arrayList.add((C51785da) czVar.build());
            }
            cxVar.mo53723b(arrayList);
            C51772cy cyVar = (C51772cy) cxVar.build();
            blVar.copyOnWrite();
            C51715bm bmVar2 = (C51715bm) blVar.instance;
            cyVar.getClass();
            bmVar2.f135671h = cyVar;
            bmVar2.f135664a |= 128;
            C62942bv build = blVar.build();
            C69664n.m101060f(build, "newBuilder()\n      .setS…()\n      )\n      .build()");
            a3.mo53849c(C125695b.m205680b((C51715bm) build));
            a2.mo105623b(a3.mo53847a());
            eVar.mo105650b(a2.mo105622a());
        }
    }

    /* renamed from: c */
    private final void m205718c(C60870cx cxVar, C60870cx cxVar2) {
        C46459k.m82829b(C47638k.m84753d(cxVar, cxVar2).mo51520a(new C125748m(this, cxVar, cxVar2), this.f346557c), "Failed to fetch ClientOp results from fulfillment for logging purposes. [SD]", new Object[0]);
    }

    /* renamed from: a */
    public final C60870cx mo107101a(String str, C125708c cVar, boolean z) {
        C60870cx cxVar;
        C125712a aVar = this.f346556b;
        List list = cVar.f346480e;
        C125721i iVar = (C125721i) aVar;
        if (!iVar.f346507g) {
            C59052c cVar2 = (C59052c) C125721i.f346501a.mo56224b();
            cVar2.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) cVar2.mo56372aa(36607)).mo56386p("The emoji fulfiller is disabled. [SD]");
            cxVar = C60856cj.m92900i(new C125751p(C125034a.TRIGGER_VOICE, C58485gu.m89845m(), C125721i.f346502b));
        } else {
            cxVar = C47633f.m84733g(iVar.f346509i.mo50395b()).mo51516i(new C125719g(iVar, str, list), iVar.f346508h).mo51513e(Exception.class, new C125720h(iVar), iVar.f346508h);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C125710d(this, str, cVar, z), this.f346557c);
    }

    /* renamed from: b */
    public final C60870cx mo107102b(Object obj, C125708c cVar, BiFunction biFunction, BiFunction biFunction2) {
        C60870cx cxVar;
        C60870cx cxVar2 = (C60870cx) biFunction.apply(obj, cVar);
        if (!this.f346561h) {
            this.f346560f.mo107444o(2);
            return cxVar2;
        }
        int i = (int) this.f346562i.f347972a;
        if (i == 2) {
            C60870cx i2 = C60856cj.m92900i(Collections.emptyList());
            try {
                i2 = (C60870cx) biFunction2.apply(obj, cVar);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f346554g.mo56226d()).mo56382g(e)).mo56372aa(36603)).mo56386p("Fulfillment through NLU + FF Service failed. [SD]");
            }
            m205718c(cxVar2, i2);
            this.f346560f.mo107444o(2);
            return cxVar2;
        } else if (i == 3) {
            try {
                cxVar = (C60870cx) biFunction2.apply(obj, cVar);
                m205718c(cxVar2, cxVar);
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) f346554g.mo56226d()).mo56382g(e2)).mo56372aa(36604)).mo56386p("Fulfillment through NLU + FF Service failed. [SD]");
                cxVar = null;
            }
            if (cxVar != null) {
                this.f346560f.mo107444o(3);
                return cxVar;
            }
            m205718c(cxVar2, C60856cj.m92900i(Collections.emptyList()));
            this.f346560f.mo107444o(4);
            return cxVar2;
        } else if (i != 4) {
            this.f346560f.mo107444o(2);
            return cxVar2;
        } else {
            C60870cx cxVar3 = (C60870cx) biFunction2.apply(obj, cVar);
            this.f346560f.mo107444o(3);
            m205718c(cxVar2, cxVar3);
            return cxVar3;
        }
    }
}
