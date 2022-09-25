package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.shared.aa.ax */
/* compiled from: PG */
public final class C89026ax extends C68247h {

    /* renamed from: a */
    private final C68283d f241286a;

    /* renamed from: c */
    private final C68283d f241287c;

    /* renamed from: d */
    private final C68283d f241288d;

    /* renamed from: e */
    private final C68283d f241289e;

    public C89026ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C89026ax.class), aVar);
        this.f241286a = C68236af.m98549d(dVar);
        this.f241287c = C68236af.m98549d(dVar2);
        this.f241288d = C68236af.m98549d(dVar3);
        this.f241289e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        int intValue = ((Integer) list.get(0)).intValue();
        C68283d dVar = this.f241287c;
        C68283d dVar2 = this.f241288d;
        C68282c cVar = (C68282c) list.get(1);
        if (intValue == 0) {
            return dVar2.mo60297gq();
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f241286a.mo60297gq(), C68236af.m98546a(this.f241289e.mo60297gq()));
    }
}
