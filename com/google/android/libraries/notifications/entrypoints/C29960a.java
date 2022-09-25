package com.google.android.libraries.notifications.entrypoints;

import android.content.Intent;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.entrypoints.a */
/* compiled from: PG */
public final /* synthetic */ class C29960a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f81111a;

    /* renamed from: b */
    public final /* synthetic */ C29965d f81112b;

    /* renamed from: c */
    public final /* synthetic */ long f81113c;

    public /* synthetic */ C29960a(Intent intent, C29965d dVar, long j) {
        this.f81111a = intent;
        this.f81112b = dVar;
        this.f81113c = j;
    }

    public final void run() {
        Intent intent = this.f81111a;
        C29965d dVar = this.f81112b;
        long j = this.f81113c;
        int i = C29964c.f81124b;
        C30058b.m55793e("ChimeBroadcastReceiver", "Executing action in Service [%s].", intent.getAction());
        C29964c.m55537b(dVar, intent, C30007h.m55637d(), j);
    }
}
