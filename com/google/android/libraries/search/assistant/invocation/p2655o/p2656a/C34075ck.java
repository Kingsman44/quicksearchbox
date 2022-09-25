package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ck */
/* compiled from: PG */
public enum C34075ck {
    INVOCATION,
    PLATFORM_CONFIGURATION_UPDATE,
    MESSAGE_NOT_SET;

    /* renamed from: a */
    public static C34075ck m62715a(int i) {
        if (i == 0) {
            return MESSAGE_NOT_SET;
        }
        if (i == 1) {
            return INVOCATION;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM_CONFIGURATION_UPDATE;
    }
}
