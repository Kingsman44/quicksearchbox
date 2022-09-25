package com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.libraries.search.assistant.n.a.a.d */
/* compiled from: PG */
public enum C34824d implements C62957cd {
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
    public static final C62958ce f92381r = null;

    /* renamed from: s */
    private final int f92383s;

    static {
        f92381r = new C34823c();
    }

    private C34824d(int i) {
        this.f92383s = i;
    }

    /* renamed from: a */
    public static C34824d m63587a(int i) {
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
        return this.f92383s;
    }

    public final String toString() {
        return Integer.toString(this.f92383s);
    }
}
