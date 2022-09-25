package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.at */
/* compiled from: PG */
final class C79424at extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C79425au f218077a;

    public C79424at(C79425au auVar) {
        this.f218077a = auVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.app.action.INTERRUPTION_FILTER_CHANGED".equals(intent.getAction()) || "android.app.action.NOTIFICATION_POLICY_CHANGED".equals(intent.getAction())) {
            this.f218077a.mo74049e();
        } else {
            ((C58970a) ((C58970a) C79425au.f218078a.mo56226d()).mo56372aa(5642)).mo56389s("got invalid intent: %s", intent);
        }
    }
}
