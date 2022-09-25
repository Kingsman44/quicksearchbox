package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.c */
/* compiled from: PG */
public final /* synthetic */ class C106823c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50701am f297694a;

    public /* synthetic */ C106823c(C50701am amVar) {
        this.f297694a = amVar;
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
        C50701am amVar = this.f297694a;
        C50701am a = C50701am.m85887a(((C50738bc) obj).f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        return a == amVar;
    }
}
