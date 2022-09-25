package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.lh */
/* compiled from: PG */
public enum C51535lh implements C62957cd {
    UNKNOWN_REQUEST_REASON_ENUM(0),
    REAL_USER(1),
    GENERAL_TEST(2),
    LOAD_TEST(3),
    EVAL(4),
    HEALTH_PROBE(5),
    DEBUGGING(6),
    SIMULATOR(7),
    REGRESSION_TEST(8),
    WEB_DEBUGGER(9),
    SPECULATIVE_EXECUTION(10),
    TAPAS_PREFETCH(15),
    ON_DEVICE_CACHE(11),
    MEDIA_PREFETCH(12),
    APP_ACTIONS_QUERY_VALIDATION(13),
    ROUTINE_CLOUD_EXECUTION(14),
    CVA_OEM_TEST(16);
    

    /* renamed from: r */
    public final int f134315r;

    private C51535lh(int i) {
        this.f134315r = i;
    }

    /* renamed from: a */
    public static C51535lh m86211a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_REASON_ENUM;
            case 1:
                return REAL_USER;
            case 2:
                return GENERAL_TEST;
            case 3:
                return LOAD_TEST;
            case 4:
                return EVAL;
            case 5:
                return HEALTH_PROBE;
            case 6:
                return DEBUGGING;
            case 7:
                return SIMULATOR;
            case 8:
                return REGRESSION_TEST;
            case 9:
                return WEB_DEBUGGER;
            case 10:
                return SPECULATIVE_EXECUTION;
            case 11:
                return ON_DEVICE_CACHE;
            case 12:
                return MEDIA_PREFETCH;
            case 13:
                return APP_ACTIONS_QUERY_VALIDATION;
            case 14:
                return ROUTINE_CLOUD_EXECUTION;
            case 15:
                return TAPAS_PREFETCH;
            case 16:
                return CVA_OEM_TEST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86212b() {
        return C51534lg.f134296a;
    }

    public final int getNumber() {
        return this.f134315r;
    }

    public final String toString() {
        return Integer.toString(this.f134315r);
    }
}
