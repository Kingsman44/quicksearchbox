package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: org.chromium.net.i */
/* compiled from: PG */
final class C72439i implements NetworkChangeNotifierAutoDetect.Observer {

    /* renamed from: a */
    final /* synthetic */ NetworkChangeNotifier f192664a;

    public C72439i(NetworkChangeNotifier networkChangeNotifier) {
        this.f192664a = networkChangeNotifier;
    }

    public final void onConnectionCostChanged(int i) {
        this.f192664a.notifyObserversOfConnectionCostChange(i);
    }

    public final void onConnectionSubtypeChanged(int i) {
        this.f192664a.notifyObserversOfConnectionSubtypeChange(i);
    }

    public final void onConnectionTypeChanged(int i) {
        this.f192664a.updateCurrentConnectionType(i);
    }

    public final void onNetworkConnect(long j, int i) {
        this.f192664a.notifyObserversOfNetworkConnect(j, i);
    }

    public final void onNetworkDisconnect(long j) {
        this.f192664a.notifyObserversOfNetworkDisconnect(j);
    }

    public final void onNetworkSoonToDisconnect(long j) {
        this.f192664a.notifyObserversOfNetworkSoonToDisconnect(j);
    }

    public final void purgeActiveNetworkList(long[] jArr) {
        this.f192664a.notifyObserversToPurgeActiveNetworkList(jArr);
    }
}
