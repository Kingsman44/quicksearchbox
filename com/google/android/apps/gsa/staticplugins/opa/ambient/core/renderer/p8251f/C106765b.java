package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f;

import com.google.assistant.p3886c.C50738bc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.f.b */
/* compiled from: PG */
public final /* synthetic */ class C106765b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106765b f297538a = new C106765b();

    private /* synthetic */ C106765b() {
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
        return ((C50738bc) obj).f132043j.size() > 0;
    }
}
