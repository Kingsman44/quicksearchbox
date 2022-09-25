package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import java.io.File;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.f */
/* compiled from: PG */
public final /* synthetic */ class C131821f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131821f f360021a = new C131821f();

    private /* synthetic */ C131821f() {
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
        return Objects.nonNull((File) obj);
    }
}
