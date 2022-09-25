package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.am */
/* compiled from: PG */
public final /* synthetic */ class C130901am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358194a;

    public /* synthetic */ C130901am(C130912ax axVar) {
        this.f358194a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358194a;
        C50833ec ecVar = (C50833ec) obj;
        if (ecVar.f132353b.size() == 0) {
            return ecVar;
        }
        for (Integer intValue : Collections.unmodifiableMap(ecVar.f132353b).keySet()) {
            axVar.f358212b.mo41670D(axVar.f358213c, C50794cr.m85938a(intValue.intValue()).name(), true, BuildConfig.FLAVOR);
        }
        axVar.f358212b.mo41670D(axVar.f358213c, "ALL", true, BuildConfig.FLAVOR);
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        ((C50833ec) dxVar.instance).mo53480a().clear();
        return (C50833ec) dxVar.build();
    }
}
