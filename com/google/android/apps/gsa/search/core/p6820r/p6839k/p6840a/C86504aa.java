package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.aa */
/* compiled from: PG */
public final class C86504aa extends C68247h {

    /* renamed from: a */
    private final C68283d f233778a;

    /* renamed from: c */
    private final C68283d f233779c;

    /* renamed from: d */
    private final C68283d f233780d;

    public C86504aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86504aa.class), aVar);
        this.f233778a = C68236af.m98549d(dVar);
        this.f233779c = C68236af.m98549d(dVar2);
        this.f233780d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58756qv e = C58758qx.m90647e(C58758qx.m90647e((Set) list.get(0), (Set) list.get(1)), (Set) list.get(2));
        C85981c[] cVarArr = new C85981c[e.size()];
        e.toArray(cVarArr);
        C85981c cVar = new C85981c();
        cVar.mo79636b(cVarArr);
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233778a.mo60297gq(), this.f233779c.mo60297gq(), this.f233780d.mo60297gq());
    }
}
