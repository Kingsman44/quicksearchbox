package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.t.h.bg */
/* compiled from: PG */
public final /* synthetic */ class C118414bg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328656a;

    /* renamed from: b */
    public final /* synthetic */ List f328657b;

    public /* synthetic */ C118414bg(C118426bs bsVar, List list) {
        this.f328656a = bsVar;
        this.f328657b = list;
    }

    public final Object apply(Object obj) {
        C118426bs bsVar = this.f328656a;
        List list = this.f328657b;
        List list2 = (List) obj;
        ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6987)).mo56389s("#getOnDeviceMediaAppsForNewFetch() Forced refresh, final media apps %s", list2);
        list.addAll(list2);
        if (list2 instanceof Collection) {
            return new LinkedHashSet(list2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C58557jl.m90136q(linkedHashSet, list2);
        return linkedHashSet;
    }
}
