package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.data.impl.a */
/* compiled from: PG */
final class C29796a extends SQLiteOpenHelper {
    public C29796a(Context context) {
        super(context, "accounts.notifications.db", (SQLiteDatabase.CursorFactory) null, 6);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C30058b.m55794f("ChimeAccountSQLiteHelper", "Creating SQLite Database [%s]", "accounts.notifications.db");
        sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0),first_registration_version INTEGER NOT NULL DEFAULT(0),internal_target_id TEXT NOT NULL DEFAULT(''),representative_target_id TEXT NOT NULL DEFAULT(''));");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C30058b.m55794f("ChimeAccountSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", "accounts.notifications.db", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accounts");
            sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0),first_registration_version INTEGER NOT NULL DEFAULT(0),internal_target_id TEXT NOT NULL DEFAULT(''),representative_target_id TEXT NOT NULL DEFAULT(''));");
            return;
        }
        if (i < 3) {
            C29812q.m55067b(sQLiteDatabase, "accounts", "last_registration_time_ms", "INTEGER NOT NULL DEFAULT(0)");
            i = 3;
        }
        if (i < 4) {
            C29812q.m55067b(sQLiteDatabase, "accounts", "last_registration_request_hash", "INTEGER NOT NULL DEFAULT(0)");
            i = 4;
        }
        if (i < 5) {
            if (!C29812q.m55068c(sQLiteDatabase, "accounts", "first_registration_version")) {
                C29812q.m55067b(sQLiteDatabase, "accounts", "first_registration_version", "INTEGER NOT NULL DEFAULT(0)");
            }
        } else if (i >= 6) {
            return;
        }
        C29812q.m55067b(sQLiteDatabase, "accounts", "internal_target_id", "TEXT NOT NULL DEFAULT('')");
        C29812q.m55067b(sQLiteDatabase, "accounts", "representative_target_id", "TEXT NOT NULL DEFAULT('')");
    }
}
