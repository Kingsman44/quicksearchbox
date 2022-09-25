package com.google.assistant.p3825an.p3832d.p3833a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.an.d.a.b */
/* compiled from: PG */
public enum C49351b implements C62957cd {
    UNSPECIFIED(0),
    BUSINESS_AND_FINANCE(2),
    EDUCATION_AND_REFERENCE(3),
    FOOD_AND_DRINK(4),
    GAMES_AND_TRIVIA(5),
    HEALTH_AND_FITNESS(6),
    KIDS_AND_FAMILY(20),
    LIFESTYLE(7),
    LOCAL(8),
    MOVIES_AND_TV(9),
    MUSIC_AND_AUDIO(10),
    NEWS(1),
    NOVELTY_AND_HUMOR(11),
    PRODUCTIVITY(12),
    SHOPPING(13),
    SOCIAL(14),
    SPORTS(15),
    TRAVEL_AND_TRANSPORTATION(16),
    UTILITIES(17),
    WEATHER(18),
    HOME_CONTROL(19),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    private final int f127579w;

    private C49351b(int i) {
        this.f127579w = i;
    }

    /* renamed from: a */
    public static C49351b m85419a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return NEWS;
            case 2:
                return BUSINESS_AND_FINANCE;
            case 3:
                return EDUCATION_AND_REFERENCE;
            case 4:
                return FOOD_AND_DRINK;
            case 5:
                return GAMES_AND_TRIVIA;
            case 6:
                return HEALTH_AND_FITNESS;
            case 7:
                return LIFESTYLE;
            case 8:
                return LOCAL;
            case 9:
                return MOVIES_AND_TV;
            case 10:
                return MUSIC_AND_AUDIO;
            case 11:
                return NOVELTY_AND_HUMOR;
            case 12:
                return PRODUCTIVITY;
            case 13:
                return SHOPPING;
            case 14:
                return SOCIAL;
            case 15:
                return SPORTS;
            case 16:
                return TRAVEL_AND_TRANSPORTATION;
            case 17:
                return UTILITIES;
            case 18:
                return WEATHER;
            case 19:
                return HOME_CONTROL;
            case 20:
                return KIDS_AND_FAMILY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85420b() {
        return C49350a.f127555a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f127579w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
