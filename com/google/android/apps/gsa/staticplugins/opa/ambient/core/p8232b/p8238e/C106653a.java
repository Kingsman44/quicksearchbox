package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106723c;
import com.google.assistant.p3860as.C49742ae;
import com.google.assistant.p3860as.C49752ao;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.a */
/* compiled from: PG */
public final /* synthetic */ class C106653a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106653a f297313a = new C106653a();

    private /* synthetic */ C106653a() {
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
        C49742ae aeVar = (C49742ae) ((C106723c) obj).mo95620b();
        C62940bt r0 = C62942bv.checkIsLite(C49752ao.f128476d);
        aeVar.mo58887l(r0);
        return aeVar.f169962ag.mo58857o(r0.f169971d);
    }
}
