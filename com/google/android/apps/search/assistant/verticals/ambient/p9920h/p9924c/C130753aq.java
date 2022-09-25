package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.common.base.C58817ah;
import p3186j$.time.LocalDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C130753aq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357956a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357957b;

    public /* synthetic */ C130753aq(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357956a = bhVar;
        this.f357957b = localDateTime;
    }

    public final Object apply(Object obj) {
        C130771bh bhVar = this.f357956a;
        LocalDateTime localDateTime = this.f357957b;
        return (Boolean) ((Optional) obj).map(new C130756at(bhVar, localDateTime)).orElseGet(new C130757au(bhVar, localDateTime));
    }
}
