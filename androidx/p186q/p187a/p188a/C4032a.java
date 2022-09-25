package androidx.p186q.p187a.p188a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.p186q.p187a.C4056k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C4032a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C4056k f12896a;

    public /* synthetic */ C4032a(C4056k kVar) {
        this.f12896a = kVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C4056k kVar = this.f12896a;
        C69664n.m101061g(kVar, "$supportQuery");
        C69664n.m101058d(sQLiteQuery);
        kVar.mo8200b(new C4045n(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
