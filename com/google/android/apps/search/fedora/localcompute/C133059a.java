package com.google.android.apps.search.fedora.localcompute;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144829p;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.fedora.localcompute.a */
/* compiled from: PG */
public final /* synthetic */ class C133059a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f362798a;

    /* renamed from: b */
    public final /* synthetic */ C144829p f362799b;

    public /* synthetic */ C133059a(String str, C144829p pVar) {
        this.f362798a = str;
        this.f362799b = pVar;
    }

    public final Object apply(Object obj) {
        String str = this.f362798a;
        C144829p pVar = this.f362799b;
        C19411o oVar = (C19411o) obj;
        if (!oVar.mo24556b()) {
            C59104x c = FedoraLocalComputeResultHandlingService.f362794a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
            ((C59052c) ((C59052c) c).mo56372aa(39848)).mo56389s("Result handler failed to process successfully : %s", str);
            pVar.mo120242a(Status.f389617c);
            return null;
        } else if (oVar.mo24555a()) {
            C59104x b = FedoraLocalComputeResultHandlingService.f362794a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
            ((C59052c) ((C59052c) b).mo56372aa(39847)).mo56389s("Local trainer %s needs resumption.", str);
            pVar.mo120242a(new Status(1, 25002, (String) null, (PendingIntent) null, (ConnectionResult) null));
            return null;
        } else {
            C59104x b2 = FedoraLocalComputeResultHandlingService.f362794a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
            ((C59052c) ((C59052c) b2).mo56372aa(39846)).mo56389s("Successfully processed the current run of %s local trainer.", str);
            pVar.mo120242a(Status.f389615a);
            return null;
        }
    }
}
