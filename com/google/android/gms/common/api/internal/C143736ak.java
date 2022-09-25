package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143933h;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.ak */
/* compiled from: PG */
final class C143736ak implements C143933h {

    /* renamed from: a */
    public final boolean f389658a;

    /* renamed from: b */
    private final WeakReference f389659b;

    /* renamed from: c */
    private final C143841m f389660c;

    public C143736ak(C143745at atVar, C143841m mVar, boolean z) {
        this.f389659b = new WeakReference(atVar);
        this.f389660c = mVar;
        this.f389658a = z;
    }

    /* renamed from: a */
    public final void mo119145a(ConnectionResult connectionResult) {
        Lock lock;
        C143745at atVar = (C143745at) this.f389659b.get();
        if (atVar != null) {
            C143919bh.m233967j(Looper.myLooper() == atVar.f389673a.f389736m.f389700d, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            atVar.f389674b.lock();
            try {
                if (!atVar.mo119153m(0)) {
                    lock = atVar.f389674b;
                } else {
                    if (!connectionResult.mo119068b()) {
                        atVar.mo119151k(connectionResult, this.f389660c, this.f389658a);
                    }
                    if (atVar.mo119154n()) {
                        atVar.mo119152l();
                    }
                    lock = atVar.f389674b;
                }
                lock.unlock();
            } catch (Throwable th) {
                atVar.f389674b.unlock();
                throw th;
            }
        }
    }
}
