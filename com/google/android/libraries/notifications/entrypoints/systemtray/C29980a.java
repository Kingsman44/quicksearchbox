package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.entrypoints.C29965d;
import com.google.android.libraries.notifications.p2267d.C29785a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.entrypoints.systemtray.a */
/* compiled from: PG */
public final /* synthetic */ class C29980a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f81165a;

    /* renamed from: b */
    public final /* synthetic */ Intent f81166b;

    public /* synthetic */ C29980a(Context context, Intent intent) {
        this.f81165a = context;
        this.f81166b = intent;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Context context = this.f81165a;
        Intent intent = this.f81166b;
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(10);
            C29965d dVar = (C29965d) C29785a.m54946a(context).mo34992ey().get("systemtray");
            if (dVar != null) {
                dVar.mo35261b(intent, C30007h.m55637d(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            }
            Process.setThreadPriority(threadPriority);
        } catch (Throwable th) {
            Process.setThreadPriority(threadPriority);
            throw th;
        }
    }
}
