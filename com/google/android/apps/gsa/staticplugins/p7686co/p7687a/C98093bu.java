package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98323ae;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98325ag;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98327c;
import com.google.android.apps.p489g.C9136d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C98093bu implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273866a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f273867b;

    public /* synthetic */ C98093bu(C98102cc ccVar, ArrayList arrayList) {
        this.f273866a = ccVar;
        this.f273867b = arrayList;
    }

    public final C60870cx apply(Object obj) {
        C98102cc ccVar = this.f273866a;
        ArrayList<C9136d> arrayList = this.f273867b;
        C118826c cVar = (C118826c) obj;
        C98323ae aeVar = ccVar.f273904l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C9136d dVar : arrayList) {
            arrayList2.add(new C98327c(C98325ag.m162876a(dVar), dVar.toByteArray(), 5));
        }
        return aeVar.mo91059m(arrayList2);
    }
}
