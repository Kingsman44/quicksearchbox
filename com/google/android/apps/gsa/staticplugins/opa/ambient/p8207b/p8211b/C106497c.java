package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106517d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.protobuf.MessageLite;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C106497c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106546e f297011a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f297012b;

    public /* synthetic */ C106497c(C106546e eVar, MessageLite messageLite) {
        this.f297011a = eVar;
        this.f297012b = messageLite;
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
        return Collection.EL.stream(((C106517d) obj).mo95549b()).anyMatch(new C106503i(this.f297011a, this.f297012b));
    }
}
