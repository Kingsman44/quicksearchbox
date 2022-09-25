package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.rz */
/* compiled from: PG */
public enum C60494rz implements C62957cd {
    UNKNOWN(0),
    SRP(1),
    SUGGEST(2),
    NOW(3),
    AMP(4),
    ASSIST(5),
    VELOUR(6),
    OPA(7),
    EXPLORE_ON_CONTENT(8),
    AMP_NOW(9),
    RECENTLY(10),
    COLLECTIONS(11),
    SILK_PANE(12),
    MENU(13),
    SILKY_TAB(14),
    NOTIFICATION(15),
    TYPED_URL(16),
    DOODLE(17),
    TABS_MANAGER(18),
    SETTINGS(19),
    PROMO_MANAGER(20);
    

    /* renamed from: v */
    public final int f163762v;

    private C60494rz(int i) {
        this.f163762v = i;
    }

    /* renamed from: a */
    public static C60494rz m92598a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SRP;
            case 2:
                return SUGGEST;
            case 3:
                return NOW;
            case 4:
                return AMP;
            case 5:
                return ASSIST;
            case 6:
                return VELOUR;
            case 7:
                return OPA;
            case 8:
                return EXPLORE_ON_CONTENT;
            case 9:
                return AMP_NOW;
            case 10:
                return RECENTLY;
            case 11:
                return COLLECTIONS;
            case 12:
                return SILK_PANE;
            case 13:
                return MENU;
            case 14:
                return SILKY_TAB;
            case 15:
                return NOTIFICATION;
            case 16:
                return TYPED_URL;
            case 17:
                return DOODLE;
            case 18:
                return TABS_MANAGER;
            case 19:
                return SETTINGS;
            case 20:
                return PROMO_MANAGER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92599b() {
        return C60493ry.f163739a;
    }

    public final int getNumber() {
        return this.f163762v;
    }

    public final String toString() {
        return Integer.toString(this.f163762v);
    }
}
