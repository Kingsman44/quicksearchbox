package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106562i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e.C106547a;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.j.f */
/* compiled from: PG */
public final class C106572f implements C106562i, C123598n {

    /* renamed from: a */
    private final C58974d f297158a;

    /* renamed from: b */
    private final C68214a f297159b;

    /* renamed from: c */
    private final C90021c f297160c;

    /* renamed from: d */
    private C106551f f297161d;

    public C106572f(C83564a aVar, C68214a aVar2, C90021c cVar) {
        this.f297158a = aVar.mo76900a("AA.Context");
        this.f297159b = aVar2;
        this.f297160c = cVar;
    }

    /* renamed from: a */
    public final C53306j mo22862a() {
        return C53306j.AMBIENT_ASSISTANT;
    }

    /* renamed from: b */
    public final C106546e mo95569b() {
        return C106546e.f297120c;
    }

    /* renamed from: c */
    public final C60870cx mo95570c(C106551f fVar) {
        if (!this.f297160c.mo79746e(C90017bw.f247904aS)) {
            return C118826c.f331423b;
        }
        this.f297161d = fVar;
        ((C118339a) this.f297159b.mo27525b()).mo90816f(this);
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo95571e() {
        if (this.f297161d != null) {
            ((C118339a) this.f297159b.mo27525b()).mo90817g(this);
            this.f297161d = null;
        }
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final /* synthetic */ Optional mo22863f() {
        return Optional.empty();
    }

    /* renamed from: g */
    public final void mo22864g() {
        C106551f fVar;
        ((C58970a) ((C58970a) this.f297158a.mo56225c()).mo56372aa(23125)).mo56386p("PCP update");
        if (this.f297160c.mo79746e(C90017bw.f247904aS) && (fVar = this.f297161d) != null) {
            C46459k.m82829b(((C106547a) fVar).f297123a.mo95579e(C106570d.f297154c), "Error calling trigger listener.", new Object[0]);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PcpTriggerSource");
        boolean z = this.f297161d != null;
        fVar.mo85292s(C90752i.m148229c("hasListener? " + z));
    }
}
