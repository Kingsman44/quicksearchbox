package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88258v;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88285w;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88366z;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.assistant.p3825an.p3830c.p3831a.C49295bn;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.b */
/* compiled from: PG */
public final class C107299b {

    /* renamed from: a */
    public static final C59071e f298620a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.e.b");

    /* renamed from: b */
    public final C86124t f298621b;

    /* renamed from: c */
    private final C107698i f298622c;

    public C107299b(C107698i iVar, C86124t tVar) {
        this.f298622c = iVar;
        this.f298621b = tVar;
    }

    /* renamed from: a */
    public final void mo95897a(C87693ab abVar) {
        C107698i iVar = this.f298622c;
        C88489j jVar = new C88489j(C87739bu.APP_ACTIONS_NOTIFICATION);
        jVar.mo82014b(C88258v.f238720a, abVar);
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo95898b(int i, C49295bn bnVar) {
        C88285w wVar = (C88285w) C87693ab.f237115j.createBuilder();
        wVar.copyOnWrite();
        C87693ab abVar = (C87693ab) wVar.instance;
        abVar.f237122f = i - 1;
        abVar.f237117a |= 16;
        String str = bnVar.f127410e;
        wVar.copyOnWrite();
        C87693ab abVar2 = (C87693ab) wVar.instance;
        str.getClass();
        abVar2.f237117a |= 32;
        abVar2.f237123g = str;
        String str2 = bnVar.f127407b;
        wVar.copyOnWrite();
        C87693ab abVar3 = (C87693ab) wVar.instance;
        str2.getClass();
        abVar3.f237117a |= 8;
        abVar3.f237121e = str2;
        C88366z zVar = (C88366z) C87692aa.f237046e.createBuilder();
        String str3 = bnVar.f127409d;
        zVar.copyOnWrite();
        C87692aa aaVar = (C87692aa) zVar.instance;
        str3.getClass();
        aaVar.f237048a |= 2;
        aaVar.f237050c = str3;
        String str4 = bnVar.f127406a;
        zVar.copyOnWrite();
        C87692aa aaVar2 = (C87692aa) zVar.instance;
        str4.getClass();
        aaVar2.f237048a |= 4;
        aaVar2.f237051d = str4;
        String str5 = bnVar.f127408c;
        zVar.copyOnWrite();
        C87692aa aaVar3 = (C87692aa) zVar.instance;
        str5.getClass();
        aaVar3.f237048a |= 1;
        aaVar3.f237049b = str5;
        C87692aa aaVar4 = (C87692aa) zVar.build();
        wVar.copyOnWrite();
        C87693ab abVar4 = (C87693ab) wVar.instance;
        aaVar4.getClass();
        abVar4.f237118b = aaVar4;
        abVar4.f237117a |= 1;
        mo95897a((C87693ab) wVar.build());
    }
}
