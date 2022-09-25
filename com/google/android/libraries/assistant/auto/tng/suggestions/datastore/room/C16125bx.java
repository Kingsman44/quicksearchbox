package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bx */
/* compiled from: PG */
final class C16125bx extends C3937a {
    public C16125bx() {
        super(11, 12);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `shortcut_to_display` (`id` TEXT NOT NULL, `display_id` TEXT NOT NULL,`is_displayed_now` INTEGER NOT NULL, `status` INTEGER NOT NULL, `display_text` TEXT NOT NULL, `display_metadata` BLOB NOT NULL,`action_fulfillment_data` BLOB NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`display_id`) REFERENCES `display_info`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_shortcut_to_display_display_id` ON `shortcut_to_display` (`display_id`)");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
