package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.state.hn */
/* compiled from: PG */
public final /* synthetic */ class C87119hn implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ TtsState f235374a;

    /* renamed from: b */
    public final /* synthetic */ ClientConfig f235375b;

    /* renamed from: c */
    public final /* synthetic */ Query f235376c;

    public /* synthetic */ C87119hn(TtsState ttsState, ClientConfig clientConfig, Query query) {
        this.f235374a = ttsState;
        this.f235375b = clientConfig;
        this.f235376c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        TtsState ttsState = this.f235374a;
        Exception exc = (Exception) obj;
        ttsState.mo80405g(this.f235375b, this.f235376c, ttsState.f234421b.getString(R.string.action_fallback_long_query_eyes_free_tts), true);
    }
}
