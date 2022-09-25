package com.google.android.libraries.appdoctor.p574b;

import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.libraries.appdoctor.p573a.C10448e;

/* renamed from: com.google.android.libraries.appdoctor.b.b */
/* compiled from: PG */
public final class C10464b extends C10448e {
    public C10464b() {
        super(C142954b.EXEC_SQL_FIX, 10);
    }

    /* renamed from: a */
    public final String mo18487a() {
        return "EXEC_SQL_FIX";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        android.util.Log.w("EXEC_SQL_FIX", "Exiting early, unable to execute query " + r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0091 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18489c(com.google.android.libraries.appdoctor.p573a.C10454k r7, com.google.common.base.C58833ax r8) {
        /*
            r6 = this;
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r8.mo56107c()
            com.google.android.gms.b.a.o r0 = (com.google.android.gms.p10747b.p10748a.C142967o) r0
            int r0 = r0.f387918a
            r1 = 2
            if (r0 != r1) goto L_0x00cb
            android.content.Context r7 = r7.f35203b
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.gms.b.a.o r8 = (com.google.android.gms.p10747b.p10748a.C142967o) r8
            int r0 = r8.f387918a
            if (r0 != r1) goto L_0x0022
            java.lang.Object r8 = r8.f387919b
            com.google.android.gms.b.a.f r8 = (com.google.android.gms.p10747b.p10748a.C142958f) r8
            goto L_0x0024
        L_0x0022:
            com.google.android.gms.b.a.f r8 = com.google.android.gms.p10747b.p10748a.C142958f.f387881f
        L_0x0024:
            boolean r0 = r8.f387887e
            if (r0 == 0) goto L_0x002c
            android.content.Context r7 = r7.createDeviceProtectedStorageContext()
        L_0x002c:
            java.lang.String r0 = r8.f387884b
            java.io.File r0 = r7.getDatabasePath(r0)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x0039
            return
        L_0x0039:
            java.lang.String r0 = r0.getPath()
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r2, r3)
            r2 = 1
            int r4 = r0.getVersion()     // Catch:{ all -> 0x00ad }
            int r5 = r8.f387885c     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            if (r5 == r4) goto L_0x0055
            if (r0 == 0) goto L_0x0054
            r0.close()
        L_0x0054:
            return
        L_0x0055:
            int r4 = r8.f387883a     // Catch:{ all -> 0x00ad }
            if (r4 == 0) goto L_0x0063
            if (r4 == r2) goto L_0x0061
            if (r4 == r1) goto L_0x005f
            r4 = 0
            goto L_0x0064
        L_0x005f:
            r4 = 4
            goto L_0x0064
        L_0x0061:
            r4 = 3
            goto L_0x0064
        L_0x0063:
            r4 = 2
        L_0x0064:
            if (r4 != 0) goto L_0x0067
            r4 = 1
        L_0x0067:
            int r4 = r4 + -2
            if (r4 == r2) goto L_0x007b
            if (r4 != r1) goto L_0x0073
            java.lang.String r8 = r8.f387884b     // Catch:{ all -> 0x00ad }
            r7.deleteDatabase(r8)     // Catch:{ all -> 0x00ad }
            goto L_0x00a7
        L_0x0073:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = "This command type is not supported"
            r7.<init>(r8)     // Catch:{ all -> 0x00ad }
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x007b:
            com.google.protobuf.cq r7 = r8.f387886d     // Catch:{ all -> 0x00ad }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00ad }
        L_0x0081:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a7
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00ad }
            r0.execSQL(r8)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x0081
        L_0x0091:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r7.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Exiting early, unable to execute query "
            r7.append(r1)     // Catch:{ all -> 0x00ad }
            r7.append(r8)     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = "EXEC_SQL_FIX"
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ad }
            android.util.Log.w(r8, r7)     // Catch:{ all -> 0x00ad }
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            return
        L_0x00ad:
            r7 = move-exception
            if (r0 == 0) goto L_0x00ca
            r0.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00ca
        L_0x00b4:
            r8 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00ca }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r3] = r1     // Catch:{ Exception -> 0x00ca }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x00ca }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ca }
            r1[r3] = r8     // Catch:{ Exception -> 0x00ca }
            r0.invoke(r7, r1)     // Catch:{ Exception -> 0x00ca }
        L_0x00ca:
            throw r7
        L_0x00cb:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            goto L_0x00d2
        L_0x00d1:
            throw r7
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appdoctor.p574b.C10464b.mo18489c(com.google.android.libraries.appdoctor.a.k, com.google.common.base.ax):void");
    }

    /* renamed from: d */
    public final boolean mo18490d() {
        return true;
    }
}
