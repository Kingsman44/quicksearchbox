package androidx.media3.p131a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.C2591ar;

/* renamed from: androidx.media3.a.d */
/* compiled from: PG */
public final class C2453d {
    static {
        C2591ar.m6797b("media3.database");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6470a(android.database.sqlite.SQLiteDatabase r11, int r12, java.lang.String r13) {
        /*
            boolean r0 = androidx.media3.common.p136b.C2612ak.m6948aD(r11)     // Catch:{ SQLException -> 0x005e }
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r3 = "ExoPlayerVersions"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLException -> 0x005e }
            java.lang.String r2 = "version"
            r10 = 0
            r4[r10] = r2     // Catch:{ SQLException -> 0x005e }
            java.lang.String r5 = "feature = ? AND instance_uid = ?"
            r2 = 2
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x005e }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ SQLException -> 0x005e }
            r6[r10] = r12     // Catch:{ SQLException -> 0x005e }
            r6[r0] = r13     // Catch:{ SQLException -> 0x005e }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x005e }
            int r12 = r11.getCount()     // Catch:{ all -> 0x0040 }
            if (r12 != 0) goto L_0x0033
            if (r11 == 0) goto L_0x0032
            r11.close()     // Catch:{ SQLException -> 0x005e }
        L_0x0032:
            return r1
        L_0x0033:
            r11.moveToNext()     // Catch:{ all -> 0x0040 }
            int r12 = r11.getInt(r10)     // Catch:{ all -> 0x0040 }
            if (r11 == 0) goto L_0x003f
            r11.close()     // Catch:{ SQLException -> 0x005e }
        L_0x003f:
            return r12
        L_0x0040:
            r12 = move-exception
            if (r11 == 0) goto L_0x005d
            r11.close()     // Catch:{ all -> 0x0047 }
            goto L_0x005d
        L_0x0047:
            r11 = move-exception
            java.lang.Class[] r13 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r13[r10] = r1     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.reflect.Method r13 = r1.getDeclaredMethod(r2, r13)     // Catch:{ Exception -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x005d }
            r0[r10] = r11     // Catch:{ Exception -> 0x005d }
            r13.invoke(r12, r0)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r12     // Catch:{ SQLException -> 0x005e }
        L_0x005e:
            r11 = move-exception
            androidx.media3.a.a r12 = new androidx.media3.a.a
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p131a.C2453d.m6470a(android.database.sqlite.SQLiteDatabase, int, java.lang.String):int");
    }

    /* renamed from: b */
    public static void m6471b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", (String) null, contentValues);
        } catch (SQLException e) {
            throw new C2450a(e);
        }
    }
}
