package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.google.p6795e.C85977a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.ai */
/* compiled from: PG */
public final class C102511ai extends C68247h {

    /* renamed from: a */
    private final C68283d f286108a;

    /* renamed from: c */
    private final C68283d f286109c;

    /* renamed from: d */
    private final C69464a f286110d;

    public C102511ai(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3) {
        super(aVar2, new C68277d(C102511ai.class), aVar);
        this.f286108a = C68236af.m98549d(dVar);
        this.f286109c = C68236af.m98549d(dVar2);
        this.f286110d = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Query query = (Query) list.get(1);
        C68214a a = C68219e.m98518a(this.f286110d);
        if (!((C86124t) list.get(0)).mo79746e(C90014bt.f247523ik)) {
            C58976aa aaVar = C58975e.f156826a;
            obj2 = C58836b.f156633a;
        } else {
            obj2 = C58833ax.m90834k(((C85977a) a.mo27525b()).mo79632b(query));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286108a.mo60297gq(), this.f286109c.mo60297gq());
    }
}
