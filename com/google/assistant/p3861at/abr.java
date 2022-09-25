package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.abr */
/* compiled from: PG */
public enum abr implements C62957cd {
    NOT_RATED(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);
    

    /* renamed from: g */
    public final int f128803g;

    private abr(int i) {
        this.f128803g = i;
    }

    /* renamed from: a */
    public static abr m85721a(int i) {
        if (i == 0) {
            return NOT_RATED;
        }
        if (i == 1) {
            return ONE;
        }
        if (i == 2) {
            return TWO;
        }
        if (i == 3) {
            return THREE;
        }
        if (i == 4) {
            return FOUR;
        }
        if (i != 5) {
            return null;
        }
        return FIVE;
    }

    /* renamed from: b */
    public static C62959cf m85722b() {
        return abq.f128795a;
    }

    public final int getNumber() {
        return this.f128803g;
    }

    public final String toString() {
        return Integer.toString(this.f128803g);
    }
}
