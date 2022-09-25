package com.google.apps.tiktok.p3663j.p3668b;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.apps.tiktok.j.b.af */
/* compiled from: PG */
public final class C47298af {

    /* renamed from: a */
    public static final C59071e f122955a = C59071e.m91332i("com.google.apps.tiktok.j.b.af");

    /* renamed from: b */
    public final ReentrantReadWriteLock f122956b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final C60887da f122957c;

    /* renamed from: d */
    public final C21370a f122958d;

    /* renamed from: e */
    public final AtomicBoolean f122959e = new AtomicBoolean(false);

    /* renamed from: f */
    public long f122960f = -1;

    /* renamed from: g */
    private final Context f122961g;

    public C47298af(Context context, C60887da daVar, C21370a aVar) {
        this.f122958d = aVar;
        this.f122961g = context;
        this.f122957c = daVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.apps.tiktok.j.c.d} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.tiktok.p3663j.p3670c.C47341d mo51180a() {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.f122961g
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "103795117"
            r0.<init>(r1, r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f122956b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0046 }
            r2 = 0
            if (r1 == 0) goto L_0x0037
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ all -> 0x0032 }
            com.google.apps.tiktok.j.c.d r0 = com.google.apps.tiktok.p3663j.p3670c.C47341d.f123048f     // Catch:{ all -> 0x002f }
            com.google.protobuf.bv r0 = com.google.apps.tiktok.p3663j.p3670c.C47341d.parseDelimitedFrom(r0, r1)     // Catch:{ all -> 0x002f }
            r2 = r0
            com.google.apps.tiktok.j.c.d r2 = (com.google.apps.tiktok.p3663j.p3670c.C47341d) r2     // Catch:{ all -> 0x002f }
            com.google.android.libraries.p1623at.p1632e.C19554b.m37295a(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0037
        L_0x002f:
            r0 = move-exception
            r2 = r1
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            com.google.android.libraries.p1623at.p1632e.C19554b.m37295a(r2)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0037:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f122956b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            if (r2 != 0) goto L_0x0045
            com.google.apps.tiktok.j.c.d r0 = com.google.apps.tiktok.p3663j.p3670c.C47341d.f123048f
            return r0
        L_0x0045:
            return r2
        L_0x0046:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f122956b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3663j.p3668b.C47298af.mo51180a():com.google.apps.tiktok.j.c.d");
    }

    /* renamed from: b */
    public final C60870cx mo51181b() {
        return C60922j.m93044g(mo51182c(), C47810es.m84963c(new C47293aa(this)), this.f122957c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo51182c() {
        if (this.f122959e.get()) {
            return C60856cj.m92900i(Long.valueOf(this.f122960f));
        }
        return this.f122957c.mo19399b(C47810es.m84978r(new C47297ae(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo51183d(C47304al alVar, long j, boolean z) {
        return this.f122957c.mo19398a(new C47334x(this, alVar, j, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51184e(com.google.apps.tiktok.p3663j.p3670c.C47341d r5) {
        /*
            r4 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x001b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x001b }
            android.content.Context r2 = r4.f122961g     // Catch:{ all -> 0x001b }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "103795117"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x001b }
            r0.<init>(r1)     // Catch:{ all -> 0x001b }
            r5.writeDelimitedTo(r0)     // Catch:{ all -> 0x0019 }
            r0.close()
            return
        L_0x0019:
            r5 = move-exception
            goto L_0x001d
        L_0x001b:
            r5 = move-exception
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.close()
        L_0x0022:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3663j.p3668b.C47298af.mo51184e(com.google.apps.tiktok.j.c.d):void");
    }

    /* renamed from: f */
    public final boolean mo51185f(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f122955a.mo56226d()).mo56382g(th)).mo56372aa(54781)).mo56386p("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.f122956b.writeLock().lock();
        try {
            boolean z = false;
            this.f122959e.set(false);
            long j = this.f122960f;
            if (j <= 0) {
                j = this.f122958d.mo26870b();
            }
            C47340c cVar = (C47340c) C47341d.f123048f.createBuilder();
            cVar.copyOnWrite();
            C47341d dVar = (C47341d) cVar.instance;
            dVar.f123050a |= 1;
            dVar.f123051b = j;
            try {
                mo51184e((C47341d) cVar.build());
                this.f122959e.set(true);
                z = true;
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f122955a.mo56225c()).mo56382g(e)).mo56372aa(54782)).mo56386p("Could not write to datastore to clear store.");
                this.f122959e.set(false);
            }
            this.f122956b.writeLock().unlock();
            return z;
        } catch (Throwable th2) {
            this.f122956b.writeLock().unlock();
            throw th2;
        }
    }
}
