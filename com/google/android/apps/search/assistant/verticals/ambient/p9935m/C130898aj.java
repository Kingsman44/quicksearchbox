package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.aj */
/* compiled from: PG */
public final /* synthetic */ class C130898aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358191a;

    public /* synthetic */ C130898aj(C130912ax axVar) {
        this.f358191a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358191a;
        C50833ec ecVar = (C50833ec) obj;
        if (ecVar.f132359h) {
            axVar.f358212b.mo41674H(axVar.f358213c, "FLP", "foreground", true);
        }
        if (ecVar.f132360i) {
            axVar.f358212b.mo41674H(axVar.f358213c, "CSL", "background", true);
        }
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        C50833ec ecVar2 = (C50833ec) dxVar.instance;
        ecVar2.f132352a &= -5;
        ecVar2.f132359h = false;
        dxVar.copyOnWrite();
        C50833ec ecVar3 = (C50833ec) dxVar.instance;
        ecVar3.f132352a &= -9;
        ecVar3.f132360i = false;
        return (C50833ec) dxVar.build();
    }
}
