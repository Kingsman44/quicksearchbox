package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.evernote.android.state.BuildConfig;
import p3186j$.time.LocalDate;
import p3186j$.time.temporal.ChronoField;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.am */
/* compiled from: PG */
public final /* synthetic */ class C76843am implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76848ar f212246a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f212247b;

    public /* synthetic */ C76843am(C76848ar arVar, Boolean bool) {
        this.f212246a = arVar;
        this.f212247b = bool;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C76848ar arVar = this.f212246a;
        Boolean bool = this.f212247b;
        C76871v vVar = arVar.f212254a;
        int intValue = ((Integer) obj).intValue();
        boolean booleanValue = bool.booleanValue();
        LocalDate a = vVar.mo72340a();
        LocalDate minus = a.mo43054k(1, C76871v.f212298b[intValue]);
        if (intValue == 0) {
            str = " before:".concat(C76871v.m123492c(a));
        } else if (!booleanValue) {
            ChronoField chronoField = C76871v.f212297a[intValue];
            minus = minus.mo43043b(chronoField, chronoField.range().getMinimum());
            ChronoField chronoField2 = C76871v.f212297a[intValue];
            str = " before:".concat(C76871v.m123492c(a.mo43043b(chronoField2, chronoField2.range().getMinimum())));
        } else {
            str = BuildConfig.FLAVOR;
        }
        String c = C76871v.m123492c(minus);
        return Optional.m71637of("after:" + c + str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
