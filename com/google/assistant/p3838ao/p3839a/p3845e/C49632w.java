package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ao.a.e.w */
/* compiled from: PG */
public enum C49632w implements C62957cd {
    CONTEXT_PROPERTY_ID_UNDEFINED(0),
    CONTEXT_PROPERTY_TEST(1),
    NO_PERMISSION_TO_READ_NOTIFICATIONS(2),
    PRODUCTIVITY_ALARM_CARD(3),
    PRODUCTIVITY_ALARM_NOT_FOUND(4),
    PRODUCTIVITY_ALARM_DELETE(5),
    PRODUCTIVITY_TIMER_NOT_FOUND(6),
    PRODUCTIVITY_TIMER_DELETE(7),
    STASH_CONFIRMATION(21),
    LOCATION_SERVICES_ARE_OFF(8),
    GOOGLE_PHOTOS_OLD_VERSION_PUNT(9),
    SETTINGS_BLUETOOTH(10),
    SETTINGS_WIFI(11),
    SETTINGS_BRIGHTNESS(12),
    SETTINGS_NIGHT_LIGHT(13),
    SETTINGS_VOLUME_MEDIA(14),
    SETTINGS_VOLUME_RING(15),
    SETTINGS_VOLUME_ALARM(16),
    SETTINGS_VOLUME_CALL(17),
    SETTINGS_HOTSPOT(18),
    SETTINGS_BATTERY_SAVER(19),
    SETTINGS_DO_NOT_DISTURB(20),
    FRE_ON_INVOCATION(22),
    FRE_ON_TIMEOUT(23);
    

    /* renamed from: y */
    private final int f128115y;

    private C49632w(int i) {
        this.f128115y = i;
    }

    /* renamed from: a */
    public static C49632w m85590a(int i) {
        switch (i) {
            case 0:
                return CONTEXT_PROPERTY_ID_UNDEFINED;
            case 1:
                return CONTEXT_PROPERTY_TEST;
            case 2:
                return NO_PERMISSION_TO_READ_NOTIFICATIONS;
            case 3:
                return PRODUCTIVITY_ALARM_CARD;
            case 4:
                return PRODUCTIVITY_ALARM_NOT_FOUND;
            case 5:
                return PRODUCTIVITY_ALARM_DELETE;
            case 6:
                return PRODUCTIVITY_TIMER_NOT_FOUND;
            case 7:
                return PRODUCTIVITY_TIMER_DELETE;
            case 8:
                return LOCATION_SERVICES_ARE_OFF;
            case 9:
                return GOOGLE_PHOTOS_OLD_VERSION_PUNT;
            case 10:
                return SETTINGS_BLUETOOTH;
            case 11:
                return SETTINGS_WIFI;
            case 12:
                return SETTINGS_BRIGHTNESS;
            case 13:
                return SETTINGS_NIGHT_LIGHT;
            case 14:
                return SETTINGS_VOLUME_MEDIA;
            case 15:
                return SETTINGS_VOLUME_RING;
            case 16:
                return SETTINGS_VOLUME_ALARM;
            case 17:
                return SETTINGS_VOLUME_CALL;
            case 18:
                return SETTINGS_HOTSPOT;
            case 19:
                return SETTINGS_BATTERY_SAVER;
            case 20:
                return SETTINGS_DO_NOT_DISTURB;
            case 21:
                return STASH_CONFIRMATION;
            case 22:
                return FRE_ON_INVOCATION;
            case 23:
                return FRE_ON_TIMEOUT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85591b() {
        return C49631v.f128089a;
    }

    public final int getNumber() {
        return this.f128115y;
    }

    public final String toString() {
        return Integer.toString(this.f128115y);
    }
}
