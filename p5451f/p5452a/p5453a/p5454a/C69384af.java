package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.af */
/* compiled from: PG */
public enum C69384af implements C62957cd {
    UNDEFINED(0),
    GOOGLE_ICON_PROMO_CARD(1),
    TONALITY_ICON_PROMO_CARD(2),
    WIDGET_ICON_PROMO_CARD(3),
    BLUE_WIDGET_ICON_PROMO_CARD(4),
    VAAV2_PROMO_CARD(5),
    VOICE_MATCH_PROMO_CARD(6),
    HOME_SCREEN_WIDGET_ICON_PROMO_CARD(7),
    MANDALORIAN_AR_PROMO_CARD(8),
    APVS_SHORTCUT_PROMO_CARD(9),
    HOMECSREEN_DEEPLINK_DEFAULT_PROMO_CARD(14),
    HOMECSREEN_DEEPLINK_DEFAULT_PROMO_CARD_EN(15);
    

    /* renamed from: m */
    private final int f185576m;

    private C69384af(int i) {
        this.f185576m = i;
    }

    /* renamed from: a */
    public static C69384af m100739a(int i) {
        if (i == 14) {
            return HOMECSREEN_DEEPLINK_DEFAULT_PROMO_CARD;
        }
        if (i == 15) {
            return HOMECSREEN_DEEPLINK_DEFAULT_PROMO_CARD_EN;
        }
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return GOOGLE_ICON_PROMO_CARD;
            case 2:
                return TONALITY_ICON_PROMO_CARD;
            case 3:
                return WIDGET_ICON_PROMO_CARD;
            case 4:
                return BLUE_WIDGET_ICON_PROMO_CARD;
            case 5:
                return VAAV2_PROMO_CARD;
            case 6:
                return VOICE_MATCH_PROMO_CARD;
            case 7:
                return HOME_SCREEN_WIDGET_ICON_PROMO_CARD;
            case 8:
                return MANDALORIAN_AR_PROMO_CARD;
            case 9:
                return APVS_SHORTCUT_PROMO_CARD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m100740b() {
        return C69383ae.f185562a;
    }

    public final int getNumber() {
        return this.f185576m;
    }

    public final String toString() {
        return Integer.toString(this.f185576m);
    }
}
