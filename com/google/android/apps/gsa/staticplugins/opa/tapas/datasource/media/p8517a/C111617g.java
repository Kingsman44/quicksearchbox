package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.MediaBrowserCompat;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.g */
/* compiled from: PG */
public final /* synthetic */ class C111617g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111617g f310368a = new C111617g();

    private /* synthetic */ C111617g() {
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
        return ((MediaBrowserCompat.MediaItem) obj).mo808c();
    }
}
