package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.iw */
/* compiled from: PG */
final class C108442iw extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ToggleSettingCard f301635a;

    public C108442iw(ToggleSettingCard toggleSettingCard) {
        this.f301635a = toggleSettingCard;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f301635a.f300945o.setChecked(C90772bp.m148282I(context));
    }
}
