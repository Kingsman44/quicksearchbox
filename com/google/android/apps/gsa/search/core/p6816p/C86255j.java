package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.p.j */
/* compiled from: PG */
public final class C86255j implements C90991b {

    /* renamed from: a */
    private static final C59071e f233158a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.j");

    /* renamed from: b */
    private final Object f233159b = new Object();

    /* renamed from: c */
    private C86232bo f233160c;

    /* renamed from: d */
    private long f233161d;

    /* renamed from: e */
    private long f233162e;

    /* renamed from: a */
    public final long mo79953a() {
        long j;
        synchronized (this.f233159b) {
            j = this.f233162e;
        }
        return j;
    }

    /* renamed from: c */
    public final void mo79955c(long j, C86232bo boVar) {
        synchronized (this.f233159b) {
            C58838bb.m90869d(boVar instanceof C86254i, "Only AssistantSearchResult can be stored in the AssistantSearchResultCache");
            if (this.f233161d != j) {
                synchronized (this.f233159b) {
                    this.f233160c = null;
                    this.f233162e = 0;
                }
                this.f233161d = j;
            }
            this.f233160c = boVar;
        }
    }

    /* renamed from: e */
    public final void mo79956e(long j) {
        synchronized (this.f233159b) {
            this.f233162e = j;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AssistantSearchResultCache");
        synchronized (this.f233159b) {
            fVar.mo85279c("cached result id").mo85276a(C90752i.m148230d(Long.valueOf(this.f233161d)));
        }
    }

    /* renamed from: b */
    public final C58833ax mo79954b(long j) {
        C86232bo boVar;
        synchronized (this.f233159b) {
            if (this.f233161d != j || (boVar = this.f233160c) == null) {
                C59104x d = f233158a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AssistSearchResultCache");
                ((C59052c) ((C59052c) d).mo56372aa(7728)).mo56386p("Assistant search result is not present.");
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            C58833ax k = C58833ax.m90834k(boVar);
            return k;
        }
    }
}
