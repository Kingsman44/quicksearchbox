package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.assistant.p3886c.C50835g;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.as */
/* compiled from: PG */
public final /* synthetic */ class C130907as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358201a;

    public /* synthetic */ C130907as(C130912ax axVar) {
        this.f358201a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358201a;
        C50833ec ecVar = (C50833ec) obj;
        if (ecVar.f132355d.size() == 0) {
            return ecVar;
        }
        boolean z = false;
        for (Map.Entry entry : Collections.unmodifiableMap(ecVar.f132355d).entrySet()) {
            C39141kp kpVar = axVar.f358212b;
            String str = axVar.f358213c;
            int b = C50835g.m85970b(((Integer) entry.getKey()).intValue());
            String a = C50835g.m85969a(b);
            if (b != 0) {
                kpVar.mo41667A(str, a, ((Boolean) entry.getValue()).booleanValue() ? 1 : 0, true);
                z |= ((Boolean) entry.getValue()).booleanValue();
            } else {
                throw null;
            }
        }
        axVar.f358212b.mo41667A(axVar.f358213c, "ALL", z ? 1 : 0, true);
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        ((C50833ec) dxVar.instance).mo53482c().clear();
        return (C50833ec) dxVar.build();
    }
}
