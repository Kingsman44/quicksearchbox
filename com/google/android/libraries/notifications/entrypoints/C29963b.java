package com.google.android.libraries.notifications.entrypoints;

import android.content.Intent;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.entrypoints.b */
/* compiled from: PG */
public final /* synthetic */ class C29963b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f81119a;

    /* renamed from: b */
    public final /* synthetic */ C29965d f81120b;

    /* renamed from: c */
    public final /* synthetic */ C30007h f81121c;

    /* renamed from: d */
    public final /* synthetic */ long f81122d;

    public /* synthetic */ C29963b(Intent intent, C29965d dVar, C30007h hVar, long j) {
        this.f81119a = intent;
        this.f81120b = dVar;
        this.f81121c = hVar;
        this.f81122d = j;
    }

    public final void run() {
        Intent intent = this.f81119a;
        C29965d dVar = this.f81120b;
        C30007h hVar = this.f81121c;
        long j = this.f81122d;
        int i = C29964c.f81124b;
        C30058b.m55793e("ChimeBroadcastReceiver", "Executing action in BroadcastReceiver [%s].", intent.getAction());
        C29964c.m55537b(dVar, intent, hVar, j);
    }
}
