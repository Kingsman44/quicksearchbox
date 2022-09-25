package com.google.android.libraries.search.location.p3029a;

import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.location.a.ak */
/* compiled from: PG */
public final class C38591ak {

    /* renamed from: a */
    public static final Duration f102016a = Duration.ofMinutes(5);

    /* renamed from: a */
    public static Duration m67898a(C38635c cVar, Instant instant) {
        Instant plus = Instant.ofEpochMilli(cVar.f102094d).plus(f102016a);
        if (instant.isBefore(plus)) {
            return Duration.between(instant, plus);
        }
        return Duration.ZERO;
    }
}
