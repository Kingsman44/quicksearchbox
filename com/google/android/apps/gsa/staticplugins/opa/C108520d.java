package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89110d;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108211ai;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108244bo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.p640a.C11292a;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21672b;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21682l;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21683m;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21686p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40062d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40061z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.d */
/* compiled from: PG */
public final /* synthetic */ class C108520d implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C109138h f301930a;

    /* renamed from: b */
    public final /* synthetic */ C109259hx f301931b;

    /* renamed from: c */
    public final /* synthetic */ C108230ba f301932c;

    /* renamed from: d */
    public final /* synthetic */ C91097g f301933d;

    /* renamed from: e */
    public final /* synthetic */ C113892w f301934e;

    /* renamed from: f */
    public final /* synthetic */ C108244bo f301935f;

    /* renamed from: g */
    public final /* synthetic */ C107659as f301936g;

    /* renamed from: h */
    public final /* synthetic */ C107144k f301937h;

    /* renamed from: i */
    public final /* synthetic */ C108211ai f301938i;

    public /* synthetic */ C108520d(C109138h hVar, C109259hx hxVar, C108230ba baVar, C91097g gVar, C113892w wVar, C108244bo boVar, C107659as asVar, C107144k kVar, C108211ai aiVar) {
        this.f301930a = hVar;
        this.f301931b = hxVar;
        this.f301932c = baVar;
        this.f301933d = gVar;
        this.f301934e = wVar;
        this.f301935f = boVar;
        this.f301936g = asVar;
        this.f301937h = kVar;
        this.f301938i = aiVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C109138h hVar = this.f301930a;
        C109138h hVar2 = hVar;
        C109259hx hxVar = this.f301931b;
        C108230ba baVar = this.f301932c;
        C91097g gVar = this.f301933d;
        C113892w wVar = this.f301934e;
        C113892w wVar2 = wVar;
        C108244bo boVar = this.f301935f;
        C108244bo boVar2 = boVar;
        C107659as asVar = this.f301936g;
        C107659as asVar2 = asVar;
        C107144k kVar = this.f301937h;
        C107144k kVar2 = kVar;
        C108211ai aiVar = this.f301938i;
        C108211ai aiVar2 = aiVar;
        C108211ai aiVar3 = aiVar;
        C108793e eVar = r0;
        C108793e eVar2 = new C108793e(hVar);
        wVar.getClass();
        boVar.getClass();
        asVar.getClass();
        kVar.getClass();
        aiVar3.getClass();
        C21370a aVar = (C21370a) hxVar.f304330a.mo17428b();
        C21370a aVar2 = aVar;
        aVar.getClass();
        Context context = (Context) hxVar.f304334b.mo17428b();
        Context context2 = context;
        context.getClass();
        C108429ij ijVar = (C108429ij) hxVar.f304335c.mo17428b();
        C108429ij ijVar2 = ijVar;
        ijVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) hxVar.f304336d).f184585a);
        C68214a aVar3 = a;
        a.getClass();
        C109258hw hwVar = r1;
        C68214a a2 = C68219e.m98518a(((C68226l) hxVar.f304337e).f184585a);
        C109259hx hxVar2 = hxVar;
        C68214a aVar4 = a2;
        a2.getClass();
        C104149a aVar5 = (C104149a) hxVar2.f304338f.mo17428b();
        C104149a aVar6 = aVar5;
        aVar5.getClass();
        C0167am amVar = (C0167am) ((C68221g) hxVar2.f304339g).f184583a;
        C0167am amVar2 = amVar;
        amVar.getClass();
        C107619d dVar = (C107619d) hxVar2.f304340h.mo17428b();
        C107619d dVar2 = dVar;
        dVar.getClass();
        C91183ao aoVar = (C91183ao) hxVar2.f304341i.mo17428b();
        C91183ao aoVar2 = aoVar;
        aoVar.getClass();
        C22871g gVar2 = (C22871g) hxVar2.f304342j.mo17428b();
        C22871g gVar3 = gVar2;
        gVar2.getClass();
        C58833ax axVar = (C58833ax) hxVar2.f304343k.mo17428b();
        C58833ax axVar2 = axVar;
        axVar.getClass();
        C107698i iVar = (C107698i) hxVar2.f304344l.mo17428b();
        C107698i iVar2 = iVar;
        iVar.getClass();
        C11292a aVar7 = (C11292a) hxVar2.f304345m.mo17428b();
        C11292a aVar8 = aVar7;
        aVar7.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) hxVar2.f304346n).f184585a);
        C68214a aVar9 = a3;
        a3.getClass();
        C114524l lVar = (C114524l) hxVar2.f304347o.mo17428b();
        C114524l lVar2 = lVar;
        lVar.getClass();
        C89110d dVar3 = (C89110d) hxVar2.f304348p.mo17428b();
        C89110d dVar4 = dVar3;
        dVar3.getClass();
        C58833ax axVar3 = (C58833ax) hxVar2.f304349q.mo17428b();
        C58833ax axVar4 = axVar3;
        axVar3.getClass();
        m mVar = (m) hxVar2.f304350r.mo17428b();
        m mVar2 = mVar;
        mVar.getClass();
        C22871g gVar4 = (C22871g) hxVar2.f304351s.mo17428b();
        C22871g gVar5 = gVar4;
        gVar4.getClass();
        C22871g gVar6 = (C22871g) hxVar2.f304352t.mo17428b();
        C22871g gVar7 = gVar6;
        gVar6.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) hxVar2.f304353u).f184585a);
        C68214a aVar10 = a4;
        a4.getClass();
        C22871g gVar8 = (C22871g) hxVar2.f304354v.mo17428b();
        C22871g gVar9 = gVar8;
        gVar8.getClass();
        C21682l lVar3 = (C21682l) hxVar2.f304355w.mo17428b();
        C21682l lVar4 = lVar3;
        lVar3.getClass();
        C21683m mVar3 = (C21683m) hxVar2.f304356x.mo17428b();
        C21683m mVar4 = mVar3;
        mVar3.getClass();
        C21672b bVar = (C21672b) hxVar2.f304357y.mo17428b();
        C21672b bVar2 = bVar;
        bVar.getClass();
        C21686p pVar = (C21686p) hxVar2.f304358z.mo17428b();
        C21686p pVar2 = pVar;
        pVar.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) hxVar2.f304304A).f184585a);
        C68214a aVar11 = a5;
        a5.getClass();
        C113863cr crVar = (C113863cr) hxVar2.f304305B.mo17428b();
        C113863cr crVar2 = crVar;
        crVar.getClass();
        Boolean bool = (Boolean) hxVar2.f304306C.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C68214a a6 = C68219e.m98518a(((C68226l) hxVar2.f304307D).f184585a);
        C68214a aVar12 = a6;
        a6.getClass();
        C68214a a7 = C68219e.m98518a(((C68226l) hxVar2.f304308E).f184585a);
        C68214a aVar13 = a7;
        a7.getClass();
        C9388a aVar14 = (C9388a) hxVar2.f304309F.mo17428b();
        C9388a aVar15 = aVar14;
        aVar14.getClass();
        C68214a a8 = C68219e.m98518a(((C68226l) hxVar2.f304310G).f184585a);
        C68214a aVar16 = a8;
        a8.getClass();
        C9409b bVar3 = (C9409b) hxVar2.f304311H.mo17428b();
        C9409b bVar4 = bVar3;
        bVar3.getClass();
        C107710u uVar = (C107710u) hxVar2.f304312I.mo17428b();
        C107710u uVar2 = uVar;
        uVar.getClass();
        Query query = (Query) hxVar2.f304313J.mo17428b();
        Query query2 = query;
        query.getClass();
        C68214a a9 = C68219e.m98518a(((C68226l) hxVar2.f304314K).f184585a);
        C68214a aVar17 = a9;
        a9.getClass();
        Boolean bool2 = (Boolean) hxVar2.f304315L.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        C40061z zVar = (C40061z) hxVar2.f304316M.mo17428b();
        C40061z zVar2 = zVar;
        zVar.getClass();
        C40062d dVar5 = (C40062d) hxVar2.f304317N.mo17428b();
        C40062d dVar6 = dVar5;
        dVar5.getClass();
        C21232ab abVar = (C21232ab) hxVar2.f304318O.mo17428b();
        C21232ab abVar2 = abVar;
        abVar.getClass();
        C68214a a10 = C68219e.m98518a(((C68226l) hxVar2.f304319P).f184585a);
        C68214a aVar18 = a10;
        a10.getClass();
        C58833ax axVar5 = (C58833ax) hxVar2.f304320Q.mo17428b();
        C58833ax axVar6 = axVar5;
        axVar5.getClass();
        C58833ax axVar7 = (C58833ax) hxVar2.f304321R.mo17428b();
        C58833ax axVar8 = axVar7;
        axVar7.getClass();
        C58833ax axVar9 = (C58833ax) hxVar2.f304322S.mo17428b();
        C58833ax axVar10 = axVar9;
        axVar9.getClass();
        C68214a a11 = C68219e.m98518a(((C68226l) hxVar2.f304323T).f184585a);
        C68214a aVar19 = a11;
        a11.getClass();
        C11054a aVar20 = (C11054a) hxVar2.f304324U.mo17428b();
        C11054a aVar21 = aVar20;
        aVar20.getClass();
        C68214a a12 = C68219e.m98518a(((C68226l) hxVar2.f304325V).f184585a);
        C68214a aVar22 = a12;
        a12.getClass();
        C68214a a13 = C68219e.m98518a(((C68226l) hxVar2.f304326W).f184585a);
        C68214a aVar23 = a13;
        a13.getClass();
        C68214a a14 = C68219e.m98518a(((C68226l) hxVar2.f304327X).f184585a);
        C68214a aVar24 = a14;
        a14.getClass();
        C68214a a15 = C68219e.m98518a(((C68226l) hxVar2.f304328Y).f184585a);
        C68214a aVar25 = a15;
        a15.getClass();
        C68214a a16 = C68219e.m98518a(((C68226l) hxVar2.f304329Z).f184585a);
        C68214a aVar26 = a16;
        a16.getClass();
        C68214a a17 = C68219e.m98518a(((C68226l) hxVar2.f304331aa).f184585a);
        C68214a aVar27 = a17;
        a17.getClass();
        C39141kp kpVar = (C39141kp) hxVar2.f304332ab.mo17428b();
        C39141kp kpVar2 = kpVar;
        kpVar.getClass();
        C68214a a18 = C68219e.m98518a(((C68226l) hxVar2.f304333ac).f184585a);
        a18.getClass();
        C109258hw hwVar2 = new C109258hw(hVar2, baVar, gVar, wVar2, boVar2, asVar2, kVar2, eVar, aiVar2, aVar2, context2, ijVar2, aVar3, aVar4, aVar6, amVar2, dVar2, aoVar2, gVar3, axVar2, iVar2, aVar8, aVar9, lVar2, dVar4, axVar4, mVar2, gVar5, gVar7, aVar10, gVar9, lVar4, mVar4, bVar2, pVar2, aVar11, crVar2, booleanValue, aVar12, aVar13, aVar15, aVar16, bVar4, uVar2, query2, aVar17, booleanValue2, zVar2, dVar6, abVar2, aVar18, axVar6, axVar8, axVar10, aVar19, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, kpVar2, a18);
        return hwVar;
    }
}
