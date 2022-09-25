package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.p */
/* compiled from: PG */
public final /* synthetic */ class C125927p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f347123a;

    public /* synthetic */ C125927p(Locale locale) {
        this.f347123a = locale;
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
        return ((Locale) obj).getLanguage().equals(this.f347123a.getLanguage());
    }
}
