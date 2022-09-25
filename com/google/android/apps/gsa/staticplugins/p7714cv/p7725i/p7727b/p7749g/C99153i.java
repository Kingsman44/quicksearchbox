package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7749g;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6604bo.C84917a;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.g.i */
/* compiled from: PG */
public final class C99153i extends C68247h {

    /* renamed from: a */
    private final C68283d f277328a;

    /* renamed from: c */
    private final C68283d f277329c;

    /* renamed from: d */
    private final C68283d f277330d;

    /* renamed from: e */
    private final C68283d f277331e;

    /* renamed from: f */
    private final C68283d f277332f;

    public C99153i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C99153i.class), aVar);
        this.f277328a = C68236af.m98549d(dVar);
        this.f277329c = C68236af.m98549d(dVar2);
        this.f277330d = C68236af.m98549d(dVar3);
        this.f277331e = C68236af.m98549d(dVar4);
        this.f277332f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        Query query = (Query) list.get(1);
        b bVar = (b) list.get(2);
        C85596b bVar2 = (C85596b) list.get(3);
        C84917a aVar = (C84917a) list.get(4);
        if (booleanValue) {
            return bVar2.mo20304d(bVar, query);
        }
        return aVar.mo78585a(bVar, query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277328a.mo60297gq(), this.f277329c.mo60297gq(), this.f277330d.mo60297gq(), this.f277331e.mo60297gq(), this.f277332f.mo60297gq());
    }
}
