package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.et */
/* compiled from: PG */
public final /* synthetic */ class C104028et implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C104032ex f289472a;

    public /* synthetic */ C104028et(C104032ex exVar) {
        this.f289472a = exVar;
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
        C104032ex exVar = this.f289472a;
        Map.Entry entry = (Map.Entry) obj;
        if (!Locale.forLanguageTag(((C8476as) entry.getValue()).f29417b).equals(Locale.US) || ((long) ((C8476as) entry.getValue()).f29419d) >= exVar.f289478d.mo79743a(C90126fx.f251748of)) {
            return true;
        }
        return false;
    }
}
