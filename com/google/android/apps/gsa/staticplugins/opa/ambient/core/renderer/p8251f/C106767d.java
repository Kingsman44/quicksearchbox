package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.f.d */
/* compiled from: PG */
public final /* synthetic */ class C106767d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50701am f297540a;

    public /* synthetic */ C106767d(C50701am amVar) {
        this.f297540a = amVar;
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
        C50701am amVar = this.f297540a;
        C50704ap apVar = (C50704ap) obj;
        C50701am a = C50701am.m85887a(apVar.f131957b);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        return a == amVar && (apVar.f131956a & 2) != 0;
    }
}
