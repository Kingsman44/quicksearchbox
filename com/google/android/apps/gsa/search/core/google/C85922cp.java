package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.common.base.C58890d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.google.cp */
/* compiled from: PG */
public final /* synthetic */ class C85922cp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Uri f232305a;

    public /* synthetic */ C85922cp(Uri uri) {
        this.f232305a = uri;
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
        Uri uri = this.f232305a;
        String[] split = ((String) obj).split("/", -1);
        if (uri.getPathSegments().size() < split.length) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!C58890d.m90990e(uri.getPathSegments().get(i), split[i])) {
                return false;
            }
        }
        return true;
    }
}
