package com.google.android.apps.gsa.speech.settingsui.language;

import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.a */
/* compiled from: PG */
public final /* synthetic */ class C92637a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f258601a;

    public /* synthetic */ C92637a(Set set) {
        this.f258601a = set;
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
        return this.f258601a.contains((String) obj);
    }
}
