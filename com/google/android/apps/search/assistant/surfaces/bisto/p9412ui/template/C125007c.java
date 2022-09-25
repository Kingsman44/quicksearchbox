package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template;

import android.view.View;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.template.c */
/* compiled from: PG */
public final /* synthetic */ class C125007c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125007c f344914a = new C125007c();

    private /* synthetic */ C125007c() {
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
        return Objects.nonNull((View) obj);
    }
}
