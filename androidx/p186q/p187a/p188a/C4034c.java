package androidx.p186q.p187a.p188a;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.p186q.p187a.C4056k;
import p5462h.p5473f.p5474a.C69632r;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.q.a.a.c */
/* compiled from: PG */
final class C4034c extends C69665o implements C69632r {

    /* renamed from: a */
    final /* synthetic */ C4056k f12898a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4034c(C4056k kVar) {
        super(4);
        this.f12898a = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        C4056k kVar = this.f12898a;
        C69664n.m101058d(sQLiteQuery);
        kVar.mo8200b(new C4045n(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
