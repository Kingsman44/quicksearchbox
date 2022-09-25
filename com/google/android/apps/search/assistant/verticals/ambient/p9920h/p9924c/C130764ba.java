package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49804r;
import com.google.p4479cg.C58081m;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ba */
/* compiled from: PG */
public final /* synthetic */ class C130764ba implements Function {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f357972a;

    public /* synthetic */ C130764ba(LocalDate localDate) {
        this.f357972a = localDate;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        LocalDate localDate = this.f357972a;
        C49804r rVar = (C49804r) obj;
        int i = C130771bh.f357984a;
        C58081m mVar = rVar.f128650a;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        LocalDateTime atTime = localDate.mo43076f(C58068e.m88828f(mVar));
        if (atTime.getHour() < 10) {
            atTime = atTime.plusDays(1);
        }
        return new C130770bg(atTime, rVar.f128651b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
