package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.n */
/* compiled from: PG */
public final class C4607n {
    /* renamed from: a */
    public static final Network m13002a(ConnectivityManager connectivityManager) {
        C69664n.m101061g(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
