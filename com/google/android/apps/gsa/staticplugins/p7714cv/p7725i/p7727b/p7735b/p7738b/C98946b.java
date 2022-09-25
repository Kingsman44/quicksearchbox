package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7738b;

import com.google.android.apps.gsa.search.core.p6519al.p6642ce.C85080a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.b.b */
/* compiled from: PG */
public final class C98946b extends C68247h {

    /* renamed from: a */
    private final C68283d f276547a;

    /* renamed from: c */
    private final C68283d f276548c;

    public C98946b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C98946b.class), aVar);
        this.f276547a = C68236af.m98549d(dVar);
        this.f276548c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C85080a aVar = (C85080a) list.get(1);
        if (axVar.mo56113h()) {
            return C90918bo.m148514a(aVar.mo78692a((Query) axVar.mo56107c()));
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276547a.mo60297gq(), this.f276548c.mo60297gq());
    }
}
