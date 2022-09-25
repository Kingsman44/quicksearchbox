package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.y.a.ap */
/* compiled from: PG */
public enum C53556ap implements C62957cd {
    NONE(0),
    NGA_CONTEXT(1),
    TIME_CONTEXT(2),
    OVERAPP_CONTEXT(3),
    PERSONAL_CONTEXT(4),
    NUDGE_CONTEXT(5),
    SECTION_CONTEXT(6),
    OLC_CONTEXT(7),
    APP_CONTROL_CONTEXT(8);
    

    /* renamed from: j */
    public final int f140559j;

    private C53556ap(int i) {
        this.f140559j = i;
    }

    /* renamed from: a */
    public static C53556ap m86864a(String str) {
        return (C53556ap) Enum.valueOf(C53556ap.class, str);
    }

    /* renamed from: b */
    public static C53556ap m86865b(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return NGA_CONTEXT;
            case 2:
                return TIME_CONTEXT;
            case 3:
                return OVERAPP_CONTEXT;
            case 4:
                return PERSONAL_CONTEXT;
            case 5:
                return NUDGE_CONTEXT;
            case 6:
                return SECTION_CONTEXT;
            case 7:
                return OLC_CONTEXT;
            case 8:
                return APP_CONTROL_CONTEXT;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m86866c() {
        return C53555ao.f140548a;
    }

    public final int getNumber() {
        return this.f140559j;
    }

    public final String toString() {
        return Integer.toString(this.f140559j);
    }
}
