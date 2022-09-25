package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bj */
/* compiled from: PG */
public final class C116599bj extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323365a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.bj");

    /* renamed from: b */
    public final BitFlags f323366b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public final C84617a f323367c;

    /* renamed from: d */
    public long f323368d;

    /* renamed from: e */
    public Query f323369e = Query.f252741b;

    /* renamed from: f */
    public Query f323370f = Query.f252741b;

    /* renamed from: g */
    public boolean f323371g;

    public C116599bj(C68214a aVar, C84617a aVar2) {
        super(aVar, 170);
        this.f323367c = aVar2;
    }

    /* renamed from: e */
    public final boolean mo102793e() {
        boolean e = this.f323366b.mo85052e(3);
        C58976aa aaVar = C58975e.f156826a;
        return e;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323366b.mo85048b()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        this.f323371g = false;
    }

    public final String toString() {
        String b = this.f323366b.mo85048b();
        return "S_ConversationState(flags=" + b + ")";
    }
}
