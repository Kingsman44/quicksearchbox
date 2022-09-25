package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7704gw;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C98070ay implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273837a;

    public /* synthetic */ C98070ay(C98102cc ccVar) {
        this.f273837a = ccVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx i;
        C98102cc ccVar = this.f273837a;
        if (((Boolean) obj).booleanValue()) {
            synchronized (ccVar.f273894b) {
                List list = ccVar.f273911s;
                i = C60856cj.m92900i((C7704gw[]) list.toArray(new C7704gw[list.size()]));
            }
            return i;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(new C7704gw[0]);
    }
}
