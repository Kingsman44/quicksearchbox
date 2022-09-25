package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.m */
/* compiled from: PG */
public enum C11716m {
    REGISTER_ASSISTANT_CLIENT,
    CLOSE_CONNECTION,
    TYPE_NOT_SET;

    /* renamed from: a */
    public static C11716m m27384a(int i) {
        if (i == 0) {
            return TYPE_NOT_SET;
        }
        if (i == 1) {
            return REGISTER_ASSISTANT_CLIENT;
        }
        if (i != 2) {
            return null;
        }
        return CLOSE_CONNECTION;
    }
}
