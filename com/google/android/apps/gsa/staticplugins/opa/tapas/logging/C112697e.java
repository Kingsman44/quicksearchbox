package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.common.p4552o.p4553a.C59525cv;
import com.google.common.p4552o.p4553a.C59527cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.e */
/* compiled from: PG */
public final /* synthetic */ class C112697e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59525cv f312427a;

    public /* synthetic */ C112697e(C59525cv cvVar) {
        this.f312427a = cvVar;
    }

    public final void accept(Object obj) {
        C59525cv cvVar = this.f312427a;
        String str = (String) obj;
        cvVar.copyOnWrite();
        C59527cx cxVar = (C59527cx) cvVar.instance;
        C59527cx cxVar2 = C59527cx.f157947n;
        str.getClass();
        cxVar.f157949a |= 4096;
        cxVar.f157961m = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
