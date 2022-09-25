package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97890ap;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97893as;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97894at;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97895au;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97896av;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97897aw;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.g.t */
/* compiled from: PG */
public final /* synthetic */ class C140156t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140133ai f380819a;

    /* renamed from: b */
    public final /* synthetic */ C140646b f380820b;

    public /* synthetic */ C140156t(C140133ai aiVar, C140646b bVar) {
        this.f380819a = aiVar;
        this.f380820b = bVar;
    }

    public final void accept(Object obj) {
        C140133ai aiVar = this.f380819a;
        C140131ag agVar = (C140131ag) obj;
        C58485gu n = C58485gu.m89846n(C140133ai.m227789a(this.f380820b));
        C58480gp e = C58485gu.m89837e();
        C58801sm G = n.listIterator(0);
        while (G.hasNext()) {
            C97929s sVar = (C97929s) G.next();
            C97890ap apVar = (C97890ap) C97897aw.f273341c.createBuilder();
            C97895au auVar = (C97895au) C97896av.f273337c.createBuilder();
            C97893as asVar = (C97893as) C97894at.f273331e.createBuilder();
            C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
            String str = sVar.f273455c;
            csVar.copyOnWrite();
            str.getClass();
            ((C54394ct) csVar.instance).f142868a = str;
            String str2 = sVar.f273456d;
            csVar.copyOnWrite();
            str2.getClass();
            ((C54394ct) csVar.instance).f142869b = str2;
            asVar.copyOnWrite();
            C97894at atVar = (C97894at) asVar.instance;
            C54394ct ctVar = (C54394ct) csVar.build();
            ctVar.getClass();
            atVar.f273335c = ctVar;
            atVar.f273334b = 1;
            auVar.copyOnWrite();
            C97896av avVar = (C97896av) auVar.instance;
            C97894at atVar2 = (C97894at) asVar.build();
            atVar2.getClass();
            avVar.f273340b = atVar2;
            avVar.f273339a |= 1;
            apVar.copyOnWrite();
            C97897aw awVar = (C97897aw) apVar.instance;
            C97896av avVar2 = (C97896av) auVar.build();
            avVar2.getClass();
            awVar.f273344b = avVar2;
            awVar.f273343a = 2;
            e.mo55395g((C97897aw) apVar.build());
        }
        if (agVar.mo115468b(e.mo55394f())) {
            C140129ae aeVar = aiVar.f380788d;
            agVar.getClass();
            aeVar.mo115466a(agVar);
            aiVar.mo115475f();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
