package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.notifications.data.impl.h */
/* compiled from: PG */
final class C29803h extends SQLiteOpenHelper {
    public C29803h(Context context, long j) {
        super(context, j + "_threads.notifications.db", (SQLiteDatabase.CursorFactory) null, 21);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C30058b.m55794f("ChimeThreadSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        int i4 = i2;
        C30058b.m55794f("ChimeThreadSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i3 < 6) {
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase2.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
            return;
        }
        if (i3 == 6) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i4 > 7) {
                i3 = 7;
            } else {
                return;
            }
        }
        if (i3 == 7) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "locally_removed", "INTEGER NOT NULL DEFAULT(0)");
            if (i4 > 8) {
                i3 = 8;
            } else {
                return;
            }
        }
        if (i3 < 12) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "storage_mode", "INTEGER NOT NULL DEFAULT(0)");
            if (i4 > 12) {
                i3 = 12;
            } else {
                return;
            }
        }
        if (i3 < 14) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "payload_type", "TEXT");
            if (i4 > 14) {
                i3 = 14;
            } else {
                return;
            }
        }
        if (i3 == 14) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "thread_stored_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i4 > 15) {
                i3 = 15;
            } else {
                return;
            }
        }
        if (i3 == 15) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "creation_id", "INTEGER NOT NULL DEFAULT(0)");
            if (i4 > 16) {
                i3 = 16;
            } else {
                return;
            }
        }
        if (i3 == 16) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "actions", "BLOB");
            if (i4 > 17) {
                i3 = 17;
            } else {
                return;
            }
        }
        if (i3 == 17) {
            if (!C29812q.m55068c(sQLiteDatabase2, "threads", "_id", "thread_id", "read_state", "count_behavior", "system_tray_behavior", "last_updated__version", "last_notification_version", "creation_id", "notification_metadata", "actions", "rendered_message", "payload_type", "payload", "update_thread_state_token", "group_id", "expiration_timestamp", "thread_stored_timestamp", "locally_removed", "storage_mode")) {
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS threads");
                sQLiteDatabase2.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
                return;
            } else if (i4 > 18) {
                i3 = 18;
            } else {
                return;
            }
        }
        if (i3 == 18) {
            C29812q.m55067b(sQLiteDatabase2, "threads", "reference", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase2.execSQL("UPDATE threads SET reference = 1");
            if (i4 > 19) {
                i3 = 19;
            } else {
                return;
            }
        }
        if (i3 == 19) {
            sQLiteDatabase2.execSQL(String.format(Locale.US, "UPDATE %s SET %s = 0 WHERE %s != 0", new Object[]{"threads", "reference", "locally_removed"}));
            if (i4 <= 20) {
                return;
            }
        } else if (i3 != 20) {
            return;
        }
        C29812q.m55067b(sQLiteDatabase2, "threads", "deletion_status", "INTEGER NOT NULL DEFAULT(0)");
        sQLiteDatabase2.execSQL("UPDATE threads SET deletion_status = ?", new String[]{"1"});
    }
}
