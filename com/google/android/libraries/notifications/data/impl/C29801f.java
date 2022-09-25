package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.data.impl.f */
/* compiled from: PG */
final class C29801f extends SQLiteOpenHelper {
    public C29801f(Context context, long j) {
        super(context, j + "_tasks.notifications.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C30058b.m55794f("ChimeTaskDataSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C30058b.m55794f("ChimeTaskDataSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks");
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        }
    }
}
