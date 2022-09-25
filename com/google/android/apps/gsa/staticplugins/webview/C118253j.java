package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.j */
/* compiled from: PG */
public final class C118253j extends C68247h {

    /* renamed from: a */
    private final C68283d f328292a;

    /* renamed from: c */
    private final C68283d f328293c;

    /* renamed from: d */
    private final C68283d f328294d;

    /* renamed from: e */
    private final C68283d f328295e;

    public C118253j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C118253j.class), aVar);
        this.f328292a = C68236af.m98549d(dVar);
        this.f328293c = C68236af.m98549d(dVar2);
        this.f328294d = C68236af.m98549d(dVar3);
        this.f328295e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C86372a aVar = (C86372a) list.get(2);
        C86603d dVar = (C86603d) list.get(3);
        if (axVar.mo56113h() && Boolean.FALSE.equals(((C86247cc) axVar.mo56107c()).f233136e)) {
            z = true;
        }
        if (query.mo84426dG() || !query.mo84321bF() || !z) {
            return C118826c.f331423b;
        }
        return dVar.mo54598b(new C118252i(aVar, query));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f328292a.mo60297gq(), this.f328293c.mo60297gq(), this.f328294d.mo60297gq(), this.f328295e.mo60297gq());
    }
}
