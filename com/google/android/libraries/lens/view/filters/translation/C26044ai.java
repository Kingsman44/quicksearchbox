package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2067ak.C25260cl;
import com.google.android.libraries.lens.view.p2067ak.C25261cm;
import com.google.android.libraries.lens.view.utils.C28136y;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ai */
/* compiled from: PG */
public final /* synthetic */ class C26044ai implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26044ai f70766a = new C26044ai();

    private /* synthetic */ C26044ai() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = C26059ax.f70784a;
        C25260cl clVar = (C25260cl) C25261cm.f68722b.createBuilder();
        String b = C28136y.m52431b((Locale) obj);
        clVar.copyOnWrite();
        b.getClass();
        ((C25261cm) clVar.instance).f68724a = b;
        return (C25261cm) clVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
