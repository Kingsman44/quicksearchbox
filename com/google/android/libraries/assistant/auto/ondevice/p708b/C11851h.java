package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60527te;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.h */
/* compiled from: PG */
public final /* synthetic */ class C11851h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11853j f38144a;

    /* renamed from: b */
    public final /* synthetic */ C66525q f38145b;

    public /* synthetic */ C11851h(C11853j jVar, C66525q qVar) {
        this.f38144a = jVar;
        this.f38145b = qVar;
    }

    public final Object apply(Object obj) {
        C11853j jVar = this.f38144a;
        C66525q qVar = this.f38145b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en enVar = (C52081en) axVar.mo56107c();
        eVar.copyOnWrite();
        C51195j jVar2 = (C51195j) eVar.instance;
        enVar.getClass();
        jVar2.f133275j = enVar;
        jVar2.f133266a |= 128;
        C51195j jVar3 = (C51195j) eVar.build();
        jVar.f38151c.e(new TaggerResult(qVar, C60527te.f163903c));
        ((C58970a) ((C58970a) C11853j.f38149a.mo56224b()).mo56372aa(43553)).mo56389s("AssistantResponse created: %s", jVar3);
        return C58833ax.m90834k(jVar3);
    }
}
