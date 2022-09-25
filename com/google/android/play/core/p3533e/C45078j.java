package com.google.android.play.core.p3533e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.e.j */
/* compiled from: PG */
final class C45078j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C45079k f117723a;

    public C45078j(C45079k kVar) {
        this.f117723a = kVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f117723a.f117726b.mo48886d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C45079k kVar = this.f117723a;
        kVar.mo48907a().post(new C45076h(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f117723a.f117726b.mo48886d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C45079k kVar = this.f117723a;
        kVar.mo48907a().post(new C45077i(this));
    }
}
