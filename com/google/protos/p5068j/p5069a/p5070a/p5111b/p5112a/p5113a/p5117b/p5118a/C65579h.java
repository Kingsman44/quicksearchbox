package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.b.a.a.b.a.h */
/* compiled from: PG */
public enum C65579h implements C62957cd {
    UNKNOWN_OR_OK(0),
    CANCELLED(1),
    GRPC_KNOWS_IT_IS_UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    

    /* renamed from: r */
    public static final C62958ce f178244r = null;

    /* renamed from: s */
    private final int f178246s;

    static {
        f178244r = new C65578g();
    }

    private C65579h(int i) {
        this.f178246s = i;
    }

    /* renamed from: a */
    public static C65579h m96739a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_OR_OK;
            case 1:
                return CANCELLED;
            case 2:
                return GRPC_KNOWS_IT_IS_UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f178246s;
    }

    public final String toString() {
        return Integer.toString(this.f178246s);
    }
}
