package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.f */
/* compiled from: PG */
public final class C13513f {
    /* renamed from: a */
    public static int m29794a(long j) {
        long minutes = Duration.ofSeconds(j).toMinutes();
        if (Duration.ofMinutes(minutes).toSeconds() != j) {
            minutes++;
        }
        return (int) minutes;
    }
}
