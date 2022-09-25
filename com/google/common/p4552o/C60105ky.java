package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.ky */
/* compiled from: PG */
public enum C60105ky implements C62957cd {
    UNKNOWN(0),
    ANDROID_OOBE_NOTIFICATION_TRADITIONAL(1),
    ANDROID_OOBE_AGSA_CHIP_TOP(2),
    ANDROID_OOBE_FAST_PAIR_V1(3),
    ANDROID_OOBE_FAST_PAIR_V2(4),
    ANDROID_OOBE_COMPANION_APP_DEEP_LINK(5),
    ANDROID_OOBE_NOTIFICATION_OTA_DONE(6),
    ANDROID_OOBE_AGSA_CHIP_NON_TOP(7),
    ANDROID_OOBE_HOTWORD_NOTIFICATION(8),
    ANDROID_GACS_OOBE_RECONNECT(9),
    ANDROID_OOBE_FAST_PAIR_HALF_SHEET(10),
    ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY(11),
    ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG(12),
    IOS_OOBE_TRIGGER_USER_NOTIFICATION(100),
    IOS_OOBE_TRIGGER_ZERO_STATE_CARD(101),
    IOS_OOBE_TRIGGER_CHAT_CARD(102),
    IOS_OOBE_TRIGGER_SETTINGS_ADD_DEVICE(103),
    IOS_OOBE_TRIGGER_3P_APP(104);
    

    /* renamed from: s */
    public final int f162530s;

    private C60105ky(int i) {
        this.f162530s = i;
    }

    /* renamed from: a */
    public static C60105ky m92528a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ANDROID_OOBE_NOTIFICATION_TRADITIONAL;
            case 2:
                return ANDROID_OOBE_AGSA_CHIP_TOP;
            case 3:
                return ANDROID_OOBE_FAST_PAIR_V1;
            case 4:
                return ANDROID_OOBE_FAST_PAIR_V2;
            case 5:
                return ANDROID_OOBE_COMPANION_APP_DEEP_LINK;
            case 6:
                return ANDROID_OOBE_NOTIFICATION_OTA_DONE;
            case 7:
                return ANDROID_OOBE_AGSA_CHIP_NON_TOP;
            case 8:
                return ANDROID_OOBE_HOTWORD_NOTIFICATION;
            case 9:
                return ANDROID_GACS_OOBE_RECONNECT;
            case 10:
                return ANDROID_OOBE_FAST_PAIR_HALF_SHEET;
            case 11:
                return ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY;
            case 12:
                return ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG;
            default:
                switch (i) {
                    case 100:
                        return IOS_OOBE_TRIGGER_USER_NOTIFICATION;
                    case 101:
                        return IOS_OOBE_TRIGGER_ZERO_STATE_CARD;
                    case 102:
                        return IOS_OOBE_TRIGGER_CHAT_CARD;
                    case 103:
                        return IOS_OOBE_TRIGGER_SETTINGS_ADD_DEVICE;
                    case 104:
                        return IOS_OOBE_TRIGGER_3P_APP;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m92529b() {
        return C60104kx.f162510a;
    }

    public final int getNumber() {
        return this.f162530s;
    }

    public final String toString() {
        return Integer.toString(this.f162530s);
    }
}
