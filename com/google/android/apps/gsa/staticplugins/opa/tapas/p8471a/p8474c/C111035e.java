package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.assistant.p3781ad.p3789d.C48582b;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C111035e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111039i f309234a;

    /* renamed from: b */
    public final /* synthetic */ C48582b f309235b;

    public /* synthetic */ C111035e(C111039i iVar, C48582b bVar) {
        this.f309234a = iVar;
        this.f309235b = bVar;
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
        return this.f309234a.f309240a.containsKey(new C111031a((String) ((Map.Entry) obj).getValue(), this.f309235b));
    }
}
