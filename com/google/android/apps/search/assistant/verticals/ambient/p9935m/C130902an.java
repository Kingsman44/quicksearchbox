package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50832eb;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62970cp;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.an */
/* compiled from: PG */
public final /* synthetic */ class C130902an implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358195a;

    public /* synthetic */ C130902an(C130912ax axVar) {
        this.f358195a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358195a;
        C50833ec ecVar = (C50833ec) obj;
        if (ecVar.f132356e.size() == 0) {
            return ecVar;
        }
        for (Map.Entry entry : Collections.unmodifiableMap(new C62970cp(ecVar.f132356e, C50833ec.f132350l)).entrySet()) {
            int i = ((C50832eb) entry.getValue()).f132348g;
            if (i <= 0 || i > 3) {
                ((C59052c) ((C59052c) C130912ax.f358209a.mo56225c()).mo56372aa(39005)).mo56387q("Invalid presentFrequencyNumber value: %d", i);
            } else {
                C39141kp kpVar = axVar.f358212b;
                ((C19567d) kpVar.f102880bK.mo6453a()).mo24822a(1, axVar.f358213c, (String) entry.getKey(), Integer.valueOf(i));
            }
        }
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        new C62970cp(((C50833ec) dxVar.instance).mo53483d(), C50833ec.f132350l).clear();
        return (C50833ec) dxVar.build();
    }
}
