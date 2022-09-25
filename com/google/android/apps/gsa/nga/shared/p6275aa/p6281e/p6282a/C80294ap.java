package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ap */
/* compiled from: PG */
public enum C80294ap {
    FEEDBACK_OP(1),
    SEND_MESSAGE_OP(4),
    REPLY_TO_NOTIFICATION_OP(5),
    SCREENSHOT_OP(12),
    REPORT_AUM_RESULTS_OP(6),
    STOP_LISTENING_OP(7),
    CLOUD_HANDOVER_OP(9),
    SYSTEM_UI_OP(11),
    RINGER_MODE_OP(13),
    FLASHLIGHT_OP(20),
    MEDIA_CONTROL_OP(15),
    POPUP_ACTION_OP(17),
    DICTATION_OP(19),
    SEND_DIRECT_ACTION_OP(10),
    SEND_DYNAMIC_ACTION_OP(21),
    SUGGESTION_SPECIAL_ACTION_OP(22),
    GELLER_WRITE_OP(2),
    GELLER_INCREMENT_ELEMENT_USED_OP(16),
    GELLER_DELETE_OP(18),
    ONDEVICEOP_NOT_SET(0);
    

    /* renamed from: u */
    public final int f220356u;

    private C80294ap(int i) {
        this.f220356u = i;
    }

    /* renamed from: a */
    public static C80294ap m128115a(int i) {
        switch (i) {
            case 0:
                return ONDEVICEOP_NOT_SET;
            case 1:
                return FEEDBACK_OP;
            case 2:
                return GELLER_WRITE_OP;
            case 4:
                return SEND_MESSAGE_OP;
            case 5:
                return REPLY_TO_NOTIFICATION_OP;
            case 6:
                return REPORT_AUM_RESULTS_OP;
            case 7:
                return STOP_LISTENING_OP;
            case 9:
                return CLOUD_HANDOVER_OP;
            case 10:
                return SEND_DIRECT_ACTION_OP;
            case 11:
                return SYSTEM_UI_OP;
            case 12:
                return SCREENSHOT_OP;
            case 13:
                return RINGER_MODE_OP;
            case 15:
                return MEDIA_CONTROL_OP;
            case 16:
                return GELLER_INCREMENT_ELEMENT_USED_OP;
            case 17:
                return POPUP_ACTION_OP;
            case 18:
                return GELLER_DELETE_OP;
            case 19:
                return DICTATION_OP;
            case 20:
                return FLASHLIGHT_OP;
            case 21:
                return SEND_DYNAMIC_ACTION_OP;
            case 22:
                return SUGGESTION_SPECIAL_ACTION_OP;
            default:
                return null;
        }
    }
}
