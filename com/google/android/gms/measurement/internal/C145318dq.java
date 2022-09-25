package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.dq */
/* compiled from: PG */
final class C145318dq extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ C145319dr f392775a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145318dq(C145319dr drVar, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f392775a = drVar;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f392775a.f393011w.mo120965ar().f392795c.mo120894a("Opening the local database failed, dropping and recreating it");
            C145361ff ffVar = this.f392775a.f393011w;
            C145222ab abVar = ffVar.f392937g;
            if (!ffVar.f392931a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f392775a.f393011w.mo120965ar().f392795c.mo120895b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f392775a.f393011w.mo120965ar().f392795c.mo120895b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C145229ai.m235964b(this.f392775a.f393011w.mo120965ar(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C145229ai.m235963a(this.f392775a.f393011w.mo120965ar(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
