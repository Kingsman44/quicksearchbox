package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.au */
/* compiled from: PG */
public final /* synthetic */ class C130757au implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357964a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357965b;

    public /* synthetic */ C130757au(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357964a = bhVar;
        this.f357965b = localDateTime;
    }

    public final Object get() {
        C130771bh bhVar = this.f357964a;
        LocalDateTime localDateTime = this.f357965b;
        LocalDateTime plusHours = localDateTime.mo43126j().atStartOfDay().plusHours(20);
        boolean z = localDateTime.isAfter(plusHours) && localDateTime.isBefore(plusHours.plusHours(5));
        LocalDateTime plusHours2 = localDateTime.mo43126j().minusDays(1).atStartOfDay().plusHours(20);
        boolean z2 = z || (localDateTime.isAfter(plusHours2) && localDateTime.isBefore(plusHours2.plusHours(5)));
        Object[] objArr = new Object[2];
        objArr[0] = localDateTime;
        objArr[1] = true != z2 ? "is not" : "is";
        bhVar.mo109816d(localDateTime, "Timestamp %s %s in the default evening interval.", objArr);
        return Boolean.valueOf(z2);
    }
}
