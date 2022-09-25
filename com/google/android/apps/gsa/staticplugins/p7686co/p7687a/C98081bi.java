package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98323ae;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98325ag;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98327c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7704gw;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C98081bi implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273853a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f273854b;

    public /* synthetic */ C98081bi(C98102cc ccVar, ArrayList arrayList) {
        this.f273853a = ccVar;
        this.f273854b = arrayList;
    }

    public final C60870cx apply(Object obj) {
        C98102cc ccVar = this.f273853a;
        ArrayList<C7704gw> arrayList = this.f273854b;
        C118826c cVar = (C118826c) obj;
        C98323ae aeVar = ccVar.f273904l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C7704gw gwVar : arrayList) {
            arrayList2.add(new C98327c(C98325ag.m162877b(gwVar), gwVar.toByteArray(), 4));
        }
        return aeVar.mo91059m(arrayList2);
    }
}
