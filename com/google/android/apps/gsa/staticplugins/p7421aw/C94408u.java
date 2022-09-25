package com.google.android.apps.gsa.staticplugins.p7421aw;

import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8575bc;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.aw.u */
/* compiled from: PG */
public final class C94408u extends C68247h {

    /* renamed from: a */
    private final C68283d f263934a;

    /* renamed from: c */
    private final C68283d f263935c;

    /* renamed from: d */
    private final C68283d f263936d;

    public C94408u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94408u.class), aVar);
        this.f263934a = C68236af.m98549d(dVar);
        this.f263935c = C68236af.m98549d(dVar2);
        this.f263936d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C8575bc bcVar = (C8575bc) list.get(1);
        C85171a aVar = (C85171a) list.get(2);
        C58838bb.m90866a(bcVar, "Trying to update with absent zeroTypingSuggest.");
        return aVar.mo78764e((Query) list.get(0), bcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f263934a.mo60297gq(), this.f263935c.mo60297gq(), this.f263936d.mo60297gq());
    }
}
