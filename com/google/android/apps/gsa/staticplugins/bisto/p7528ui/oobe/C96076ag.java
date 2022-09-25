package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ag */
/* compiled from: PG */
public final /* synthetic */ class C96076ag implements C83874ah {

    /* renamed from: a */
    public final /* synthetic */ C96082am f268995a;

    public /* synthetic */ C96076ag(C96082am amVar) {
        this.f268995a = amVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96082am amVar = this.f268995a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C83875ai.f228524a;
        }
        C95299e eVar = amVar.f269005c;
        C58976aa aaVar = C58975e.f156826a;
        eVar.f266647b.mo57066b("FixAccountToken");
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent", (Parcelable) axVar.mo56107c());
        return C83875ai.m133540e(new C96081al(), bundle);
    }
}
