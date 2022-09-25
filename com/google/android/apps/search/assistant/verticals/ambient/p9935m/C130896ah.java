package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ah */
/* compiled from: PG */
public final /* synthetic */ class C130896ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358189a;

    public /* synthetic */ C130896ah(C130912ax axVar) {
        this.f358189a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358189a;
        C50833ec ecVar = (C50833ec) obj;
        if (!ecVar.f132361j) {
            return ecVar;
        }
        axVar.f358212b.mo41673G(axVar.f358213c, "ALL", true);
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        C50833ec ecVar2 = (C50833ec) dxVar.instance;
        ecVar2.f132352a |= 16;
        ecVar2.f132361j = false;
        return (C50833ec) dxVar.build();
    }
}
