package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6604bo.C84917a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.m */
/* compiled from: PG */
public final class C102619m extends C68247h {

    /* renamed from: a */
    private final C68283d f286399a;

    /* renamed from: c */
    private final C68283d f286400c;

    /* renamed from: d */
    private final C68283d f286401d;

    public C102619m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102619m.class), aVar);
        this.f286399a = C68236af.m98549d(dVar);
        this.f286400c = C68236af.m98549d(dVar2);
        this.f286401d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C84917a aVar = (C84917a) list.get(1);
        C58976aa aaVar = C58975e.f156826a;
        return aVar.mo78585a((b) list.get(0), (Query) list.get(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286399a.mo60297gq(), this.f286400c.mo60297gq(), this.f286401d.mo60297gq());
    }
}
