package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.u */
/* compiled from: PG */
final class C115076u extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ View f319417a;

    /* renamed from: b */
    final /* synthetic */ View f319418b;

    /* renamed from: c */
    final /* synthetic */ C115077v f319419c;

    public C115076u(C115077v vVar, View view, View view2) {
        this.f319419c = vVar;
        this.f319417a = view;
        this.f319418b = view2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f319419c.mo101839j(this.f319417a, this.f319418b);
    }
}
