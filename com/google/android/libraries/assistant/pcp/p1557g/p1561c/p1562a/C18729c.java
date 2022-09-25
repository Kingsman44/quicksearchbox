package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18729c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18729c f52816a = new C18729c();

    private /* synthetic */ C18729c() {
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
        return !"com.google.android.apps.search.podcasts.browser.PodcastBrowserService".equals(((ComponentName) obj).getClassName());
    }
}
