package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.x */
/* compiled from: PG */
public final /* synthetic */ class C125518x implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125518x f346111a = new C125518x();

    private /* synthetic */ C125518x() {
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
        C59071e eVar = C125470af.f346003a;
        return !((String) obj).isEmpty();
    }
}
