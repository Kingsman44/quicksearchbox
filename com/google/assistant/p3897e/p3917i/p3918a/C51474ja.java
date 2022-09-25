package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.ja */
/* compiled from: PG */
public enum C51474ja implements C62957cd {
    UNKNOWN(0),
    GOOGLE_MAP(1),
    CHARGING_AMBIENT(2),
    ACTIVITY_RECOGNIZER(3),
    ACTIVITY_RECOGNIZER_AUTO_LAUNCH(17),
    ACTIVITY_RECOGNIZER_NOTIFICATION_CLICK(16),
    DRIVING_MODE(4),
    VANAGON(5),
    ASSISTANT_SERVER(6),
    GOOGLE_MAP_FREENAV(7),
    NFC(8),
    WAZE(9),
    QUERY(10),
    BLUETOOTH(11),
    BLUETOOTH_AUTO_LAUNCH(18),
    BLUETOOTH_NOTIFICATION_CLICK(15),
    VANAGON_SETTINGS(12),
    VANAGON_PROMO_CARD(13),
    LAUNCHER_SHORTCUT(14),
    PERSISTENT_NOTIFICATION_CLICK(20),
    DRIVING_SCREEN_UNSPECIFIED(19);
    

    /* renamed from: v */
    public final int f134124v;

    private C51474ja(int i) {
        this.f134124v = i;
    }

    /* renamed from: a */
    public static C51474ja m86196a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return GOOGLE_MAP;
            case 2:
                return CHARGING_AMBIENT;
            case 3:
                return ACTIVITY_RECOGNIZER;
            case 4:
                return DRIVING_MODE;
            case 5:
                return VANAGON;
            case 6:
                return ASSISTANT_SERVER;
            case 7:
                return GOOGLE_MAP_FREENAV;
            case 8:
                return NFC;
            case 9:
                return WAZE;
            case 10:
                return QUERY;
            case 11:
                return BLUETOOTH;
            case 12:
                return VANAGON_SETTINGS;
            case 13:
                return VANAGON_PROMO_CARD;
            case 14:
                return LAUNCHER_SHORTCUT;
            case 15:
                return BLUETOOTH_NOTIFICATION_CLICK;
            case 16:
                return ACTIVITY_RECOGNIZER_NOTIFICATION_CLICK;
            case 17:
                return ACTIVITY_RECOGNIZER_AUTO_LAUNCH;
            case 18:
                return BLUETOOTH_AUTO_LAUNCH;
            case 19:
                return DRIVING_SCREEN_UNSPECIFIED;
            case 20:
                return PERSISTENT_NOTIFICATION_CLICK;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86197b() {
        return C51472iz.f134089a;
    }

    public final int getNumber() {
        return this.f134124v;
    }

    public final String toString() {
        return Integer.toString(this.f134124v);
    }
}
