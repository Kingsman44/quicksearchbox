package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ao */
/* compiled from: PG */
public enum C122396ao {
    PART,
    COMPLETED,
    ERROR,
    CANCELLED,
    PAYLOAD_NOT_SET;

    /* renamed from: a */
    public static C122396ao m201856a(int i) {
        if (i == 0) {
            return PAYLOAD_NOT_SET;
        }
        if (i == 2) {
            return PART;
        }
        if (i == 3) {
            return COMPLETED;
        }
        if (i == 4) {
            return ERROR;
        }
        if (i != 5) {
            return null;
        }
        return CANCELLED;
    }
}
