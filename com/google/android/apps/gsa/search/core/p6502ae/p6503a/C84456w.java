package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.search.core.p6805i.C86111g;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.global.C145908l;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.w */
/* compiled from: PG */
public final /* synthetic */ class C84456w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229846a;

    /* renamed from: b */
    public final /* synthetic */ C86111g f229847b;

    /* renamed from: c */
    public final /* synthetic */ ConditionVariable f229848c;

    public /* synthetic */ C84456w(C84425ag agVar, C86111g gVar, ConditionVariable conditionVariable) {
        this.f229846a = agVar;
        this.f229847b = gVar;
        this.f229848c = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229846a;
        C86111g gVar = this.f229847b;
        ConditionVariable conditionVariable = this.f229848c;
        C84421ac acVar = agVar.f229720c;
        byte[] byteArray = gVar.toByteArray();
        C58976aa aaVar = C58975e.f156826a;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            try {
                C143851w wVar = acVar.f229707a.f229712c;
                SetExperimentIdsCall$Request setExperimentIdsCall$Request = new SetExperimentIdsCall$Request();
                setExperimentIdsCall$Request.f394464a = byteArray;
                setExperimentIdsCall$Request.f394465b = false;
                ((SetExperimentIdsCall$Response) wVar.mo119159d(new C145908l(setExperimentIdsCall$Request, wVar)).mo117317b(C84425ag.f229719b, TimeUnit.MILLISECONDS)).f394466a.mo119097c();
            } catch (RuntimeException e) {
                C59104x c = C84425ag.f229718a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9293)).mo56386p("Exception when calling setExperimentIds");
            }
        }
        conditionVariable.open();
    }
}
