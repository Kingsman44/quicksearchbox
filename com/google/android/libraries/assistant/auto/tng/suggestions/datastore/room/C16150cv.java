package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cv */
/* compiled from: PG */
final class C16150cv extends C3933ap {
    public C16150cv(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM suggestion_to_display WHERE display_id = ? AND is_displayed_now = ?";
    }
}
