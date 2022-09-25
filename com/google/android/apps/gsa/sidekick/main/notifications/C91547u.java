package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Intent;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.u */
/* compiled from: PG */
public final /* synthetic */ class C91547u implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NotificationRefreshReceiver f255345a;

    /* renamed from: b */
    public final /* synthetic */ Intent f255346b;

    public /* synthetic */ C91547u(NotificationRefreshReceiver notificationRefreshReceiver, Intent intent) {
        this.f255345a = notificationRefreshReceiver;
        this.f255346b = intent;
    }

    public final void run() {
        NotificationRefreshReceiver notificationRefreshReceiver = this.f255345a;
        Intent intent = this.f255346b;
        C91544r rVar = (C91544r) notificationRefreshReceiver.f255190e.mo27525b();
        for (C7718hj h : C91978bb.m150939e(intent, "notification_entries")) {
            rVar.f255333b.mo85843h(h);
        }
    }
}
