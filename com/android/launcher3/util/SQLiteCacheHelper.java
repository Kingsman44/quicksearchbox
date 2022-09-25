package com.android.launcher3.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* compiled from: PG */
public abstract class SQLiteCacheHelper {
    private boolean mIgnoreWrites = false;
    private final MySQLiteOpenHelper mOpenHelper;
    public final String mTableName;

    /* compiled from: PG */
    final class MySQLiteOpenHelper extends SQLiteOpenHelper {
        public MySQLiteOpenHelper(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        }

        private final void clearDB(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(SQLiteCacheHelper.this.mTableName));
            SQLiteCacheHelper.this.onCreateTable(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            SQLiteCacheHelper.this.onCreateTable(sQLiteDatabase);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i != i2) {
                clearDB(sQLiteDatabase);
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i != i2) {
                clearDB(sQLiteDatabase);
            }
        }
    }

    public SQLiteCacheHelper(Context context, String str, int i, String str2) {
        this.mTableName = str2;
        this.mOpenHelper = new MySQLiteOpenHelper(context, str, i);
    }

    private final void onDiskFull(SQLiteFullException sQLiteFullException) {
        Log.e("SQLiteCacheHelper", "Disk full, all write operations will be ignored", sQLiteFullException);
        this.mIgnoreWrites = true;
    }

    public final void delete(String str, String[] strArr) {
        if (!this.mIgnoreWrites) {
            try {
                this.mOpenHelper.getWritableDatabase().delete(this.mTableName, str, strArr);
            } catch (SQLiteFullException e) {
                onDiskFull(e);
            } catch (SQLiteException e2) {
                Log.d("SQLiteCacheHelper", "Ignoring sqlite exception", e2);
            }
        }
    }

    public final void insertOrReplace(ContentValues contentValues) {
        if (!this.mIgnoreWrites) {
            try {
                this.mOpenHelper.getWritableDatabase().insertWithOnConflict(this.mTableName, (String) null, contentValues, 5);
            } catch (SQLiteFullException e) {
                onDiskFull(e);
            } catch (SQLiteException e2) {
                Log.d("SQLiteCacheHelper", "Ignoring sqlite exception", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onCreateTable(SQLiteDatabase sQLiteDatabase);

    public final Cursor query(String[] strArr, String str, String[] strArr2) {
        return this.mOpenHelper.getReadableDatabase().query(this.mTableName, strArr, str, strArr2, (String) null, (String) null, (String) null);
    }

    public final void update$ar$ds(ContentValues contentValues, String[] strArr) {
        if (!this.mIgnoreWrites) {
            try {
                this.mOpenHelper.getWritableDatabase().update(this.mTableName, contentValues, "componentName = ? AND profileId = ?", strArr);
            } catch (SQLiteFullException e) {
                onDiskFull(e);
            } catch (SQLiteException e2) {
                Log.d("SQLiteCacheHelper", "Ignoring sqlite exception", e2);
            }
        }
    }
}
