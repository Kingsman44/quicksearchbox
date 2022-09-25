package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.view.translation.TranslationCapability;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.c */
/* compiled from: PG */
public final /* synthetic */ class C128223c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C128223c f352708a = new C128223c();

    private /* synthetic */ C128223c() {
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
        int i = C128225e.f352710d;
        return ((TranslationCapability) obj).getState() == 3;
    }
}
