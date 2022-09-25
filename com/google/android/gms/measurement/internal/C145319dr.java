package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.dr */
/* compiled from: PG */
public final class C145319dr extends C145355f {

    /* renamed from: b */
    private final C145318dq f392776b;

    /* renamed from: c */
    private boolean f392777c;

    public C145319dr(C145361ff ffVar) {
        super(ffVar);
        C145361ff ffVar2 = this.f393011w;
        Context context = ffVar2.f392931a;
        C145222ab abVar = ffVar2.f392937g;
        this.f392776b = new C145318dq(this, context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final SQLiteDatabase mo120882e() {
        if (this.f392777c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f392776b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f392777c = true;
        return null;
    }

    /* renamed from: f */
    public final void mo120883f() {
        int delete;
        mo120904g();
        try {
            SQLiteDatabase e = mo120882e();
            if (e != null && (delete = e.delete("messages", (String) null, (String[]) null)) > 0) {
                this.f393011w.mo120965ar().f392803k.mo120895b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Error resetting local analytics data. error", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo120884h() {
        C145361ff ffVar = this.f393011w;
        Context context = ffVar.f392931a;
        C145222ab abVar = ffVar.f392937g;
        return context.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1 A[SYNTHETIC, Splitter:B:47:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0110 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120885i(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo120904g()
            boolean r0 = r1.f392777c
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0027:
            if (r5 >= r4) goto L_0x0124
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.mo120882e()     // Catch:{ SQLiteFullException -> 0x00f4, SQLiteDatabaseLockedException -> 0x00e2, SQLiteException -> 0x00bd, all -> 0x00ba }
            if (r9 != 0) goto L_0x0034
            r1.f392777c = r7     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e3, SQLiteException -> 0x00b2 }
            return r2
        L_0x0034:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e3, SQLiteException -> 0x00b2 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e3, SQLiteException -> 0x00b2 }
            r11 = 0
            if (r10 == 0) goto L_0x0053
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            if (r0 == 0) goto L_0x0053
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            goto L_0x0118
        L_0x004f:
            r0 = move-exception
            goto L_0x00b4
        L_0x0051:
            r0 = move-exception
            goto L_0x00b8
        L_0x0053:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009a
            com.google.android.gms.measurement.internal.ff r15 = r1.f393011w     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            com.google.android.gms.measurement.internal.dx r15 = r15.mo120965ar()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            com.google.android.gms.measurement.internal.dv r15 = r15.f392795c     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "Data loss, local db full"
            r15.mo120894a(r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            r4.mo120897d(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
        L_0x009a:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00ad, SQLiteException -> 0x004f, all -> 0x004c }
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            r9.close()
            r2 = 1
            return r2
        L_0x00ad:
            r8 = r10
            goto L_0x00e3
        L_0x00af:
            r0 = move-exception
            goto L_0x0119
        L_0x00b2:
            r0 = move-exception
            r10 = r8
        L_0x00b4:
            r8 = r9
            goto L_0x00bf
        L_0x00b6:
            r0 = move-exception
            r10 = r8
        L_0x00b8:
            r8 = r9
            goto L_0x00f6
        L_0x00ba:
            r0 = move-exception
            r9 = r8
            goto L_0x0119
        L_0x00bd:
            r0 = move-exception
            r10 = r8
        L_0x00bf:
            if (r8 == 0) goto L_0x00ca
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00ca
            r8.endTransaction()     // Catch:{ all -> 0x0116 }
        L_0x00ca:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x0116 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo120895b(r4, r0)     // Catch:{ all -> 0x0116 }
            r2 = 1
            r1.f392777c = r2     // Catch:{ all -> 0x0116 }
            if (r10 == 0) goto L_0x00df
            r10.close()
        L_0x00df:
            if (r8 == 0) goto L_0x0110
            goto L_0x010d
        L_0x00e2:
            r9 = r8
        L_0x00e3:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00af }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00ee
            r8.close()
        L_0x00ee:
            if (r9 == 0) goto L_0x0110
            r9.close()
            goto L_0x0110
        L_0x00f4:
            r0 = move-exception
            r10 = r8
        L_0x00f6:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w     // Catch:{ all -> 0x0116 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo120895b(r4, r0)     // Catch:{ all -> 0x0116 }
            r2 = 1
            r1.f392777c = r2     // Catch:{ all -> 0x0116 }
            if (r10 == 0) goto L_0x010b
            r10.close()
        L_0x010b:
            if (r8 == 0) goto L_0x0110
        L_0x010d:
            r8.close()
        L_0x0110:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0027
        L_0x0116:
            r0 = move-exception
            r9 = r8
        L_0x0118:
            r8 = r10
        L_0x0119:
            if (r8 == 0) goto L_0x011e
            r8.close()
        L_0x011e:
            if (r9 == 0) goto L_0x0123
            r9.close()
        L_0x0123:
            throw r0
        L_0x0124:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo120894a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145319dr.mo120885i(int, byte[]):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:70|71|72|73) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:85|86|87|88) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:57|58|59|60|201) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1.f393011w.mo120965ar().f392795c.mo120894a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.f393011w.mo120965ar().f392795c.mo120894a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12.recycle();
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r1.f393011w.mo120965ar().f392795c.mo120894a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.recycle();
        r13 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e4 A[SYNTHETIC, Splitter:B:127:0x01e4] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0209 A[SYNTHETIC, Splitter:B:155:0x0209] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0252 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo120886j() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "Error reading entries from local database"
            java.lang.String r3 = "rowid"
            r24.mo120904g()
            boolean r0 = r1.f392777c
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r24.mo120884h()
            if (r0 == 0) goto L_0x0272
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 5
        L_0x001e:
            if (r8 >= r6) goto L_0x0264
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r24.mo120882e()     // Catch:{ SQLiteFullException -> 0x023a, SQLiteDatabaseLockedException -> 0x0227, SQLiteException -> 0x0204, all -> 0x0201 }
            if (r15 != 0) goto L_0x002a
            r1.f392777c = r10     // Catch:{ SQLiteFullException -> 0x01fc, SQLiteDatabaseLockedException -> 0x01f8, SQLiteException -> 0x01f3, all -> 0x01ee }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01fc, SQLiteDatabaseLockedException -> 0x01f8, SQLiteException -> 0x01f3, all -> 0x01ee }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x01df }
            r13[r7] = r3     // Catch:{ all -> 0x01df }
            java.lang.String r14 = "type=?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x01df }
            r11[r7] = r0     // Catch:{ all -> 0x01df }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r0 = r11
            r11 = r15
            r20 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01db }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01d7 }
            r21 = -1
            if (r0 == 0) goto L_0x005e
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01d7 }
            if (r11 == 0) goto L_0x0079
            r11.close()     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            goto L_0x0079
        L_0x005e:
            if (r11 == 0) goto L_0x0077
            r11.close()     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            goto L_0x0077
        L_0x0064:
            r0 = move-exception
            r13 = r20
            goto L_0x01f0
        L_0x0069:
            r0 = move-exception
            r13 = r20
            goto L_0x01f5
        L_0x006e:
            r13 = r20
            goto L_0x01f9
        L_0x0072:
            r0 = move-exception
            r13 = r20
            goto L_0x01fe
        L_0x0077:
            r12 = r21
        L_0x0079:
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            r14 = r0
            r15 = r11
            goto L_0x008c
        L_0x008a:
            r14 = r4
            r15 = r14
        L_0x008c:
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            r13[r7] = r3     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            java.lang.String r11 = "type"
            r13[r10] = r11     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            java.lang.String r11 = "entry"
            r12 = 2
            r13[r12] = r11     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            java.lang.String r16 = "messages"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid asc"
            r11 = 100
            java.lang.String r23 = java.lang.Integer.toString(r11)     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
            r11 = r20
            r6 = 2
            r12 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x0072, SQLiteDatabaseLockedException -> 0x006e, SQLiteException -> 0x0069, all -> 0x0064 }
        L_0x00b9:
            boolean r12 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            if (r12 == 0) goto L_0x018d
            long r21 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            int r12 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            byte[] r13 = r11.getBlob(r6)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            if (r12 != 0) goto L_0x0100
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            int r14 = r13.length     // Catch:{ a -> 0x00eb }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x00eb }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x00eb }
            android.os.Parcelable$Creator r13 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ a -> 0x00eb }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x00eb }
            com.google.android.gms.measurement.internal.EventParcel r13 = (com.google.android.gms.measurement.internal.EventParcel) r13     // Catch:{ a -> 0x00eb }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            if (r13 == 0) goto L_0x00b9
            r5.add(r13)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x00e9:
            r0 = move-exception
            goto L_0x00fc
        L_0x00eb:
            com.google.android.gms.measurement.internal.ff r13 = r1.f393011w     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392795c     // Catch:{ all -> 0x00e9 }
            java.lang.String r14 = "Failed to load event from local database"
            r13.mo120894a(r14)     // Catch:{ all -> 0x00e9 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x00fc:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
        L_0x0100:
            if (r12 != r10) goto L_0x0136
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            int r14 = r13.length     // Catch:{ a -> 0x011b }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x011b }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x011b }
            android.os.Parcelable$Creator r13 = com.google.android.gms.measurement.internal.UserAttributeParcel.CREATOR     // Catch:{ a -> 0x011b }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x011b }
            com.google.android.gms.measurement.internal.UserAttributeParcel r13 = (com.google.android.gms.measurement.internal.UserAttributeParcel) r13     // Catch:{ a -> 0x011b }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x012c
        L_0x0119:
            r0 = move-exception
            goto L_0x0132
        L_0x011b:
            com.google.android.gms.measurement.internal.ff r13 = r1.f393011w     // Catch:{ all -> 0x0119 }
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()     // Catch:{ all -> 0x0119 }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392795c     // Catch:{ all -> 0x0119 }
            java.lang.String r14 = "Failed to load user property from local database"
            r13.mo120894a(r14)     // Catch:{ all -> 0x0119 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            r13 = r4
        L_0x012c:
            if (r13 == 0) goto L_0x00b9
            r5.add(r13)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x0132:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
        L_0x0136:
            if (r12 != r6) goto L_0x016d
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            int r14 = r13.length     // Catch:{ a -> 0x0151 }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x0151 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x0151 }
            android.os.Parcelable$Creator r13 = com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel.CREATOR     // Catch:{ a -> 0x0151 }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x0151 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r13 = (com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r13     // Catch:{ a -> 0x0151 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x0162
        L_0x014f:
            r0 = move-exception
            goto L_0x0169
        L_0x0151:
            com.google.android.gms.measurement.internal.ff r13 = r1.f393011w     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392795c     // Catch:{ all -> 0x014f }
            java.lang.String r14 = "Failed to load conditional user property from local database"
            r13.mo120894a(r14)     // Catch:{ all -> 0x014f }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            r13 = r4
        L_0x0162:
            if (r13 == 0) goto L_0x00b9
            r5.add(r13)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x0169:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
        L_0x016d:
            if (r12 != r0) goto L_0x017e
            com.google.android.gms.measurement.internal.ff r12 = r1.f393011w     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392798f     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            java.lang.String r13 = "Skipping app launch break"
            r12.mo120894a(r13)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x017e:
            com.google.android.gms.measurement.internal.ff r12 = r1.f393011w     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392795c     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            java.lang.String r13 = "Unknown record type in local database"
            r12.mo120894a(r13)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            goto L_0x00b9
        L_0x018d:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            java.lang.String r6 = java.lang.Long.toString(r21)     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            r0[r7] = r6     // Catch:{ SQLiteFullException -> 0x01d3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01cc, all -> 0x01c7 }
            java.lang.String r6 = "messages"
            java.lang.String r12 = "rowid <= ?"
            r13 = r20
            int r0 = r13.delete(r6, r12, r0)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            int r6 = r5.size()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            if (r0 >= r6) goto L_0x01b2
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            java.lang.String r6 = "Fewer entries removed from local database than expected"
            r0.mo120894a(r6)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
        L_0x01b2:
            r13.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            r13.endTransaction()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01c3, all -> 0x01c1 }
            if (r11 == 0) goto L_0x01bd
            r11.close()
        L_0x01bd:
            r13.close()
            return r5
        L_0x01c1:
            r0 = move-exception
            goto L_0x01ca
        L_0x01c3:
            r0 = move-exception
            goto L_0x01f6
        L_0x01c5:
            r0 = move-exception
            goto L_0x01ff
        L_0x01c7:
            r0 = move-exception
            r13 = r20
        L_0x01ca:
            r4 = r11
            goto L_0x01f0
        L_0x01cc:
            r0 = move-exception
            r13 = r20
            goto L_0x01f6
        L_0x01d0:
            r13 = r20
            goto L_0x01fa
        L_0x01d3:
            r0 = move-exception
            r13 = r20
            goto L_0x01ff
        L_0x01d7:
            r0 = move-exception
            r13 = r20
            goto L_0x01e2
        L_0x01db:
            r0 = move-exception
            r13 = r20
            goto L_0x01e1
        L_0x01df:
            r0 = move-exception
            r13 = r15
        L_0x01e1:
            r11 = r4
        L_0x01e2:
            if (r11 == 0) goto L_0x01e7
            r11.close()     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01f9, SQLiteException -> 0x01ea, all -> 0x01e8 }
        L_0x01e7:
            throw r0     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01f9, SQLiteException -> 0x01ea, all -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            goto L_0x01f0
        L_0x01ea:
            r0 = move-exception
            goto L_0x01f5
        L_0x01ec:
            r0 = move-exception
            goto L_0x01fe
        L_0x01ee:
            r0 = move-exception
            r13 = r15
        L_0x01f0:
            r15 = r13
            goto L_0x0259
        L_0x01f3:
            r0 = move-exception
            r13 = r15
        L_0x01f5:
            r11 = r4
        L_0x01f6:
            r15 = r13
            goto L_0x0207
        L_0x01f8:
            r13 = r15
        L_0x01f9:
            r11 = r4
        L_0x01fa:
            r15 = r13
            goto L_0x0229
        L_0x01fc:
            r0 = move-exception
            r13 = r15
        L_0x01fe:
            r11 = r4
        L_0x01ff:
            r15 = r13
            goto L_0x023d
        L_0x0201:
            r0 = move-exception
            r15 = r4
            goto L_0x0259
        L_0x0204:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0207:
            if (r15 == 0) goto L_0x0212
            boolean r6 = r15.inTransaction()     // Catch:{ all -> 0x0257 }
            if (r6 == 0) goto L_0x0212
            r15.endTransaction()     // Catch:{ all -> 0x0257 }
        L_0x0212:
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w     // Catch:{ all -> 0x0257 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ all -> 0x0257 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392795c     // Catch:{ all -> 0x0257 }
            r6.mo120895b(r2, r0)     // Catch:{ all -> 0x0257 }
            r1.f392777c = r10     // Catch:{ all -> 0x0257 }
            if (r11 == 0) goto L_0x0224
            r11.close()
        L_0x0224:
            if (r15 == 0) goto L_0x0252
            goto L_0x0236
        L_0x0227:
            r11 = r4
            r15 = r11
        L_0x0229:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0257 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x0234
            r11.close()
        L_0x0234:
            if (r15 == 0) goto L_0x0252
        L_0x0236:
            r15.close()
            goto L_0x0252
        L_0x023a:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x023d:
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w     // Catch:{ all -> 0x0257 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ all -> 0x0257 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392795c     // Catch:{ all -> 0x0257 }
            r6.mo120895b(r2, r0)     // Catch:{ all -> 0x0257 }
            r1.f392777c = r10     // Catch:{ all -> 0x0257 }
            if (r11 == 0) goto L_0x024f
            r11.close()
        L_0x024f:
            if (r15 == 0) goto L_0x0252
            goto L_0x0236
        L_0x0252:
            int r8 = r8 + 1
            r6 = 5
            goto L_0x001e
        L_0x0257:
            r0 = move-exception
            r4 = r11
        L_0x0259:
            if (r4 == 0) goto L_0x025e
            r4.close()
        L_0x025e:
            if (r15 == 0) goto L_0x0263
            r15.close()
        L_0x0263:
            throw r0
        L_0x0264:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo120894a(r2)
            return r4
        L_0x0272:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145319dr.mo120886j():java.util.List");
    }

    /* renamed from: k */
    public final void mo120887k() {
        mo120904g();
        if (!this.f392777c && mo120884h()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase e = mo120882e();
                    if (e == null) {
                        this.f392777c = true;
                        return;
                    }
                    e.beginTransaction();
                    e.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    e.setTransactionSuccessful();
                    e.endTransaction();
                    e.close();
                    return;
                } catch (SQLiteFullException e2) {
                    this.f393011w.mo120965ar().f392795c.mo120895b("Error deleting app launch break from local database", e2);
                    this.f392777c = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e3) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f393011w.mo120965ar().f392795c.mo120895b("Error deleting app launch break from local database", e3);
                    this.f392777c = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f393011w.mo120965ar().f392798f.mo120894a("Error deleting app launch break from local database in reasonable time");
        }
    }
}
