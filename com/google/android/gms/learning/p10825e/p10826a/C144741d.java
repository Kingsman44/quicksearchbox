package com.google.android.gms.learning.p10825e.p10826a;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.learning.dynamite.proxy.C144646p;
import com.google.android.gms.learning.dynamite.proxy.C144648r;
import com.google.android.gms.libs.p10836d.p10840d.C144863b;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.gms.learning.e.a.d */
/* compiled from: PG */
final class C144741d extends C144863b {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f391544a;

    /* renamed from: b */
    final /* synthetic */ C144749l f391545b;

    public C144741d(C144749l lVar, SettableFuture settableFuture) {
        this.f391545b = lVar;
        this.f391544a = settableFuture;
    }

    /* renamed from: a */
    public final void mo120166a(ComponentName componentName) {
    }

    /* renamed from: b */
    public final void mo120167b(IBinder iBinder) {
        Object obj;
        SettableFuture settableFuture = this.f391544a;
        if (iBinder == null) {
            obj = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
            obj = queryLocalInterface instanceof C144648r ? (C144648r) queryLocalInterface : new C144646p(iBinder);
        }
        settableFuture.mo57356n(obj);
        try {
            iBinder.linkToDeath(this.f391545b.f391581j, 0);
        } catch (RemoteException unused) {
            this.f391545b.f391574c.mo34866h("Could not link to death, process probably already died");
        }
    }
}
