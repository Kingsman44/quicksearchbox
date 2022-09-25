package com.google.android.libraries.social.populous.logging;

import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;

/* renamed from: com.google.android.libraries.social.populous.logging.ac */
/* compiled from: PG */
public final class C42565ac {
    /* renamed from: a */
    public static int m75121a(SQLiteException sQLiteException) {
        if (sQLiteException instanceof SQLiteAbortException) {
            return 5;
        }
        if (sQLiteException instanceof SQLiteAccessPermException) {
            return 4;
        }
        if (sQLiteException instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
            return 26;
        }
        if (sQLiteException instanceof SQLiteBlobTooBigException) {
            return 19;
        }
        if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
            return 15;
        }
        if (sQLiteException instanceof SQLiteConstraintException) {
            return 20;
        }
        if (sQLiteException instanceof SQLiteDatabaseCorruptException) {
            return 12;
        }
        if (sQLiteException instanceof SQLiteDatabaseLockedException) {
            return 7;
        }
        if (sQLiteException instanceof SQLiteDatatypeMismatchException) {
            return 21;
        }
        if (sQLiteException instanceof SQLiteDiskIOException) {
            return 11;
        }
        if (sQLiteException instanceof SQLiteDoneException) {
            return 102;
        }
        if (sQLiteException instanceof SQLiteFullException) {
            return 14;
        }
        if (sQLiteException instanceof SQLiteMisuseException) {
            return 22;
        }
        if (sQLiteException instanceof SQLiteOutOfMemoryException) {
            return 8;
        }
        if (sQLiteException instanceof SQLiteReadOnlyDatabaseException) {
            return 27;
        }
        if (sQLiteException instanceof SQLiteTableLockedException) {
            return 7;
        }
        return 2;
    }
}
