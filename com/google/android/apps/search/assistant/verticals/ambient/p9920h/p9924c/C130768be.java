package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49802p;
import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.be */
/* compiled from: PG */
public final /* synthetic */ class C130768be implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357976a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357977b;

    public /* synthetic */ C130768be(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357976a = bhVar;
        this.f357977b = localDateTime;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f357976a.mo109815c((C49802p) obj, this.f357977b) == C130769bf.f357979b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
