package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.hy */
/* compiled from: PG */
final class C145434hy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393207a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f393208b;

    /* renamed from: c */
    final /* synthetic */ C145456it f393209c;

    public C145434hy(C145456it itVar, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.f393209c = itVar;
        this.f393207a = atomicReference;
        this.f393208b = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f393207a) {
            try {
                if (!this.f393209c.f393011w.mo120971g().mo120923c().mo120786f(C145223ac.ANALYTICS_STORAGE)) {
                    this.f393209c.f393011w.mo120965ar().f392800h.mo120894a("Analytics storage consent denied; will not get app instance id");
                    this.f393209c.f393011w.mo120972j().f393143d.set((Object) null);
                    this.f393209c.f393011w.mo120971g().f392853f.mo120920b((String) null);
                    this.f393207a.set((Object) null);
                    this.f393207a.notify();
                    return;
                }
                C145456it itVar = this.f393209c;
                C145316do doVar = itVar.f393272c;
                if (doVar == null) {
                    itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to get app instance id");
                    this.f393207a.notify();
                    return;
                }
                C143919bh.m233958a(this.f393208b);
                this.f393207a.set(doVar.mo120855e(this.f393208b));
                String str = (String) this.f393207a.get();
                if (str != null) {
                    this.f393209c.f393011w.mo120972j().f393143d.set(str);
                    this.f393209c.f393011w.mo120971g().f392853f.mo120920b(str);
                }
                this.f393209c.mo121158n();
                atomicReference = this.f393207a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f393209c.f393011w.mo120965ar().f392795c.mo120895b("Failed to get app instance id", e);
                    atomicReference = this.f393207a;
                } catch (Throwable th) {
                    this.f393207a.notify();
                    throw th;
                }
            }
        }
    }
}
