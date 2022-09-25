package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.hotword.C92343a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hz */
/* compiled from: PG */
public final class C116777hz extends C116780ib {

    /* renamed from: a */
    public final C85232a f323972a;

    /* renamed from: b */
    public final boolean f323973b;

    /* renamed from: c */
    public final BitFlags f323974c = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: d */
    public long f323975d;

    public C116777hz(C68214a aVar, C92343a aVar2, C85232a aVar3) {
        super(aVar, 185);
        this.f323973b = aVar2 == C92343a.AVAILABLE;
        this.f323972a = aVar3;
    }

    /* renamed from: e */
    public final boolean mo102937e() {
        return this.f323974c.mo85052e(5);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ServiceSessionState");
        fVar.mo85279c("mCanSafelyPerformHeadlessHotword").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323973b)));
        fVar.mo85279c("Flags").mo85276a(C90752i.m148229c(this.f323974c.mo85048b()));
    }

    public final String toString() {
        String b = this.f323974c.mo85048b();
        return "ServiceSessionState(Flags=" + b + ")";
    }
}
