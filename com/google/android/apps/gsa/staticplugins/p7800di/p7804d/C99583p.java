package com.google.android.apps.gsa.staticplugins.p7800di.p7804d;

import com.google.android.apps.gsa.staticplugins.p7800di.p7802b.C99551a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.io.File;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.d.p */
/* compiled from: PG */
public final class C99583p extends C68247h {

    /* renamed from: a */
    private final C68283d f278693a;

    /* renamed from: c */
    private final C68283d f278694c;

    /* renamed from: d */
    private final C68283d f278695d;

    public C99583p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99583p.class), aVar);
        this.f278693a = C68236af.m98549d(dVar);
        this.f278694c = C68236af.m98549d(dVar2);
        this.f278695d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C99551a aVar = (C99551a) list.get(1);
        return ((C58009ae) list.get(0)).mo54597a(new C99582o((File) list.get(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f278693a.mo60297gq(), this.f278694c.mo60297gq(), this.f278695d.mo60297gq());
    }
}
