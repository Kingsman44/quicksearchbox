package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.i.b.a.an */
/* compiled from: PG */
public enum C71204an implements C62957cd {
    UNKNOWN(0),
    OTHER(1),
    DISCOVER_GOOGLE_APP(2),
    INTERESTS_TAB_SNA(3),
    NOTIFICATION_SEARCH_SNA(4),
    TEXT_SEARCH_SNA(5),
    VOICE_SEARCH_SNA(6),
    TEXT_SEARCH_QEA(7),
    VOICE_SEARCH_QEA(8),
    TEXT_SEARCH_GOOGLE_APP(9),
    OPA_LONG_PRESS_HOME_VOICE_INPUT(10),
    OPA_LONG_PRESS_HOME_TEXT_INPUT(11),
    OPA_HOTWORD_VOICE_INPUT(12),
    OPA_SHELL_APP_VOICE_INPUT(13),
    OPA_SHELL_APP_TEXT_INPUT(14),
    OPA_OTHER(15),
    HOME_NIU(16),
    SUGGEST_NIU(17),
    SRP_NIU(18),
    VOICE_SEARCH_GOOGLE_APP(19);
    

    /* renamed from: u */
    public final int f190071u;

    private C71204an(int i) {
        this.f190071u = i;
    }

    /* renamed from: a */
    public static C71204an m103936a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OTHER;
            case 2:
                return DISCOVER_GOOGLE_APP;
            case 3:
                return INTERESTS_TAB_SNA;
            case 4:
                return NOTIFICATION_SEARCH_SNA;
            case 5:
                return TEXT_SEARCH_SNA;
            case 6:
                return VOICE_SEARCH_SNA;
            case 7:
                return TEXT_SEARCH_QEA;
            case 8:
                return VOICE_SEARCH_QEA;
            case 9:
                return TEXT_SEARCH_GOOGLE_APP;
            case 10:
                return OPA_LONG_PRESS_HOME_VOICE_INPUT;
            case 11:
                return OPA_LONG_PRESS_HOME_TEXT_INPUT;
            case 12:
                return OPA_HOTWORD_VOICE_INPUT;
            case 13:
                return OPA_SHELL_APP_VOICE_INPUT;
            case 14:
                return OPA_SHELL_APP_TEXT_INPUT;
            case 15:
                return OPA_OTHER;
            case 16:
                return HOME_NIU;
            case 17:
                return SUGGEST_NIU;
            case 18:
                return SRP_NIU;
            case 19:
                return VOICE_SEARCH_GOOGLE_APP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103937b() {
        return C71203am.f190049a;
    }

    public final int getNumber() {
        return this.f190071u;
    }

    public final String toString() {
        return Integer.toString(this.f190071u);
    }
}
