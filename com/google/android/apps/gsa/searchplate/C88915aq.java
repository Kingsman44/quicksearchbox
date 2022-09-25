package com.google.android.apps.gsa.searchplate;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.searchplate.aq */
/* compiled from: PG */
public final /* synthetic */ class C88915aq implements Function {

    /* renamed from: a */
    public final /* synthetic */ C88923ay f240868a;

    /* renamed from: b */
    public final /* synthetic */ Map f240869b;

    public /* synthetic */ C88915aq(C88923ay ayVar, Map map) {
        this.f240868a = ayVar;
        this.f240869b = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C88923ay ayVar = this.f240868a;
        Map map = this.f240869b;
        Locale forLanguageTag = Locale.forLanguageTag((String) obj);
        String displayLanguage = forLanguageTag.getDisplayLanguage(forLanguageTag);
        if (!map.containsKey(displayLanguage)) {
            return displayLanguage;
        }
        if (!ayVar.f240883f && ((Long) map.get(displayLanguage)).longValue() <= 1) {
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
