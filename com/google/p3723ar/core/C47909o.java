package com.google.p3723ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.ar.core.o */
/* compiled from: PG */
final class C47909o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C47913s f124049a;

    public C47909o(C47913s sVar) {
        this.f124049a = sVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f124049a.mo52260d(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f124049a.mo52261e();
    }
}
