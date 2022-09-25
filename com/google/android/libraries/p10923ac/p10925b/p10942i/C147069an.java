package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.content.ContentValues;
import com.google.common.base.C58838bb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.ac.b.i.an */
/* compiled from: PG */
final class C147069an extends C147062ag implements C147078aw, C147071ap {

    /* renamed from: h */
    public boolean f397103h;

    /* renamed from: i */
    public volatile ExecutorService f397104i;

    /* renamed from: j */
    public volatile boolean f397105j;

    /* renamed from: k */
    final /* synthetic */ C147073ar f397106k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147069an(C147073ar arVar) {
        super(arVar);
        this.f397106k = arVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[SYNTHETIC, Splitter:B:29:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            boolean r0 = r5.f397091f
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Transaction is closed"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            boolean r0 = r5.f397105j
            r2 = 0
            java.util.concurrent.ExecutorService r3 = r5.f397104i     // Catch:{ InterruptedException -> 0x0069, ExecutionException -> 0x0067, all -> 0x0065 }
            com.google.android.libraries.ac.b.i.aj r4 = new com.google.android.libraries.ac.b.i.aj     // Catch:{ InterruptedException -> 0x0069, ExecutionException -> 0x0067, all -> 0x0065 }
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x0069, ExecutionException -> 0x0067, all -> 0x0065 }
            java.util.concurrent.Future r3 = r3.submit(r4)     // Catch:{ InterruptedException -> 0x0069, ExecutionException -> 0x0067, all -> 0x0065 }
            r3.get()     // Catch:{ InterruptedException -> 0x0069, ExecutionException -> 0x0067, all -> 0x0065 }
            java.util.concurrent.ExecutorService r3 = r5.f397104i
            r3.shutdown()
            r5.f397104i = r2
            if (r0 == 0) goto L_0x0029
            java.util.Set r2 = r5.f397086a     // Catch:{ all -> 0x0049 }
            r5.mo123890d(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x002e
        L_0x0029:
            java.util.Set r2 = r5.f397087b     // Catch:{ all -> 0x0049 }
            r5.mo123889c(r2)     // Catch:{ all -> 0x0049 }
        L_0x002e:
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397106k
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x0043
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            return
        L_0x0043:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
            return
        L_0x0049:
            r2 = move-exception
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397106k
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x005f
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x0064
        L_0x005f:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x0064:
            throw r2
        L_0x0065:
            r3 = move-exception
            goto L_0x0075
        L_0x0067:
            r0 = move-exception
            goto L_0x006a
        L_0x0069:
            r0 = move-exception
        L_0x006a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "Failure to close transaction"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0072 }
            throw r3     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r3 = r0
            r0 = 0
        L_0x0075:
            java.util.concurrent.ExecutorService r4 = r5.f397104i
            r4.shutdown()
            r5.f397104i = r2
            if (r0 == 0) goto L_0x0084
            java.util.Set r2 = r5.f397086a     // Catch:{ all -> 0x00a4 }
            r5.mo123890d(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x0089
        L_0x0084:
            java.util.Set r2 = r5.f397087b     // Catch:{ all -> 0x00a4 }
            r5.mo123889c(r2)     // Catch:{ all -> 0x00a4 }
        L_0x0089:
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397106k
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x009e
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x00a3
        L_0x009e:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x00a3:
            throw r3
        L_0x00a4:
            r2 = move-exception
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397106k
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x00ba
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x00bf
        L_0x00ba:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x00bf:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147069an.close():void");
    }

    /* renamed from: f */
    public final Object mo123893f(String str, C147063ah ahVar) {
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        try {
            return this.f397104i.submit(new C147067al(this, str, ahVar)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new C147075at("Error executing SQLite query", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo123898g() {
        if (!this.f397103h) {
            this.f397090e.beginTransaction();
            this.f397103h = true;
        }
    }

    /* renamed from: h */
    public final void mo123899h(String str, ContentValues contentValues) {
        C58838bb.m90884s(this.f397104i != null, "Transaction is closed");
        C58838bb.m90884s(!this.f397105j, "Trying to modify after setSuccessful()");
        try {
            this.f397104i.submit(new C147066ak(this, str, contentValues)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new C147075at("SQLite insert failed", e);
        }
    }

    /* renamed from: i */
    public final void mo123900i(String str) {
        C58838bb.m90884s(this.f397104i != null, "Transaction is closed");
        C58838bb.m90884s(!this.f397105j, "Trying to modify after setSuccessful()");
        try {
            this.f397104i.submit(new C147068am(this, str)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new C147075at("SQLite statement failed", e);
        }
    }

    /* renamed from: j */
    public final void mo123901j() {
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        C58838bb.m90884s(!this.f397105j, "Transaction is successful already");
        this.f397105j = true;
    }
}
