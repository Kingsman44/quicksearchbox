package com.google.android.apps.gsa.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.startup.b */
/* compiled from: PG */
public final /* synthetic */ class C92660b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StartUpReceiver f258656a;

    /* renamed from: b */
    public final /* synthetic */ Context f258657b;

    /* renamed from: c */
    public final /* synthetic */ Intent f258658c;

    /* renamed from: d */
    public final /* synthetic */ BroadcastReceiver.PendingResult f258659d;

    public /* synthetic */ C92660b(StartUpReceiver startUpReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f258656a = startUpReceiver;
        this.f258657b = context;
        this.f258658c = intent;
        this.f258659d = pendingResult;
    }

    public final void run() {
        StartUpReceiver startUpReceiver = this.f258656a;
        Context context = this.f258657b;
        Intent intent = this.f258658c;
        BroadcastReceiver.PendingResult pendingResult = this.f258659d;
        startUpReceiver.mo87427b(context, intent);
        pendingResult.finish();
    }
}
