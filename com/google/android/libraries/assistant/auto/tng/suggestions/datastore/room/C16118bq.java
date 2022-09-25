package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bq */
/* compiled from: PG */
final class C16118bq extends C3933ap {
    public C16118bq(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM shortcut_to_display WHERE display_id = ? AND is_displayed_now = ?";
    }
}
