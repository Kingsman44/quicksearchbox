package com.google.android.libraries.storage.p3315b;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: com.google.android.libraries.storage.b.bb */
/* compiled from: PG */
final class C42843bb implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    private final Object[] f112132a;

    public C42843bb(Object[] objArr) {
        this.f112132a = objArr;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        if (this.f112132a != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f112132a;
                if (i >= objArr.length) {
                    break;
                }
                int i2 = i + 1;
                Object obj = objArr[i];
                if (obj == null) {
                    sQLiteQuery.bindNull(i2);
                } else if (obj instanceof String) {
                    sQLiteQuery.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    sQLiteQuery.bindBlob(i2, (byte[]) obj);
                } else if (obj instanceof Long) {
                    sQLiteQuery.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    sQLiteQuery.bindDouble(i2, ((Double) obj).doubleValue());
                } else {
                    throw new AssertionError("Attempted to bind an unsupported type");
                }
                i = i2;
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
