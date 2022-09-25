package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.aj */
/* compiled from: PG */
final class C143894aj extends C143891ag {

    /* renamed from: c */
    public final HashMap f390090c = new HashMap();

    /* renamed from: d */
    public final Context f390091d;

    /* renamed from: e */
    public volatile Handler f390092e;

    /* renamed from: f */
    public final C143860a f390093f;

    /* renamed from: g */
    public final long f390094g;

    /* renamed from: h */
    private final C143893ai f390095h;

    /* renamed from: i */
    private final long f390096i;

    public C143894aj(Context context, Looper looper) {
        C143893ai aiVar = new C143893ai(this);
        this.f390095h = aiVar;
        this.f390091d = context.getApplicationContext();
        this.f390092e = new C144861c(looper, aiVar);
        this.f390093f = C143860a.m233845a();
        this.f390096i = 5000;
        this.f390094g = 300000;
    }

    /* renamed from: b */
    public final boolean mo119403b(C143890af afVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z;
        C143919bh.m233971n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f390090c) {
            C143892ah ahVar = (C143892ah) this.f390090c.get(afVar);
            if (ahVar == null) {
                ahVar = new C143892ah(this, afVar);
                ahVar.mo119410d(serviceConnection, serviceConnection);
                ahVar.mo119407a(str, executor);
                this.f390090c.put(afVar, ahVar);
            } else {
                this.f390092e.removeMessages(0, afVar);
                if (!ahVar.mo119408b(serviceConnection)) {
                    ahVar.mo119410d(serviceConnection, serviceConnection);
                    int i = ahVar.f390083b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(ahVar.f390087f, ahVar.f390085d);
                    } else if (i == 2) {
                        ahVar.mo119407a(str, executor);
                    }
                } else {
                    String obj = afVar.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            z = ahVar.f390084c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo119405d(C143890af afVar, ServiceConnection serviceConnection) {
        C143919bh.m233971n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f390090c) {
            C143892ah ahVar = (C143892ah) this.f390090c.get(afVar);
            if (ahVar == null) {
                String obj = afVar.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (ahVar.mo119408b(serviceConnection)) {
                ahVar.f390082a.remove(serviceConnection);
                if (ahVar.mo119409c()) {
                    this.f390092e.sendMessageDelayed(this.f390092e.obtainMessage(0, afVar), this.f390096i);
                }
            } else {
                String obj2 = afVar.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }
}
