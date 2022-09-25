package com.google.android.apps.gsa.staticplugins.opa;

import android.app.KeyguardManager;
import android.os.Bundle;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ik */
/* compiled from: PG */
final class C109276ik extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Bundle f304410a;

    /* renamed from: b */
    final /* synthetic */ EnterOpaActivity f304411b;

    public C109276ik(EnterOpaActivity enterOpaActivity, Bundle bundle) {
        this.f304411b = enterOpaActivity;
        this.f304410a = bundle;
    }

    public final void onDismissCancelled() {
        this.f304411b.finish();
    }

    public final void onDismissError() {
        ((C59052c) ((C59052c) EnterOpaActivity.f295596a.mo56225c()).mo56372aa(22823)).mo56386p("Error dismissing keyguard");
        this.f304411b.finish();
    }

    public final void onDismissSucceeded() {
        this.f304411b.mo95145a(this.f304410a);
    }
}
