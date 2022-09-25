package androidx.p186q.p187a;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* renamed from: androidx.q.a.e */
/* compiled from: PG */
public abstract class C4050e {

    /* renamed from: e */
    public final int f12934e;

    public C4050e(int i) {
        this.f12934e = i;
    }

    /* renamed from: c */
    public static final void m11599c(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: ".concat(String.valueOf(str)));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo8197a(C4049d dVar, int i, int i2);
}
