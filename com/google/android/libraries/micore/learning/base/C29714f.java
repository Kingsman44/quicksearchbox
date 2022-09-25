package com.google.android.libraries.micore.learning.base;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.libraries.micore.learning.base.f */
/* compiled from: PG */
public final class C29714f implements C29724p {

    /* renamed from: a */
    private final ConnectivityManager f80482a;

    public C29714f(Context context) {
        this.f80482a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final int mo34858a() {
        ConnectivityManager connectivityManager = this.f80482a;
        if (connectivityManager == null) {
            return 1;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 2;
        }
        return this.f80482a.isActiveNetworkMetered() ? 3 : 4;
    }
}
