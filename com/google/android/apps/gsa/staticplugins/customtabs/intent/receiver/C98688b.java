package com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver.b */
/* compiled from: PG */
public final /* synthetic */ class C98688b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f275676a;

    public /* synthetic */ C98688b(BroadcastReceiver.PendingResult pendingResult) {
        this.f275676a = pendingResult;
    }

    public final void run() {
        this.f275676a.finish();
    }
}
