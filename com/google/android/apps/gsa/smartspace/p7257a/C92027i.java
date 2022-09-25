package com.google.android.apps.gsa.smartspace.p7257a;

import com.google.assistant.p3886c.C50694af;
import com.google.assistant.p3886c.C50695ag;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.smartspace.a.i */
/* compiled from: PG */
public final /* synthetic */ class C92027i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92030l f256558a;

    public /* synthetic */ C92027i(C92030l lVar) {
        this.f256558a = lVar;
    }

    public final Object apply(Object obj) {
        C92030l lVar = this.f256558a;
        C50695ag agVar = (C50695ag) obj;
        boolean z = false;
        if (C92030l.m151039c(agVar)) {
            ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11979)).mo56386p("Start count");
            long a = lVar.mo86681a(lVar.f256566c.mo57444a(), 0);
            boolean z2 = agVar.f131902d;
            if (a <= 0) {
                z = true;
            }
            lVar.mo86682b(z2, z, lVar.f256566c.mo57444a());
            C50694af afVar = (C50694af) C50695ag.f131897e.createBuilder();
            long epochMilli = lVar.f256566c.mo57444a().toEpochMilli();
            afVar.copyOnWrite();
            C50695ag agVar2 = (C50695ag) afVar.instance;
            agVar2.f131899a |= 1;
            agVar2.f131900b = epochMilli;
            afVar.copyOnWrite();
            C50695ag agVar3 = (C50695ag) afVar.instance;
            agVar3.f131899a |= 2;
            agVar3.f131901c = 1;
            afVar.copyOnWrite();
            C50695ag agVar4 = (C50695ag) afVar.instance;
            agVar4.f131899a |= 4;
            agVar4.f131902d = z;
            return (C50695ag) afVar.build();
        }
        ((C58970a) ((C58970a) lVar.f256565b.mo56224b()).mo56372aa(11978)).mo56386p("Increase count");
        long a2 = lVar.mo86681a(Instant.ofEpochMilli(agVar.f131900b), agVar.f131901c);
        boolean z3 = agVar.f131902d;
        if (a2 <= 0) {
            z = true;
        }
        lVar.mo86682b(z3, z, Instant.ofEpochMilli(agVar.f131900b));
        C50694af afVar2 = (C50694af) agVar.toBuilder();
        int i = agVar.f131901c;
        afVar2.copyOnWrite();
        C50695ag agVar5 = (C50695ag) afVar2.instance;
        agVar5.f131899a |= 2;
        agVar5.f131901c = i + 1;
        afVar2.copyOnWrite();
        C50695ag agVar6 = (C50695ag) afVar2.instance;
        agVar6.f131899a |= 4;
        agVar6.f131902d = z;
        return (C50695ag) afVar2.build();
    }
}
