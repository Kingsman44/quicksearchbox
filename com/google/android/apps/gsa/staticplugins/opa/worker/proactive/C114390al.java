package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.al */
/* compiled from: PG */
public final /* synthetic */ class C114390al implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C114396ar f317187a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f317188b;

    /* renamed from: c */
    public final /* synthetic */ List f317189c;

    public /* synthetic */ C114390al(C114396ar arVar, ArrayList arrayList, List list) {
        this.f317187a = arVar;
        this.f317188b = arrayList;
        this.f317189c = list;
    }

    public final Object call() {
        C114396ar arVar = this.f317187a;
        ArrayList arrayList = this.f317188b;
        List list = this.f317189c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C58833ax axVar = (C58833ax) C60856cj.m92909r((C60870cx) arrayList.get(i));
            if (axVar.mo56113h()) {
                arVar.f317200b.mo101349c((String) axVar.mo56107c());
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        return C118826c.f331422a;
    }
}
