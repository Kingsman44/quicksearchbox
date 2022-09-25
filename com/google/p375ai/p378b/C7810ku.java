package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.ku */
/* compiled from: PG */
public enum C7810ku implements C62957cd {
    STRING(0),
    RATING(1),
    STATUS_BADGE(2),
    ICON(3),
    DISTANCE(4);
    

    /* renamed from: f */
    public final int f27304f;

    private C7810ku(int i) {
        this.f27304f = i;
    }

    /* renamed from: a */
    public static C7810ku m22854a(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return RATING;
        }
        if (i == 2) {
            return STATUS_BADGE;
        }
        if (i == 3) {
            return ICON;
        }
        if (i != 4) {
            return null;
        }
        return DISTANCE;
    }

    /* renamed from: b */
    public static C62959cf m22855b() {
        return C7809kt.f27297a;
    }

    public final int getNumber() {
        return this.f27304f;
    }

    public final String toString() {
        return Integer.toString(this.f27304f);
    }
}
