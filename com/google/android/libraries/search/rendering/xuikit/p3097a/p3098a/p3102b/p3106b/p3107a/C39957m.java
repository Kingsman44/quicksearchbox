package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C39957m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C39957m f105040a = new C39957m();

    private /* synthetic */ C39957m() {
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
        String str = ((C46108a) obj).mo50210b().f121165j;
        return !str.equals("pseudonymous") && !str.equals("incognito");
    }
}
