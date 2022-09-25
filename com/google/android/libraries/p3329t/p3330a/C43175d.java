package com.google.android.libraries.p3329t.p3330a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.libraries.t.a.d */
/* compiled from: PG */
final class C43175d implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C43176e f112880a;

    public C43175d(C43176e eVar) {
        this.f112880a = eVar;
    }

    /* renamed from: a */
    private final void m76152a() {
        this.f112880a.f112882b.post(new C43174c(this));
        C43176e eVar = this.f112880a;
        eVar.f112886f = null;
        eVar.f112885e.mo46250b((Object) null);
        this.f112880a.mo46242b();
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f112880a.f112890j.incrementAndGet();
        m76152a();
    }

    public final void onNullBinding(ComponentName componentName) {
        this.f112880a.f112891k.incrementAndGet();
        m76152a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f112880a.f112887g.incrementAndGet();
        C43176e eVar = this.f112880a;
        eVar.f112885e.mo46250b((IInterface) eVar.f112883c.apply(iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C43176e eVar = this.f112880a;
        if (eVar.f112886f == this) {
            eVar.f112889i.incrementAndGet();
        }
        this.f112880a.f112885e.mo46250b((Object) null);
    }
}
