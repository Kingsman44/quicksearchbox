package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.aw.a.a.b */
/* compiled from: PG */
public enum C54624b implements C62957cd {
    UNSPECIFIED(0),
    PKG_PEOPLE_TIER_1(1),
    PKG_PEOPLE_TIER_1_FIRST_NAMES(2),
    PKG_PEOPLE_TIER_1_LAST_NAMES(3),
    PKG_PEOPLE_TIER_1_FULL_NAMES(4),
    PKG_PEOPLE_TIER_1_ALIAS_NAMES(10),
    PKG_PEOPLE_TIER_2(5),
    PKG_PEOPLE_TIER_2_SHARED_DEVICE_CONTACTS(6),
    PKG_PEOPLE_TIER_2_EMAIL_CONTACTS(7),
    PKG_MEDIA_ARTISTS(8),
    PKG_MEDIA_NON_ARTISTS(9),
    PKG_HOME_AUTOMATION_ROOM_NAMES(11),
    PKG_HOME_AUTOMATION_STRUCTURE_NAMES(12),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES(13),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES(14),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES(15),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES(16),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES(17),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES(18),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES(19),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES(20);
    

    /* renamed from: v */
    public final int f143427v;

    private C54624b(int i) {
        this.f143427v = i;
    }

    /* renamed from: a */
    public static C54624b m87507a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return PKG_PEOPLE_TIER_1;
            case 2:
                return PKG_PEOPLE_TIER_1_FIRST_NAMES;
            case 3:
                return PKG_PEOPLE_TIER_1_LAST_NAMES;
            case 4:
                return PKG_PEOPLE_TIER_1_FULL_NAMES;
            case 5:
                return PKG_PEOPLE_TIER_2;
            case 6:
                return PKG_PEOPLE_TIER_2_SHARED_DEVICE_CONTACTS;
            case 7:
                return PKG_PEOPLE_TIER_2_EMAIL_CONTACTS;
            case 8:
                return PKG_MEDIA_ARTISTS;
            case 9:
                return PKG_MEDIA_NON_ARTISTS;
            case 10:
                return PKG_PEOPLE_TIER_1_ALIAS_NAMES;
            case 11:
                return PKG_HOME_AUTOMATION_ROOM_NAMES;
            case 12:
                return PKG_HOME_AUTOMATION_STRUCTURE_NAMES;
            case 13:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES;
            case 14:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES;
            case 15:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES;
            case 16:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES;
            case 17:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES;
            case 18:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES;
            case 19:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES;
            case 20:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87508b() {
        return C54623a.f143404a;
    }

    public final int getNumber() {
        return this.f143427v;
    }

    public final String toString() {
        return Integer.toString(this.f143427v);
    }
}
