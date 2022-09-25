package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ApplicationInfo;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.a */
/* compiled from: PG */
public final /* synthetic */ class C111567a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111583h f310288a;

    /* renamed from: b */
    public final /* synthetic */ String f310289b;

    public /* synthetic */ C111567a(C111583h hVar, String str) {
        this.f310288a = hVar;
        this.f310289b = str;
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
        C111583h hVar = this.f310288a;
        String str = this.f310289b;
        CharSequence applicationLabel = hVar.f310316d.getApplicationLabel((ApplicationInfo) obj);
        return applicationLabel != null && applicationLabel.toString().toLowerCase(Locale.getDefault()).equals(str.toLowerCase(Locale.getDefault()));
    }
}
