package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ph */
/* compiled from: PG */
public enum C14602ph {
    INCOMING_CALL_TASK,
    OUTGOING_CALL_TASK,
    ONGOING_CALL_TASK,
    MEDIA_TASK,
    INCOMING_MESSAGE_TASK,
    MESSAGE_AUTO_READ_TASK,
    MESSAGE_READ_TASK,
    MESSAGE_REPLY_TASK,
    MESSAGE_AUTO_DISMISS_REPLY_TASK,
    MESSAGE_COMPOSE_TASK,
    MESSAGE_CONFIRM_TASK,
    MESSAGE_SENT_TASK,
    ONGOING_CALL_EDUCATION_MESSAGE_TASK,
    IMMERSIVE_DIALOGUE_TASK,
    DISABLE_MORRIS_TASK,
    NOTIFICATION_PERMISSIONS_TASK,
    CONFIRM_NOT_DRIVING_TASK,
    AUDIO_OUTPUT_PICKER_TASK,
    PRIVACY_DISCLAIMER_TASK,
    ONE_SHOT_WIDGET_TASK,
    EXPANDED_VOICE_PLATE_TASK,
    ONBOARDING_POPUP_TASK,
    TASK_NOT_SET;

    /* renamed from: a */
    public static C14602ph m30643a(int i) {
        switch (i) {
            case 0:
                return TASK_NOT_SET;
            case 1:
                return INCOMING_CALL_TASK;
            case 2:
                return OUTGOING_CALL_TASK;
            case 3:
                return ONGOING_CALL_TASK;
            case 4:
                return INCOMING_MESSAGE_TASK;
            case 6:
                return MEDIA_TASK;
            case 7:
                return MESSAGE_CONFIRM_TASK;
            case 8:
                return MESSAGE_SENT_TASK;
            case 9:
                return MESSAGE_READ_TASK;
            case 10:
                return MESSAGE_COMPOSE_TASK;
            case 11:
                return IMMERSIVE_DIALOGUE_TASK;
            case 12:
                return MESSAGE_REPLY_TASK;
            case 13:
                return DISABLE_MORRIS_TASK;
            case 14:
                return NOTIFICATION_PERMISSIONS_TASK;
            case 15:
                return MESSAGE_AUTO_READ_TASK;
            case 16:
                return MESSAGE_AUTO_DISMISS_REPLY_TASK;
            case 17:
                return CONFIRM_NOT_DRIVING_TASK;
            case 18:
                return AUDIO_OUTPUT_PICKER_TASK;
            case 19:
                return PRIVACY_DISCLAIMER_TASK;
            case 20:
                return ONGOING_CALL_EDUCATION_MESSAGE_TASK;
            case 21:
                return ONE_SHOT_WIDGET_TASK;
            case 22:
                return EXPANDED_VOICE_PLATE_TASK;
            case 23:
                return ONBOARDING_POPUP_TASK;
            default:
                return null;
        }
    }
}
