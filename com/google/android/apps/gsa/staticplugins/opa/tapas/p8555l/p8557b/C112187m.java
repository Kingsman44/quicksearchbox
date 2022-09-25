package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.m */
/* compiled from: PG */
public final /* synthetic */ class C112187m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112187m f311479a = new C112187m();

    private /* synthetic */ C112187m() {
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
        C59071e eVar = C112189o.f311481a;
        try {
            C48668ac.m85255a(str);
            return true;
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C112189o.f311481a.mo56225c()).mo56382g(e)).mo56372aa(27638)).mo56389s("Could not load predictor: %s", str);
            return false;
        }
    }
}
