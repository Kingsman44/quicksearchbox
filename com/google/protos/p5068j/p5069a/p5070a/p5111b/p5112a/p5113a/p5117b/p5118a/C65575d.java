package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.b.a.a.b.a.d */
/* compiled from: PG */
public enum C65575d implements C62957cd {
    UNKNOWN_OR_INTERNAL(0),
    HOSTNAME_NOT_RESOLVED(1),
    INTERNET_DISCONNECTED(2),
    NETWORK_CHANGED(3),
    TIMED_OUT(4),
    CONNECTION_CLOSED(5),
    CONNECTION_TIMED_OUT(6),
    CONNECTION_REFUSED(7),
    CONNECTION_RESET(8),
    ADDRESS_UNREACHABLE(9),
    QUIC_PROTOCOL_FAILED(10),
    OTHER(11);
    

    /* renamed from: m */
    public static final C62958ce f178221m = null;

    /* renamed from: n */
    private final int f178223n;

    static {
        f178221m = new C65574c();
    }

    private C65575d(int i) {
        this.f178223n = i;
    }

    /* renamed from: a */
    public static C65575d m96735a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_OR_INTERNAL;
            case 1:
                return HOSTNAME_NOT_RESOLVED;
            case 2:
                return INTERNET_DISCONNECTED;
            case 3:
                return NETWORK_CHANGED;
            case 4:
                return TIMED_OUT;
            case 5:
                return CONNECTION_CLOSED;
            case 6:
                return CONNECTION_TIMED_OUT;
            case 7:
                return CONNECTION_REFUSED;
            case 8:
                return CONNECTION_RESET;
            case 9:
                return ADDRESS_UNREACHABLE;
            case 10:
                return QUIC_PROTOCOL_FAILED;
            case 11:
                return OTHER;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f178223n;
    }

    public final String toString() {
        return Integer.toString(this.f178223n);
    }
}
