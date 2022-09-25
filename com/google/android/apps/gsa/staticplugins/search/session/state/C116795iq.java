package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.iq */
/* compiled from: PG */
public final /* synthetic */ class C116795iq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ TtsState f324031a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfig f324032b;

    /* renamed from: c */
    public final /* synthetic */ Query f324033c;

    public /* synthetic */ C116795iq(TtsState ttsState, ClientConfig clientConfig, Query query) {
        this.f324031a = ttsState;
        this.f324032b = clientConfig;
        this.f324033c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        TtsState ttsState = this.f324031a;
        ClientConfig clientConfig = this.f324032b;
        Query query = this.f324033c;
        Exception exc = (Exception) obj;
        C58976aa aaVar = C58975e.f156826a;
        ttsState.mo102754i(clientConfig, query, ttsState.f323219c.getString(R.string.action_fallback_long_query_eyes_free_tts), true);
    }
}
