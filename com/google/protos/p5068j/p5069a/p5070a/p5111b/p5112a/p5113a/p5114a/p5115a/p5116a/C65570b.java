package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.b.a.a.a.a.a.b */
/* compiled from: PG */
public enum C65570b implements C62957cd {
    ERROR_UNKNOWN(0),
    ERROR_UNSUPPORTED_CONTEXT_KEY(1),
    ERROR_INVALID_CACHING_STRATEGY(2),
    ERROR_FETCH_CALLBACK_FAILED(3),
    ERROR_ACCESS_SESSION_DISCONNECTED(4),
    ERROR_SESSION_CLOSED(5),
    ERROR_ONDEVICE_ONLY_CONTEXT_KEY(6),
    ERROR_ACCESS_SESSION_ALREADY_CONNECTED(7),
    ERROR_BAD_INVOCATION_TOKEN(8),
    ERROR_UNKNOWN_CONSUMER_GET_CONTEXT(9),
    ERROR_UNKNOWN_SOURCE_GET_CONTEXT(10),
    ERROR_UNKNOWN_CONSUMER_GET_SUPPORTED_KEYS(11),
    ERROR_UNKNOWN_SOURCE_GET_SUPPORTED_KEYS(12),
    ERROR_INTERNAL_ASSERTION_FAILED(13),
    ERROR_PROVIDER(14);
    

    /* renamed from: p */
    public static final C62958ce f178195p = null;

    /* renamed from: q */
    private final int f178197q;

    static {
        f178195p = new C65569a();
    }

    private C65570b(int i) {
        this.f178197q = i;
    }

    /* renamed from: a */
    public static C65570b m96731a(int i) {
        switch (i) {
            case 0:
                return ERROR_UNKNOWN;
            case 1:
                return ERROR_UNSUPPORTED_CONTEXT_KEY;
            case 2:
                return ERROR_INVALID_CACHING_STRATEGY;
            case 3:
                return ERROR_FETCH_CALLBACK_FAILED;
            case 4:
                return ERROR_ACCESS_SESSION_DISCONNECTED;
            case 5:
                return ERROR_SESSION_CLOSED;
            case 6:
                return ERROR_ONDEVICE_ONLY_CONTEXT_KEY;
            case 7:
                return ERROR_ACCESS_SESSION_ALREADY_CONNECTED;
            case 8:
                return ERROR_BAD_INVOCATION_TOKEN;
            case 9:
                return ERROR_UNKNOWN_CONSUMER_GET_CONTEXT;
            case 10:
                return ERROR_UNKNOWN_SOURCE_GET_CONTEXT;
            case 11:
                return ERROR_UNKNOWN_CONSUMER_GET_SUPPORTED_KEYS;
            case 12:
                return ERROR_UNKNOWN_SOURCE_GET_SUPPORTED_KEYS;
            case 13:
                return ERROR_INTERNAL_ASSERTION_FAILED;
            case 14:
                return ERROR_PROVIDER;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f178197q;
    }

    public final String toString() {
        return Integer.toString(this.f178197q);
    }
}
