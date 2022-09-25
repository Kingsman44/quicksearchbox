package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;

/* compiled from: PG */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountType");
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                String string = intent.getExtras().getString("authAccount");
                if (string.contains("../") || string.contains("/..")) {
                    Log.w("AccountRemovedRecv", "Got an invalid account name for P/H that includes '..':" + string + ". Exiting.");
                    return;
                }
                C31760t b = C31760t.m59099b(context);
                if (b != null) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    C60856cj.m92893b(C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(C31700as.m59035a(b).mo46039a(new C31697ap(string), b.mo37368h())), new C31698aq(b, string), b.mo37368h()), IOException.class, C31735c.f85314a, C60826bg.f164896a), b.mo37368h().mo19398a(new C31737d(context, string))).mo57334a(new C31738e(goAsync), C60826bg.f164896a);
                }
            }
        }
    }
}
