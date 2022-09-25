package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.ac.b.i.ai */
/* compiled from: PG */
final class C147064ai extends C147062ag {

    /* renamed from: h */
    final /* synthetic */ C147073ar f397093h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147064ai(C147073ar arVar) {
        super(arVar);
        this.f397093h = arVar;
    }

    public final void close() {
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        try {
            mo123890d(this.f397086a);
            this.f397091f = true;
            if (C147266a.m240135f()) {
                this.f397093h.f397111a.readLock().unlock();
            }
            mo123890d(this.f397088c);
        } catch (Throwable th) {
            this.f397091f = true;
            if (C147266a.m240135f()) {
                this.f397093h.f397111a.readLock().unlock();
            }
            mo123890d(this.f397088c);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0037 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo123893f(java.lang.String r6, com.google.android.libraries.p10923ac.p10925b.p10942i.C147063ah r7) {
        /*
            r5 = this;
            boolean r0 = r5.f397091f
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Transaction is closed"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            android.database.sqlite.SQLiteDatabase r0 = r5.f397090e     // Catch:{ SQLiteException -> 0x0038 }
            r2 = 0
            android.database.Cursor r6 = r0.rawQuery(r6, r2)     // Catch:{ SQLiteException -> 0x0038 }
            com.google.android.libraries.p10923ac.p10925b.p10945l.C147178l.m240009b(r6)     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.Object r7 = r7.mo123868a(r6)     // Catch:{ all -> 0x001b }
            r6.close()     // Catch:{ SQLiteException -> 0x0038 }
            return r7
        L_0x001b:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0037
        L_0x0020:
            r6 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0037 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r3 = 0
            r0[r3] = r2     // Catch:{ Exception -> 0x0037 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0037 }
            r1[r3] = r6     // Catch:{ Exception -> 0x0037 }
            r0.invoke(r7, r1)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            throw r7     // Catch:{ SQLiteException -> 0x0038 }
        L_0x0038:
            r6 = move-exception
            com.google.android.libraries.ac.b.i.at r7 = new com.google.android.libraries.ac.b.i.at
            java.lang.String r0 = "Error executing SQLite query"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147064ai.mo123893f(java.lang.String, com.google.android.libraries.ac.b.i.ah):java.lang.Object");
    }
}
