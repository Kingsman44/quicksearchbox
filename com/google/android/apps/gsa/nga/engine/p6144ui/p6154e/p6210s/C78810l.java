package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.l */
/* compiled from: PG */
public enum C78810l {
    NO_SESSION,
    VOICE_SESSION,
    POST_EXECUTION_SESSION,
    NOT_LISTENING_SESSION,
    AVS_SESSION,
    SUPPRESSED_UI_SESSION,
    SESSIONTYPE_NOT_SET;

    /* renamed from: a */
    public static C78810l m126595a(int i) {
        if (i == 0) {
            return SESSIONTYPE_NOT_SET;
        }
        switch (i) {
            case 2:
                return NO_SESSION;
            case 3:
                return VOICE_SESSION;
            case 4:
                return POST_EXECUTION_SESSION;
            case 5:
                return NOT_LISTENING_SESSION;
            case 6:
                return AVS_SESSION;
            case 7:
                return SUPPRESSED_UI_SESSION;
            default:
                return null;
        }
    }
}
