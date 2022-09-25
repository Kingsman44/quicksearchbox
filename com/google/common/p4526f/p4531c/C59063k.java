package com.google.common.p4526f.p4531c;

/* renamed from: com.google.common.f.c.k */
/* compiled from: PG */
enum C59063k {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    /* renamed from: a */
    public static C59063k m91324a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }
}
