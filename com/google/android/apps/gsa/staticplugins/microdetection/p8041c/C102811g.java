package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.g */
/* compiled from: PG */
public final /* synthetic */ class C102811g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C102811g f287083a = new C102811g();

    private /* synthetic */ C102811g() {
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
        return ((C29690f) obj).f80411b.startsWith("hotword_model_");
    }
}
