package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.a */
/* compiled from: PG */
public final /* synthetic */ class C117867a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117886ai f327124a;

    /* renamed from: b */
    public final /* synthetic */ Query f327125b;

    /* renamed from: c */
    public final /* synthetic */ TtsRequest f327126c;

    public /* synthetic */ C117867a(C117886ai aiVar, Query query, TtsRequest ttsRequest) {
        this.f327124a = aiVar;
        this.f327125b = query;
        this.f327126c = ttsRequest;
    }

    public final C60870cx apply(Object obj) {
        C117886ai aiVar = this.f327124a;
        Query query = this.f327125b;
        TtsRequest ttsRequest = this.f327126c;
        if (((Boolean) obj).booleanValue()) {
            return aiVar.f327194h.mo77888b(query, ttsRequest, C118071q.f327691a);
        }
        return aiVar.f327194h.mo77887a(query, ttsRequest, C118072r.f327692a);
    }
}
