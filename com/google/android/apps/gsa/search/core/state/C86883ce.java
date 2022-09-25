package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.p6519al.p6701dg.C85360a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ce */
/* compiled from: PG */
public final class C86883ce extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234624a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.ce");

    /* renamed from: b */
    public final BitFlags f234625b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public final C84617a f234626c;

    /* renamed from: d */
    public final C86124t f234627d;

    /* renamed from: e */
    public final C85360a f234628e;

    /* renamed from: f */
    public long f234629f;

    /* renamed from: g */
    public Query f234630g = Query.f252741b;

    /* renamed from: h */
    public Query f234631h = Query.f252741b;

    /* renamed from: i */
    public boolean f234632i;

    /* renamed from: j */
    public boolean f234633j;

    /* renamed from: k */
    public boolean f234634k;

    /* renamed from: l */
    public boolean f234635l;

    public C86883ce(C68214a aVar, C84617a aVar2, C86124t tVar, C85360a aVar3) {
        super(aVar, 65);
        this.f234626c = aVar2;
        this.f234627d = tVar;
        this.f234628e = aVar3;
    }

    /* renamed from: a */
    public final void mo80544a(boolean z) {
        if (this.f234627d.mo79746e(C90082eg.f250067dx)) {
            C59104x b = f234624a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConversationState");
            ((C59052c) ((C59052c) b).mo56372aa(8682)).mo56389s("handleAssistantConversationStateChange(): inAssistantConversation: %b", Boolean.valueOf(z));
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
        if (z) {
            this.f234626c.mo78381d();
            if (!this.f234635l && this.f234627d.mo79746e(C90063do.f249432dS)) {
                this.f234628e.mo78895h(false);
                return;
            }
            return;
        }
        this.f234626c.mo78379b();
    }

    /* renamed from: b */
    public final void mo80545b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f234632i = false;
        this.f234633j = false;
        mo80544a(false);
    }

    /* renamed from: e */
    public final boolean mo80546e() {
        boolean e = this.f234625b.mo85052e(7);
        C58976aa aaVar = C58975e.f156826a;
        return e;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f234625b.mo85048b()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        this.f234634k = false;
        if (this.f234627d.mo79746e(C90086ek.f250512j)) {
            this.f234625b.mo85054g();
        }
    }

    public final String toString() {
        String b = this.f234625b.mo85048b();
        return "ConversationState(flags=" + b + ")";
    }
}
