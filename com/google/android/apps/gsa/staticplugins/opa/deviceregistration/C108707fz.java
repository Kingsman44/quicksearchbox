package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fz */
/* compiled from: PG */
public final /* synthetic */ class C108707fz implements C83874ah {

    /* renamed from: a */
    public static final /* synthetic */ C108707fz f302325a = new C108707fz();

    private /* synthetic */ C108707fz() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Throwable th = (Throwable) obj;
        C59104x c = C108709ga.f302327a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SetupCompleteSeq");
        ((C59052c) ((C59052c) c).mo56372aa(24223)).mo56386p("Failed to get HA provider");
        return C83875ai.m133537b(new C108704fw());
    }
}
