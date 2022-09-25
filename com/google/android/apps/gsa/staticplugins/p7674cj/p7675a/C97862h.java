package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.h */
/* compiled from: PG */
final class C97862h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f273268a;

    /* renamed from: b */
    final /* synthetic */ C97863i f273269b;

    public C97862h(C97863i iVar, SettableFuture settableFuture) {
        this.f273269b = iVar;
        this.f273268a = settableFuture;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f273268a.cancel(false);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C60856cj.m92911t(this.f273269b.f273270a.f273276f.mo28201a("post-visit-badge-service", new C97859e(this, iBinder, this.f273268a)), new C97861g(this), C60826bg.f164896a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f273268a.cancel(false);
    }
}
