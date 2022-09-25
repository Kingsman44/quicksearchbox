package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.a.ce */
/* compiled from: PG */
public enum C59508ce implements C62957cd {
    UNSPECIFIED_STATE(0),
    LOADING_NOT_STARTED(4),
    JNI_LOADING(1),
    JNI_LOADED(2),
    MODEL_LOADING(5),
    MODEL_LOADED(6),
    JNI_TIMEOUT(3),
    ERROR(7);
    

    /* renamed from: i */
    public final int f157897i;

    private C59508ce(int i) {
        this.f157897i = i;
    }

    /* renamed from: a */
    public static C59508ce m92362a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_STATE;
            case 1:
                return JNI_LOADING;
            case 2:
                return JNI_LOADED;
            case 3:
                return JNI_TIMEOUT;
            case 4:
                return LOADING_NOT_STARTED;
            case 5:
                return MODEL_LOADING;
            case 6:
                return MODEL_LOADED;
            case 7:
                return ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92363b() {
        return C59507cd.f157887a;
    }

    public final int getNumber() {
        return this.f157897i;
    }

    public final String toString() {
        return Integer.toString(this.f157897i);
    }
}
