package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.assistant.p3860as.C49804r;
import com.google.p4479cg.C58081m;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.i */
/* compiled from: PG */
public final /* synthetic */ class C106683i implements Function {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f297355a;

    public /* synthetic */ C106683i(LocalDate localDate) {
        this.f297355a = localDate;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        LocalDate localDate = this.f297355a;
        C49804r rVar = (C49804r) obj;
        C58081m mVar = rVar.f128650a;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        LocalDateTime atTime = localDate.mo43076f(C58068e.m88828f(mVar));
        if (atTime.getHour() < 10) {
            atTime = atTime.plusDays(1);
        }
        return new C106695u(atTime, rVar.f128651b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
