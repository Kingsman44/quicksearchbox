package com.google.android.apps.gsa.shared.util;

import android.database.Cursor;

/* renamed from: com.google.android.apps.gsa.shared.util.t */
/* compiled from: PG */
public final class C91089t {
    /* renamed from: a */
    public static final String m148812a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    public static void m148813b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: c */
    public static void m148814c(C91087s sVar, Cursor cursor) {
        if (cursor != null) {
            while (cursor.moveToNext() && !Thread.currentThread().isInterrupted()) {
                try {
                    sVar.mo70787a(cursor);
                } catch (Throwable th) {
                    m148813b(cursor);
                    throw th;
                }
            }
        }
        m148813b(cursor);
    }
}
