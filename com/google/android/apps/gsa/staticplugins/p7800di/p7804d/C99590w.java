package com.google.android.apps.gsa.staticplugins.p7800di.p7804d;

import com.google.android.apps.gsa.staticplugins.p7800di.p7802b.C99557g;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.di.d.w */
/* compiled from: PG */
public final class C99590w extends C68247h {

    /* renamed from: a */
    private final C68283d f278708a;

    /* renamed from: c */
    private final C68283d f278709c;

    /* renamed from: d */
    private final C68283d f278710d;

    public C99590w(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99590w.class), aVar);
        this.f278708a = C68236af.m98549d(dVar);
        this.f278709c = C68236af.m98549d(dVar2);
        this.f278710d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C99557g gVar = (C99557g) list.get(1);
        return ((C58009ae) list.get(0)).mo54597a(new C99589v((File) list.get(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f278708a.mo60297gq(), this.f278709c.mo60297gq(), this.f278710d.mo60297gq());
    }
}
