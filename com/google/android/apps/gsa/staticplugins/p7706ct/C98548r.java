package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.search.core.state.C87032ez;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.r */
/* compiled from: PG */
public final class C98548r extends C68247h {

    /* renamed from: a */
    private final C68283d f275186a;

    /* renamed from: c */
    private final C68283d f275187c;

    /* renamed from: d */
    private final C68283d f275188d;

    /* renamed from: e */
    private final C68283d f275189e;

    public C98548r(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C98548r.class), aVar);
        this.f275186a = C68236af.m98549d(dVar);
        this.f275187c = C68236af.m98549d(dVar2);
        this.f275188d = C68236af.m98549d(dVar3);
        this.f275189e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f275186a;
        C87032ez ezVar = (C87032ez) list.get(2);
        if (C87032ez.m140541a((Query) list.get(0), (String) list.get(1))) {
            return dVar.mo60297gq();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f275187c.mo60297gq(), this.f275188d.mo60297gq(), this.f275189e.mo60297gq());
    }
}
