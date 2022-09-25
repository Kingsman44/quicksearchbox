package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.ec */
/* compiled from: PG */
public final class C145331ec extends C145478jo {
    public C145331ec(C145488jy jyVar) {
        super(jyVar);
    }

    /* renamed from: a */
    public final boolean mo120907a() {
        mo121194J();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f393011w.f392931a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }
}
