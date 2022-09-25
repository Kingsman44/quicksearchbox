package androidx.media3.p131a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.a.c */
/* compiled from: PG */
public class C2452c extends SQLiteOpenHelper {
    public C2452c(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private static void m6469a(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    str = "DROP " + string + " IF EXISTS " + string2;
                    sQLiteDatabase.execSQL(str);
                }
            } catch (SQLException e) {
                C2633u.m7048c("SADatabaseProvider", C2633u.m7046a("Error executing " + str, e));
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m6469a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
