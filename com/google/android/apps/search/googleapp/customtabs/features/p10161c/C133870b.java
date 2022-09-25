package com.google.android.apps.search.googleapp.customtabs.features.p10161c;

import android.net.Uri;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.c.b */
/* compiled from: PG */
public final /* synthetic */ class C133870b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f364611a;

    /* renamed from: b */
    public final /* synthetic */ String f364612b;

    public /* synthetic */ C133870b(String str, String str2) {
        this.f364611a = str;
        this.f364612b = str2;
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
        String str = this.f364611a;
        String str2 = this.f364612b;
        Uri uri = (Uri) obj;
        Uri uri2 = C133871c.f364613a;
        return str.equals(uri.getScheme()) && str2.equals(uri.getAuthority());
    }
}
