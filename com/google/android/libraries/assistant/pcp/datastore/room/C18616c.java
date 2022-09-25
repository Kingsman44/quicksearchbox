package com.google.android.libraries.assistant.pcp.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.c */
/* compiled from: PG */
final class C18616c extends C3937a {
    public C18616c() {
        super(2, 3);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `new_stored_elements` (`feature_type` INTEGER NOT NULL, `id` TEXT NOT NULL, `stored_element` BLOB NOT NULL, `structured_data_state_type` TEXT NOT NULL, PRIMARY KEY(`feature_type`, `id`))");
        dVar2.f12902a.execSQL("INSERT INTO new_stored_elements(feature_type, id, stored_element, structured_data_state_type) SELECT feature_type, id, stored_element, structured_data_state_type FROM stored_elements");
        dVar2.f12902a.execSQL("DROP TABLE stored_elements");
        dVar2.f12902a.execSQL("ALTER TABLE new_stored_elements RENAME TO stored_elements");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
