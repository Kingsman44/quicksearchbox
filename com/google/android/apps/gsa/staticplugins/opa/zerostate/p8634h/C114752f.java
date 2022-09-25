package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h;

import p3186j$.time.Clock;
import p3186j$.time.LocalTime;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.h.f */
/* compiled from: PG */
public enum C114752f {
    UNKNOWN,
    MORNING,
    AFTERNOON,
    EVENING,
    NIGHT;
    

    /* renamed from: f */
    private static final LocalTime f318459f = null;

    /* renamed from: g */
    private static final LocalTime f318460g = null;

    /* renamed from: h */
    private static final LocalTime f318461h = null;

    /* renamed from: i */
    private static final LocalTime f318462i = null;

    static {
        f318459f = LocalTime.m71211of(4, 30);
        f318460g = LocalTime.m71211of(12, 0);
        f318461h = LocalTime.m71211of(17, 0);
        f318462i = LocalTime.m71211of(22, 0);
    }

    /* renamed from: a */
    public static C114752f m190229a(Clock clock) {
        LocalTime now = LocalTime.now(clock);
        LocalTime localTime = f318459f;
        if (now.equals(localTime) || (now.isAfter(localTime) && now.isBefore(f318460g))) {
            return MORNING;
        }
        LocalTime localTime2 = f318460g;
        if (now.equals(localTime2) || (now.isAfter(localTime2) && now.isBefore(f318461h))) {
            return AFTERNOON;
        }
        LocalTime localTime3 = f318461h;
        return (now.equals(localTime3) || (now.isAfter(localTime3) && now.isBefore(f318462i))) ? EVENING : NIGHT;
    }
}
