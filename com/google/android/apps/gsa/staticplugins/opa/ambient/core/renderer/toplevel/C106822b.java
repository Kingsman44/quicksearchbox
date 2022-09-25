package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.b */
/* compiled from: PG */
public final /* synthetic */ class C106822b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297693a;

    public /* synthetic */ C106822b(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297693a = topLevelRendererHelper;
    }

    public final Object apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297693a;
        return (List) Collection.EL.stream((C58485gu) obj).peek(new C106842v(topLevelRendererHelper)).filter(new C106843w(topLevelRendererHelper)).map(new C106844x(topLevelRendererHelper)).collect(Collectors.toList());
    }
}
