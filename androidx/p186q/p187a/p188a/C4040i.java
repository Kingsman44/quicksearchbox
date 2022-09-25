package androidx.p186q.p187a.p188a;

import android.database.sqlite.SQLiteDatabase;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.i */
/* compiled from: PG */
public final class C4040i {
    /* renamed from: a */
    public static final C4035d m11566a(C4036e eVar, SQLiteDatabase sQLiteDatabase) {
        C69664n.m101061g(eVar, "refHolder");
        C69664n.m101061g(sQLiteDatabase, "sqLiteDatabase");
        C4035d dVar = eVar.f12903a;
        if (dVar != null) {
            C69664n.m101061g(sQLiteDatabase, "sqLiteDatabase");
            if (C69664n.m101066l(dVar.f12902a, sQLiteDatabase)) {
                return dVar;
            }
        }
        C4035d dVar2 = new C4035d(sQLiteDatabase);
        eVar.f12903a = dVar2;
        return dVar2;
    }
}
