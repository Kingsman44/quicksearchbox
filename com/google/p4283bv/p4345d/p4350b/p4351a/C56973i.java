package com.google.p4283bv.p4345d.p4350b.p4351a;

/* renamed from: com.google.bv.d.b.a.i */
/* compiled from: PG */
public enum C56973i {
    OPEN_URL_ACTION,
    SEARCH_ACTION,
    FEEDBACK,
    OPAQUE_NOTIFICATION_ACTION,
    GOOGLE_FEEDBACK,
    MANAGE_NOTIFICATIONS_ACTION,
    DISCOVER_PINNED_CONTENT_ACTION,
    FULL_COVERAGE_ACTION,
    ACTION_NOT_SET;

    /* renamed from: a */
    public static C56973i m88245a(int i) {
        switch (i) {
            case 0:
                return ACTION_NOT_SET;
            case 2:
                return OPEN_URL_ACTION;
            case 3:
                return SEARCH_ACTION;
            case 4:
                return FEEDBACK;
            case 6:
                return OPAQUE_NOTIFICATION_ACTION;
            case 7:
                return GOOGLE_FEEDBACK;
            case 8:
                return MANAGE_NOTIFICATIONS_ACTION;
            case 9:
                return DISCOVER_PINNED_CONTENT_ACTION;
            case 10:
                return FULL_COVERAGE_ACTION;
            default:
                return null;
        }
    }
}
