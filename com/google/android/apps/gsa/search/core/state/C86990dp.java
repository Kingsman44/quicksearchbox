package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6872d.C86938be;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.apps.gsa.search.core.state.p6872d.C86962n;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.dp */
/* compiled from: PG */
public final class C86990dp implements C87143ik {

    /* renamed from: a */
    private final C86938be f234964a;

    /* renamed from: b */
    private final C86842bk f234965b;

    /* renamed from: c */
    private final C86842bk f234966c;

    public C86990dp(C86938be beVar, C68214a aVar, C68214a aVar2) {
        this.f234964a = beVar;
        this.f234965b = new C86842bk(aVar);
        this.f234966c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234964a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f234965b.mo80534b(icVar);
        this.f234966c.mo80534b(icVar);
        C86842bk bkVar = this.f234965b;
        boolean z = bkVar.f234552a;
        if (z || this.f234966c.f234552a) {
            C86938be beVar = this.f234964a;
            C86842bk bkVar2 = this.f234966c;
            boolean R = z ? beVar.mo80590R((C86962n) bkVar.mo80533a()) : false;
            if (bkVar2.f234552a) {
                C86948bo boVar = (C86948bo) bkVar2.mo80533a();
                R |= beVar.f234791e.mo85049c(4, 0);
            }
            if (R) {
                this.f234964a.mo80591ar();
            }
        }
    }
}
