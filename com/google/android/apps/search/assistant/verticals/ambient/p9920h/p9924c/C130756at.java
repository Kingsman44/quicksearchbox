package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49802p;
import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.at */
/* compiled from: PG */
public final /* synthetic */ class C130756at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130771bh f357962a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f357963b;

    public /* synthetic */ C130756at(C130771bh bhVar, LocalDateTime localDateTime) {
        this.f357962a = bhVar;
        this.f357963b = localDateTime;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f357962a.mo109815c((C49802p) obj, this.f357963b) == C130769bf.f357980c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
