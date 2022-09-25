package com.google.android.apps.gsa.staticplugins.opa.p8181ae;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23957g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ae.c */
/* compiled from: PG */
public final /* synthetic */ class C106113c implements C23957g {

    /* renamed from: a */
    public final /* synthetic */ C106114d f296122a;

    public /* synthetic */ C106113c(C106114d dVar) {
        this.f296122a = dVar;
    }

    /* renamed from: a */
    public final C70286co mo29368a(String str, int i) {
        C106114d dVar = this.f296122a;
        try {
            return (C70286co) C90877ak.m148472f(dVar.f296124b.mo27501m(str, i, (C70334de) null, (String) null, 77));
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = C106114d.f296123a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JitUdcConsentCtl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24703)).mo56386p("Failed to create gRPC channel.");
            dVar.f296125c = true;
            return null;
        }
    }
}
