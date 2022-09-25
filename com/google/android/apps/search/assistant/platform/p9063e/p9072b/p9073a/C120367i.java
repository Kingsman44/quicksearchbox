package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.function.Function;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.i */
/* compiled from: PG */
class C120367i implements Function {
    /* renamed from: a */
    public final C62722b apply(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code.ordinal()) {
            case 0:
                return C62722b.OK;
            case 1:
                return C62722b.CANCELLED;
            case 2:
                return C62722b.UNKNOWN;
            case 3:
                return C62722b.INVALID_ARGUMENT;
            case 4:
                return C62722b.DEADLINE_EXCEEDED;
            case 5:
                return C62722b.NOT_FOUND;
            case 6:
                return C62722b.ALREADY_EXISTS;
            case 7:
                return C62722b.PERMISSION_DENIED;
            case 8:
                return C62722b.RESOURCE_EXHAUSTED;
            case 9:
                return C62722b.FAILED_PRECONDITION;
            case 10:
                return C62722b.ABORTED;
            case 11:
                return C62722b.OUT_OF_RANGE;
            case 12:
                return C62722b.UNIMPLEMENTED;
            case 13:
                return C62722b.INTERNAL;
            case 14:
                return C62722b.UNAVAILABLE;
            case 15:
                return C62722b.DATA_LOSS;
            case 16:
                return C62722b.UNAUTHENTICATED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(code))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
