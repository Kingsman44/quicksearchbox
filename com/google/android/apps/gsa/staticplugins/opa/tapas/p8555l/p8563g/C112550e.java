package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79932ag;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79937al;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.e */
/* compiled from: PG */
public final /* synthetic */ class C112550e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79937al f312140a;

    public /* synthetic */ C112550e(C79937al alVar) {
        this.f312140a = alVar;
    }

    public final void accept(Object obj) {
        C79937al alVar = this.f312140a;
        C79932ag agVar = (C79932ag) obj;
        alVar.copyOnWrite();
        C79938am amVar = (C79938am) alVar.instance;
        C79938am amVar2 = C79938am.f219175F;
        agVar.getClass();
        amVar.f219201t = agVar;
        amVar.f219182a |= C89885b.HTTP_VALUE;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
