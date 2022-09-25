package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.search.core.google.p6794d.C85938e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.s */
/* compiled from: PG */
public final class C86449s extends C68247h {

    /* renamed from: a */
    private final C68283d f233643a;

    /* renamed from: c */
    private final C68283d f233644c;

    /* renamed from: d */
    private final C68283d f233645d;

    public C86449s(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86449s.class), aVar);
        this.f233643a = C68236af.m98549d(dVar);
        this.f233644c = C68236af.m98549d(dVar2);
        this.f233645d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        int i = 2;
        C89911f fVar = (C89911f) list.get(2);
        int i2 = 3;
        if (C57940c.m88580g(cVar) || !axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            boolean equals = "1".equals(((C89022at) C57940c.m88577d(cVar)).mo83000a("X-Protobuffer-Response-Type", (String) null));
            C58976aa aaVar2 = C58975e.f156826a;
            int a = C85938e.m138129a(C89033bd.m144788a((String) axVar.mo56107c()));
            if (a == 2) {
                fVar.mo83755a((Throwable) null, 112547344, 29).mo83721a();
            } else {
                i = a;
            }
            if (equals && i == 3) {
                i2 = 6;
            } else if (i != 0) {
                if (!(i == 3 || i == 1)) {
                    fVar.mo83755a((Throwable) null, 14989204, 29).mo83721a();
                }
                i2 = i;
            }
        }
        return C60856cj.m92900i(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f233643a.mo60297gq()), this.f233644c.mo60297gq(), this.f233645d.mo60297gq());
    }
}
