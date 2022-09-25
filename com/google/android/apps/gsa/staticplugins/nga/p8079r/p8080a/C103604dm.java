package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.c.b.a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dm */
/* compiled from: PG */
public final class C103604dm extends C68247h {

    /* renamed from: a */
    private final C68283d f288617a;

    /* renamed from: c */
    private final C68283d f288618c;

    /* renamed from: d */
    private final C68283d f288619d;

    public C103604dm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C103604dm.class), aVar);
        this.f288617a = C68236af.m98549d(dVar);
        this.f288618c = C68236af.m98549d(dVar2);
        this.f288619d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        a aVar = (a) list.get(0);
        C58833ax axVar = (C58833ax) list.get(2);
        long j = ((Query) list.get(1)).f252749G;
        if (axVar.mo56113h()) {
            aVar.b(C58833ax.m90834k(C60856cj.m92900i((com.google.android.apps.gsa.c.a.a) axVar.mo56107c())), j);
        } else {
            aVar.b(C58836b.f156633a, j);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288617a.mo60297gq(), this.f288618c.mo60297gq(), this.f288619d.mo60297gq());
    }
}
