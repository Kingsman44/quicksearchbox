package p5451f.p5452a.p5453a.p5454a;

/* renamed from: f.a.a.a.aq */
/* compiled from: PG */
public enum C69395aq {
    TOPDECK_FEATURE_TIP(2),
    FEED_TOOLTIP(3),
    DRAWER_FEATURE_TIP(4),
    BOTTOM_DIALOG_TIP(5),
    PARTICLE_DISC_TOOLTIP(6),
    BOTTOM_BAR_PROMOTION_INDICATOR(7),
    BOTTOM_BAR_TOOLTIP(8),
    SEARCH_PLATE_TOOLTIP(9),
    TIP_NOT_SET(0);
    

    /* renamed from: j */
    public final int f185677j;

    private C69395aq(int i) {
        this.f185677j = i;
    }

    /* renamed from: a */
    public static C69395aq m100747a(int i) {
        if (i == 0) {
            return TIP_NOT_SET;
        }
        switch (i) {
            case 2:
                return TOPDECK_FEATURE_TIP;
            case 3:
                return FEED_TOOLTIP;
            case 4:
                return DRAWER_FEATURE_TIP;
            case 5:
                return BOTTOM_DIALOG_TIP;
            case 6:
                return PARTICLE_DISC_TOOLTIP;
            case 7:
                return BOTTOM_BAR_PROMOTION_INDICATOR;
            case 8:
                return BOTTOM_BAR_TOOLTIP;
            case 9:
                return SEARCH_PLATE_TOOLTIP;
            default:
                return null;
        }
    }
}
