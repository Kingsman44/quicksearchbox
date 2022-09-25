package com.google.apps.tiktok.concurrent;

import android.os.PowerManager;

/* renamed from: com.google.apps.tiktok.concurrent.d */
/* compiled from: PG */
public final /* synthetic */ class C46432d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PowerManager.WakeLock f121507a;

    public /* synthetic */ C46432d(PowerManager.WakeLock wakeLock) {
        this.f121507a = wakeLock;
    }

    public final void run() {
        this.f121507a.release();
    }
}
