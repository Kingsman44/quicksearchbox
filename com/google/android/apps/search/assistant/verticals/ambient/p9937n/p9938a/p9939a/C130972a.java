package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.p9939a;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130972a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130984m f358339a;

    public /* synthetic */ C130972a(C130984m mVar) {
        this.f358339a = mVar;
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
        C130984m mVar = this.f358339a;
        try {
            return mVar.f358372p.getApplicationInfo(((C130701b) obj).mo109797h(), 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
