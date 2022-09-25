package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ip */
/* compiled from: PG */
public final /* synthetic */ class C116794ip implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ TtsState f324028a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfig f324029b;

    /* renamed from: c */
    public final /* synthetic */ Query f324030c;

    public /* synthetic */ C116794ip(TtsState ttsState, ClientConfig clientConfig, Query query) {
        this.f324028a = ttsState;
        this.f324029b = clientConfig;
        this.f324030c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        this.f324028a.mo102754i(this.f324029b, this.f324030c, (String) obj, true);
    }
}
