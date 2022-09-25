package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: org.chromium.net.u */
/* compiled from: PG */
final class C72556u extends BroadcastReceiver {

    /* renamed from: a */
    private final ProxyChangeListener f193076a;

    public C72556u(ProxyChangeListener proxyChangeListener) {
        this.f193076a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.f193076a.updateProxyConfigFromConnectivityManager(intent);
        }
    }
}
