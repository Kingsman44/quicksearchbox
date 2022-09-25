package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.global.C145905i;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.y */
/* compiled from: PG */
public final /* synthetic */ class C84458y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229854a;

    /* renamed from: b */
    public final /* synthetic */ List f229855b;

    /* renamed from: c */
    public final /* synthetic */ ConditionVariable f229856c;

    public /* synthetic */ C84458y(C84425ag agVar, List list, ConditionVariable conditionVariable) {
        this.f229854a = agVar;
        this.f229855b = list;
        this.f229856c = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229854a;
        List list = this.f229855b;
        ConditionVariable conditionVariable = this.f229856c;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        int[] iArr = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            try {
                C143851w wVar = acVar.f229707a.f229712c;
                GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response = (GetPendingExperimentIdsCall$Response) wVar.mo119159d(new C145905i(new GetPendingExperimentIdsCall$Request(), wVar)).mo117317b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (getPendingExperimentIdsCall$Response.f394462a.mo119097c()) {
                    iArr = getPendingExperimentIdsCall$Response.f394463b;
                }
            } catch (RuntimeException e) {
                C59104x c = C84425ag.f229718a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9295)).mo56386p("Exception when calling getPendingExperimentIds");
            }
        }
        int i = 0;
        while (iArr != null && i < iArr.length) {
            list.add(Integer.valueOf(iArr[i]));
            i++;
        }
        conditionVariable.open();
    }
}
