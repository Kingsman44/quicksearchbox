package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import p3186j$.time.Duration;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.o */
/* compiled from: PG */
enum C122288o {
    ZERO_TO_TWO_SECONDS("ZERO_TO_TWO_SECONDS", Duration.ZERO, Duration.ofSeconds(2)),
    TWO_TO_FIVE_SECONDS("TWO_TO_FIVE_SECONDS", Duration.ofSeconds(2), Duration.ofSeconds(5)),
    FIVE_TO_TEN_SECONDS("FIVE_TO_TEN_SECONDS", Duration.ofSeconds(5), Duration.ofSeconds(10)),
    TEN_SECONDS_TO_THIRTY_SECONDS("TEN_SECONDS_TO_THIRTY_SECONDS", Duration.ofSeconds(10), Duration.ofSeconds(30)),
    THIRTY_SECONDS_TO_ONE_MINUTE("THIRTY_SECONDS_TO_ONE_MINUTE", Duration.ofSeconds(30), Duration.ofMinutes(1)),
    ONE_TO_FIVE_MINUTES("ONE_TO_FIVE_MINUTES", Duration.ofMinutes(1), Duration.ofMinutes(5)),
    FIVE_TO_TEN_MINUTES("FIVE_TO_TEN_MINUTES", Duration.ofMinutes(5), Duration.ofMinutes(10)),
    TEN_MINUTES_OR_LONGER("TEN_MINUTES_OR_LONGER", Duration.ofMinutes(10), Duration.ofSeconds(Long.MAX_VALUE)),
    BOOT_TIME_INACCESSIBLE("BOOT_TIME_INACCESSIBLE", Duration.ofMinutes(-1), Duration.ofMinutes(-1)),
    ERROR("ERROR", Duration.ofMinutes(-1), Duration.ofMinutes(-1));
    

    /* renamed from: k */
    public final String f339101k;

    /* renamed from: l */
    public final Duration f339102l;

    /* renamed from: m */
    public final Duration f339103m;

    private C122288o(String str, Duration duration, Duration duration2) {
        this.f339101k = str;
        this.f339102l = duration;
        this.f339103m = duration2;
    }

    /* renamed from: a */
    public static Optional m201804a(Duration duration) {
        return DesugarArrays.stream((T[]) values()).filter(new C122287n(duration)).findFirst();
    }
}
