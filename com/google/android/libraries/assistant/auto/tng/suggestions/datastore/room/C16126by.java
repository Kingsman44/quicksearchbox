package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.by */
/* compiled from: PG */
final class C16126by extends C3937a {
    public C16126by() {
        super(12, 13);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("DELETE FROM `suggestion_to_display`");
        dVar2.f12902a.execSQL("DELETE FROM `display_info`");
        dVar2.f12902a.execSQL("DROP TABLE `candidate_suggestion`");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `candidate_suggestion` (`id` TEXT NOT NULL, `display_text` TEXT NOT NULL, `description` TEXT, `locale` TEXT NOT NULL, `source` INTEGER NOT NULL, `created_time_ms` INTEGER, `metadata` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
