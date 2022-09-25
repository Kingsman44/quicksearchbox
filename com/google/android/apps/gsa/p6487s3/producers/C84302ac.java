package com.google.android.apps.gsa.p6487s3.producers;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66606cd;

/* renamed from: com.google.android.apps.gsa.s3.producers.ac */
/* compiled from: PG */
public abstract class C84302ac implements C57981b, C84326y {

    /* renamed from: a */
    private C84301ab f229425a;

    /* renamed from: b */
    private boolean f229426b = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo77842c(C66606cd cdVar, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo77843d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo77844e();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo77845f(java.lang.Object r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.apps.gsa.s3.producers.ab r0 = r1.f229425a     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f155044c     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            com.google.speech.h.cd r0 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197403a()     // Catch:{ all -> 0x0024 }
            r1.mo77842c(r0, r2)     // Catch:{ all -> 0x0024 }
            com.google.android.apps.gsa.s3.producers.ab r2 = r1.f229425a     // Catch:{ all -> 0x0024 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0024 }
            com.google.speech.h.ce r0 = (com.google.speech.p5208h.C66607ce) r0     // Catch:{ all -> 0x0024 }
            r2.mo54583c(r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.producers.C84302ac.mo77845f(java.lang.Object):void");
    }

    /* renamed from: g */
    public final void mo77846g(boolean z) {
        mo77844e();
        synchronized (this) {
            C84301ab abVar = this.f229425a;
            if (abVar != null && abVar.f155044c.get()) {
                this.f229425a.mo54584d(z);
            }
        }
    }

    /* renamed from: hk */
    public final void mo77847hk() {
        synchronized (this) {
            this.f229426b = true;
            C84301ab abVar = this.f229425a;
            if (abVar != null) {
                if (abVar.f155044c.get()) {
                    mo77846g(false);
                }
            }
        }
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C84301ab abVar = new C84301ab(this, aVar);
        aVar.mo20338d(abVar);
        synchronized (this) {
            if (this.f229426b) {
                abVar.mo21018g();
                C57979e eVar = abVar.f155043b;
                return eVar;
            } else if (this.f229425a != null) {
                abVar.mo54585e(new UnsupportedOperationException("UpdateSource is an one shot source."));
                C57979e eVar2 = abVar.f155043b;
                return eVar2;
            } else {
                this.f229425a = abVar;
                mo77843d();
                return abVar.f155043b;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: jK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20388jK() {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f229426b = r0     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.s3.producers.ab r0 = r1.f229425a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f155044c     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            com.google.android.apps.gsa.s3.producers.ab r0 = r1.f229425a     // Catch:{ all -> 0x0019 }
            r0.mo21018g()     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.producers.C84302ac.mo20388jK():void");
    }
}
