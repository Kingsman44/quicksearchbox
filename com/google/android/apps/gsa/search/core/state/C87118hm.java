package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.search.core.state.hm */
/* compiled from: PG */
public final /* synthetic */ class C87118hm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ TtsState f235371a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfig f235372b;

    /* renamed from: c */
    public final /* synthetic */ Query f235373c;

    public /* synthetic */ C87118hm(TtsState ttsState, ClientConfig clientConfig, Query query) {
        this.f235371a = ttsState;
        this.f235372b = clientConfig;
        this.f235373c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        this.f235371a.mo80405g(this.f235372b, this.f235373c, (String) obj, true);
    }
}
