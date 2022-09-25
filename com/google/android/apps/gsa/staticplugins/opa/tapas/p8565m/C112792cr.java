package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cr */
/* compiled from: PG */
public final /* synthetic */ class C112792cr implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59568x f312615a;

    public /* synthetic */ C112792cr(C59568x xVar) {
        this.f312615a = xVar;
    }

    public final void accept(Object obj) {
        C59568x xVar = this.f312615a;
        C59450aa aaVar = (C59450aa) obj;
        xVar.copyOnWrite();
        C59569y yVar = (C59569y) xVar.instance;
        C59569y yVar2 = C59569y.f158066g;
        aaVar.getClass();
        yVar.f158072e = aaVar;
        yVar.f158068a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
