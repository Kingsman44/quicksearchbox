package androidx.p186q.p187a.p188a;

import android.database.sqlite.SQLiteStatement;
import androidx.p186q.p187a.C4057l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.o */
/* compiled from: PG */
public final class C4046o extends C4045n implements C4057l {

    /* renamed from: b */
    public final SQLiteStatement f12931b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4046o(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        C69664n.m101061g(sQLiteStatement, "delegate");
        this.f12931b = sQLiteStatement;
    }

    /* renamed from: a */
    public final int mo8256a() {
        return this.f12931b.executeUpdateDelete();
    }

    /* renamed from: b */
    public final long mo8257b() {
        return this.f12931b.executeInsert();
    }
}
