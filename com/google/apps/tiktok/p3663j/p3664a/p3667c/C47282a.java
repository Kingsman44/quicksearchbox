package com.google.apps.tiktok.p3663j.p3664a.p3667c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import androidx.core.p093e.C1887a;
import com.google.apps.tiktok.p3663j.p3664a.C47279a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.j.a.c.a */
/* compiled from: PG */
public final class C47282a implements C47279a {

    /* renamed from: a */
    private final ConnectivityManager f122932a;

    public C47282a(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            C58838bb.m90884s(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.f122932a = connectivityManager;
    }

    /* renamed from: a */
    public final boolean mo51162a() {
        boolean a = C1887a.m5146a(this.f122932a);
        NetworkInfo activeNetworkInfo = this.f122932a.getActiveNetworkInfo();
        return !a && activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED;
    }
}
