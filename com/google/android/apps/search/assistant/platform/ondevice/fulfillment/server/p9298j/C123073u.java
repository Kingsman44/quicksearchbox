package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.u */
/* compiled from: PG */
public final /* synthetic */ class C123073u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ PackageManager f340634a;

    public /* synthetic */ C123073u(PackageManager packageManager) {
        this.f340634a = packageManager;
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
        PackageManager packageManager = this.f340634a;
        C59071e eVar = C123078z.f340639a;
        return packageManager.getLaunchIntentForPackage(((PackageInfo) obj).packageName) != null;
    }
}
