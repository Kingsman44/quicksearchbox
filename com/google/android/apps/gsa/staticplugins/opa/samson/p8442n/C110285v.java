package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.KeyguardManager;
import android.content.Intent;
import android.view.View;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.aky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.v */
/* compiled from: PG */
public final /* synthetic */ class C110285v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110287x f307351a;

    /* renamed from: b */
    public final /* synthetic */ Intent f307352b;

    /* renamed from: c */
    public final /* synthetic */ aky f307353c;

    /* renamed from: d */
    public final /* synthetic */ C50794cr f307354d;

    public /* synthetic */ C110285v(C110287x xVar, Intent intent, aky aky, C50794cr crVar) {
        this.f307351a = xVar;
        this.f307352b = intent;
        this.f307353c = aky;
        this.f307354d = crVar;
    }

    public final void onClick(View view) {
        C110287x xVar = this.f307351a;
        Intent intent = this.f307352b;
        aky aky = this.f307353c;
        C50794cr crVar = this.f307354d;
        if (((KeyguardManager) xVar.f307361a.getSystemService("keyguard")).isKeyguardLocked()) {
            xVar.f307368h.mo95770e(new C110286w(xVar, intent, aky, crVar));
            return;
        }
        xVar.f307369i.mo86770h(xVar.f307361a, intent);
        xVar.f307366f.mo77147c(aky, crVar);
    }
}
