package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2982x.C38234aq;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.c.x.a.ac */
/* compiled from: PG */
final class C38165ac implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C38166ad f101125a;

    /* renamed from: b */
    private final C58833ax f101126b;

    /* renamed from: c */
    private final Runnable f101127c;

    public C38165ac(C38166ad adVar, C58833ax axVar, Runnable runnable) {
        this.f101125a = adVar;
        this.f101126b = axVar;
        this.f101127c = runnable;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        try {
            C38166ad adVar = this.f101125a;
            C38234aq aqVar = (C38234aq) C38235ar.f101329c.createBuilder();
            aqVar.copyOnWrite();
            C38235ar arVar = (C38235ar) aqVar.instance;
            lVar.getClass();
            arVar.f101332b = lVar;
            arVar.f101331a = 6;
            adVar.mo41302h((C38235ar) aqVar.build());
            if (lVar.f100343b == 2) {
                this.f101125a.mo41295a(this.f101126b);
            }
        } catch (C70761fa e) {
            C59104x d = C38166ad.f101128a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(53022)).mo56389s("#audio# onNext failed: StatusRuntimeException %s.", e.f188571a.getCode());
            if (!e.f188571a.getCode().equals(Status.Code.CANCELLED)) {
                ((C38213v) this.f101127c).f101289a.mo41297c();
                this.f101125a.mo41299e(e);
            }
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f101125a.f101132e;
    }
}
