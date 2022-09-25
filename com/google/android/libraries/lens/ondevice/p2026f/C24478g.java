package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.ondevice.f.g */
/* compiled from: PG */
public final /* synthetic */ class C24478g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C24803n f66994a;

    public /* synthetic */ C24478g(C24803n nVar) {
        this.f66994a = nVar;
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
        return this.f66994a.equals(C24491t.m45561b(new ArrayList((Collection) ((Map.Entry) obj).getValue())));
    }
}
