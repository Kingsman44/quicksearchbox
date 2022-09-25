package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.j */
/* compiled from: PG */
public final /* synthetic */ class C106830j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297702a;

    public /* synthetic */ C106830j(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297702a = topLevelRendererHelper;
    }

    public final Object apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297702a;
        List list = (List) Collection.EL.stream((C58485gu) obj).filter(C106828h.f297700a).map(C106829i.f297701a).collect(Collectors.toList());
        ((C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56224b()).mo56372aa(23322)).mo56389s("pcp renderer list %s", list);
        return list;
    }
}
