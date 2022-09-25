package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.x */
/* compiled from: PG */
public final /* synthetic */ class C107121x implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107121x f298197a = new C107121x();

    private /* synthetic */ C107121x() {
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
        C58528ij ijVar = C107097an.f298158b;
        C50701am a = C50701am.m85887a(((C50738bc) obj).f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        return ijVar.contains(a);
    }
}
