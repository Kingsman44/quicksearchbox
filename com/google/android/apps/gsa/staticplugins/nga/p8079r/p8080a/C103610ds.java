package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81493k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66558ao;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.ds */
/* compiled from: PG */
final class C103610ds extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C58833ax f288630a;

    public C103610ds(C58833ax axVar) {
        this.f288630a = axVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C66558ao aoVar = (C66558ao) obj;
        C58976aa aaVar = C58975e.f156826a;
        try {
            ((C81493k) this.f288630a.mo56107c()).mo75109a(aoVar.toByteArray());
        } catch (RemoteException e) {
            C59104x d = C103611dt.f288631a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ResultsForwardingPM");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21583)).mo56386p("Unable to send on-device arbitration response, NGA died?");
        }
    }
}
