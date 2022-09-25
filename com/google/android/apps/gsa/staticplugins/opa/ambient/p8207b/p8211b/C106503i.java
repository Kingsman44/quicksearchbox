package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106523c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C106503i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106546e f297020a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f297021b;

    public /* synthetic */ C106503i(C106546e eVar, MessageLite messageLite) {
        this.f297020a = eVar;
        this.f297021b = messageLite;
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
        C106546e eVar = this.f297020a;
        MessageLite messageLite = this.f297021b;
        C106523c cVar = (C106523c) obj;
        if (!cVar.f297056a.mo95556a().equals(eVar.mo95556a()) || !cVar.f297056a.mo95559d().isInstance(messageLite)) {
            return false;
        }
        return ((Boolean) cVar.f297057b.apply((MessageLite) cVar.f297056a.mo95559d().cast(messageLite))).booleanValue();
    }
}
