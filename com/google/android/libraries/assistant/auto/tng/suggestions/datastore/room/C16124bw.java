package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bw */
/* compiled from: PG */
final class C16124bw extends C3937a {
    public C16124bw() {
        super(10, 11);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("DELETE FROM `candidate_suggestion`");
        dVar2.f12902a.execSQL("DROP TABLE `candidate_suggestion_metrics`");
        dVar2.f12902a.execSQL("DROP TABLE `suggestion_to_display`");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `candidate_suggestion_metrics` (`candidate_suggestion_id` TEXT NOT NULL, `click_count` INTEGER NOT NULL, `show_count` INTEGER NOT NULL, `last_click_timestamp` INTEGER NOT NULL, `last_show_timestamp` INTEGER NOT NULL, `last_cleared_timestamp` INTEGER NOT NULL, PRIMARY KEY(`candidate_suggestion_id`))");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_candidate_suggestion_metrics_candidate_suggestion_id` ON `candidate_suggestion_metrics` (`candidate_suggestion_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `suggestion_to_display` (`id` TEXT NOT NULL, `candidate_suggestion_id` TEXT NOT NULL, `display_id` TEXT NOT NULL, `is_displayed_now` INTEGER NOT NULL, `display_text` TEXT NOT NULL, `description` TEXT, `display_metadata` BLOB NOT NULL, `source` INTEGER NOT NULL, `action_fulfillment_data` BLOB NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`display_id`) REFERENCES `display_info`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_suggestion_to_display_display_id` ON `suggestion_to_display` (`display_id`)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_suggestion_to_display_candidate_suggestion_id` ON `suggestion_to_display` (`candidate_suggestion_id`)");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
