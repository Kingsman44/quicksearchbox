package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ao */
/* compiled from: PG */
public final /* synthetic */ class C130903ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358196a;

    public /* synthetic */ C130903ao(C130912ax axVar) {
        this.f358196a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358196a;
        C50833ec ecVar = (C50833ec) obj;
        int i = ecVar.f132352a;
        if (!((i & 1) == 0 && (i & 2) == 0)) {
            axVar.f358212b.mo41695j(axVar.f358213c, ecVar.f132357f, ecVar.f132358g, true);
        }
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        C50833ec ecVar2 = (C50833ec) dxVar.instance;
        ecVar2.f132352a &= -2;
        ecVar2.f132357f = 0;
        dxVar.copyOnWrite();
        C50833ec ecVar3 = (C50833ec) dxVar.instance;
        ecVar3.f132352a &= -3;
        ecVar3.f132358g = 0;
        return (C50833ec) dxVar.build();
    }
}
