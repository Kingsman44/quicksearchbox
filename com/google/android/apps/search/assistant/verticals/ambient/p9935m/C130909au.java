package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.au */
/* compiled from: PG */
public final /* synthetic */ class C130909au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f358204a;

    /* renamed from: b */
    public final /* synthetic */ int f358205b;

    public /* synthetic */ C130909au(int i, int i2) {
        this.f358204a = i;
        this.f358205b = i2;
    }

    public final Object apply(Object obj) {
        int i = this.f358204a;
        int i2 = this.f358205b;
        C50833ec ecVar = (C50833ec) obj;
        C59071e eVar = C130912ax.f358209a;
        int max = Math.max(i, ecVar.f132357f);
        int max2 = Math.max(i2, ecVar.f132358g);
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        C50833ec ecVar2 = (C50833ec) dxVar.instance;
        ecVar2.f132352a |= 1;
        ecVar2.f132357f = max;
        dxVar.copyOnWrite();
        C50833ec ecVar3 = (C50833ec) dxVar.instance;
        ecVar3.f132352a |= 2;
        ecVar3.f132358g = max2;
        return (C50833ec) dxVar.build();
    }
}
