package com.google.android.libraries.lens.view.p2159q.p2160a;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.q.a.k */
/* compiled from: PG */
public final /* synthetic */ class C27564k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27564k f75350a = new C27564k();

    private /* synthetic */ C27564k() {
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
        return ((C46108a) obj).mo50210b().f121165j.equals("google");
    }
}
