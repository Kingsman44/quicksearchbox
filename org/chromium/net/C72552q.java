package org.chromium.net;

import android.net.Network;

/* renamed from: org.chromium.net.q */
/* compiled from: PG */
final class C72552q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Network f193070a;

    /* renamed from: b */
    final /* synthetic */ C72554s f193071b;

    public C72552q(C72554s sVar, Network network) {
        this.f193071b = sVar;
        this.f193070a = network;
    }

    public final void run() {
        this.f193071b.f193075b.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(this.f193070a));
    }
}
