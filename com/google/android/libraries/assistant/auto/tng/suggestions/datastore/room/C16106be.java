package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import org.json.JSONObject;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.be */
/* compiled from: PG */
public abstract class C16106be {
    /* renamed from: a */
    public abstract long mo22757a();

    /* renamed from: b */
    public abstract String mo22758b();

    /* renamed from: c */
    public abstract int mo22759c();

    /* renamed from: d */
    public final boolean mo22760d() {
        int c = mo22759c();
        if (c == 0) {
            throw null;
        } else if (c != 1) {
            return true;
        } else {
            if (mo22759c() == 1 && !new JSONObject(mo22758b()).getBoolean("homeScreenVisibility")) {
                return false;
            }
            return mo22759c() != 1 || new JSONObject(mo22758b()).getBoolean("assistantVisibility");
        }
    }
}
