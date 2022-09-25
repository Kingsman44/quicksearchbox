package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.a.b */
/* compiled from: PG */
public enum C37026b implements C62957cd {
    PKG_UNSPECIFIED(0),
    PKG_MEDIA_ARTIST_NAMES(427618636),
    PKG_MEDIA_NON_ARTIST_NAMES(435332597),
    PKG_TIER_1_CONTACT_NAMES(435323676),
    PKG_TIER_2_EMAIL_CONTACT_NAMES(437240457),
    PKG_HOME_AUTOMATION_ROOM_NAMES(441432260),
    PKG_HOME_AUTOMATION_STRUCTURE_NAMES(441432261),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES(441432262),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES(441432263),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES(441432264),
    PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES(441432265),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES(441432266),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES(441432267),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES(441432268),
    PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES(441432269);
    

    /* renamed from: p */
    public final int f96455p;

    private C37026b(int i) {
        this.f96455p = i;
    }

    /* renamed from: a */
    public static C37026b m65716a(int i) {
        if (i == 0) {
            return PKG_UNSPECIFIED;
        }
        if (i == 427618636) {
            return PKG_MEDIA_ARTIST_NAMES;
        }
        if (i == 435323676) {
            return PKG_TIER_1_CONTACT_NAMES;
        }
        if (i == 435332597) {
            return PKG_MEDIA_NON_ARTIST_NAMES;
        }
        if (i == 437240457) {
            return PKG_TIER_2_EMAIL_CONTACT_NAMES;
        }
        switch (i) {
            case 441432260:
                return PKG_HOME_AUTOMATION_ROOM_NAMES;
            case 441432261:
                return PKG_HOME_AUTOMATION_STRUCTURE_NAMES;
            case 441432262:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES;
            case 441432263:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES;
            case 441432264:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES;
            case 441432265:
                return PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES;
            case 441432266:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES;
            case 441432267:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES;
            case 441432268:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES;
            case 441432269:
                return PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m65717b() {
        return C37025a.f96438a;
    }

    public final int getNumber() {
        return this.f96455p;
    }

    public final String toString() {
        return Integer.toString(this.f96455p);
    }
}
