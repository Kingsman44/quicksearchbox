package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.C58881cr;
import java.io.File;
import java.io.UnsupportedEncodingException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.af */
/* compiled from: PG */
public final class C100127af extends ContextWrapper {

    /* renamed from: a */
    public final String f279996a;

    /* renamed from: b */
    private final C58881cr f279997b;

    public C100127af(Context context, String str, C58881cr crVar) {
        super(context);
        this.f279996a = str;
        this.f279997b = crVar;
    }

    public final boolean deleteDatabase(String str) {
        return getDatabasePath(str).delete();
    }

    public final File getDatabasePath(String str) {
        String str2 = this.f279996a;
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        File file = new File((File) this.f279997b.mo6453a(), str2);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(str, i, cursorFactory, (DatabaseErrorHandler) null);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openDatabase(getDatabasePath(str).getAbsolutePath(), cursorFactory, i | 268435456, databaseErrorHandler);
    }
}
