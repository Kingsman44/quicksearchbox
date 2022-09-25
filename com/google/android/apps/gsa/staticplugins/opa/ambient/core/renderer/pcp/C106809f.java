package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.f */
/* compiled from: PG */
public final /* synthetic */ class C106809f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f297661a;

    public /* synthetic */ C106809f(List list) {
        this.f297661a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f297661a;
        Collection.EL.stream((List) obj).forEach(new C106804a(list));
        return list;
    }
}
