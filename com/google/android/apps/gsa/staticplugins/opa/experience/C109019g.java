package com.google.android.apps.gsa.staticplugins.opa.experience;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.experience.g */
/* compiled from: PG */
final class C109019g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ OpaBActivity f303161a;

    public C109019g(OpaBActivity opaBActivity) {
        this.f303161a = opaBActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        OpaBActivity opaBActivity = this.f303161a;
        opaBActivity.f303127B = null;
        opaBActivity.f303128C = null;
        if (opaBActivity.f303142v) {
            opaBActivity.mo97374x(3);
        } else {
            opaBActivity.mo97375y();
        }
    }
}
