package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.m */
/* compiled from: PG */
public final /* synthetic */ class C109116m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109116m f303865a = new C109116m();

    private /* synthetic */ C109116m() {
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
        C53552al alVar = (C53552al) obj;
        C59071e eVar = C109100ar.f303734a;
        if ((alVar.f140541a & 1) == 0) {
            return false;
        }
        C53556ap b = C53556ap.m86865b(alVar.f140544d);
        if (b == null) {
            b = C53556ap.NONE;
        }
        return b == C53556ap.PERSONAL_CONTEXT;
    }
}
