package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.i */
/* compiled from: PG */
public final class C91660i {

    /* renamed from: d */
    private static final long f255638d = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: a */
    public final C89859i f255639a;

    /* renamed from: b */
    final Map f255640b = new HashMap();

    /* renamed from: c */
    public final Map f255641c = new HashMap();

    /* renamed from: e */
    private final C22871g f255642e;

    /* renamed from: f */
    private final Map f255643f = new HashMap();

    public C91660i(C89859i iVar, C22871g gVar) {
        this.f255639a = iVar;
        this.f255642e = gVar;
    }

    /* renamed from: a */
    public final void mo86068a(C89851ag agVar, C89857g gVar, C89849ae aeVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (((Integer) Map.EL.getOrDefault(this.f255643f, agVar, 0)).intValue() != 1) {
            this.f255640b.put(agVar, this.f255642e.mo28208h("AppFlowTimeoutTask", f255638d, new C91659h(this, agVar)));
            this.f255643f.put(agVar, 1);
            this.f255641c.put(agVar, aeVar);
            this.f255639a.mo74236a(gVar);
        }
    }

    /* renamed from: b */
    public final void mo86069b(C89851ag agVar, C89849ae aeVar) {
        if (((Integer) Map.EL.getOrDefault(this.f255643f, agVar, 0)).intValue() == 1) {
            this.f255643f.put(agVar, 2);
            C58976aa aaVar = C58975e.f156826a;
            C89859i iVar = this.f255639a;
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            iVar.mo74236a(fVar.mo83699a());
            if (this.f255640b.containsKey(agVar)) {
                ((C60870cx) this.f255640b.get(agVar)).cancel(true);
                this.f255640b.remove(agVar);
            }
            this.f255641c.remove(agVar);
        }
    }
}
