package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.feedback.C144206k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.e */
/* compiled from: PG */
public final /* synthetic */ class C106407e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106410h f296813a;

    public /* synthetic */ C106407e(C106410h hVar) {
        this.f296813a = hVar;
    }

    public final void onClick(View view) {
        C106410h hVar = this.f296813a;
        C58976aa aaVar = C58975e.f156826a;
        Activity activity = hVar.f296817b;
        AmbientAssistantFeedbackActivity.f296768j = C144206k.m234449a(activity);
        activity.startActivity(new Intent(activity, AmbientAssistantFeedbackActivity.class));
    }
}
