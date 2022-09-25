package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.r */
/* compiled from: PG */
public final /* synthetic */ class C112192r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112192r f311490a = new C112192r();

    private /* synthetic */ C112192r() {
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
        try {
            C48667ab.m85252a(str);
            return true;
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C112194t.f311492a.mo56225c()).mo56382g(e)).mo56372aa(27644)).mo56389s("Could not load adjuster: %s", str);
            return false;
        }
    }
}
