package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.widget.Switch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.iv */
/* compiled from: PG */
final class C108441iv extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ToggleSettingCard f301634a;

    public C108441iv(ToggleSettingCard toggleSettingCard) {
        this.f301634a = toggleSettingCard;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            Switch switchR = this.f301634a.f300945o;
            boolean z = false;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                z = true;
            }
            switchR.setChecked(z);
        }
    }
}
