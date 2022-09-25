package com.google.android.libraries.lens.view.filters.translation;

import android.content.Context;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.r */
/* compiled from: PG */
public final class C26217r {

    /* renamed from: a */
    public static final Locale f71251a = new Locale("auto");

    /* renamed from: b */
    public final Context f71252b;

    /* renamed from: c */
    public final Locale f71253c;

    /* renamed from: d */
    private final Map f71254d = new HashMap();

    /* renamed from: e */
    private final Map f71255e = new HashMap();

    /* renamed from: f */
    private final Map f71256f = new HashMap();

    public C26217r(Context context) {
        this.f71252b = context;
        this.f71253c = C28122k.m52406f(context);
    }

    /* renamed from: a */
    static C58833ax m48404a(Locale locale, C58528ij ijVar) {
        if (locale == null) {
            return C58836b.f156633a;
        }
        if (locale.equals(f71251a)) {
            return C58833ax.m90834k(locale);
        }
        if (locale.getLanguage().equals("zh")) {
            if (locale.getScript().equals("Hant")) {
                locale = Locale.forLanguageTag("zh-TW");
            } else if (locale.getScript().equals("Hans")) {
                locale = Locale.forLanguageTag("zh-CN");
            }
        }
        String language = locale.getLanguage();
        String languageTag = locale.toLanguageTag();
        if (ijVar.contains(Locale.forLanguageTag(languageTag))) {
            return C58833ax.m90834k(Locale.forLanguageTag(languageTag));
        }
        return ijVar.contains(Locale.forLanguageTag(language)) ? C58833ax.m90834k(Locale.forLanguageTag(language)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final String mo31432b(Locale locale) {
        return (String) Map.EL.computeIfAbsent(this.f71254d, locale, new C26202o(this));
    }

    /* renamed from: c */
    public final String mo31433c(Locale locale) {
        return (String) Map.EL.computeIfAbsent(this.f71256f, locale, new C26215p(this));
    }

    /* renamed from: d */
    public final String mo31434d(Locale locale) {
        return (String) Map.EL.computeIfAbsent(this.f71255e, locale, new C26216q(this));
    }
}
