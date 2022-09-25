package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6600bm.C84904a;
import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.eo */
/* compiled from: PG */
public final class C116685eo extends C116780ib {

    /* renamed from: a */
    public long f323604a;

    /* renamed from: b */
    public boolean f323605b;

    /* renamed from: c */
    public boolean f323606c;

    /* renamed from: d */
    public final C68214a f323607d;

    /* renamed from: e */
    public final C85051a f323608e;

    /* renamed from: f */
    public final C86124t f323609f;

    /* renamed from: g */
    private final C84904a f323610g;

    public C116685eo(C68214a aVar, C84904a aVar2, C85051a aVar3, C86124t tVar, C68214a aVar4) {
        super(aVar, 175);
        this.f323610g = aVar2;
        this.f323608e = aVar3;
        this.f323609f = tVar;
        this.f323607d = aVar4;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[0];
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NowState");
        fVar.mo85279c("Is Foreground").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323606c)));
        fVar.mo85279c("Init UI Pending").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323605b)));
    }

    /* renamed from: ho */
    public final void mo80748ho() {
        if (this.f323605b) {
            this.f323605b = false;
            this.f323610g.mo78576a();
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        int i = C90755l.f253831a;
    }
}
