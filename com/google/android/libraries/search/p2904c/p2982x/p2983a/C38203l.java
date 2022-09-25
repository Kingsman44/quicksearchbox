package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37452ca;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37638gq;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37658he;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37677hx;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2906aa.C37330e;
import com.google.android.libraries.search.p2904c.p2942m.C37826a;
import com.google.android.libraries.search.p2904c.p2942m.C37872b;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2942m.C37896j;
import com.google.android.libraries.search.p2904c.p2942m.C37897k;
import com.google.android.libraries.search.p2904c.p2982x.C38161a;
import com.google.android.libraries.search.p2904c.p2982x.C38225ah;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.android.libraries.search.p2904c.p2982x.C38233ap;
import com.google.android.libraries.search.p2904c.p2982x.C38240b;
import com.google.android.libraries.search.p2904c.p2982x.C38247f;
import com.google.android.libraries.search.p2904c.p2982x.C38253l;
import com.google.android.libraries.search.p2904c.p2982x.C38257p;
import com.google.android.libraries.search.p2904c.p2982x.C38259r;
import com.google.android.libraries.search.p2904c.p2982x.C38261t;
import com.google.android.libraries.search.p2904c.p2982x.C38263v;
import com.google.android.libraries.search.p2904c.p2982x.C38265x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Objects;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;
import p5488io.grpc.p5533i.C70887z;

/* renamed from: com.google.android.libraries.search.c.x.a.l */
/* compiled from: PG */
public final class C38203l extends C38247f {

    /* renamed from: a */
    public static final C59071e f101252a = C59071e.m91332i("com.google.android.libraries.search.c.x.a.l");

    /* renamed from: b */
    public final Executor f101253b;

    /* renamed from: c */
    public final C38193bd f101254c;

    /* renamed from: d */
    public final C38167ae f101255d;

    /* renamed from: e */
    private final C37895i f101256e;

    /* renamed from: f */
    private final C37452ca f101257f;

    /* renamed from: g */
    private final C38182at f101258g;

    /* renamed from: h */
    private Integer f101259h;

    /* renamed from: i */
    private C70862aj f101260i;

    public C38203l(C37895i iVar, Executor executor, C38193bd bdVar, C38167ae aeVar, C37452ca caVar, C38182at atVar) {
        this.f101256e = iVar;
        this.f101253b = executor;
        this.f101254c = bdVar;
        this.f101255d = aeVar;
        this.f101257f = caVar;
        this.f101258g = atVar;
    }

