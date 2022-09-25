package androidx.media3.p132b.p133a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.p131a.C2450a;
import androidx.media3.p131a.C2452c;
import androidx.media3.p131a.C2453d;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.media3.b.a.h */
/* compiled from: PG */
final class C2463h {

    /* renamed from: a */
    private static final String[] f6776a = {"name", "length", "last_touch_timestamp"};

    /* renamed from: b */
    private String f6777b;

    /* renamed from: c */
    private final C2452c f6778c;

    public C2463h(C2452c cVar) {
        this.f6778c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map mo5885a() {
        /*
            r10 = this;
            java.lang.String r0 = r10.f6777b     // Catch:{ SQLException -> 0x0066 }
            r0.getClass()
            androidx.media3.a.c r0 = r10.f6778c     // Catch:{ SQLException -> 0x0066 }
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()     // Catch:{ SQLException -> 0x0066 }
            java.lang.String r2 = r10.f6777b     // Catch:{ SQLException -> 0x0066 }
            java.lang.String[] r3 = f6776a     // Catch:{ SQLException -> 0x0066 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x0066 }
            r1 = 1
            r2 = 0
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0048 }
            int r4 = r0.getCount()     // Catch:{ all -> 0x0048 }
            r3.<init>(r4)     // Catch:{ all -> 0x0048 }
        L_0x0023:
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r0.getString(r2)     // Catch:{ all -> 0x0048 }
            r4.getClass()
            long r5 = r0.getLong(r1)     // Catch:{ all -> 0x0048 }
            r7 = 2
            long r7 = r0.getLong(r7)     // Catch:{ all -> 0x0048 }
            androidx.media3.b.a.g r9 = new androidx.media3.b.a.g     // Catch:{ all -> 0x0048 }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x0048 }
            r3.put(r4, r9)     // Catch:{ all -> 0x0048 }
            goto L_0x0023
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ SQLException -> 0x0066 }
        L_0x0047:
            return r3
        L_0x0048:
            r3 = move-exception
            if (r0 == 0) goto L_0x0065
            r0.close()     // Catch:{ all -> 0x004f }
            goto L_0x0065
        L_0x004f:
            r0 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0065 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x0065 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0065 }
            r1[r2] = r0     // Catch:{ Exception -> 0x0065 }
            r4.invoke(r3, r1)     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            throw r3     // Catch:{ SQLException -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            androidx.media3.a.a r1 = new androidx.media3.a.a
            r1.<init>(r0)
            goto L_0x006e
        L_0x006d:
            throw r1
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.p133a.C2463h.mo5885a():java.util.Map");
    }

    /* renamed from: b */
    public final void mo5886b(long j) {
        SQLiteDatabase writableDatabase;
        try {
            String hexString = Long.toHexString(j);
            this.f6777b = "ExoPlayerCacheFileMetadata".concat(String.valueOf(hexString));
            if (C2453d.m6470a(this.f6778c.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = this.f6778c.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C2453d.m6471b(writableDatabase, 2, hexString);
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(this.f6777b)));
                String str = this.f6777b;
                writableDatabase.execSQL("CREATE TABLE " + str + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C2450a(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo5888d(Set set) {
        SQLiteDatabase writableDatabase;
        this.f6777b.getClass();
        try {
            writableDatabase = this.f6778c.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f6777b, "name = ?", new String[]{(String) it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C2450a(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo5887c(String str) {
        this.f6777b.getClass();
        try {
            this.f6778c.getWritableDatabase().delete(this.f6777b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C2450a(e);
        }
    }

    /* renamed from: e */
    public final void mo5889e(String str, long j, long j2) {
        this.f6777b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f6778c.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f6777b, (String) null, contentValues);
        } catch (SQLException e) {
            throw new C2450a(e);
        }
    }
}
