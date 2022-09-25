package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.utils.C28136y;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.p */
/* compiled from: PG */
public final /* synthetic */ class C26215p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C26217r f71249a;

    public /* synthetic */ C26215p(C26217r rVar) {
        this.f71249a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C26217r rVar = this.f71249a;
        Locale locale = (Locale) obj;
        if (C26217r.f71251a.equals(locale)) {
            return rVar.f71252b.getString(R.string.lens_translate_filter_params_detect_language_long);
        }
        Locale c = C28136y.m52432c(C28136y.m52433d(locale));
        return c.getDisplayName(c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
