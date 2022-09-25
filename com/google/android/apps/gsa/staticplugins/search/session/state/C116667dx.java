package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6590bh.C84842a;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.dx */
/* compiled from: PG */
public final class C116667dx extends C116780ib {

    /* renamed from: a */
    public final C84842a f323525a;

    /* renamed from: b */
    public final List f323526b = new ArrayList();

    /* renamed from: c */
    public SearchError f323527c;

    /* renamed from: d */
    public Query f323528d;

    /* renamed from: e */
    public long f323529e = 0;

    /* renamed from: f */
    private final C68214a f323530f;

    /* renamed from: g */
    private final C68214a f323531g;

    /* renamed from: h */
    private final C68214a f323532h;

    /* renamed from: i */
    private List f323533i = new ArrayList();

    public C116667dx(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C84842a aVar5) {
        super(aVar, 181);
        this.f323530f = aVar2;
        this.f323531g = aVar3;
        this.f323532h = aVar4;
        this.f323525a = aVar5;
    }

    /* renamed from: e */
    public final void mo102823e() {
        C87544b bVar;
        C87544b bVar2;
        this.f323526b.clear();
        SearchError searchError = this.f323527c;
        if (searchError != null) {
            C58485gu guVar = ((C116666dw) this.f323532h.mo27525b()).f323518a;
            int i = ((C58724pq) guVar).f156474d;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                bVar = null;
                if (i3 >= i) {
                    bVar2 = null;
                    break;
                }
                C116647dd ddVar = (C116647dd) guVar.get(i3);
                i3++;
                if (ddVar.mo102821b(searchError)) {
                    bVar2 = ddVar.mo102820a();
                    break;
                }
            }
            if (bVar2 != null) {
                this.f323526b.add(bVar2);
            }
            C58485gu guVar2 = ((C116666dw) this.f323532h.mo27525b()).f323519b;
            int i4 = ((C58724pq) guVar2).f156474d;
            while (true) {
                if (i2 >= i4) {
                    break;
                }
                C116647dd ddVar2 = (C116647dd) guVar2.get(i2);
                i2++;
                if (ddVar2.mo102821b(searchError)) {
                    bVar = ddVar2.mo102820a();
                    break;
                }
            }
            if (bVar != null) {
                this.f323526b.add(bVar);
            }
        } else if (!this.f323533i.isEmpty()) {
            this.f323526b.addAll(this.f323533i);
        }
    }

    /* renamed from: g */
    public final void mo102824g(Query query, List list) {
        List list2;
        if (((C116735gk) this.f323530f.mo27525b()).f323784p.mo84383cP(query)) {
            if ((!list.isEmpty() && ((C116740gp) this.f323531g.mo27525b()).mo102911g()) || (list2 = this.f323533i) == list) {
                return;
            }
            if (list2 == null || !list2.equals(list)) {
                C58976aa aaVar = C58975e.f156826a;
                this.f323533i = list;
                mo102823e();
                this.f323525a.mo78534k(this.f323526b);
                mo80591ar();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MessageState");
        fVar.mo85279c("Error").mo85276a(C90752i.m148231e(this.f323527c));
        fVar.mo85279c("Messages").mo85276a(C90752i.m148229c(this.f323526b.toString()));
        fVar.mo85279c("TransientMessages").mo85276a(C90752i.m148229c(this.f323533i.toString()));
        if (!this.f323526b.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C87544b bVar : this.f323526b) {
                arrayList.add(Integer.valueOf(bVar.f236491v));
            }
            fVar.mo85284k("Message cards", arrayList.toString());
        }
    }

    /* renamed from: i */
    public final boolean mo102825i() {
        return !this.f323526b.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Message{Identity=");
        sb.append(System.identityHashCode(this));
        sb.append(" Messages=");
        sb.append(this.f323526b.toString());
        sb.append(" Error=");
        SearchError searchError = this.f323527c;
        sb.append(searchError == null ? "null" : searchError.toString());
        sb.append(" TransientMessages=");
        sb.append(this.f323533i);
        sb.append(" LastClientId=");
        sb.append(this.f323529e);
        sb.append("}");
        return sb.toString();
    }
}
