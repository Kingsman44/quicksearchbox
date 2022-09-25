package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.p.b.cq */
/* compiled from: PG */
public enum C65813cq implements C62957cd {
    UNKNOWN_REQUEST_REASON(0),
    PERIODIC(1),
    PUSH_UPDATES(2),
    CLIENT_OP(3),
    ON_DEMAND(4),
    ON_DEMAND_RECENT_CACHE_ONLY(5),
    INITIALIZATION(6);
    

    /* renamed from: h */
    public final int f178923h;

    private C65813cq(int i) {
        this.f178923h = i;
    }

    /* renamed from: a */
    public static C65813cq m96811a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_REASON;
            case 1:
                return PERIODIC;
            case 2:
                return PUSH_UPDATES;
            case 3:
                return CLIENT_OP;
            case 4:
                return ON_DEMAND;
            case 5:
                return ON_DEMAND_RECENT_CACHE_ONLY;
            case 6:
                return INITIALIZATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96812b() {
        return C65812cp.f178914a;
    }

    public final int getNumber() {
        return this.f178923h;
    }

    public final String toString() {
        return Integer.toString(this.f178923h);
    }
}
