package com.google.android.libraries.assistant.auto.tng.common.p926m.p927a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.m.a.a */
/* compiled from: PG */
public final class C13293a {

    /* renamed from: a */
    private final ConnectivityManager f40998a;

    public C13293a(ConnectivityManager connectivityManager) {
        this.f40998a = connectivityManager;
    }

    /* renamed from: a */
    public final boolean mo21011a() {
        Network activeNetwork = this.f40998a.getActiveNetwork();
        NetworkCapabilities networkCapabilities = this.f40998a.getNetworkCapabilities(activeNetwork);
        return activeNetwork != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && networkCapabilities.hasCapability(21);
    }
}
