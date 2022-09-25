package com.google.android.apps.gsa.assistant.settings.features.p562ao;

import android.content.SharedPreferences;
import com.google.assistant.p3861at.C50277rc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ao.a */
/* compiled from: PG */
public final /* synthetic */ class C10177a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10180d f34586a;

    public /* synthetic */ C10177a(C10180d dVar) {
        this.f34586a = dVar;
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
        return !((SharedPreferences) this.f34586a.f34594a.f34596a.mo27525b()).getBoolean(C10181e.m25052a((C50277rc) obj), false);
    }
}
