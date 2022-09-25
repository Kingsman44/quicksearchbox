package com.google.apps.tiktok.p3663j.p3664a.p3666b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import com.google.apps.tiktok.p3663j.p3664a.C47279a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.j.a.b.a */
/* compiled from: PG */
public final class C47281a implements C47279a {

    /* renamed from: a */
    private final ConnectivityManager f122931a;

    public C47281a(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            C58838bb.m90884s(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.f122931a = connectivityManager;
    }

    /* renamed from: a */
    public final boolean mo51162a() {
        NetworkInfo activeNetworkInfo = this.f122931a.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
