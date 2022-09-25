package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.bc */
/* compiled from: PG */
public final class C105949bc extends SQLiteOpenHelper {

    /* renamed from: a */
    static final String[] f295796a = {"CREATE TABLE turns (id INTEGER PRIMARY KEY AUTOINCREMENT, account_id INTEGER, event_id TEXT, timestamp INTEGER)", "CREATE TABLE entries (id INTEGER PRIMARY KEY, turn_id INTEGER, entry BLOB)", "CREATE TABLE accounts (id INTEGER PRIMARY KEY, name TEXT)", "CREATE TABLE suggests (id INTEGER PRIMARY KEY AUTOINCREMENT, account_id INTEGER, turn_id INTEGER, entry BLOB)", "CREATE TABLE deletions (id INTEGER PRIMARY KEY, account_id INTEGER, event_id TEXT)", "CREATE TABLE webanswerattribs (account_id INTEGER PRIMARY KEY, entry BLOB)"};

    /* renamed from: b */
    private final Context f295797b;

    /* renamed from: c */
    private final int f295798c = 65542;

    /* renamed from: d */
    private final Activity f295799d;

    /* renamed from: e */
    private final C89911f f295800e;

    public C105949bc(Context context, Activity activity, C89911f fVar) {
        super(context, "opa_history", (SQLiteDatabase.CursorFactory) null, 65542);
        this.f295797b = context;
        this.f295799d = activity;
        this.f295800e = fVar;
    }

    /* renamed from: a */
    private static final void m176508a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C59071e eVar = C105952bf.f295801a;
        C58976aa aaVar = C58975e.f156826a;
        while (i < i2) {
            sQLiteDatabase.execSQL(f295796a[i]);
            i++;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (C105950bd unused) {
            this.f295797b.deleteDatabase("opa_history");
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException unused2) {
            this.f295800e.mo83755a((Throwable) null, 73669261, 29).mo83721a();
            this.f295799d.finish();
            sQLiteDatabase = null;
        }
        sQLiteDatabase.getClass();
        return sQLiteDatabase;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C59071e eVar = C105952bf.f295801a;
        C58976aa aaVar = C58975e.f156826a;
        m176508a(sQLiteDatabase, 0, (char) this.f295798c);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C59071e eVar = C105952bf.f295801a;
        C58976aa aaVar = C58975e.f156826a;
        if ((i2 & 16711680) <= (16711680 & i)) {
            m176508a(sQLiteDatabase, (char) i, (char) i2);
            return;
        }
        throw new C105950bd();
    }
}
