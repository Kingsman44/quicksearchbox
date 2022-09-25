package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85841z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.C58003a;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.x */
/* compiled from: PG */
public final class C102536x extends C68247h {

    /* renamed from: a */
    private final C68283d f286159a;

    /* renamed from: c */
    private final C68283d f286160c;

    /* renamed from: d */
    private final C68283d f286161d;

    /* renamed from: e */
    private final C68283d f286162e;

    /* renamed from: f */
    private final C68283d f286163f;

    public C102536x(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C102536x.class), aVar);
        this.f286159a = C68236af.m98549d(dVar);
        this.f286160c = C68236af.m98549d(dVar2);
        this.f286161d = C68236af.m98549d(dVar3);
        this.f286162e = C68236af.m98549d(dVar4);
        this.f286163f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C22871g) list.get(2)).mo28205e(((C58003a) list.get(1)).mo54593a(this.f286163f, ((C86124t) list.get(0)).mo79743a(C90014bt.f247437hD), TimeUnit.MILLISECONDS), "Catching timeouts from carrierParamsProducer", Exception.class, new C102530r((C85841z) list.get(3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286159a.mo60297gq(), this.f286160c.mo60297gq(), this.f286161d.mo60297gq(), this.f286162e.mo60297gq());
    }
}
