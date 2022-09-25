package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17037ad;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17158u;
import com.google.android.libraries.p590as.p593b.p596b.p607i.C10934m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bv */
/* compiled from: PG */
public final /* synthetic */ class C122263bv implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122264bw f339031a;

    /* renamed from: b */
    public final /* synthetic */ C17036ac f339032b;

    public /* synthetic */ C122263bv(C122264bw bwVar, C17036ac acVar) {
        this.f339031a = bwVar;
        this.f339032b = acVar;
    }

    public final Object call() {
        C122264bw bwVar = this.f339031a;
        C17036ac acVar = this.f339032b;
        Optional a = C17158u.m34308a(acVar);
        if (!a.isEmpty()) {
            C62940bt r3 = C62942bv.checkIsLite(C17037ad.f49646a);
            acVar.mo58887l(r3);
            if (!acVar.f169962ag.mo58857o(r3.f169971d) || bwVar.f339034b.containsKey(a.get()) || C10934m.m25956d((String) a.get())) {
                return (String) a.get();
            }
            ((C58970a) ((C58970a) C122264bw.f339033a.mo56225c()).mo56372aa(34741)).mo56386p("An unregistered filegroup has been requested through the Apa Data Download gRPC. Please make sure that the ApaDataDownloadFileGroup is properly injected into the dagger set.");
            throw new C70761fa(Status.f186912j.withDescription("An unregistered filegroup has been requested through the APA Data Download gRPC."), (C70334de) null, true);
        }
        throw new C70761fa(Status.f186906d.withDescription("The file group name was missing in the gRPC request."), (C70334de) null, true);
    }
}
