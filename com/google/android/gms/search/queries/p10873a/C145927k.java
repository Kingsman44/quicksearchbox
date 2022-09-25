package com.google.android.gms.search.queries.p10873a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: com.google.android.gms.search.queries.a.k */
/* compiled from: PG */
public final class C145927k extends C145917a {

    /* renamed from: a */
    final C145925i f394527a;

    /* renamed from: b */
    private final C143825n f394528b;

    /* renamed from: c */
    private final Class f394529c;

    public C145927k(C143825n nVar, Class cls, C145925i iVar) {
        this.f394528b = nVar;
        this.f394529c = cls;
        this.f394527a = iVar;
    }

    /* renamed from: g */
    private final void m237731g(Bundle bundle) {
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
            try {
                ((C145919c) this.f394527a.mo122241m()).mo122335f(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo122328a(AnnotateCall$Response annotateCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(annotateCall$Response));
        m237731g(annotateCall$Response.f394486c);
    }

    /* renamed from: b */
    public final void mo122329b(GetDocumentsCall$Response getDocumentsCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(getDocumentsCall$Response));
        m237731g(getDocumentsCall$Response.f394491c);
    }

    /* renamed from: c */
    public final void mo122330c(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(getPhraseAffinityCall$Response));
        m237731g(getPhraseAffinityCall$Response.f394497c);
    }

    /* renamed from: d */
    public final void mo122331d(GlobalQueryCall$Response globalQueryCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(globalQueryCall$Response));
        m237731g(globalQueryCall$Response.f394505c);
    }

    /* renamed from: e */
    public final void mo122332e(QueryCall$Response queryCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(queryCall$Response));
        m237731g(queryCall$Response.f394515c);
    }

    /* renamed from: f */
    public final void mo122333f(QuerySuggestCall$Response querySuggestCall$Response) {
        this.f394528b.mo117682i(this.f394529c.cast(querySuggestCall$Response));
        m237731g(querySuggestCall$Response.f394518c);
    }
}
