package com.google.android.libraries.lens.view.filters.translation.p2106a;

import com.google.android.gms.languageprofile.LanguagePreference;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.a.b */
/* compiled from: PG */
public final /* synthetic */ class C26026b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26026b f70741a = new C26026b();

    private /* synthetic */ C26026b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((LanguagePreference) obj).f391048a.toLanguageTag();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
