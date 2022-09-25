package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cb */
/* compiled from: PG */
final class C16130cb extends C3937a {
    public C16130cb() {
        super(15, 16);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("ALTER TABLE candidate_suggestion_metrics ADD COLUMN dismissal_count INTEGER NOT NULL DEFAULT 0");
        dVar2.f12902a.execSQL("ALTER TABLE candidate_suggestion_metrics ADD COLUMN last_dismissal_timestamp INTEGER NOT NULL DEFAULT 0");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
