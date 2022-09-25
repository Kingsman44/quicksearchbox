package com.google.android.apps.gsa.smartspace.p7260d;

import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.smartspace.d.a */
/* compiled from: PG */
public final class C92098a implements C92106i {

    /* renamed from: a */
    private final C83793i f256793a;

    /* renamed from: b */
    private final C92122r f256794b;

    public C92098a(C83793i iVar, C92122r rVar) {
        this.f256793a = iVar;
        this.f256794b = rVar;
    }

    /* renamed from: a */
    public final void mo86739a() {
        if (this.f256794b.mo86772l()) {
            C58976aa aaVar = C58975e.f156826a;
            C83793i iVar = this.f256793a;
            Intent intent = new Intent();
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_TIME_FENCES");
            C74445c.m120396c(iVar.f228383c, intent);
        }
    }
}
