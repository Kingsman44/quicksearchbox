package com.google.android.apps.gsa.staticplugins.webview;

import android.app.ActivityManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bu */
/* compiled from: PG */
public final /* synthetic */ class C118158bu implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C118163bz f327951a;

    public /* synthetic */ C118158bu(C118163bz bzVar) {
        this.f327951a = bzVar;
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
        return ((ActivityManager.RunningAppProcessInfo) obj).pid == this.f327951a.f327959d;
    }
}
