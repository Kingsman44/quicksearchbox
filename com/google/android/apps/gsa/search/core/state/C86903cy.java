package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58833ax;
import com.google.knowledge.p4682d.C61995f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cy */
/* compiled from: PG */
public final class C86903cy extends C86898ct {

    /* renamed from: a */
    public Query f234678a = Query.f252741b;

    /* renamed from: b */
    public C58833ax f234679b;

    /* renamed from: c */
    public C61995f f234680c;

    /* renamed from: d */
    public boolean f234681d;

    /* renamed from: e */
    public Query f234682e;

    /* renamed from: f */
    public int f234683f;

    public C86903cy(C68214a aVar) {
        super(aVar, 74);
    }

    /* renamed from: a */
    public final C86247cc mo80561a() {
        C58833ax axVar = this.f234679b;
        if (axVar == null || !axVar.mo56113h()) {
            return null;
        }
        return (C86247cc) axVar.mo56107c();
    }

    /* renamed from: b */
    public final void mo80562b() {
        this.f234679b = null;
        this.f234683f = 1;
    }

    /* renamed from: e */
    public final void mo80563e(Query query, C58833ax axVar) {
        if (this.f234678a.mo84383cP(query)) {
            this.f234681d = true;
            this.f234679b = axVar;
            if (axVar.mo56113h()) {
                Boolean bool = ((C86247cc) axVar.mo56107c()).f233136e;
                if (bool != null) {
                    this.f234683f = true != bool.booleanValue() ? 2 : 3;
                } else {
                    this.f234683f = 4;
                }
            } else {
                this.f234683f = 4;
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchResultState");
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        mo80562b();
        this.f234680c = null;
    }

    public final String toString() {
        return "SRS";
    }
}
