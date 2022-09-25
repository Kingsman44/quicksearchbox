package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lj */
/* compiled from: PG */
public enum C14496lj implements C62957cd {
    UNKNOWN_TASK(0),
    INCOMING_CALL_TASK(1),
    OUTGOING_CALL_TASK(2),
    ONGOING_CALL_TASK(3),
    INCOMING_MESSAGE_TASK(4),
    MESSAGE_ANNOUNCE_TASK(24),
    MESSAGE_COMPOSE_TASK(5),
    MESSAGE_CONFIRM_TASK(8),
    MESSAGE_SENT_TASK(9),
    MESSAGE_READ_TASK(10),
    MESSAGE_REPLY_TASK(14),
    MESSAGE_AUTO_READ_TASK(17),
    MESSAGE_AUTO_DISMISS_REPLY_TASK(18),
    ONGOING_CALL_EDUCATION_MESSAGE_TASK(25),
    MEDIA_TASK(6),
    PLAY_SOMETHING_ELSE_TASK(7),
    ONE_SHOT_WIDGET_TASK(26),
    IMMERSIVE_MESSAGE_TASK(12),
    IMMERSIVE_CALLING_TASK(13),
    IMMERSIVE_DESTINATION_TASK(19),
    IMMERSIVE_CARD_TASK(22),
    EXPANDED_VOICE_PLATE_TASK(27),
    DISABLE_MORRIS_TASK(15),
    NOTIFICATION_PERMISSIONS_TASK(16),
    CONFIRM_NOT_DRIVING_TASK(20),
    PRIVACY_DISCLAIMER_TASK(23),
    AUDIO_OUTPUT_PICKER_TASK(21),
    ONBOARDING_POPUP_TASK(28),
    UNRECOGNIZED(-1);
    

    /* renamed from: D */
    private final int f43847D;

    private C14496lj(int i) {
        this.f43847D = i;
    }

    /* renamed from: a */
    public static C14496lj m30625a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TASK;
            case 1:
                return INCOMING_CALL_TASK;
            case 2:
                return OUTGOING_CALL_TASK;
            case 3:
                return ONGOING_CALL_TASK;
            case 4:
                return INCOMING_MESSAGE_TASK;
            case 5:
                return MESSAGE_COMPOSE_TASK;
            case 6:
                return MEDIA_TASK;
            case 7:
                return PLAY_SOMETHING_ELSE_TASK;
            case 8:
                return MESSAGE_CONFIRM_TASK;
            case 9:
                return MESSAGE_SENT_TASK;
            case 10:
                return MESSAGE_READ_TASK;
            case 12:
                return IMMERSIVE_MESSAGE_TASK;
            case 13:
                return IMMERSIVE_CALLING_TASK;
            case 14:
                return MESSAGE_REPLY_TASK;
            case 15:
                return DISABLE_MORRIS_TASK;
            case 16:
                return NOTIFICATION_PERMISSIONS_TASK;
            case 17:
                return MESSAGE_AUTO_READ_TASK;
            case 18:
                return MESSAGE_AUTO_DISMISS_REPLY_TASK;
            case 19:
                return IMMERSIVE_DESTINATION_TASK;
            case 20:
                return CONFIRM_NOT_DRIVING_TASK;
            case 21:
                return AUDIO_OUTPUT_PICKER_TASK;
            case 22:
                return IMMERSIVE_CARD_TASK;
            case 23:
                return PRIVACY_DISCLAIMER_TASK;
            case 24:
                return MESSAGE_ANNOUNCE_TASK;
            case 25:
                return ONGOING_CALL_EDUCATION_MESSAGE_TASK;
            case 26:
                return ONE_SHOT_WIDGET_TASK;
            case 27:
                return EXPANDED_VOICE_PLATE_TASK;
            case 28:
                return ONBOARDING_POPUP_TASK;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43847D;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
