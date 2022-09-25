package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.hotword.C92343a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hb */
/* compiled from: PG */
public final class C87107hb extends C86898ct {

    /* renamed from: a */
    public final C85232a f235349a;

    /* renamed from: b */
    public final boolean f235350b;

    /* renamed from: c */
    public final BitFlags f235351c = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: d */
    public long f235352d;

    public C87107hb(C68214a aVar, C92343a aVar2, C85232a aVar3) {
        super(aVar, 78);
        this.f235350b = aVar2 == C92343a.AVAILABLE;
        this.f235349a = aVar3;
    }

    /* renamed from: a */
    public final boolean mo80739a() {
        return this.f235351c.mo85052e(5);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ServiceSessionState");
        fVar.mo85279c("mCanSafelyPerformHeadlessHotword").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235350b)));
        fVar.mo85279c("Flags").mo85276a(C90752i.m148229c(this.f235351c.mo85048b()));
    }

    public final String toString() {
        String b = this.f235351c.mo85048b();
        return "ServiceSessionState(Flags=" + b + ")";
    }
}
