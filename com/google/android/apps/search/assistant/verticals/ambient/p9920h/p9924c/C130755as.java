package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.common.base.C58817ah;
import p3186j$.time.LocalDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.as */
/* compiled from: PG */
public final /* synthetic */ class C130755as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357960a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357961b;

    public /* synthetic */ C130755as(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357960a = bhVar;
        this.f357961b = localDateTime;
    }

    public final Object apply(Object obj) {
        C130771bh bhVar = this.f357960a;
        LocalDateTime localDateTime = this.f357961b;
        return (Boolean) ((Optional) obj).map(new C130768be(bhVar, localDateTime)).orElseGet(new C130754ar(bhVar, localDateTime));
    }
}
