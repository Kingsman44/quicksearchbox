package com.google.android.gms.libs.p10836d.p10840d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.gms.libs.d.d.b */
/* compiled from: PG */
public abstract class C144863b implements ServiceConnection {
    public C144863b() {
        C144862a aVar = C144862a.f391711a;
    }

    /* renamed from: a */
    public abstract void mo120166a(ComponentName componentName);

    /* renamed from: b */
    public abstract void mo120167b(IBinder iBinder);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo120167b(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        mo120166a(componentName);
    }
}
