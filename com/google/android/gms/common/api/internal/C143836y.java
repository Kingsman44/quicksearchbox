package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* compiled from: PG */
final class C143836y implements C143774bv {

    /* renamed from: a */
    final /* synthetic */ C143837z f389902a;

    public C143836y(C143837z zVar) {
        this.f389902a = zVar;
    }

    /* renamed from: q */
    public final void mo119165q(ConnectionResult connectionResult) {
        this.f389902a.f389909g.lock();
        try {
            C143837z zVar = this.f389902a;
            zVar.f389907e = connectionResult;
            zVar.mo119285g();
        } finally {
            this.f389902a.f389909g.unlock();
        }
    }

    /* renamed from: r */
    public final void mo119166r(Bundle bundle) {
        this.f389902a.f389909g.lock();
        try {
            C143837z zVar = this.f389902a;
            zVar.f389907e = ConnectionResult.f389572a;
            zVar.mo119285g();
        } finally {
            this.f389902a.f389909g.unlock();
        }
    }

    /* renamed from: s */
    public final void mo119167s(int i) {
        Lock lock;
        this.f389902a.f389909g.lock();
        try {
            C143837z zVar = this.f389902a;
            if (zVar.f389908f) {
                zVar.f389908f = false;
                zVar.mo119286j(i);
                lock = this.f389902a.f389909g;
            } else {
                zVar.f389908f = true;
                zVar.f389903a.mo26992kr(i);
                lock = this.f389902a.f389909g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f389902a.f389909g.unlock();
            throw th;
        }
    }
}
