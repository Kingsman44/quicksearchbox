package com.google.assistant.p3838ao.p3839a.p3846f;

import p3186j$.time.Instant;

/* renamed from: com.google.assistant.ao.a.f.a */
/* compiled from: PG */
abstract class C49637a implements C49642f {

    /* renamed from: a */
    private final Instant f128124a;

    protected C49637a(Instant instant) {
        this.f128124a = instant;
    }

    /* renamed from: a */
    public final /* synthetic */ Instant mo53280a() {
        return mo53282c().isAfter(Instant.EPOCH) ? mo53282c() : mo53281b();
    }

    /* renamed from: b */
    public final Instant mo53281b() {
        return this.f128124a;
    }
}
