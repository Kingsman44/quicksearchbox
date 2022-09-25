package com.google.android.apps.gsa.speech.settingsui.language;

import com.google.common.base.C58890d;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.b */
/* compiled from: PG */
public final /* synthetic */ class C92638b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LanguagePreference f258602a;

    public /* synthetic */ C92638b(LanguagePreference languagePreference) {
        this.f258602a = languagePreference;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        LanguagePreference languagePreference = this.f258602a;
        String str = (String) obj;
        return !languagePreference.f258594f.contains(str) && C58890d.m90990e(languagePreference.f258595g, Locale.forLanguageTag(str).getCountry());
    }
}
