package p5602o.p5607c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: o.c.aa */
/* compiled from: PG */
public enum C71924aa implements C62957cd {
    UNKNOWN_PROVENANCE(0),
    DEVICE(1),
    CLOUD(2),
    USER_ENTERED(3),
    PAPI_AUTOCOMPLETE(4),
    PAPI_TOPN(5),
    PAPI_LIST_PEOPLE_BY_KNOWN_ID(6),
    MENAGERIE(7),
    DIRECTORY(8),
    DAS_TOP_AFFINITIES(9),
    PREPOPULATED(10),
    SMART_ADDRESS_EXPANSION(11),
    SMART_ADDRESS_REPLACEMENT(12),
    CUSTOM_RESULT_PROVIDER(13);
    

    /* renamed from: o */
    public final int f191566o;

    private C71924aa(int i) {
        this.f191566o = i;
    }

    /* renamed from: a */
    public static C71924aa m105227a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROVENANCE;
            case 1:
                return DEVICE;
            case 2:
                return CLOUD;
            case 3:
                return USER_ENTERED;
            case 4:
                return PAPI_AUTOCOMPLETE;
            case 5:
                return PAPI_TOPN;
            case 6:
                return PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 7:
                return MENAGERIE;
            case 8:
                return DIRECTORY;
            case 9:
                return DAS_TOP_AFFINITIES;
            case 10:
                return PREPOPULATED;
            case 11:
                return SMART_ADDRESS_EXPANSION;
            case 12:
                return SMART_ADDRESS_REPLACEMENT;
            case 13:
                return CUSTOM_RESULT_PROVIDER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m105228b() {
        return C71955z.f191653a;
    }

    public final int getNumber() {
        return this.f191566o;
    }

    public final String toString() {
        return Integer.toString(this.f191566o);
    }
}
