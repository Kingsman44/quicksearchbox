package com.google.android.apps.gsa.staticplugins.nga.p8067j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.j.az */
/* compiled from: PG */
final class C103345az implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C103347ba f288135a;

    public C103345az(C103347ba baVar) {
        this.f288135a = baVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f288135a.f288138b.mo28212l("[NGA] process messages after connection", new C103343ax(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f288135a.f288138b.mo28212l("[NGA] NgaInteractorConnection::onServiceDisconnected", new C103344ay(this));
    }
}
