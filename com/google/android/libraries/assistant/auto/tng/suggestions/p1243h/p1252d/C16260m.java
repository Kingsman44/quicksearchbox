package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.common.base.C58817ah;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.m */
/* compiled from: PG */
public final /* synthetic */ class C16260m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16267t f47879a;

    public /* synthetic */ C16260m(C16267t tVar) {
        this.f47879a = tVar;
    }

    public final Object apply(Object obj) {
        C16267t tVar = this.f47879a;
        return Boolean.valueOf(((Instant) obj).plus(Duration.ofSeconds(((Long) tVar.f47897j.mo17428b()).longValue())).isAfter(Instant.ofEpochMilli(tVar.f47890c.mo26870b())));
    }
}
