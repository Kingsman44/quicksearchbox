package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.b.a.a.b.a.b */
/* compiled from: PG */
public enum C65573b implements C62957cd {
    AUTH_TOKEN_FETCH_FAILURE_UNKNOWN(0),
    AUTH_TOKEN_FETCH_FAILURE_TIMEOUT(1),
    AUTH_TOKEN_FETCH_FAILURE_IO_EXCEPTION(2),
    AUTH_TOKEN_FETCH_FAILURE_RUNTIME_EXCEPTION(3),
    AUTH_TOKEN_FETCH_FAILURE_USER_RECOVERABLE_AUTH_EXCEPTION(4),
    AUTH_TOKEN_FETCH_FAILURE_AUTHENTICATOR_EXCEPTION(5),
    AUTH_TOKEN_FETCH_FAILURE_NETWORK_ERROR_EXCEPTION(6);
    

    /* renamed from: h */
    public static final C62958ce f178206h = null;

    /* renamed from: i */
    public final int f178208i;

    static {
        f178206h = new C65572a();
    }

    private C65573b(int i) {
        this.f178208i = i;
    }

    /* renamed from: a */
    public static C65573b m96733a(int i) {
        switch (i) {
            case 0:
                return AUTH_TOKEN_FETCH_FAILURE_UNKNOWN;
            case 1:
                return AUTH_TOKEN_FETCH_FAILURE_TIMEOUT;
            case 2:
                return AUTH_TOKEN_FETCH_FAILURE_IO_EXCEPTION;
            case 3:
                return AUTH_TOKEN_FETCH_FAILURE_RUNTIME_EXCEPTION;
            case 4:
                return AUTH_TOKEN_FETCH_FAILURE_USER_RECOVERABLE_AUTH_EXCEPTION;
            case 5:
                return AUTH_TOKEN_FETCH_FAILURE_AUTHENTICATOR_EXCEPTION;
            case 6:
                return AUTH_TOKEN_FETCH_FAILURE_NETWORK_ERROR_EXCEPTION;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f178208i;
    }

    public final String toString() {
        return Integer.toString(this.f178208i);
    }
}
