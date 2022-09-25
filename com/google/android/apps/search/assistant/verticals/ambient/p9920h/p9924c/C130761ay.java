package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49804r;
import com.google.p4479cg.C58081m;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C130761ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f357969a;

    public /* synthetic */ C130761ay(LocalDate localDate) {
        this.f357969a = localDate;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        LocalDate localDate = this.f357969a;
        C49804r rVar = (C49804r) obj;
        int i = C130771bh.f357984a;
        C58081m mVar = rVar.f128650a;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        return new C130770bg(localDate.mo43076f(C58068e.m88828f(mVar)), rVar.f128651b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
