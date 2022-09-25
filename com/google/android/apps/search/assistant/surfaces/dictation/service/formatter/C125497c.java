package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.c */
/* compiled from: PG */
public final /* synthetic */ class C125497c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125497c f346070a = new C125497c();

    private /* synthetic */ C125497c() {
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
        C125503i iVar = C125503i.f346078a;
        return !((String) obj).isEmpty();
    }
}
