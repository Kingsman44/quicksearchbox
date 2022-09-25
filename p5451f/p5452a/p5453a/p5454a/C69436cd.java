package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.cd */
/* compiled from: PG */
public enum C69436cd implements C62957cd {
    UNKNOWN(0),
    TOPDECK(1),
    FEED_TOOLTIP(2),
    DRAWER_FEATURE_TIP(3),
    BOTTOM_DIALOG_TIP(4),
    PARTICLE_DISC_TOOLTIP(5),
    BOTTOM_BAR_PROMOTION_INDICATOR(6),
    BOTTOM_BAR_TOOLTIP(7),
    SEARCH_PLATE_TOOLTIP(8);
    

    /* renamed from: j */
    public final int f185809j;

    private C69436cd(int i) {
        this.f185809j = i;
    }

    /* renamed from: a */
    public static C69436cd m100758a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TOPDECK;
            case 2:
                return FEED_TOOLTIP;
            case 3:
                return DRAWER_FEATURE_TIP;
            case 4:
                return BOTTOM_DIALOG_TIP;
            case 5:
                return PARTICLE_DISC_TOOLTIP;
            case 6:
                return BOTTOM_BAR_PROMOTION_INDICATOR;
            case 7:
                return BOTTOM_BAR_TOOLTIP;
            case 8:
                return SEARCH_PLATE_TOOLTIP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m100759b() {
        return C69435cc.f185798a;
    }

    public final int getNumber() {
        return this.f185809j;
    }

    public final String toString() {
        return Integer.toString(this.f185809j);
    }
}
