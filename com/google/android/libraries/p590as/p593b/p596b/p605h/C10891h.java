package com.google.android.libraries.p590as.p593b.p596b.p605h;

import java.io.File;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.h.h */
/* compiled from: PG */
public final /* synthetic */ class C10891h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10891h f35977a = new C10891h();

    private /* synthetic */ C10891h() {
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
        return ((File) obj).isDirectory();
    }
}
