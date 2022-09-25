package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.t.h.bm */
/* compiled from: PG */
public final /* synthetic */ class C118420bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328667a;

    /* renamed from: b */
    public final /* synthetic */ List f328668b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f328669c;

    public /* synthetic */ C118420bm(C118426bs bsVar, List list, C53306j jVar) {
        this.f328667a = bsVar;
        this.f328668b = list;
        this.f328669c = jVar;
    }

    public final C60870cx apply(Object obj) {
        C118426bs bsVar = this.f328667a;
        List list = this.f328668b;
        C53306j jVar = this.f328669c;
        List list2 = (List) obj;
        ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6978)).mo56389s("#getOnDeviceMediaAppsForNewFetch() Final media apps %s", list2);
        list.addAll(list2);
        return C47633f.m84733g(C60856cj.m92896e((C58485gu) Collection.EL.stream(list2).map(new C118381aa(bsVar, jVar)).collect(C58370cn.f155946a)));
    }
}
