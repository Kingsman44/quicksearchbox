package com.google.android.libraries.search.video.p3194d;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.apps.gsa.p8867w.p8879i.C118817r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8590q;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.search.video.d.g */
/* compiled from: PG */
public final class C41496g {

    /* renamed from: a */
    private final ConnectivityManager f108408a;

    /* renamed from: b */
    private final C60870cx f108409b;

    public C41496g(ConnectivityManager connectivityManager, C118817r rVar) {
        this.f108408a = connectivityManager;
        this.f108409b = rVar.mo103997a();
    }

    /* renamed from: a */
    public final C8590q mo44017a() {
        try {
            return (C8590q) C60856cj.m92909r(this.f108409b);
        } catch (ExecutionException unused) {
            return C8590q.AUTOPLAY_UNSPECIFIED;
        }
    }

    /* renamed from: b */
    public final int mo44018b() {
        Network activeNetwork = this.f108408a.getActiveNetwork();
        if (activeNetwork == null) {
            return 1;
        }
        NetworkCapabilities networkCapabilities = this.f108408a.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            return 2;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            return 3;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 4;
        }
        return 1;
    }
}
