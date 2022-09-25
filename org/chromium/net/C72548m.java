package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* renamed from: org.chromium.net.m */
/* compiled from: PG */
final class C72548m extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ NetworkChangeNotifierAutoDetect f193060a;

    public C72548m(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f193060a = networkChangeNotifierAutoDetect;
    }

    public final void onAvailable(Network network) {
        if (this.f193060a.mRegistered) {
            this.f193060a.connectionTypeChanged();
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        onAvailable((Network) null);
    }

    public final void onLost(Network network) {
        onAvailable((Network) null);
    }
}
