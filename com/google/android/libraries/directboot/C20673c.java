package com.google.android.libraries.directboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.directboot.c */
/* compiled from: PG */
final class C20673c extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f57952a;

    /* renamed from: b */
    final /* synthetic */ Runnable f57953b;

    /* renamed from: c */
    final /* synthetic */ C2164c f57954c;

    public C20673c(AtomicBoolean atomicBoolean, Runnable runnable, C2164c cVar) {
        this.f57952a = atomicBoolean;
        this.f57953b = runnable;
        this.f57954c = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f57952a.compareAndSet(false, true)) {
            context.unregisterReceiver(this);
            this.f57953b.run();
            this.f57954c.mo5437b((Object) null);
        }
    }
}
