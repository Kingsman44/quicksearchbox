package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.al */
/* compiled from: PG */
public final /* synthetic */ class C33067al implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C33067al f88532a = new C33067al();

    private /* synthetic */ C33067al() {
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
        C50954az azVar = (C50954az) obj;
        int i = C33070ao.f88535a;
        C50951aw a = C50951aw.m85988a(azVar.f132649i);
        if (a == null) {
            a = C50951aw.DEFAULT_STATUS;
        }
        if (a.equals(C50951aw.HIGHLIGHT)) {
            return true;
        }
        C50951aw a2 = C50951aw.m85988a(azVar.f132649i);
        if (a2 == null) {
            a2 = C50951aw.DEFAULT_STATUS;
        }
        return a2.equals(C50951aw.ERROR);
    }
}
