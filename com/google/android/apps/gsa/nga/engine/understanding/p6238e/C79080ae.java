package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C79080ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217436a;

    public /* synthetic */ C79080ae(C79086ak akVar) {
        this.f217436a = akVar;
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
        return this.f217436a.f217451g.mo72021b().mo72039e().toLanguageTag().toLowerCase(Locale.ROOT).startsWith(((String) obj).toLowerCase(Locale.ROOT));
    }
}
