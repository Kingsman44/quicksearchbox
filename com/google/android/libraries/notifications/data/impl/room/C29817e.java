package com.google.android.libraries.notifications.data.impl.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: com.google.android.libraries.notifications.data.impl.room.e */
/* compiled from: PG */
final class C29817e extends C3933ap {
    public C29817e(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM chime_thread_states WHERE modified_timestamp < ?";
    }
}
