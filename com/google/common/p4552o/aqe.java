package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.aqe */
/* compiled from: PG */
public enum aqe implements C62957cd {
    UNKNOWN(0),
    INTERPRETER_SUGGESTION_CHIP(1),
    PRONUNCIATION_SUGGESTION_CHIP(2),
    PRACTICE_GRAMMAR(3),
    LANGUAGE_PARTNER(4),
    DAILY_PHRASES(5),
    INTERPRETER_UI(6),
    PRONUNCIATION_GRAMMAR(7);
    

    /* renamed from: i */
    public final int f159730i;

    private aqe(int i) {
        this.f159730i = i;
    }

    /* renamed from: a */
    public static aqe m92457a(String str) {
        return (aqe) Enum.valueOf(aqe.class, str);
    }

    /* renamed from: b */
    public static aqe m92458b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INTERPRETER_SUGGESTION_CHIP;
            case 2:
                return PRONUNCIATION_SUGGESTION_CHIP;
            case 3:
                return PRACTICE_GRAMMAR;
            case 4:
                return LANGUAGE_PARTNER;
            case 5:
                return DAILY_PHRASES;
            case 6:
                return INTERPRETER_UI;
            case 7:
                return PRONUNCIATION_GRAMMAR;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m92459c() {
        return aqd.f159720a;
    }

    public final int getNumber() {
        return this.f159730i;
    }

    public final String toString() {
        return Integer.toString(this.f159730i);
    }
}
