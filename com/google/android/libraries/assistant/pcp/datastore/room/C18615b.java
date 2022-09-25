package com.google.android.libraries.assistant.pcp.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.b */
/* compiled from: PG */
final class C18615b extends C3937a {
    public C18615b() {
        super(1, 2);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `feature_last_full_refresh` (`feature_type` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`feature_type`))");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
