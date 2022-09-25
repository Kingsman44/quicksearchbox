package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cu */
/* compiled from: PG */
public final /* synthetic */ class C114851cu implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318642a;

    /* renamed from: b */
    public final /* synthetic */ Intent f318643b;

    public /* synthetic */ C114851cu(C114860dc dcVar, Intent intent) {
        this.f318642a = dcVar;
        this.f318643b = intent;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C114860dc dcVar = this.f318642a;
        Intent intent = this.f318643b;
        if (abVar.mo122491j()) {
            C58976aa aaVar = C58975e.f156826a;
            dcVar.mo101660e(intent);
            return;
        }
        C59104x d = C114860dc.f318661a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
        ((C59052c) ((C59052c) d).mo56372aa(29623)).mo56386p("#RecordConsentCallback(): Audit recording failed.");
    }
}
