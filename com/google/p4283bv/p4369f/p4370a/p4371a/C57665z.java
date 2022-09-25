package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.f.a.a.z */
/* compiled from: PG */
public enum C57665z implements C62957cd {
    UNKNOWN_ITEM_TYPE(0),
    BOOK_EDITION(12),
    CLIP(16),
    DEAL(14),
    EXPERIENCE(9),
    IMAGE(2),
    ITINERARY(4),
    JOB(7),
    KNOWLEDGE_GRAPH_ENTITY(6),
    PLACE(1),
    RECIPE(8),
    SCREENSHOT(11),
    SHOPPING_PRODUCT(10),
    TOWNSQUARE_LIST(17),
    TOWNSQUARE_PRODUCT(18),
    TRAVEL(15),
    TVM_ENTITY(13),
    USER_UPLOADED_IMAGE(19),
    VIDEO(3),
    WEB_PAGE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: v */
    private final int f154013v;

    private C57665z(int i) {
        this.f154013v = i;
    }

    /* renamed from: a */
    public static C57665z m88512a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ITEM_TYPE;
            case 1:
                return PLACE;
            case 2:
                return IMAGE;
            case 3:
                return VIDEO;
            case 4:
                return ITINERARY;
            case 5:
                return WEB_PAGE;
            case 6:
                return KNOWLEDGE_GRAPH_ENTITY;
            case 7:
                return JOB;
            case 8:
                return RECIPE;
            case 9:
                return EXPERIENCE;
            case 10:
                return SHOPPING_PRODUCT;
            case 11:
                return SCREENSHOT;
            case 12:
                return BOOK_EDITION;
            case 13:
                return TVM_ENTITY;
            case 14:
                return DEAL;
            case 15:
                return TRAVEL;
            case 16:
                return CLIP;
            case 17:
                return TOWNSQUARE_LIST;
            case 18:
                return TOWNSQUARE_PRODUCT;
            case 19:
                return USER_UPLOADED_IMAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88513b() {
        return C57664y.f153990a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f154013v;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
