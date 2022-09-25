package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ix */
/* compiled from: PG */
final class C108443ix extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ToggleSettingCard f301636a;

    public C108443ix(ToggleSettingCard toggleSettingCard) {
        this.f301636a = toggleSettingCard;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f301636a.f300945o.setChecked(C90772bp.m148277D(context));
    }
}
