package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9471d;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.d.b */
/* compiled from: PG */
public final /* synthetic */ class C126023b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126023b f347321a = new C126023b();

    private /* synthetic */ C126023b() {
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
        String str = (String) obj;
        return str.equals("set_title_start_dictation") || str.equals("add_item_start_dictation");
    }
}
