package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6787f.C85768a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.al */
/* compiled from: PG */
final class C92774al implements C85768a {

    /* renamed from: a */
    private final SettableFuture f258896a;

    /* renamed from: b */
    private final SettableFuture f258897b;

    /* renamed from: c */
    private final SettableFuture f258898c;

    public C92774al(SettableFuture settableFuture, SettableFuture settableFuture2, SettableFuture settableFuture3) {
        this.f258896a = settableFuture;
        this.f258897b = settableFuture2;
        this.f258898c = settableFuture3;
    }

    /* renamed from: e */
    private static void m152805e(SettableFuture settableFuture, Throwable th) {
        if (!settableFuture.isDone()) {
            settableFuture.mo57357o(th);
        }
    }

    /* renamed from: a */
    public final void mo79423a(Query query, SearchError searchError) {
        Exception exc = new Exception(searchError.mo81137P());
        m152805e(this.f258896a, exc);
        m152805e(this.f258897b, exc);
        m152805e(this.f258898c, exc);
    }

    /* renamed from: c */
    public final void mo79424c(Query query, C90606n nVar) {
        this.f258898c.mo57356n(C58833ax.m90834k(nVar));
    }

    /* renamed from: d */
    public final void mo79425d(Query query) {
        if (!this.f258897b.isDone()) {
            this.f258897b.mo57357o(new Throwable("Text Search result is missing!"));
        }
        if (!this.f258898c.isDone()) {
            this.f258898c.mo57356n(C58836b.f156633a);
        }
        this.f258896a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: f */
    public final void mo79426f(Query query, C86232bo boVar) {
        this.f258897b.mo57356n(boVar);
    }
}
