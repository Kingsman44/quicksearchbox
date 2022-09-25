package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.sqlite.SQLiteException;
import dagger.C68214a;

@Deprecated
/* renamed from: com.google.android.libraries.ac.b.i.ae */
/* compiled from: PG */
public final class C147060ae implements C147074as {

    /* renamed from: a */
    private static final String[] f397083a = {"name"};

    /* renamed from: b */
    private final C68214a f397084b;

    public C147060ae(C68214a aVar) {
        this.f397084b = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123885a(android.database.sqlite.SQLiteDatabase r9) {
        /*
            r8 = this;
            r9.beginTransaction()
            java.lang.String r1 = "sqlite_master"
            java.lang.String[] r2 = f397083a     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
            java.lang.String r3 = "type='table'"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
            com.google.android.libraries.p10923ac.p10925b.p10945l.C147178l.m240009b(r0)     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
        L_0x0015:
            r1 = 0
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r0.getString(r1)     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = com.google.android.libraries.p10923ac.p10925b.p10942i.C147058ac.m239736d(r2)     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r3.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "DROP TABLE "
            r3.append(r4)     // Catch:{ all -> 0x0043 }
            r3.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0043 }
            r9.execSQL(r2)     // Catch:{ all -> 0x0043 }
            goto L_0x0015
        L_0x0039:
            r0.close()     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
            r9.endTransaction()
            return
        L_0x0043:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0048 }
            goto L_0x005f
        L_0x0048:
            r0 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r1] = r5     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x005f }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x005f }
            r3[r1] = r0     // Catch:{ Exception -> 0x005f }
            r4.invoke(r2, r3)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r2     // Catch:{ SQLiteException -> 0x0064, at -> 0x0062 }
        L_0x0060:
            r0 = move-exception
            goto L_0x006d
        L_0x0062:
            r0 = move-exception
            goto L_0x0065
        L_0x0064:
            r0 = move-exception
        L_0x0065:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Error clearing SQLite storage"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x006d:
            r9.endTransaction()
            goto L_0x0072
        L_0x0071:
            throw r0
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147060ae.mo123885a(android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: b */
    public final void mo123886b() {
        C147091n nVar = (C147091n) this.f397084b.mo27525b();
        synchronized (nVar.f397144a) {
            if (!nVar.f397147d) {
                if (nVar.f397148e) {
                    nVar.f397149f.close();
                }
                nVar.f397147d = true;
                try {
                    nVar.f397149f.getWritableDatabase().close();
                    if (!nVar.f397145b.deleteDatabase(nVar.f397146c)) {
                        throw new C147075at("Database delete failed.");
                    }
                } catch (SQLiteException e) {
                    throw new C147075at("Database clear failed.", e);
                }
            }
        }
    }
}
