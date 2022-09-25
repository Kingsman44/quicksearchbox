package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.m */
/* compiled from: PG */
public final class C4606m {
    /* renamed from: a */
    public static final NetworkCapabilities m12999a(ConnectivityManager connectivityManager, Network network) {
        C69664n.m101061g(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final void m13000b(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C69664n.m101061g(connectivityManager, "<this>");
        C69664n.m101061g(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    /* renamed from: c */
    public static final boolean m13001c(NetworkCapabilities networkCapabilities, int i) {
        C69664n.m101061g(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }
}
