package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ah.a.a.r */
/* compiled from: PG */
public enum C63185r implements C62957cd {
    UNKNOWN_ROLE(0),
    CURRENT_LOCATION(1),
    DEFAULT_LOCATION(2),
    QUERY(3),
    USER_SPECIFIED_FOR_REQUEST(4),
    HISTORICAL_QUERY(5),
    HISTORICAL_LOCATION(6),
    VIEWPORT(7),
    FUTURE_LOCATION(8),
    INVALID_LOCATION(9),
    EXPERIMENTAL_LOCATION(10),
    CURRENT_CONTEXT(11),
    FINAL_VIEWPORT(12),
    WILDCARD_ROLE(-1);
    

    /* renamed from: o */
    public final int f170696o;

    private C63185r(int i) {
        this.f170696o = i;
    }

    /* renamed from: a */
    public static C63185r m96200a(int i) {
        switch (i) {
            case -1:
                return WILDCARD_ROLE;
            case 0:
                return UNKNOWN_ROLE;
            case 1:
                return CURRENT_LOCATION;
            case 2:
                return DEFAULT_LOCATION;
            case 3:
                return QUERY;
            case 4:
                return USER_SPECIFIED_FOR_REQUEST;
            case 5:
                return HISTORICAL_QUERY;
            case 6:
                return HISTORICAL_LOCATION;
            case 7:
                return VIEWPORT;
            case 8:
                return FUTURE_LOCATION;
            case 9:
                return INVALID_LOCATION;
            case 10:
                return EXPERIMENTAL_LOCATION;
            case 11:
                return CURRENT_CONTEXT;
            case 12:
                return FINAL_VIEWPORT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96201b() {
        return C63184q.f170680a;
    }

    public final int getNumber() {
        return this.f170696o;
    }

    public final String toString() {
        return Integer.toString(this.f170696o);
    }
}
