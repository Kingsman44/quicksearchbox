package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118588f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ax */
/* compiled from: PG */
public final /* synthetic */ class C125488ax implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125488ax f346047a = new C125488ax();

    private /* synthetic */ C125488ax() {
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
        return ((C118588f) obj).f330864d.size() > 0;
    }
}
