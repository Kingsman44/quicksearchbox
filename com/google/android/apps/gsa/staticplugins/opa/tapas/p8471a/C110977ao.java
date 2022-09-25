package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.common.p4522b.C58490gz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C110977ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f309154a;

    /* renamed from: b */
    public final /* synthetic */ String f309155b;

    /* renamed from: c */
    public final /* synthetic */ C113502n f309156c;

    public /* synthetic */ C110977ao(C58490gz gzVar, String str, C113502n nVar) {
        this.f309154a = gzVar;
        this.f309155b = str;
        this.f309156c = nVar;
    }

    public final void accept(Object obj) {
        C58490gz gzVar = this.f309154a;
        String str = this.f309155b;
        C113502n nVar = this.f309156c;
        C112142i iVar = C112142i.ACTION_FULFILLMENT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(String.format("package: %s intent: %s params: %s", new Object[]{str, (String) obj, nVar.mo99956o()}), 1.0f);
        gzVar.mo55429h(iVar, (C112144k) hVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
