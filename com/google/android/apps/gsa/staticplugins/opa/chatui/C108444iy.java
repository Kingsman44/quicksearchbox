package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.iy */
/* compiled from: PG */
final class C108444iy extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ToggleSettingCard f301637a;

    public C108444iy(ToggleSettingCard toggleSettingCard) {
        this.f301637a = toggleSettingCard;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f301637a.f300945o.setChecked(C90772bp.m148281H(context));
    }
}
