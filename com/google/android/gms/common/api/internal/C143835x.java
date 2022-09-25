package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* compiled from: PG */
final class C143835x implements C143774bv {

    /* renamed from: a */
    final /* synthetic */ C143837z f389901a;

    public C143835x(C143837z zVar) {
        this.f389901a = zVar;
    }

    /* renamed from: q */
    public final void mo119165q(ConnectionResult connectionResult) {
        this.f389901a.f389909g.lock();
        try {
            C143837z zVar = this.f389901a;
            zVar.f389906d = connectionResult;
            zVar.mo119285g();
        } finally {
            this.f389901a.f389909g.unlock();
        }
    }

    /* renamed from: r */
    public final void mo119166r(Bundle bundle) {
        this.f389901a.f389909g.lock();
        try {
            C143837z zVar = this.f389901a;
            Bundle bundle2 = zVar.f389905c;
            if (bundle2 == null) {
                zVar.f389905c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            C143837z zVar2 = this.f389901a;
            zVar2.f389906d = ConnectionResult.f389572a;
            zVar2.mo119285g();
        } finally {
            this.f389901a.f389909g.unlock();
        }
    }

    /* renamed from: s */
    public final void mo119167s(int i) {
        Lock lock;
        ConnectionResult connectionResult;
        this.f389901a.f389909g.lock();
        try {
            C143837z zVar = this.f389901a;
            if (!zVar.f389908f && (connectionResult = zVar.f389907e) != null) {
                if (connectionResult.mo119068b()) {
                    zVar.f389908f = true;
                    zVar.f389904b.mo26992kr(i);
                    lock = this.f389901a.f389909g;
                    lock.unlock();
                }
            }
            zVar.f389908f = false;
            zVar.mo119286j(i);
            lock = this.f389901a.f389909g;
            lock.unlock();
        } catch (Throwable th) {
            this.f389901a.f389909g.unlock();
            throw th;
        }
    }
}
