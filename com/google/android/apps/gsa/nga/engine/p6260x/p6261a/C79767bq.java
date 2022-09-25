package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.common.p4552o.C59992ip;
import com.google.common.p4552o.C59994ir;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bq */
/* compiled from: PG */
public final /* synthetic */ class C79767bq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79767bq f218698a = new C79767bq();

    private /* synthetic */ C79767bq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59994ir irVar;
        C82889ee eeVar = (C82889ee) obj;
        C82885ea eaVar = eeVar.f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 112) {
            irVar = (C59994ir) eaVar.f225980b;
        } else {
            irVar = C59994ir.f162142h;
        }
        C59992ip ipVar = (C59992ip) irVar.toBuilder();
        long j = eeVar.f226103h;
        ipVar.copyOnWrite();
        C59994ir irVar2 = (C59994ir) ipVar.instance;
        irVar2.f162144a |= 32;
        irVar2.f162150g = j;
        return (C59994ir) ipVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
