package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7752j;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6604bo.C84917a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.j.o */
/* compiled from: PG */
public final class C99211o extends C68247h {

    /* renamed from: a */
    private final C68283d f277557a;

    /* renamed from: c */
    private final C68283d f277558c;

    /* renamed from: d */
    private final C68283d f277559d;

    public C99211o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99211o.class), aVar);
        this.f277557a = C68236af.m98549d(dVar);
        this.f277558c = C68236af.m98549d(dVar2);
        this.f277559d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        C84917a aVar = (C84917a) list.get(2);
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return aVar.mo78585a((b) axVar.mo56107c(), (Query) axVar2.mo56107c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277557a.mo60297gq(), this.f277558c.mo60297gq(), this.f277559d.mo60297gq());
    }
}
