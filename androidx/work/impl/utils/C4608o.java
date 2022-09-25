package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.o */
/* compiled from: PG */
public final class C4608o {
    /* renamed from: a */
    public static final void m13003a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C69664n.m101061g(connectivityManager, "<this>");
        C69664n.m101061g(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
