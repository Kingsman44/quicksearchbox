package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.c.x.a.bb */
/* compiled from: PG */
final class C38191bb implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C38192bc f101208a;

    /* renamed from: b */
    private final C58833ax f101209b;

    /* renamed from: c */
    private final Runnable f101210c;

    public C38191bb(C38192bc bcVar, C58833ax axVar, Runnable runnable) {
        this.f101208a = bcVar;
        this.f101209b = axVar;
        this.f101210c = runnable;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        try {
            C38192bc bcVar = this.f101208a;
            C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
            asVar.copyOnWrite();
            C38237at atVar = (C38237at) asVar.instance;
            lVar.getClass();
            atVar.f101336b = lVar;
            atVar.f101335a = 6;
            bcVar.mo41321h((C38237at) asVar.build());
            if (lVar.f100343b == 2) {
                this.f101208a.mo41314a(this.f101209b);
            }
        } catch (C70761fa e) {
            C59104x d = C38192bc.f101211a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSender");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(53052)).mo56389s("#audio# onNext failed: StatusRuntimeException %s.", e.f188571a.getCode());
            if (!e.f188571a.getCode().equals(Status.Code.CANCELLED)) {
                ((C38183au) this.f101210c).f101199a.mo41316c();
                this.f101208a.mo41319f(e);
            }
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f101208a.f101216f;
    }
}
