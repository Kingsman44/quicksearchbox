package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97890ap;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97891aq;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97892ar;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97893as;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97894at;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97897aw;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.g.a */
/* compiled from: PG */
public final /* synthetic */ class C140124a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140133ai f380767a;

    /* renamed from: b */
    public final /* synthetic */ C140646b f380768b;

    public /* synthetic */ C140124a(C140133ai aiVar, C140646b bVar) {
        this.f380767a = aiVar;
        this.f380768b = bVar;
    }

    public final void accept(Object obj) {
        C140133ai aiVar = this.f380767a;
        C140131ag agVar = (C140131ag) obj;
        C97929s a = C140133ai.m227789a(this.f380768b);
        long b = agVar.f380778a.mo26870b();
        C97890ap apVar = (C97890ap) C97897aw.f273341c.createBuilder();
        C97891aq aqVar = (C97891aq) C97892ar.f273324f.createBuilder();
        C97893as asVar = (C97893as) C97894at.f273331e.createBuilder();
        C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
        String str = a.f273456d;
        csVar.copyOnWrite();
        str.getClass();
        ((C54394ct) csVar.instance).f142869b = str;
        String str2 = a.f273455c;
        csVar.copyOnWrite();
        str2.getClass();
        ((C54394ct) csVar.instance).f142868a = str2;
        asVar.copyOnWrite();
        C97894at atVar = (C97894at) asVar.instance;
        C54394ct ctVar = (C54394ct) csVar.build();
        ctVar.getClass();
        atVar.f273335c = ctVar;
        atVar.f273334b = 1;
        String str3 = a.f273454b;
        asVar.copyOnWrite();
        C97894at atVar2 = (C97894at) asVar.instance;
        str3.getClass();
        atVar2.f273333a |= 4;
        atVar2.f273336d = str3;
        aqVar.copyOnWrite();
        C97892ar arVar = (C97892ar) aqVar.instance;
        C97894at atVar3 = (C97894at) asVar.build();
        atVar3.getClass();
        arVar.f273329d = atVar3;
        arVar.f273326a |= 1;
        C97928r rVar = (C97928r) a.toBuilder();
        rVar.copyOnWrite();
        C97929s sVar = (C97929s) rVar.instance;
        sVar.f273453a |= 32768;
        sVar.f273468p = b;
        aqVar.copyOnWrite();
        C97892ar arVar2 = (C97892ar) aqVar.instance;
        C97929s sVar2 = (C97929s) rVar.build();
        sVar2.getClass();
        arVar2.f273328c = sVar2;
        arVar2.f273327b = 3;
        aqVar.copyOnWrite();
        C97892ar arVar3 = (C97892ar) aqVar.instance;
        arVar3.f273326a |= 2;
        arVar3.f273330e = b;
        apVar.copyOnWrite();
        C97897aw awVar = (C97897aw) apVar.instance;
        C97892ar arVar4 = (C97892ar) aqVar.build();
        arVar4.getClass();
        awVar.f273344b = arVar4;
        awVar.f273343a = 1;
        if (agVar.mo115468b(C58485gu.m89846n((C97897aw) apVar.build()))) {
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
