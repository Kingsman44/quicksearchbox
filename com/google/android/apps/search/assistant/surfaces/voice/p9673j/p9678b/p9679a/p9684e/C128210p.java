package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3994s.p3995a.C53128ck;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.p */
/* compiled from: PG */
public final /* synthetic */ class C128210p implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C128210p f352686a = new C128210p();

    private /* synthetic */ C128210p() {
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
        C123744bk bkVar = (C123744bk) obj;
        if (bkVar.f341808c != 35) {
            return false;
        }
        C51133hp a = C51133hp.m86035a(((C53128ck) bkVar.f341809d).f139242c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        return a == C51133hp.TRY_SAYING;
    }
}
