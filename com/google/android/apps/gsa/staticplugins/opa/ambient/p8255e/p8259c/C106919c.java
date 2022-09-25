package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.c */
/* compiled from: PG */
public final /* synthetic */ class C106919c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106959m f297838a;

    public /* synthetic */ C106919c(C106959m mVar) {
        this.f297838a = mVar;
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
        C106959m mVar = this.f297838a;
        try {
            return mVar.f297929j.getApplicationInfo(((C130701b) obj).mo109797h(), 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
