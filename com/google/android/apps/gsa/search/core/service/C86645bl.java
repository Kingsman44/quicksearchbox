package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.state.C87111hf;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.service.bl */
/* compiled from: PG */
public final class C86645bl implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C86647bn f234078a;

    /* renamed from: b */
    private final int f234079b;

    public C86645bl(C86647bn bnVar, int i) {
        this.f234078a = bnVar;
        this.f234079b = i;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        if (((C86948bo) this.f234078a.f234086e.mo27525b()).mo80604x()) {
            this.f234078a.mo80261a();
        } else if (this.f234078a.f234088g == this.f234079b) {
            HashSet hashSet = new HashSet();
            for (C87111hf a : (Set) this.f234078a.f234090i.mo27525b()) {
                hashSet.add(a.mo70822a());
            }
            C90875ai.m148465b(C86643bj.f234076a, C60856cj.m92896e(hashSet), (C22871g) this.f234078a.f234087f.mo27525b(), "ServiceShutdownLikely listener callback").mo85223a(C86644bk.f234077a);
        }
    }
}
