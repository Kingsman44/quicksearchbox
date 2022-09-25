package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gv */
/* compiled from: PG */
public enum C14373gv {
    USER_TRIGGERED_CALL_RECENT_CALL,
    USER_TRIGGERED_CALL_TOP_CONTACT,
    UPDATED_RECENT_CALL_CACHE,
    USER_TRIGGERED_CALL_SOMEONE_ELSE,
    USER_TRIGGERED_CALL_TILE,
    CALLCENTEREVENT_NOT_SET;

    /* renamed from: a */
    public static C14373gv m30614a(int i) {
        if (i == 0) {
            return CALLCENTEREVENT_NOT_SET;
        }
        if (i == 1) {
            return USER_TRIGGERED_CALL_RECENT_CALL;
        }
        if (i == 2) {
            return USER_TRIGGERED_CALL_TOP_CONTACT;
        }
        if (i == 3) {
            return UPDATED_RECENT_CALL_CACHE;
        }
        if (i == 4) {
            return USER_TRIGGERED_CALL_SOMEONE_ELSE;
        }
        if (i != 7) {
            return null;
        }
        return USER_TRIGGERED_CALL_TILE;
    }
}
