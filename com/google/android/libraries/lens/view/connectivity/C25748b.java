package com.google.android.libraries.lens.view.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.libraries.lens.view.connectivity.b */
/* compiled from: PG */
final class C25748b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ LensConnectivityManager f70012a;

    public C25748b(LensConnectivityManager lensConnectivityManager) {
        this.f70012a = lensConnectivityManager;
    }

    public final void onAvailable(Network network) {
        this.f70012a.f70005a.execute(new C25747a(this));
    }

    public final void onLost(Network network) {
        this.f70012a.f70005a.execute(new C25747a(this));
    }
}
