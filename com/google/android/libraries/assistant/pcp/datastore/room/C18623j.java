package com.google.android.libraries.assistant.pcp.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.j */
/* compiled from: PG */
final class C18623j extends C3933ap {
    public C18623j(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM stored_elements WHERE feature_type = ? AND id = ?";
    }
}
