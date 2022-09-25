package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.s */
/* compiled from: PG */
final class C30693s extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C31036ak f82846a;

    public C30693s(C31036ak akVar) {
        this.f82846a = akVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            this.f82846a.dismiss();
        }
    }
}
