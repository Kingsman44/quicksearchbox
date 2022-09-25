package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.i */
/* compiled from: PG */
public final /* synthetic */ class C125730i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125730i f346525a = new C125730i();

    private /* synthetic */ C125730i() {
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
        return !((C125141do) obj).f345220b.isEmpty();
    }
}
