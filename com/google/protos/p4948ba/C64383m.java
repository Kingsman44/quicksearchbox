package com.google.protos.p4948ba;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ba.m */
/* compiled from: PG */
public enum C64383m implements C62957cd {
    CATEGORY_UNSPECIFIED(0),
    PQ_BASED(1),
    INTEREST_BASED(2),
    ENGAGE_RETENTIVE(4),
    COVID19(5),
    VISITED_DOC_BASED(6),
    SIGNED_OUT_PQ_BASED(7),
    PREVIOUS_SEARCH_RELATED_ENTITY_CHIPS(8),
    PEOPLE_ALSO_ASK(9),
    TRENDS(10),
    TRENDS_ENTITY_CHIPS(17),
    PERSONALIZED_TRENDS(11),
    SHOPPING_ATTRIBUTES(12),
    REPEATED_HISTORY_PSUGGEST(13),
    REPEATED_HISTORY_REPEATED_QUERIES(14),
    ADDITIONAL_PSUGGEST(15),
    ADDITIONAL_ENTITY_PSUGGEST(18),
    SHOPPING(16),
    DEPRECATED_ASSISTANT_ACTION(3);
    

    /* renamed from: t */
    public final int f174621t;

    private C64383m(int i) {
        this.f174621t = i;
    }

    /* renamed from: a */
    public static C64383m m96397a(int i) {
        switch (i) {
            case 0:
                return CATEGORY_UNSPECIFIED;
            case 1:
                return PQ_BASED;
            case 2:
                return INTEREST_BASED;
            case 3:
                return DEPRECATED_ASSISTANT_ACTION;
            case 4:
                return ENGAGE_RETENTIVE;
            case 5:
                return COVID19;
            case 6:
                return VISITED_DOC_BASED;
            case 7:
                return SIGNED_OUT_PQ_BASED;
            case 8:
                return PREVIOUS_SEARCH_RELATED_ENTITY_CHIPS;
            case 9:
                return PEOPLE_ALSO_ASK;
            case 10:
                return TRENDS;
            case 11:
                return PERSONALIZED_TRENDS;
            case 12:
                return SHOPPING_ATTRIBUTES;
            case 13:
                return REPEATED_HISTORY_PSUGGEST;
            case 14:
                return REPEATED_HISTORY_REPEATED_QUERIES;
            case 15:
                return ADDITIONAL_PSUGGEST;
            case 16:
                return SHOPPING;
            case 17:
                return TRENDS_ENTITY_CHIPS;
            case 18:
                return ADDITIONAL_ENTITY_PSUGGEST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96398b() {
        return C64382l.f174600a;
    }

    public final int getNumber() {
        return this.f174621t;
    }

    public final String toString() {
        return Integer.toString(this.f174621t);
    }
}
