package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.libraries.gsa.p1875j.C22830a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.e */
/* compiled from: PG */
public final /* synthetic */ class C116049e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321795a;

    /* renamed from: b */
    public final /* synthetic */ C22831b f321796b;

    /* renamed from: c */
    public final /* synthetic */ String f321797c;

    public /* synthetic */ C116049e(C116070z zVar, C22831b bVar, String str) {
        this.f321795a = zVar;
        this.f321796b = bVar;
        this.f321797c = str;
    }

    public final Object apply(Object obj) {
        C116070z zVar = this.f321795a;
        C22831b bVar = this.f321796b;
        String str = this.f321797c;
        C22831b bVar2 = (C22831b) obj;
        C58976aa aaVar = C58975e.f156826a;
        bVar2.f62862a.size();
        if (bVar2 == null || bVar2.f62862a.size() <= 0) {
            return bVar;
        }
        C62971cq cqVar = bVar.f62862a;
        C62971cq cqVar2 = bVar2.f62862a;
        cqVar.size();
        cqVar2.size();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(cqVar);
        arrayList.addAll(cqVar2);
        C22830a aVar = (C22830a) C22831b.f62860b.createBuilder();
        aVar.mo28194a(zVar.mo102448r(arrayList));
        C22831b bVar3 = (C22831b) aVar.build();
        zVar.f321843d.mo102430c(bVar3, str);
        return bVar3;
    }
}
