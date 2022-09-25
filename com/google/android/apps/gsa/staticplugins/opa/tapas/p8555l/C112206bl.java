package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.assistant.p3897e.p3917i.p3918a.C51559me;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bl */
/* compiled from: PG */
public final /* synthetic */ class C112206bl implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112206bl f311499a = new C112206bl();

    private /* synthetic */ C112206bl() {
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
        int i = C112213bs.f311506c;
        C51559me a = C51559me.m86216a(((C51560mf) obj).f134386c);
        if (a == null) {
            a = C51559me.UNDEFINED;
        }
        return a == C51559me.RUNNING;
    }
}
