package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.android.libraries.p1642ax.p1644b.p1645a.C19598a;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.o */
/* compiled from: PG */
public final /* synthetic */ class C26202o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C26217r f71203a;

    public /* synthetic */ C26202o(C26217r rVar) {
        this.f71203a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C26217r rVar = this.f71203a;
        Locale locale = (Locale) obj;
        Locale c = C28136y.m52432c(C28136y.m52433d(locale));
        if (C26217r.f71251a.equals(c)) {
            str = rVar.f71252b.getString(R.string.lens_translate_filter_params_detect_language_long);
        } else {
            str = c.getDisplayName(rVar.f71253c);
        }
        return C19598a.m37353a(rVar.f71252b, C28136y.m52431b(locale), str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
