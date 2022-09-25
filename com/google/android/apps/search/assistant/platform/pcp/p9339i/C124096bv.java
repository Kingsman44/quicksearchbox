package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bv */
/* compiled from: PG */
public final /* synthetic */ class C124096bv implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f342747a;

    public /* synthetic */ C124096bv(String str) {
        this.f342747a = str;
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
        return ((C46108a) obj).mo50210b().f121161f.equals(this.f342747a);
    }
}
