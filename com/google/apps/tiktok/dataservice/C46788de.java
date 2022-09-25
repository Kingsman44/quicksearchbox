package com.google.apps.tiktok.dataservice;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.dataservice.de */
/* compiled from: PG */
public enum C46788de {
    DONT_CARE(Long.MAX_VALUE),
    SAME_WEEK(TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS)),
    SAME_DAY(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)),
    FEW_HOURS(TimeUnit.MILLISECONDS.convert(4, TimeUnit.HOURS)),
    ONE_HOUR(TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS)),
    HALF_HOUR(TimeUnit.MILLISECONDS.convert(30, TimeUnit.MINUTES)),
    TEN_MINUTES(TimeUnit.MILLISECONDS.convert(10, TimeUnit.MINUTES)),
    FEW_MINUTES(TimeUnit.MILLISECONDS.convert(4, TimeUnit.MINUTES)),
    ONE_MINUTE(TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES)),
    FEW_SECONDS(TimeUnit.MILLISECONDS.convert(4, TimeUnit.SECONDS));
    

    /* renamed from: k */
    final long f122159k;

    private C46788de(long j) {
        this.f122159k = j;
    }

    /* renamed from: a */
    public final boolean mo50797a(long j, long j2) {
        return j < j2 - this.f122159k;
    }
}