    /* renamed from: b */
    public final synchronized void mo41323b(C37407bl blVar, C70862aj ajVar) {
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(52994)).mo56386p("#audio# activateAudioRequestClient");
        C37826a g = this.f101256e.mo41106g(blVar);
        C38161a aVar = (C38161a) C38240b.f101338c.createBuilder();
        C37638gq gqVar = (C37638gq) C37639gr.f100004c.createBuilder();
        int a = g.mo41090a();
        gqVar.copyOnWrite();
        C37639gr grVar = (C37639gr) gqVar.instance;
        grVar.f100006a |= 1;
        grVar.f100007b = a;
        aVar.copyOnWrite();
        C38240b bVar = (C38240b) aVar.instance;
        C37639gr grVar2 = (C37639gr) gqVar.build();
        grVar2.getClass();
        bVar.f101341b = grVar2;
        bVar.f101340a |= 1;
        ajVar.mo20123c((C38240b) aVar.build());
        ajVar.mo20121a();
    }

    /* renamed from: c */
    public final void mo41324c(C38253l lVar, C70862aj ajVar) {
        C37639gr grVar = lVar.f101361b;
        if (grVar == null) {
            grVar = C37639gr.f100004c;
        }
        int i = grVar.f100007b;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(52995)).mo56387q("#audio# deactivateClient, token=%d", i);
        this.f101256e.mo41115p(i);
        ajVar.mo20123c(C38259r.f101366a);
        ajVar.mo20121a();
    }

    /* renamed from: d */
    public final void mo41325d(C37454cc ccVar, C70862aj ajVar) {
        C37330e.m66336a(ccVar);
        C37677hx a = this.f101257f.mo40977a(ccVar);
        C38182at atVar = this.f101258g;
        C60870cx d = a.mo20357d();
        C60870cx a2 = ((C37401bf) a.mo20358e()).mo20353a();
        C60870cx b = a.mo20355b();
        d.getClass();
        a2.getClass();
        b.getClass();
        C71422aw awVar = (C71422aw) atVar.f101196a.mo17428b();
        awVar.getClass();
        Executor executor = (Executor) atVar.f101197b.mo17428b();
        executor.getClass();
        Executor executor2 = (Executor) atVar.f101198c.mo17428b();
        executor2.getClass();
        C38181as asVar = new C38181as(d, a2, b, ajVar, awVar, executor, executor2);
        if (asVar.f101190e.getAndSet(true)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C71803m.m105043d(asVar.f101187b, (C69585o) null, (C71424ay) null, new C38180ar(asVar, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final synchronized void mo41326e(C38253l lVar, C70862aj ajVar) {
        C37639gr grVar = lVar.f101361b;
        if (grVar == null) {
            grVar = C37639gr.f100004c;
        }
        int i = grVar.f100007b;
        C60856cj.m92911t(this.f101256e.mo41107h(i).mo41091b().mo40939e(), C47810es.m84974n(new C38199h(ajVar, i)), this.f101253b);
    }

    /* renamed from: f */
    public final synchronized void mo41327f(C38261t tVar, C70862aj ajVar) {
        C37679hz hzVar = tVar.f101371b;
        if (hzVar == null) {
            hzVar = C37679hz.f100067c;
        }
        int i = hzVar.f100070b;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(52997)).mo56387q("#audio# getExternalAdapterStopListeningTriggeredStatus sessionToken: %d", i);
        Integer num = this.f101259h;
        if (num == null || num.intValue() != i) {
            ajVar.mo20123c(C38263v.f101372a);
            ajVar.mo20121a();
            return;
        }
        this.f101260i = ajVar;
    }

    /* renamed from: g */
    public final synchronized void mo41328g(C38227aj ajVar, C70862aj ajVar2) {
        C37407bl blVar;
        int a;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(53000)).mo56386p("#audio# startListening");
        int i = ajVar.f101312b;
        if (i == 2) {
            a = ((C37639gr) ajVar.f101313c).f100007b;
        } else {
            C37895i iVar = this.f101256e;
            if (i == 3) {
                blVar = (C37407bl) ajVar.f101313c;
            } else {
                blVar = C37407bl.f99325c;
            }
            a = iVar.mo41106g(blVar).mo41090a();
        }
        int i2 = a;
        C37895i iVar2 = this.f101256e;
        C37410bo boVar = ajVar.f101314d;
        if (boVar == null) {
            boVar = C37410bo.f99330k;
        }
        C37872b j = iVar2.mo41109j(i2, boVar);
        C37402bg b = j.mo41093b();
        int a2 = j.mo41092a();
        Objects.requireNonNull(b);
        ((C70883v) ajVar2).mo62583d(new C38162a(b));
        C60856cj.m92911t(b.mo20357d(), C47810es.m84974n(new C38194c(this, ajVar, ajVar2, i2, a2, b)), this.f101253b);
    }

    /* renamed from: h */
    public final synchronized void mo41329h(C38265x xVar, C70862aj ajVar) {
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(53001)).mo56386p("#audio# startListeningForHotword");
        C37895i iVar = this.f101256e;
        C37662hi hiVar = xVar.f101377b;
        if (hiVar == null) {
            hiVar = C37662hi.f100030g;
        }
        C37897k n = iVar.mo41113n(hiVar);
        C37659hf b = n.mo41143b();
        int a = n.mo41142a();
        Objects.requireNonNull(b);
        ((C70883v) ajVar).mo62583d(new C38189b(b));
        C60856cj.m92911t(b.mo41060d(), C47810es.m84974n(new C38196e(this, xVar, ajVar, a, b)), this.f101253b);
    }

    /* renamed from: i */
    public final synchronized void mo41330i(C38233ap apVar, C70862aj ajVar) {
        C37639gr grVar = apVar.f101327b;
        if (grVar == null) {
            grVar = C37639gr.f100004c;
        }
        int i = grVar.f100007b;
        C37679hz hzVar = apVar.f101328c;
        if (hzVar == null) {
            hzVar = C37679hz.f100067c;
        }
        int i2 = hzVar.f100070b;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(53002)).mo56387q("#audio# stopListening sessionToken: %d", i2);
        C60856cj.m92911t(this.f101256e.mo41108i(i, i2).mo41093b().mo20354a().mo20353a(), C47810es.m84974n(new C38195d(ajVar, i, i2)), this.f101253b);
    }

    /* renamed from: j */
    public final synchronized void mo41331j(C37679hz hzVar, C70862aj ajVar) {
        int i = hzVar.f100070b;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(53003)).mo56387q("#audio# stopListeningForHotword sessionToken: %d", i);
        C60856cj.m92911t(this.f101256e.mo41112m(i).mo41143b().mo41058b().mo41053a(), C47810es.m84974n(new C38197f(ajVar, i)), this.f101253b);
    }

    /* renamed from: k */
    public final synchronized void mo41332k(C37679hz hzVar, C70862aj ajVar) {
        int i = hzVar.f100070b;
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(53004)).mo56387q("#audio# stopListeningForSeamlessMode sessionToken: %d", i);
        C37658he c = this.f101256e.mo41112m(i).mo41143b().mo41059c();
        C60856cj.m92911t(c.mo41056c(), C47810es.m84974n(new C38198g(this, c, ajVar, i)), this.f101253b);
    }

    /* renamed from: l */
    public final void mo41333l(C70862aj ajVar) {
        ajVar.mo20123c(C38257p.f101364a);
    }

    /* renamed from: m */
    public final synchronized void mo41334m(C70862aj ajVar) {
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(52998)).mo56386p("#audio# notifyStartListening");
        C37896j l = this.f101256e.mo41111l(new C38202k(this));
        int a = l.mo41136a();
        this.f101259h = Integer.valueOf(a);
        C60856cj.m92911t(l.mo41138c(), C47810es.m84974n(new C38200i(ajVar, a)), this.f101253b);
    }

    /* renamed from: n */
    public final synchronized void mo41335n(C70862aj ajVar) {
        ((C59052c) ((C59052c) f101252a.mo56224b()).mo56372aa(52999)).mo56386p("#audio# notifyStopListening");
        this.f101256e.mo41117r();
        ajVar.mo20123c(C38225ah.f101307a);
        ajVar.mo20121a();
    }

    /* renamed from: o */
    public final synchronized void mo41336o() {
        this.f101259h = null;
        C70862aj ajVar = this.f101260i;
        if (ajVar != null && !((C70887z) ajVar).f189070a.mo62063h()) {
            ajVar.mo20123c(C38263v.f101372a);
            ajVar.mo20121a();
        }
        this.f101260i = null;
    }
}
