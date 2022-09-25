package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.a.b.a.a.a.a.a.b */
/* compiled from: PG */
public enum C65479b implements C62957cd {
    UNKNOWN(0),
    CLIENT_DISCONNECTED(1),
    INTERRUPTED_DUE_TO_ANOTHER_INTERACTION_START(2),
    INTERNAL_INVALID_CLIENT_OP_EXECUTION_RESPONSE(3),
    INTERNAL_INVALID_CONTEXT_KEY_FETCH_REQUESTED(4),
    INTERNAL_INVALID_CONTEXT_FETCH_RESPONSE(5),
    INTERNAL_INVALID_EXPERIMENT_TOKENS(6),
    INTERNAL_UNKNOWN_PROCEDURE(7);
    

    /* renamed from: i */
    public static final C62958ce f177996i = null;

    /* renamed from: j */
    private final int f177998j;

    static {
        f177996i = new C65478a();
    }

    private C65479b(int i) {
        this.f177998j = i;
    }

    /* renamed from: a */
    public static C65479b m96691a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CLIENT_DISCONNECTED;
            case 2:
                return INTERRUPTED_DUE_TO_ANOTHER_INTERACTION_START;
            case 3:
                return INTERNAL_INVALID_CLIENT_OP_EXECUTION_RESPONSE;
            case 4:
                return INTERNAL_INVALID_CONTEXT_KEY_FETCH_REQUESTED;
            case 5:
                return INTERNAL_INVALID_CONTEXT_FETCH_RESPONSE;
            case 6:
                return INTERNAL_INVALID_EXPERIMENT_TOKENS;
            case 7:
                return INTERNAL_UNKNOWN_PROCEDURE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f177998j;
    }

    public final String toString() {
        return Integer.toString(this.f177998j);
    }
}
