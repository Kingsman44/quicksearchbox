package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.aa */
/* compiled from: PG */
public enum C16327aa implements C62957cd {
    UNKNOWN_ACTION_TYPE(0),
    CALL_BACK(1),
    REDIAL(2),
    READ_SINGLE_MESSAGE(3),
    SHARE_ETA(4),
    CALL_CONTACT(5),
    TEXT_CONTACT(6),
    GAS_STATION(7),
    EV_STATION(8),
    READ_MESSAGES(9),
    NAVIGATE(10),
    NAVIGATE_HOME(19),
    NAVIGATE_WORK(20),
    PLAY_MUSIC(11),
    PLAY_NEWS(12),
    CAR_AUTOMATION(13),
    MIC_OPEN(14),
    OOBE_SIGN_IN(15),
    OOBE_PERSONAL_RESULT_BIT(16),
    NOTIFICATION_ACCESS(17),
    DISCOVERY_WCYD(18),
    DO_IT_AGAIN(21),
    DEFAULT_ASSISTANT(22),
    MORRIS_DS_PROMO_FOCUS(23),
    TIRE_PRESSURE_LOW(24),
    HOTWORD_ACCESS(26),
    TURN_ON_SEAT_HEATER(27),
    TURN_ON_CUSTOM_FEATURE(28),
    PLAY_RADIO(29),
    DOWNLOAD_APP(30),
    TURN_OFF_CUSTOM_FEATURE(31),
    MORRIS_ONBOARDING_NOTIFICATION_POPUP(32),
    PLAY_PERSONALIZED_MUSIC(33);
    

    /* renamed from: H */
    public final int f48064H;

    private C16327aa(int i) {
        this.f48064H = i;
    }

    /* renamed from: a */
    public static C16327aa m33331a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return CALL_BACK;
            case 2:
                return REDIAL;
            case 3:
                return READ_SINGLE_MESSAGE;
            case 4:
                return SHARE_ETA;
            case 5:
                return CALL_CONTACT;
            case 6:
                return TEXT_CONTACT;
            case 7:
                return GAS_STATION;
            case 8:
                return EV_STATION;
            case 9:
                return READ_MESSAGES;
            case 10:
                return NAVIGATE;
            case 11:
                return PLAY_MUSIC;
            case 12:
                return PLAY_NEWS;
            case 13:
                return CAR_AUTOMATION;
            case 14:
                return MIC_OPEN;
            case 15:
                return OOBE_SIGN_IN;
            case 16:
                return OOBE_PERSONAL_RESULT_BIT;
            case 17:
                return NOTIFICATION_ACCESS;
            case 18:
                return DISCOVERY_WCYD;
            case 19:
                return NAVIGATE_HOME;
            case 20:
                return NAVIGATE_WORK;
            case 21:
                return DO_IT_AGAIN;
            case 22:
                return DEFAULT_ASSISTANT;
            case 23:
                return MORRIS_DS_PROMO_FOCUS;
            case 24:
                return TIRE_PRESSURE_LOW;
            case 26:
                return HOTWORD_ACCESS;
            case 27:
                return TURN_ON_SEAT_HEATER;
            case 28:
                return TURN_ON_CUSTOM_FEATURE;
            case 29:
                return PLAY_RADIO;
            case 30:
                return DOWNLOAD_APP;
            case 31:
                return TURN_OFF_CUSTOM_FEATURE;
            case 32:
                return MORRIS_ONBOARDING_NOTIFICATION_POPUP;
            case 33:
                return PLAY_PERSONALIZED_MUSIC;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m33332b() {
        return C16390z.f48242a;
    }

    public final int getNumber() {
        return this.f48064H;
    }

    public final String toString() {
        return Integer.toString(this.f48064H);
    }
}
