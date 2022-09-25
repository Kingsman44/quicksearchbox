package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118326q;
import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.cb */
/* compiled from: PG */
public final class C100177cb {

    /* renamed from: a */
    public C58833ax f280116a;

    /* renamed from: b */
    public C58833ax f280117b;

    /* renamed from: c */
    public C58833ax f280118c;

    /* renamed from: d */
    public C58833ax f280119d;

    /* renamed from: e */
    private C58833ax f280120e;

    /* renamed from: f */
    private boolean f280121f;

    public C100177cb() {
        C58836b bVar = C58836b.f156633a;
        this.f280120e = bVar;
        this.f280116a = bVar;
        this.f280117b = bVar;
        this.f280118c = bVar;
        this.f280119d = bVar;
    }

    /* renamed from: a */
    public final String mo91781a(ArrayList arrayList) {
        int i;
        C58838bb.m90883r(this.f280120e.mo56113h());
        C58838bb.m90883r(this.f280119d.mo56113h() || (this.f280118c.mo56113h() && ((C100187m) this.f280118c.mo56107c()).f280211a.size() > 0));
        StringBuilder sb = new StringBuilder();
        if (this.f280121f) {
            sb.append("SELECT DISTINCT ");
        } else {
            sb.append("SELECT ");
        }
        if (this.f280120e.mo56113h()) {
            C100164bp.m165989b((C118336y) this.f280120e.mo56107c(), false).mo91779a(this.f280119d, this.f280118c, sb, arrayList);
        }
        sb.append(" FROM ");
        if (this.f280119d.mo56113h()) {
            sb.append("blob_table AS ");
            sb.append((String) this.f280119d.mo56107c());
            i = 0;
        } else {
            sb.append("attribute_table AS ");
            C100187m mVar = (C100187m) this.f280118c.mo56107c();
            C58838bb.m90868c(mVar.f280211a.size() > 0);
            sb.append((String) mVar.f280211a.valueAt(0));
            i = 1;
        }
        if (this.f280118c.mo56113h()) {
            while (i < ((C100187m) this.f280118c.mo56107c()).f280211a.size()) {
                if (this.f280119d.mo56113h()) {
                    C118302a a = C118302a.m196461a(((C100187m) this.f280118c.mo56107c()).mo91793a(i));
                    sb.append(" LEFT JOIN attribute_table AS ");
                    sb.append(((C100187m) this.f280118c.mo56107c()).mo91794b(a));
                    sb.append(" ON ");
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(C118308af.m196467a(a));
                    arrayList2.add(C118308af.f328388c);
                    C100164bp.m165989b(C118326q.m196505a(arrayList2, 5).mo103664a(C118328s.m196510b(a)), true).mo91779a(this.f280119d, this.f280118c, sb, arrayList);
                } else {
                    C118302a a2 = C118302a.m196461a(((C100187m) this.f280118c.mo56107c()).mo91793a(0));
                    C118302a a3 = C118302a.m196461a(((C100187m) this.f280118c.mo56107c()).mo91793a(i));
                    sb.append(" LEFT JOIN attribute_table AS ");
                    sb.append(((C100187m) this.f280118c.mo56107c()).mo91794b(a3));
                    sb.append(" ON ");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(C118308af.m196467a(a2));
                    arrayList3.add(C118308af.m196467a(a3));
                    C100164bp.m165989b(C118326q.m196505a(arrayList3, 5).mo103664a(C118328s.m196510b(a3)), true).mo91779a(this.f280119d, this.f280118c, sb, arrayList);
                }
                i++;
            }
        }
        if (this.f280117b.mo56113h()) {
            sb.append(" WHERE ");
            C100164bp.m165989b((C118336y) this.f280117b.mo56107c(), false).mo91779a(this.f280119d, this.f280118c, sb, arrayList);
        }
        if (this.f280116a.mo56113h() && !((C118327r) this.f280116a.mo56107c()).f328453a.isEmpty()) {
            sb.append(" ORDER BY ");
            C100164bp.m165989b((C118336y) this.f280116a.mo56107c(), false).mo91779a(this.f280119d, this.f280118c, sb, arrayList);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo91782b(C118327r rVar, boolean z) {
        this.f280120e = C58833ax.m90834k(rVar);
        this.f280121f = z;
    }
}
