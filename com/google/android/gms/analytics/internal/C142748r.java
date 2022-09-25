package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.analytics.internal.r */
/* compiled from: PG */
final class C142748r extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ C142749s f387368a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C142748r(C142749s sVar, Context context) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f387368a = sVar;
    }

    /* renamed from: a */
    private final boolean m231644a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            if (query != null) {
                query.close();
            }
            return moveToFirst;
        } catch (SQLiteException e) {
            this.f387368a.mo117536i(5, "Error querying for table", str, e, (Object) null);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static final Set m231645b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.f387368a.f387371c.mo117526a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f387368a.f387371c.f387316a = SystemClock.elapsedRealtime();
                this.f387368a.mo117536i(6, "Opening the database failed, dropping the table and recreating it", (Object) null, (Object) null, (Object) null);
                this.f387368a.f387328e.f387334b.getDatabasePath(this.f387368a.mo117569d()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f387368a.f387371c.f387316a = 0;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f387368a.mo117536i(6, "Failed to open freshly created database", e, (Object) null, (Object) null);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            C142721ar.m231569a("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        if (!m231644a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(C142749s.f387369a);
        } else {
            Set b = m231645b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            int i2 = 0;
            while (i2 < 4) {
                String str = strArr[i2];
                if (b.remove(str)) {
                    i2++;
                } else {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str)));
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (m231644a(sQLiteDatabase, "properties")) {
            Set b2 = m231645b(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            while (i < 6) {
                String str2 = strArr2[i];
                if (b2.remove(str2)) {
                    i++;
                } else {
                    throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str2)));
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
