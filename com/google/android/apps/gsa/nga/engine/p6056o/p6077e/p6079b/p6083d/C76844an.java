package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import p3186j$.time.LocalDate;
import p3186j$.time.temporal.ChronoField;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.an */
/* compiled from: PG */
public final /* synthetic */ class C76844an implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76848ar f212248a;

    public /* synthetic */ C76844an(C76848ar arVar) {
        this.f212248a = arVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76871v vVar = this.f212248a.f212254a;
        int intValue = ((Integer) obj).intValue();
        LocalDate a = vVar.mo72340a();
        if (a.getDayOfWeek().getValue() <= intValue) {
            a = a.minusWeeks(1);
        }
        LocalDate with = a.mo43043b(ChronoField.DAY_OF_WEEK, (long) intValue);
        LocalDate plusDays = with.plusDays(1);
        String c = C76871v.m123492c(with);
        String c2 = C76871v.m123492c(plusDays);
        return Optional.m71637of("after:" + c + " before:" + c2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
