package com.google.android.apps.gsa.staticplugins.opa;

import android.app.KeyguardManager;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mb */
/* compiled from: PG */
final class C109463mb extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ C109465md f304883a;

    public C109463mb(C109465md mdVar) {
        this.f304883a = mdVar;
    }

    public final void onDismissCancelled() {
        C58976aa aaVar = C58975e.f156826a;
        this.f304883a.f54539k.mo24855e();
    }

    public final void onDismissError() {
        C59104x c = C109465md.f304885a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaDismissKeyguardAct");
        ((C59052c) ((C59052c) c).mo56372aa(22955)).mo56386p("Error dismissing keyguard");
        this.f304883a.f54539k.mo24855e();
    }

    public final void onDismissSucceeded() {
        C58976aa aaVar = C58975e.f156826a;
        C109465md mdVar = this.f304883a;
        mdVar.f304890f = true;
        mdVar.mo97844h();
    }
}
