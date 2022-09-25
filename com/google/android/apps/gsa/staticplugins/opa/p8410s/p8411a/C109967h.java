package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4541l.C59326i;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a.C64163d;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.h */
/* compiled from: PG */
public final /* synthetic */ class C109967h implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C109969j f306418a;

    /* renamed from: b */
    public final /* synthetic */ C64163d f306419b;

    public /* synthetic */ C109967h(C109969j jVar, C64163d dVar) {
        this.f306418a = jVar;
        this.f306419b = dVar;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C109969j jVar = this.f306418a;
        C64163d dVar = this.f306419b;
        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
        C51805du duVar = dVar.f173478b;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        duVar.getClass();
        dgVar.f132833e = duVar;
        dgVar.f132829a |= 8;
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = ((C51016dg) dfVar.build()).toByteArray();
        Intent parseUri = Intent.parseUri("intent:#Intent;action=assistant.cards.USER_INTERACTION;scheme=assistant;S.interactive_element=" + iVar.mo56837l(byteArray, byteArray.length) + ";end;", 0);
        C87680ah ahVar = jVar.f306422a;
        C88489j jVar2 = new C88489j(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT);
        jVar2.mo82015c(parseUri);
        ahVar.mo81961c(jVar2.mo82013a());
    }
}
