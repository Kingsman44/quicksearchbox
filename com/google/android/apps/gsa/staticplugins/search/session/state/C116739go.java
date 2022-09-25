package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.go */
/* compiled from: PG */
public final class C116739go implements C87143ik {

    /* renamed from: a */
    private final C116738gn f323803a;

    /* renamed from: b */
    private final C68214a f323804b;

    public C116739go(C116738gn gnVar, C68214a aVar) {
        this.f323803a = gnVar;
        this.f323804b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323803a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116735gk) this.f323804b.mo27525b()).f235452J)) {
            C116738gn gnVar = this.f323803a;
            Query query = ((C116735gk) this.f323804b.mo27525b()).f323784p;
            if (query != null && query.mo84391cX() && !query.mo84338bW() && !TextUtils.isEmpty(query.f252770i)) {
                C58833ax axVar = gnVar.f323802b;
                if (!axVar.mo56113h() || !query.f252770i.equals(((Query) axVar.mo56107c()).f252770i) || !query.mo84346be().equals(((Query) axVar.mo56107c()).mo84346be())) {
                    gnVar.f323802b = C58833ax.m90834k(query);
                    gnVar.f323801a.mo78700d(gnVar.f323802b);
                }
            }
        }
    }
}
