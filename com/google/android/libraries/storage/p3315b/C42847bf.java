package com.google.android.libraries.storage.p3315b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.libraries.storage.b.bf */
/* compiled from: PG */
public final class C42847bf {

    /* renamed from: a */
    public final CancellationSignal f112137a = new CancellationSignal();

    /* renamed from: b */
    public final SQLiteDatabase f112138b;

    public C42847bf(SQLiteDatabase sQLiteDatabase) {
        this.f112138b = sQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r7.getType(r3) != 4) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = "Unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r4 = "Blob, length " + r7.getBlob(r3).length;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m75693f(android.database.Cursor r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String[] r1 = r7.getColumnNames()     // Catch:{ all -> 0x005d }
            java.lang.String r2 = java.util.Arrays.toString(r1)     // Catch:{ all -> 0x005d }
            r0.append(r2)     // Catch:{ all -> 0x005d }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x005d }
        L_0x0015:
            boolean r3 = r7.moveToNext()     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0053
            r3 = 0
        L_0x001c:
            int r4 = r1.length     // Catch:{ all -> 0x005d }
            if (r3 >= r4) goto L_0x004f
            java.lang.String r4 = r7.getString(r3)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0044
        L_0x0024:
            int r4 = r7.getType(r3)     // Catch:{ all -> 0x005d }
            r5 = 4
            if (r4 == r5) goto L_0x002e
            java.lang.String r4 = "Unknown"
            goto L_0x0044
        L_0x002e:
            byte[] r4 = r7.getBlob(r3)     // Catch:{ all -> 0x005d }
            int r4 = r4.length     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r5.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Blob, length "
            r5.append(r6)     // Catch:{ all -> 0x005d }
            r5.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005d }
        L_0x0044:
            java.lang.String r5 = "|"
            r0.append(r5)     // Catch:{ all -> 0x005d }
            r0.append(r4)     // Catch:{ all -> 0x005d }
            int r3 = r3 + 1
            goto L_0x001c
        L_0x004f:
            r0.append(r2)     // Catch:{ all -> 0x005d }
            goto L_0x0015
        L_0x0053:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x005c
            r7.close()
        L_0x005c:
            return r0
        L_0x005d:
            r0 = move-exception
            if (r7 == 0) goto L_0x0068
            r7.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r7 = move-exception
            com.google.android.libraries.storage.p3315b.C42842ba.m75685a(r0, r7)
        L_0x0068:
            goto L_0x006a
        L_0x0069:
            throw r0
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3315b.C42847bf.m75693f(android.database.Cursor):java.lang.String");
    }

    /* renamed from: g */
    public static void m75694g() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: a */
    public final int mo45929a(C42837aw awVar) {
        m75694g();
        String str = awVar.f112122a;
        String str2 = awVar.f112123b;
        C47558bi s = C47831fm.m85024s("DELETE FROM " + str + " WHERE " + str2);
        try {
            int delete = this.f112138b.delete(awVar.f112122a, awVar.f112123b, awVar.f112124c);
            s.close();
            return delete;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    @SafeVarargs
    /* renamed from: b */
    public final int mo45930b(String str, String str2, String... strArr) {
        m75694g();
        C47558bi s = C47831fm.m85024s("DELETE FROM " + str + " WHERE " + str2);
        try {
            int delete = this.f112138b.delete(str, str2, strArr);
            s.close();
            return delete;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final long mo45931c(String str, ContentValues contentValues, int i) {
        m75694g();
        C47558bi s = C47831fm.m85024s("INSERT WITH ON CONFLICT ".concat(str));
        try {
            long insertWithOnConflict = this.f112138b.insertWithOnConflict(str, (String) null, contentValues, i);
            s.close();
            return insertWithOnConflict;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final Cursor mo45932d(C42839ay ayVar) {
        m75694g();
        if (Log.isLoggable("ASQLDB", 2)) {
            Log.v("ASQLDB", m75693f(this.f112138b.rawQueryWithFactory(new C42843bb(ayVar.f112129b), "EXPLAIN QUERY PLAN ".concat(ayVar.f112128a), (String[]) null, (String) null)));
        }
        C47558bi s = C47831fm.m85024s("Query: ".concat(ayVar.f112128a));
        try {
            Cursor rawQueryWithFactory = this.f112138b.rawQueryWithFactory(new C42843bb(ayVar.f112129b), ayVar.f112128a, (String[]) null, (String) null, this.f112137a);
            s.close();
            return rawQueryWithFactory;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final C42845bd mo45933e(String str) {
        m75694g();
        return new C42845bd(this, str);
    }

    /* renamed from: h */
    public final void mo45934h(C42839ay ayVar) {
        m75694g();
        C47558bi s = C47831fm.m85024s("execSQL: ".concat(ayVar.f112128a));
        try {
            this.f112138b.execSQL(ayVar.f112128a, ayVar.f112129b);
            s.close();
            return;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo45935i(String str) {
        m75694g();
        C47558bi s = C47831fm.m85024s("execSQL: ".concat(str));
        try {
            this.f112138b.execSQL(str);
            s.close();
            return;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }

    @SafeVarargs
    /* renamed from: j */
    public final void mo45936j(String str, ContentValues contentValues, String str2, String... strArr) {
        m75694g();
        C47558bi s = C47831fm.m85024s("UPDATE WHERE ".concat(str2));
        try {
            this.f112138b.update(str, contentValues, str2, strArr);
            s.close();
            return;
        } catch (Throwable th) {
            C42842ba.m75685a(th, th);
        }
        throw th;
    }
}
