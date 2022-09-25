package com.google.android.apps.gsa.search.core.p6519al.p6711dl.p6712a;

import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.dl.a.e */
/* compiled from: PG */
public final class C85391e implements C85392b {

    /* renamed from: a */
    private final C68214a f231190a;

    public C85391e(C68214a aVar) {
        this.f231190a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78912a(Query query) {
        C85387a aVar = new C85387a(query);
        ((C86727g) this.f231190a.mo27525b()).mo80313b(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final void mo78913b() {
        ((C86727g) this.f231190a.mo27525b()).mo80313b(new C85388b());
    }

    /* renamed from: c */
    public final void mo78914c() {
        ((C86727g) this.f231190a.mo27525b()).mo80313b(new C85390d());
    }

    /* renamed from: d */
    public final void mo78915d(int i, String str, Query query, C90606n nVar, TtsRequest ttsRequest, boolean z, boolean z2, String str2, C85386a aVar) {
        ((C86727g) this.f231190a.mo27525b()).mo80313b(new C85389c(i, str, query, nVar, ttsRequest, z, z2, str2, aVar));
    }
}
