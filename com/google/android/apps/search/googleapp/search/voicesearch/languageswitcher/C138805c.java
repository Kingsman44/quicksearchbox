package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.c */
/* compiled from: PG */
public final /* synthetic */ class C138805c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f377561a;

    public /* synthetic */ C138805c(Map map) {
        this.f377561a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        Map map = this.f377561a;
        Locale forLanguageTag = Locale.forLanguageTag((String) obj);
        String displayLanguage = forLanguageTag.getDisplayLanguage(forLanguageTag);
        if (!map.containsKey(displayLanguage) || ((Long) map.get(displayLanguage)).longValue() <= 1) {
            return displayLanguage;
        }
        String country = forLanguageTag.getCountry();
        if (country.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = " (" + country + ")";
        }
        return String.valueOf(displayLanguage).concat(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
