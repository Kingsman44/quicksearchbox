package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bu */
/* compiled from: PG */
public final /* synthetic */ class C112353bu implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112353bu f311754a = new C112353bu();

    private /* synthetic */ C112353bu() {
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
        C121537f fVar = C112360ca.f311766c;
        return ((Optional) ((Map.Entry) obj).getValue()).isPresent();
    }
}
