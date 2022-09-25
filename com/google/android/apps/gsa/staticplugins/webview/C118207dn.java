package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86378c;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.dn */
/* compiled from: PG */
public final class C118207dn extends C68247h {

    /* renamed from: a */
    private final C68283d f328172a;

    /* renamed from: c */
    private final C68283d f328173c;

    /* renamed from: d */
    private final C68283d f328174d;

    /* renamed from: e */
    private final C68283d f328175e;

    /* renamed from: f */
    private final C68283d f328176f;

    public C118207dn(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118207dn.class), aVar);
        this.f328172a = C68236af.m98549d(dVar);
        this.f328173c = C68236af.m98549d(dVar2);
        this.f328174d = C68236af.m98549d(dVar3);
        this.f328175e = C68236af.m98549d(dVar4);
        this.f328176f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C57954d dVar = (C57954d) list.get(2);
        C86378c cVar = (C86378c) list.get(3);
        C86603d dVar2 = (C86603d) list.get(4);
        if (!booleanValue) {
            obj2 = C58836b.f156633a;
        } else {
            obj2 = C58833ax.m90834k(new C118200dg(dVar2, cVar, query));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f328172a.mo60297gq(), this.f328173c.mo60297gq(), this.f328174d.mo60297gq(), this.f328175e.mo60297gq(), this.f328176f.mo60297gq());
    }
}
