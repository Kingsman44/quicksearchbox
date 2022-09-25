package com.google.android.libraries.lens.view.filters.translation;

import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.aa */
/* compiled from: PG */
public final /* synthetic */ class C26036aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f70756a;

    public /* synthetic */ C26036aa(C58528ij ijVar) {
        this.f70756a = ijVar;
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
        return this.f70756a.contains((Locale) obj);
    }
}
