package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.ac.b.i.aq */
/* compiled from: PG */
final class C147072aq extends C147062ag implements C147078aw, C147071ap {

    /* renamed from: h */
    public volatile long f397107h;

    /* renamed from: i */
    final /* synthetic */ C147073ar f397108i;

    /* renamed from: j */
    private boolean f397109j;

    /* renamed from: k */
    private boolean f397110k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147072aq(C147073ar arVar) {
        super(arVar);
        this.f397108i = arVar;
    }

    /* renamed from: k */
    private final void m239761k() {
        C58838bb.m90884s(this.f397107h == Thread.currentThread().getId(), "Accessing transaction from different thread");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A[SYNTHETIC, Splitter:B:38:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            r5.m239761k()
            boolean r0 = r5.f397091f
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Transaction is closed"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            boolean r0 = r5.f397110k
            r2 = 0
            r5.mo123902g()     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            boolean r3 = r5.f397110k     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            if (r3 == 0) goto L_0x001b
            android.database.sqlite.SQLiteDatabase r3 = r5.f397090e     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
        L_0x001b:
            r5.m239761k()     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            android.database.sqlite.SQLiteDatabase r3 = r5.f397090e     // Catch:{ all -> 0x0069 }
            r3.endTransaction()     // Catch:{ all -> 0x0069 }
            r5.f397109j = r2     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            if (r0 == 0) goto L_0x002d
            java.util.Set r2 = r5.f397086a     // Catch:{ all -> 0x004d }
            r5.mo123890d(r2)     // Catch:{ all -> 0x004d }
            goto L_0x0032
        L_0x002d:
            java.util.Set r2 = r5.f397087b     // Catch:{ all -> 0x004d }
            r5.mo123889c(r2)     // Catch:{ all -> 0x004d }
        L_0x0032:
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397108i
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x0047
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            return
        L_0x0047:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
            return
        L_0x004d:
            r2 = move-exception
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397108i
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x0063
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x0068
        L_0x0063:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x0068:
            throw r2
        L_0x0069:
            r3 = move-exception
            r5.f397109j = r2     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            throw r3     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
        L_0x006d:
            r2 = move-exception
            goto L_0x007b
        L_0x006f:
            r0 = move-exception
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Failure to close transaction"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0078 }
            throw r3     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            r2 = r0
            r0 = 0
        L_0x007b:
            if (r0 == 0) goto L_0x0083
            java.util.Set r3 = r5.f397086a     // Catch:{ all -> 0x00a3 }
            r5.mo123890d(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x0088
        L_0x0083:
            java.util.Set r3 = r5.f397087b     // Catch:{ all -> 0x00a3 }
            r5.mo123889c(r3)     // Catch:{ all -> 0x00a3 }
        L_0x0088:
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397108i
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x009d
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x00a2
        L_0x009d:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x00a2:
            throw r2
        L_0x00a3:
            r2 = move-exception
            r5.f397091f = r1
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397108i
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f397111a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            if (r0 == 0) goto L_0x00b9
            java.util.Set r0 = r5.f397088c
            r5.mo123890d(r0)
            goto L_0x00be
        L_0x00b9:
            java.util.Set r0 = r5.f397089d
            r5.mo123889c(r0)
        L_0x00be:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147072aq.close():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo123893f(java.lang.String r6, com.google.android.libraries.p10923ac.p10925b.p10942i.C147063ah r7) {
        /*
            r5 = this;
            r5.m239761k()
            boolean r0 = r5.f397091f
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Transaction is closed"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            r5.mo123902g()     // Catch:{ SQLiteException -> 0x003e }
            android.database.sqlite.SQLiteDatabase r0 = r5.f397090e     // Catch:{ SQLiteException -> 0x003e }
            r2 = 0
            android.database.Cursor r6 = r0.rawQuery(r6, r2)     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.libraries.p10923ac.p10925b.p10945l.C147178l.m240009b(r6)     // Catch:{ SQLiteException -> 0x003e }
            java.lang.Object r7 = r7.mo123868a(r6)     // Catch:{ all -> 0x0021 }
            r6.close()     // Catch:{ SQLiteException -> 0x003e }
            return r7
        L_0x0021:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0026 }
            goto L_0x003d
        L_0x0026:
            r6 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003d }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r3 = 0
            r0[r3] = r2     // Catch:{ Exception -> 0x003d }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x003d }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003d }
            r1[r3] = r6     // Catch:{ Exception -> 0x003d }
            r0.invoke(r7, r1)     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            throw r7     // Catch:{ SQLiteException -> 0x003e }
        L_0x003e:
            r6 = move-exception
            com.google.android.libraries.ac.b.i.at r7 = new com.google.android.libraries.ac.b.i.at
            java.lang.String r0 = "Error executing SQLite query"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147072aq.mo123893f(java.lang.String, com.google.android.libraries.ac.b.i.ah):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo123902g() {
        m239761k();
        if (!this.f397109j) {
            this.f397090e.beginTransaction();
            this.f397109j = true;
        }
    }

    /* renamed from: h */
    public final void mo123899h(String str, ContentValues contentValues) {
        m239761k();
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        C58838bb.m90884s(!this.f397110k, "Trying to modify after setSuccessful()");
        try {
            mo123902g();
            this.f397090e.insertWithOnConflict(str, (String) null, contentValues, 5);
        } catch (SQLiteException e) {
            throw new C147075at("SQLite insert failed", e);
        }
    }

    /* renamed from: i */
    public final void mo123900i(String str) {
        m239761k();
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        C58838bb.m90884s(!this.f397110k, "Trying to modify after setSuccessful()");
        try {
            mo123902g();
            this.f397090e.execSQL(str);
        } catch (SQLiteException e) {
            throw new C147075at("SQLite statement failed", e);
        }
    }

    /* renamed from: j */
    public final void mo123901j() {
        m239761k();
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        C58838bb.m90884s(!this.f397110k, "Transaction is successful already");
        this.f397110k = true;
    }
}
