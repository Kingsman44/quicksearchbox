package com.google.android.apps.gsa.speech.settingsui.language;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.c */
/* compiled from: PG */
public final /* synthetic */ class C92639c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LanguagePreference f258603a;

    public /* synthetic */ C92639c(LanguagePreference languagePreference) {
        this.f258603a = languagePreference;
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
        return !this.f258603a.f258594f.contains((String) obj);
    }
}
