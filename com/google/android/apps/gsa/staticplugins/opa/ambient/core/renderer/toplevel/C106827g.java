package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.g */
/* compiled from: PG */
public final /* synthetic */ class C106827g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297698a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f297699b;

    public /* synthetic */ C106827g(TopLevelRendererHelper topLevelRendererHelper, C58485gu guVar) {
        this.f297698a = topLevelRendererHelper;
        this.f297699b = guVar;
    }

    public final Object call() {
        TopLevelRendererHelper topLevelRendererHelper = this.f297698a;
        C58485gu guVar = this.f297699b;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(new C106837q(topLevelRendererHelper)).filter(C106838r.f297713a).map(C106839s.f297714a).peek(new C106840t(topLevelRendererHelper)).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56224b()).mo56372aa(23317)).mo56393w("returning %d child use cases from %d futures", guVar2.size(), guVar.size());
        return guVar2;
    }
}
