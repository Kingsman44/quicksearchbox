package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.assistant.p3861at.C49875cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.v */
/* compiled from: PG */
public final /* synthetic */ class C108767v implements C83874ah {

    /* renamed from: a */
    public final /* synthetic */ C108769x f302487a;

    public /* synthetic */ C108767v(C108769x xVar) {
        this.f302487a = xVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108741i iVar;
        C108769x xVar = this.f302487a;
        if (!((Boolean) obj).booleanValue() && (iVar = xVar.f302489a.f302004l) != null && iVar.mo97099b() == C49875cf.LIBASSISTANT) {
            return C83875ai.m133537b(new C108752t());
        }
        return C83875ai.m133539d(new C83956t[0]);
    }
}
