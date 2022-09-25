package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.common.p4552o.p4553a.C59522cs;
import com.google.common.p4552o.p4553a.C59523ct;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.au */
/* compiled from: PG */
public final /* synthetic */ class C112683au implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59522cs f312325a;

    public /* synthetic */ C112683au(C59522cs csVar) {
        this.f312325a = csVar;
    }

    public final void accept(Object obj) {
        C59522cs csVar = this.f312325a;
        String str = (String) obj;
        csVar.copyOnWrite();
        C59523ct ctVar = (C59523ct) csVar.instance;
        C59523ct ctVar2 = C59523ct.f157929n;
        str.getClass();
        ctVar.f157931a |= 4;
        ctVar.f157934d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
