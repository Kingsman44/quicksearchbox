package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.j */
/* compiled from: PG */
public enum C53306j implements C62957cd {
    UNKNOWNN(0),
    MAIN_APP(1),
    WIDGET(2),
    DOCK(3),
    OPA_TV(4),
    GELLER(5),
    DREAMLINER_AOD(6),
    GSA(7),
    OPA(8),
    MINUS_ONE(9),
    ASSISTANT_GO(10),
    MORRIS(11),
    MORRIS_DRIVING_SCREEN(36),
    OPA_KAIOS(12),
    AMBIENT(13),
    OPA_GO2PHONE(14),
    OPA_TV_AMBIENT(37),
    OPA_TV_ASSISTANT_ROW(15),
    OPA_TV_VOICEPLATE_SUGGESTIONS(16),
    OPA_TV_LAUNCHER_SUGGESTIONS(17),
    OPA_TV_SUGGESTED_QUERIES(32),
    AUTO_EMBEDDED(18),
    AUTO_PROJECTED(34),
    OPA_TV_SEARCH_TAB(19),
    OPA_TV_PERSON_ENTITY_SUGGESTIONS(20),
    AMBIENT_ASSISTANT(21),
    ALL_PCP_CLIENTS(22),
    OPA_SMARTSPACE(23),
    OPA_TV_TV_SHOWS_PIVOTS(24),
    OPA_TV_MOVIES_PIVOTS(25),
    TAPAS(26),
    ROSHI(27),
    WEAR(28),
    CHALKBOARD(29),
    INPUT_PLATE(30),
    OPA_LITE(31),
    OPA_TV_FALLBACK_SUGGESTIONS(33),
    ASSISTANT_WEARABLES(35),
    WEATHER_WIDGET(38),
    BLUECHIP_SMARTSPACE_TNG(39),
    STOCK_WIDGET(40),
    AR_GLASSES(41),
    OPA_HUB_UI(42),
    OPA_TV_LAUNCHER_X_SEARCH_TAB(43),
    OPA_TV_RECENT_SEARCHES(44),
    ASSISTANT_NOTIFICATIONS(45),
    UNIT_TEST_1(8001),
    UNIT_TEST_2(8002),
    UNIT_TEST_3(8003);
    

    /* renamed from: X */
    public final int f139793X;

    private C53306j(int i) {
        this.f139793X = i;
    }

    /* renamed from: a */
    public static C53306j m86809a(int i) {
        switch (i) {
            case 0:
                return UNKNOWNN;
            case 1:
                return MAIN_APP;
            case 2:
                return WIDGET;
            case 3:
                return DOCK;
            case 4:
                return OPA_TV;
            case 5:
                return GELLER;
            case 6:
                return DREAMLINER_AOD;
            case 7:
                return GSA;
            case 8:
                return OPA;
            case 9:
                return MINUS_ONE;
            case 10:
                return ASSISTANT_GO;
            case 11:
                return MORRIS;
            case 12:
                return OPA_KAIOS;
            case 13:
                return AMBIENT;
            case 14:
                return OPA_GO2PHONE;
            case 15:
                return OPA_TV_ASSISTANT_ROW;
            case 16:
                return OPA_TV_VOICEPLATE_SUGGESTIONS;
            case 17:
                return OPA_TV_LAUNCHER_SUGGESTIONS;
            case 18:
                return AUTO_EMBEDDED;
            case 19:
                return OPA_TV_SEARCH_TAB;
            case 20:
                return OPA_TV_PERSON_ENTITY_SUGGESTIONS;
            case 21:
                return AMBIENT_ASSISTANT;
            case 22:
                return ALL_PCP_CLIENTS;
            case 23:
                return OPA_SMARTSPACE;
            case 24:
                return OPA_TV_TV_SHOWS_PIVOTS;
            case 25:
                return OPA_TV_MOVIES_PIVOTS;
            case 26:
                return TAPAS;
            case 27:
                return ROSHI;
            case 28:
                return WEAR;
            case 29:
                return CHALKBOARD;
            case 30:
                return INPUT_PLATE;
            case 31:
                return OPA_LITE;
            case 32:
                return OPA_TV_SUGGESTED_QUERIES;
            case 33:
                return OPA_TV_FALLBACK_SUGGESTIONS;
            case 34:
                return AUTO_PROJECTED;
            case 35:
                return ASSISTANT_WEARABLES;
            case 36:
                return MORRIS_DRIVING_SCREEN;
            case 37:
                return OPA_TV_AMBIENT;
            case 38:
                return WEATHER_WIDGET;
            case 39:
                return BLUECHIP_SMARTSPACE_TNG;
            case 40:
                return STOCK_WIDGET;
            case 41:
                return AR_GLASSES;
            case 42:
                return OPA_HUB_UI;
            case 43:
                return OPA_TV_LAUNCHER_X_SEARCH_TAB;
            case 44:
                return OPA_TV_RECENT_SEARCHES;
            case 45:
                return ASSISTANT_NOTIFICATIONS;
            default:
                switch (i) {
                    case 8001:
                        return UNIT_TEST_1;
                    case 8002:
                        return UNIT_TEST_2;
                    case 8003:
                        return UNIT_TEST_3;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m86810b() {
        return C53279i.f139685a;
    }

    public final int getNumber() {
        return this.f139793X;
    }

    public final String toString() {
        return Integer.toString(this.f139793X);
    }
}
