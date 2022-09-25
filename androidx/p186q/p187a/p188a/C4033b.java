package androidx.p186q.p187a.p188a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p5462h.p5473f.p5474a.C69632r;

/* renamed from: androidx.q.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C4033b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C69632r f12897a;

    public /* synthetic */ C4033b(C69632r rVar) {
        this.f12897a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C69632r rVar = this.f12897a;
        int i = C4035d.f12899b;
        return (Cursor) rVar.mo8479a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
