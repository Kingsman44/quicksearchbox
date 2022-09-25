package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ce */
/* compiled from: PG */
final class C16133ce extends C3937a {
    public C16133ce() {
        super(3, 4);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("DELETE FROM display_info");
        dVar2.f12902a.execSQL("ALTER TABLE display_info ADD COLUMN max_display_text_length INTEGER NOT NULL DEFAULT '0'");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
