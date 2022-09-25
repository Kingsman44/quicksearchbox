package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.h */
/* compiled from: PG */
public final class C103628h extends C68247h {

    /* renamed from: a */
    private final C68283d f288671a;

    /* renamed from: c */
    private final C68283d f288672c;

    /* renamed from: d */
    private final C68283d f288673d;

    public C103628h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C103628h.class), aVar);
        this.f288671a = C68236af.m98549d(dVar);
        this.f288672c = C68236af.m98549d(dVar2);
        this.f288673d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85929cw cwVar = (C85929cw) list.get(0);
        C86227bj bjVar = (C86227bj) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        if (axVar.mo56113h()) {
            bjVar.f233010k.mo79927ar((Query) axVar.mo56107c());
            bjVar.f233020b = new C103522c(cwVar, axVar);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288671a.mo60297gq(), this.f288672c.mo60297gq(), this.f288673d.mo60297gq());
    }
}
