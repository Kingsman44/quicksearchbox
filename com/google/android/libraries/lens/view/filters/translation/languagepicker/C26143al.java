package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.al */
/* compiled from: PG */
public final /* synthetic */ class C26143al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C26146ao f71046a;

    /* renamed from: b */
    public final /* synthetic */ C26199z f71047b;

    public /* synthetic */ C26143al(C26146ao aoVar, C26199z zVar) {
        this.f71046a = aoVar;
        this.f71047b = zVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C26146ao aoVar = this.f71046a;
        C26131a aVar = (C26131a) this.f71047b;
        return aoVar.mo31382c((Locale) obj, aVar.f71036e, aVar.f71037f, aVar.f71038g, aVar.f71039h);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
