package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.j */
/* compiled from: PG */
public final class C143935j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C143939n f390127a;

    /* renamed from: b */
    private final int f390128b;

    public C143935j(C143939n nVar, int i) {
        this.f390127a = nVar;
        this.f390128b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C143906av avVar;
        int i;
        int i2;
        if (iBinder == null) {
            C143939n nVar = this.f390127a;
            synchronized (nVar.f390159w) {
                i = nVar.f390134A;
            }
            if (i == 3) {
                nVar.f390140G = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = nVar.f390158v;
            handler.sendMessage(handler.obtainMessage(i2, nVar.f390142I.get(), 16));
            return;
        }
        synchronized (this.f390127a.f390160x) {
            C143939n nVar2 = this.f390127a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C143906av)) {
                avVar = new C143906av(iBinder);
            } else {
                avVar = (C143906av) queryLocalInterface;
            }
            nVar2.f390143J = avVar;
        }
        this.f390127a.mo119463V(0, this.f390128b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f390127a.f390160x) {
            this.f390127a.f390143J = null;
        }
        Handler handler = this.f390127a.f390158v;
        handler.sendMessage(handler.obtainMessage(6, this.f390128b, 1));
    }
}
