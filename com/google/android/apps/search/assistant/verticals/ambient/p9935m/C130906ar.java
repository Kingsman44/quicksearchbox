package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ar */
/* compiled from: PG */
public final /* synthetic */ class C130906ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131177b f358199a;

    /* renamed from: b */
    public final /* synthetic */ String f358200b;

    public /* synthetic */ C130906ar(C131177b bVar, String str) {
        this.f358199a = bVar;
        this.f358200b = str;
    }

    public final Object apply(Object obj) {
        C131177b bVar = this.f358199a;
        String str = this.f358200b;
        C59071e eVar = C130912ax.f358209a;
        C50827dx dxVar = (C50827dx) ((C50833ec) obj).toBuilder();
        dxVar.copyOnWrite();
        ((C50833ec) dxVar.instance).mo53481b().put(bVar.name() + "," + str, true);
        return (C50833ec) dxVar.build();
    }
}
