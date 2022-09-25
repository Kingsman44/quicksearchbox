package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10012f;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106567a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.search.assistant.platform.pcp.api.C123606v;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.f.e */
/* compiled from: PG */
public final class C131734e implements C123606v {

    /* renamed from: a */
    private final C58974d f359873a;

    /* renamed from: b */
    private final boolean f359874b;

    /* renamed from: c */
    private final C131251t f359875c;

    /* renamed from: d */
    private final ExecutorService f359876d;

    /* renamed from: e */
    private final C32240a f359877e;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.f.e$a */
    /* compiled from: PG */
    public interface C131735a {
        /* renamed from: aM */
        C131101a mo110285aM();
    }

    public C131734e(C130603a aVar, boolean z, C131251t tVar, C32240a aVar2, ExecutorService executorService) {
        this.f359873a = aVar.mo109740b(this);
        this.f359874b = z;
        this.f359875c = tVar;
        this.f359877e = aVar2;
        this.f359876d = executorService;
    }

    /* renamed from: a */
    public final C53306j mo28158a() {
        return C53306j.BLUECHIP_SMARTSPACE_TNG;
    }

    /* renamed from: b */
    public final void mo28159b() {
        if (!this.f359875c.mo110133h() || !this.f359874b) {
            ((C58970a) ((C58970a) this.f359873a.mo56224b()).mo56372aa(39383)).mo56386p("BC Smartspace data listener is not enabled on device");
            return;
        }
        C106567a aVar = (C106567a) C106570d.f297154c.createBuilder();
        aVar.copyOnWrite();
        C106570d dVar = (C106570d) aVar.instance;
        dVar.f297157b = 2;
        dVar.f297156a |= 1;
        C46459k.m82829b(C47633f.m84733g(this.f359877e.f86461a.mo104411a(C131735a.class)).mo51515h(C131732c.f359871a, this.f359876d).mo51516i(new C131733d(C131701c.m214153c((C106570d) aVar.build())), this.f359876d), "Error on notify AmbientAssistantOrchestrator.", new Object[0]);
    }
}
