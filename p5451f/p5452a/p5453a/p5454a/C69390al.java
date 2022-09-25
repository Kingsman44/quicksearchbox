package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.al */
/* compiled from: PG */
public enum C69390al implements C62957cd {
    UNKNOWN(0),
    SEARCH_WIDGET_PROMOTION(1),
    DARK_MODE_PROMOTION(2),
    DISCOVER_ENTRYPOINT_PROMOTION(3),
    VAAV2_VOICE_SEARCH_PROMOTION(4),
    VOICE_MATCH_PROMOTION(5),
    MANDALORIAN_AR_PROMOTION(6),
    APVS_SHORTCUT_PROMOTION(7),
    HOMECSREEN_DEEPLINK_DEFAULT_PROMOTION(9);
    

    /* renamed from: j */
    private final int f185637j;

    private C69390al(int i) {
        this.f185637j = i;
    }

    /* renamed from: a */
    public static C69390al m100745a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SEARCH_WIDGET_PROMOTION;
            case 2:
                return DARK_MODE_PROMOTION;
            case 3:
                return DISCOVER_ENTRYPOINT_PROMOTION;
            case 4:
                return VAAV2_VOICE_SEARCH_PROMOTION;
            case 5:
                return VOICE_MATCH_PROMOTION;
            case 6:
                return MANDALORIAN_AR_PROMOTION;
            case 7:
                return APVS_SHORTCUT_PROMOTION;
            case 9:
                return HOMECSREEN_DEEPLINK_DEFAULT_PROMOTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m100746b() {
        return C69389ak.f185626a;
    }

    public final int getNumber() {
        return this.f185637j;
    }

    public final String toString() {
        return Integer.toString(this.f185637j);
    }
}
