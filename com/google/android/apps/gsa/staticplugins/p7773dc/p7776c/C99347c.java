package com.google.android.apps.gsa.staticplugins.p7773dc.p7776c;

import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7777d.C99361c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.c.c */
/* compiled from: PG */
public final class C99347c extends C68247h {

    /* renamed from: a */
    private final C68283d f277974a;

    /* renamed from: c */
    private final C68283d f277975c;

    /* renamed from: d */
    private final C68283d f277976d;

    public C99347c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99347c.class), aVar);
        this.f277974a = C68236af.m98549d(dVar);
        this.f277975c = C68236af.m98549d(dVar2);
        this.f277976d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C86603d) list.get(2)).mo54598b(new C99346b((C99361c) list.get(1), (Query) list.get(0)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277974a.mo60297gq(), this.f277975c.mo60297gq(), this.f277976d.mo60297gq());
    }
}
