package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.ab */
/* compiled from: PG */
public final /* synthetic */ class C109378ab implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109378ab f304661a = new C109378ab();

    private /* synthetic */ C109378ab() {
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
        C123768ch chVar = (C123768ch) obj;
        if ((chVar.f341896a & 1) == 0) {
            return false;
        }
        C123762cb a = C123762cb.m203107a(chVar.f341898c);
        if (a == null) {
            a = C123762cb.AFFINITY_TYPE_UNSPECIFIED;
        }
        return a == C123762cb.CALL;
    }
}
