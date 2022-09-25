package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a.C111914h;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C111940ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f310979a;

    /* renamed from: b */
    public final /* synthetic */ Duration f310980b;

    public /* synthetic */ C111940ah(String str, Duration duration) {
        this.f310979a = str;
        this.f310980b = duration;
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
        String str = this.f310979a;
        Duration duration = this.f310980b;
        C111914h hVar = (C111914h) obj;
        C59071e eVar = C111943ak.f310985a;
        return hVar.mo99286d().equals(str) && duration.compareTo(hVar.mo99284b()) < 0;
    }
}
