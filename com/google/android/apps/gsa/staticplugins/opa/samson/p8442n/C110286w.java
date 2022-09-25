package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.KeyguardManager;
import android.content.Intent;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.aky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.w */
/* compiled from: PG */
final class C110286w extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Intent f307355a;

    /* renamed from: b */
    final /* synthetic */ aky f307356b;

    /* renamed from: c */
    final /* synthetic */ C50794cr f307357c;

    /* renamed from: d */
    final /* synthetic */ C110287x f307358d;

    public C110286w(C110287x xVar, Intent intent, aky aky, C50794cr crVar) {
        this.f307358d = xVar;
        this.f307355a = intent;
        this.f307356b = aky;
        this.f307357c = crVar;
    }

    public final void onDismissSucceeded() {
        C110287x xVar = this.f307358d;
        xVar.f307369i.mo86770h(xVar.f307361a, this.f307355a);
        this.f307358d.f307366f.mo77147c(this.f307356b, this.f307357c);
    }
}
