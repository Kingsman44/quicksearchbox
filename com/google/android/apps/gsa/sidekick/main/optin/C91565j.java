package com.google.android.apps.gsa.sidekick.main.optin;

import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23957g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.j */
/* compiled from: PG */
public final /* synthetic */ class C91565j implements C23957g {

    /* renamed from: a */
    public final /* synthetic */ C89012aj f255406a;

    public /* synthetic */ C91565j(C89012aj ajVar) {
        this.f255406a = ajVar;
    }

    /* renamed from: a */
    public final C70286co mo29368a(String str, int i) {
        try {
            return (C70286co) C90877ak.m148472f(this.f255406a.mo27501m(str, i, (C70334de) null, (String) null, 77));
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = C91566k.f255407a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConsentFlowFrag");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11723)).mo56386p("Failed to create gRPC channel.");
            return null;
        }
    }
}
