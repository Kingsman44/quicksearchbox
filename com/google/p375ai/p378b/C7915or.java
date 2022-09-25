package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.or */
/* compiled from: PG */
public enum C7915or implements C62957cd {
    INVALID(0),
    DISMISS_CARD(1),
    ADD_A_TEAM(2),
    ADD_A_STOCK(3),
    REFRESH_CARD_LIST(4),
    EDIT_PLACES(5),
    MANAGE_LOCATION_SHARING(6),
    RENAME_PLACE(7),
    FORGET_PLACE(8),
    SHOW_LINKED_CARD(9),
    REFRESH_CARD(10),
    REFRESH_IMMEDIATELY(11);
    

    /* renamed from: m */
    private final int f27817m;

    private C7915or(int i) {
        this.f27817m = i;
    }

    /* renamed from: a */
    public static C7915or m22889a(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return DISMISS_CARD;
            case 2:
                return ADD_A_TEAM;
            case 3:
                return ADD_A_STOCK;
            case 4:
                return REFRESH_CARD_LIST;
            case 5:
                return EDIT_PLACES;
            case 6:
                return MANAGE_LOCATION_SHARING;
            case 7:
                return RENAME_PLACE;
            case 8:
                return FORGET_PLACE;
            case 9:
                return SHOW_LINKED_CARD;
            case 10:
                return REFRESH_CARD;
            case 11:
                return REFRESH_IMMEDIATELY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22890b() {
        return C7914oq.f27803a;
    }

    public final int getNumber() {
        return this.f27817m;
    }

    public final String toString() {
        return Integer.toString(this.f27817m);
    }
}
