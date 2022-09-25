package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C130754ar implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357958a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357959b;

    public /* synthetic */ C130754ar(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357958a = bhVar;
        this.f357959b = localDateTime;
    }

    public final Object get() {
        C130771bh bhVar = this.f357958a;
        LocalDateTime localDateTime = this.f357959b;
        LocalDateTime plusHours = localDateTime.mo43126j().atStartOfDay().plusHours(6);
        boolean z = localDateTime.isAfter(plusHours) && localDateTime.isBefore(plusHours.plusHours(5));
        Object[] objArr = new Object[2];
        objArr[0] = localDateTime;
        objArr[1] = true != z ? "is not" : "is";
        bhVar.mo109816d(localDateTime, "Timestamp %s %s in the default morning interval.", objArr);
        return Boolean.valueOf(z);
    }
}
