package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import com.google.assistant.p3886c.C50741bf;
import com.google.assistant.p3886c.C50743bh;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.m */
/* compiled from: PG */
public final /* synthetic */ class C130633m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130633m f357767a = new C130633m();

    private /* synthetic */ C130633m() {
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
        C50741bf bfVar = ((C50743bh) obj).f132053a;
        if (bfVar == null) {
            bfVar = C50741bf.f132046c;
        }
        return bfVar.f132048a.equals("details");
    }
}
