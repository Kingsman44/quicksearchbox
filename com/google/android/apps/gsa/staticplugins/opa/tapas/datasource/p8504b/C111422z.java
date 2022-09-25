package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.base.C58881cr;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.z */
/* compiled from: PG */
public final /* synthetic */ class C111422z implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111396ae f309993a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309994b;

    public /* synthetic */ C111422z(C111396ae aeVar, C113405ep epVar) {
        this.f309993a = aeVar;
        this.f309994b = epVar;
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
        Iterable<String> iterable;
        C111396ae aeVar = this.f309993a;
        String lowerCase = this.f309994b.mo100033p().toLowerCase(Locale.getDefault());
        String lowerCase2 = ((LauncherActivityInfoCompat) obj).getLabel().toString().toLowerCase(Locale.getDefault());
        C58881cr crVar = aeVar.f309948e;
        if (crVar == null || (iterable = (Iterable) ((Map) crVar.mo6453a()).get(lowerCase2)) == null) {
            iterable = C111396ae.f309944a.mo56153g(lowerCase2);
        }
        for (String contains : iterable) {
            if (contains.contains(lowerCase)) {
                return true;
            }
        }
        return false;
    }
}
