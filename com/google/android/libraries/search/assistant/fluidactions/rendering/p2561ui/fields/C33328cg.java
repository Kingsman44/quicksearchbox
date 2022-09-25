package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.assistant.p3897e.p3902c.p3907c.C51049em;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cg */
/* compiled from: PG */
public final /* synthetic */ class C33328cg implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C33328cg f89329a = new C33328cg();

    private /* synthetic */ C33328cg() {
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
        C51049em emVar = (C51049em) obj;
        return emVar.f132931c.equals("text/plain") && !emVar.f132930b.isEmpty();
    }
}
