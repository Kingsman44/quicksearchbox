package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C133210e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C133210e f363078a = new C133210e();

    private /* synthetic */ C133210e() {
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
        C59071e eVar = C133215j.f363083a;
        String str = ((C46108a) obj).mo50210b().f121165j;
        return !str.equals("pseudonymous") && !str.equals("incognito");
    }
}
