package com.google.android.gms.search.queries.p10873a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.search.queries.a.h */
/* compiled from: PG */
public final class C145924h extends C145917a {

    /* renamed from: a */
    private final C145925i f394525a;

    /* renamed from: b */
    private final C146010af f394526b;

    public C145924h(C145925i iVar, C146010af afVar) {
        this.f394525a = iVar;
        this.f394526b = afVar;
    }

    /* renamed from: g */
    private final void m237718g(Bundle bundle) {
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
            try {
                ((C145919c) this.f394525a.mo122241m()).mo122335f(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo122328a(AnnotateCall$Response annotateCall$Response) {
        m237718g(annotateCall$Response.f394486c);
        C143811de.m233724a(annotateCall$Response.f394484a, annotateCall$Response.f394485b, this.f394526b);
    }

    /* renamed from: b */
    public final void mo122329b(GetDocumentsCall$Response getDocumentsCall$Response) {
        m237718g(getDocumentsCall$Response.f394491c);
        C143811de.m233724a(getDocumentsCall$Response.f394489a, getDocumentsCall$Response.f394490b, this.f394526b);
    }

    /* renamed from: c */
    public final void mo122330c(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        m237718g(getPhraseAffinityCall$Response.f394497c);
        C143811de.m233724a(getPhraseAffinityCall$Response.f394495a, getPhraseAffinityCall$Response.f394496b, this.f394526b);
    }

    /* renamed from: d */
    public final void mo122331d(GlobalQueryCall$Response globalQueryCall$Response) {
        m237718g(globalQueryCall$Response.f394505c);
        C143811de.m233724a(globalQueryCall$Response.f394503a, globalQueryCall$Response.f394504b, this.f394526b);
    }

    /* renamed from: e */
    public final void mo122332e(QueryCall$Response queryCall$Response) {
        m237718g(queryCall$Response.f394515c);
        C143811de.m233724a(queryCall$Response.f394513a, queryCall$Response.f394514b, this.f394526b);
    }

    /* renamed from: f */
    public final void mo122333f(QuerySuggestCall$Response querySuggestCall$Response) {
        m237718g(querySuggestCall$Response.f394518c);
        C143811de.m233724a(querySuggestCall$Response.f394516a, querySuggestCall$Response.f394517b, this.f394526b);
    }
}
