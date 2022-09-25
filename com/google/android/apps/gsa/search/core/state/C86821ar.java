package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.ar */
/* compiled from: PG */
public final /* synthetic */ class C86821ar implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86825av f234500a;

    /* renamed from: b */
    public final /* synthetic */ Query f234501b;

    /* renamed from: c */
    public final /* synthetic */ SearchError f234502c;

    public /* synthetic */ C86821ar(C86825av avVar, Query query, SearchError searchError) {
        this.f234500a = avVar;
        this.f234501b = query;
        this.f234502c = searchError;
    }

    public final void run() {
        C86825av avVar = this.f234500a;
        ((C87023eq) avVar.f234511a.mo27525b()).mo80634g(this.f234501b, this.f234502c);
    }
}
