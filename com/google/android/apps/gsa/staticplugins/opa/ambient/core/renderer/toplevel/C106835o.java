package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.o */
/* compiled from: PG */
public final /* synthetic */ class C106835o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297710a;

    public /* synthetic */ C106835o(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297710a = topLevelRendererHelper;
    }

    public final Object apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297710a;
        List list = (List) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).flatMap(C106836p.f297711a).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56224b()).mo56372aa(23318)).mo56393w("got %d DetailsRenderers from %d Providers", guVar.size(), list.size());
        return guVar;
    }
}
