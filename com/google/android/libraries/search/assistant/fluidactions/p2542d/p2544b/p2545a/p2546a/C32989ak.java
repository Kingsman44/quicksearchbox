package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.net.Uri;
import com.google.common.base.C58890d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C32989ak implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C32989ak f88388a = new C32989ak();

    private /* synthetic */ C32989ak() {
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
        String scheme = Uri.parse((String) obj).getScheme();
        return scheme == null || !C58890d.m90990e("content", scheme);
    }
}
