package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.util.C113873da;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.iu */
/* compiled from: PG */
final class C108440iu extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ToggleSettingCard f301633a;

    public C108440iu(ToggleSettingCard toggleSettingCard) {
        this.f301633a = toggleSettingCard;
    }

    public final void onReceive(Context context, Intent intent) {
        if (C113873da.f315294a.equals(intent.getAction())) {
            this.f301633a.f300945o.setChecked(intent.getIntExtra(C113873da.f315295b, -1) == C113873da.f315296c);
        }
    }
}
