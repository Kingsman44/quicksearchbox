package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ac */
/* compiled from: PG */
public final /* synthetic */ class C119583ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C119586af f333285a;

    public /* synthetic */ C119583ac(C119586af afVar) {
        this.f333285a = afVar;
    }

    public final Object call() {
        C119586af afVar = this.f333285a;
        synchronized (afVar.f333291d) {
            if (afVar.f333294g == null) {
                C59104x b = C119586af.f333288a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GrpcPSSDataSender");
                ((C59052c) ((C59052c) b).mo56372aa(34463)).mo56386p("bind to service");
                Intent intent = new Intent().setAction("com.google.android.apps.gsa.publicsearch.IPublicSearchService").setPackage("com.google.android.googlequicksearchbox");
                afVar.f333294g = new C119585ae(afVar);
                if (!afVar.f333289b.bindService(intent, afVar.f333294g, 1)) {
                    C59104x d = C119586af.f333288a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GrpcPSSDataSender");
                    ((C59052c) ((C59052c) d).mo56372aa(34464)).mo56386p("Failed to connect PSS");
                    afVar.f333294g = null;
                }
            }
        }
        return null;
    }
}
