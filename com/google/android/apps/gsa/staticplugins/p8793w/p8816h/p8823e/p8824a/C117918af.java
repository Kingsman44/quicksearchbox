package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.af */
/* compiled from: PG */
public final class C117918af extends C68247h {

    /* renamed from: a */
    private final C68283d f327295a;

    /* renamed from: c */
    private final C68283d f327296c;

    /* renamed from: d */
    private final C68283d f327297d;

    public C117918af(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117918af.class), aVar);
        this.f327295a = C68236af.m98549d(dVar);
        this.f327296c = C68236af.m98549d(dVar2);
        this.f327297d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C58003a) list.get(1)).mo54593a(this.f327295a, ((Long) list.get(0)).longValue(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327296c.mo60297gq(), this.f327297d.mo60297gq());
    }
}
