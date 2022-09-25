package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.knowledge.p4682d.C61995f;
import com.google.protobuf.p4747b.p4748a.p4749a.C62920a;
import dagger.C68214a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cl */
/* compiled from: PG */
public final class C116628cl extends C116780ib {

    /* renamed from: a */
    public Query f323450a = Query.f252741b;

    /* renamed from: b */
    public C58833ax f323451b;

    /* renamed from: c */
    public C61995f f323452c;

    /* renamed from: d */
    public boolean f323453d;

    /* renamed from: e */
    public List f323454e;

    /* renamed from: f */
    public Query f323455f;

    /* renamed from: g */
    public double f323456g;

    /* renamed from: h */
    public Long f323457h = 0L;

    /* renamed from: i */
    public int f323458i;

    public C116628cl(C68214a aVar) {
        super(aVar, 180);
    }

    /* renamed from: e */
    public final C86247cc mo102807e() {
        C58833ax axVar = this.f323451b;
        if (axVar == null || !axVar.mo56113h()) {
            return null;
        }
        return (C86247cc) axVar.mo56107c();
    }

    /* renamed from: g */
    public final void mo102808g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f323457h = 0L;
        this.f323451b = null;
        this.f323454e = null;
        this.f323458i = 1;
        this.f323456g = C59203do.f157270a;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("SearchResultState");
        C91005e c = fVar.mo85279c("corpora order");
        List list = this.f323454e;
        if (list == null) {
            str = "null";
        } else {
            str = Arrays.toString(C62920a.m95367a(list));
        }
        c.mo85276a(C90752i.m148229c(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hm */
    public final void mo80709hm(Query query, Bundle bundle) {
        bundle.putLong("velvet:query_state:search_result_id", this.f323457h.longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        mo102808g();
        this.f323452c = null;
    }

    /* renamed from: i */
    public final void mo102809i(Query query, C58833ax axVar) {
        Boolean bool;
        if (this.f323450a.mo84383cP(query)) {
            this.f323453d = true;
            this.f323451b = axVar;
            if (!axVar.mo56113h() || (bool = ((C86247cc) axVar.mo56107c()).f233136e) == null) {
                this.f323458i = 4;
            } else {
                this.f323458i = true != bool.booleanValue() ? 2 : 3;
            }
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    public final String toString() {
        return "SRS";
    }
}
