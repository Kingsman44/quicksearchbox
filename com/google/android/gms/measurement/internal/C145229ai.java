package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.google.android.gms.measurement.internal.ai */
/* compiled from: PG */
public final class C145229ai {
    /* renamed from: b */
    static void m235964b(C145325dx dxVar, SQLiteDatabase sQLiteDatabase) {
        if (dxVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                dxVar.f392798f.mo120894a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                dxVar.f392798f.mo120894a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                dxVar.f392798f.mo120894a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                dxVar.f392798f.mo120894a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ all -> 0x00cf, SQLiteException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[Catch:{ all -> 0x00cf, SQLiteException -> 0x00d4 }, LOOP:1: B:32:0x00a6->B:37:0x00b8, LOOP_START, PHI: r15 
      PHI: (r15v1 int) = (r15v0 int), (r15v2 int) binds: [B:31:0x00a4, B:37:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1 A[Catch:{ all -> 0x00cf, SQLiteException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m235963a(com.google.android.gms.measurement.internal.C145325dx r16, android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r1 = r16
            r10 = r17
            r11 = r18
            r12 = r21
            java.lang.String r13 = "SELECT * FROM "
            if (r1 == 0) goto L_0x00e5
            r14 = 0
            r15 = 0
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0037, all -> 0x0034 }
            java.lang.String r2 = "name"
            r4[r15] = r2     // Catch:{ SQLiteException -> 0x0037, all -> 0x0034 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0037, all -> 0x0034 }
            r6[r15] = r11     // Catch:{ SQLiteException -> 0x0037, all -> 0x0034 }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r17
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0037, all -> 0x0034 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0032 }
            if (r2 == 0) goto L_0x002f
            r2.close()
        L_0x002f:
            if (r0 != 0) goto L_0x004a
            goto L_0x0045
        L_0x0032:
            r0 = move-exception
            goto L_0x0039
        L_0x0034:
            r0 = move-exception
            goto L_0x00df
        L_0x0037:
            r0 = move-exception
            r2 = r14
        L_0x0039:
            com.google.android.gms.measurement.internal.dv r3 = r1.f392798f     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = "Error querying for table"
            r3.mo120896c(r4, r11, r0)     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x0045
            r2.close()
        L_0x0045:
            r2 = r19
            r10.execSQL(r2)
        L_0x004a:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00d4 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d4 }
            r2.<init>(r13)     // Catch:{ SQLiteException -> 0x00d4 }
            r2.append(r11)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r3 = " LIMIT 0"
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00d4 }
            android.database.Cursor r2 = r10.rawQuery(r2, r14)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00cf }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00cf }
            r2.close()     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r2 = ","
            r3 = r20
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00d4 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00d4 }
            r4 = 0
        L_0x0078:
            if (r4 >= r3) goto L_0x00a4
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00d4 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00d4 }
            if (r6 == 0) goto L_0x0085
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0085:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d4 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r3 = "Table "
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d4 }
            r2.append(r11)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r3 = " is missing required column: "
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d4 }
            r2.append(r5)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00d4 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00d4 }
            throw r0     // Catch:{ SQLiteException -> 0x00d4 }
        L_0x00a4:
            if (r12 == 0) goto L_0x00bb
        L_0x00a6:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00d4 }
            if (r15 >= r2) goto L_0x00bb
            r2 = r12[r15]     // Catch:{ SQLiteException -> 0x00d4 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00d4 }
            if (r2 != 0) goto L_0x00b8
            int r2 = r15 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00d4 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00d4 }
        L_0x00b8:
            int r15 = r15 + 2
            goto L_0x00a6
        L_0x00bb:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00d4 }
            if (r2 != 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.dv r2 = r1.f392798f     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00d4 }
            r2.mo120896c(r3, r11, r0)     // Catch:{ SQLiteException -> 0x00d4 }
        L_0x00ce:
            return
        L_0x00cf:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00d4 }
            throw r0     // Catch:{ SQLiteException -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.dv r1 = r1.f392795c
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.mo120895b(r2, r11)
            throw r0
        L_0x00dd:
            r0 = move-exception
            r14 = r2
        L_0x00df:
            if (r14 == 0) goto L_0x00e4
            r14.close()
        L_0x00e4:
            throw r0
        L_0x00e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            goto L_0x00ee
        L_0x00ed:
            throw r0
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145229ai.m235963a(com.google.android.gms.measurement.internal.dx, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
