package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fy */
/* compiled from: PG */
public final /* synthetic */ class C108706fy implements C83874ah {

    /* renamed from: a */
    public static final /* synthetic */ C108706fy f302324a = new C108706fy();

    private /* synthetic */ C108706fy() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C108704fw fwVar = new C108704fw();
        String str = axVar.mo56113h() ? ((C50181no) axVar.mo56107c()).f130447b : null;
        C58976aa aaVar = C58975e.f156826a;
        Bundle bundle = new Bundle();
        if (!C58837ba.m90859h(str)) {
            bundle.putString("HA-provider-name", str);
        }
        return C83875ai.m133540e(fwVar, bundle);
    }
}
