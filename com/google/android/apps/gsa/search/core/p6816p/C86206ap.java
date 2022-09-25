package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.p.ap */
/* compiled from: PG */
public final class C86206ap extends C68247h {

    /* renamed from: a */
    private final C68283d f232946a;

    /* renamed from: c */
    private final C68283d f232947c;

    /* renamed from: d */
    private final C68283d f232948d;

    public C86206ap(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86206ap.class), aVar);
        this.f232946a = C68236af.m98549d(dVar);
        this.f232947c = C68236af.m98549d(dVar2);
        this.f232948d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C68283d dVar = this.f232948d;
        if (((C86232bo) list.get(1)).mo79884T()) {
            return C118826c.m197213c(dVar.mo60297gq());
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f232946a.mo60297gq(), this.f232947c.mo60297gq());
    }
}
