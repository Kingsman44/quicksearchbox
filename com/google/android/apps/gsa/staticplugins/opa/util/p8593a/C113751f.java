package com.google.android.apps.gsa.staticplugins.opa.util.p8593a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.a.f */
/* compiled from: PG */
public final class C113751f extends C68247h {

    /* renamed from: a */
    private final C68283d f315045a;

    /* renamed from: c */
    private final C68283d f315046c;

    /* renamed from: d */
    private final C68283d f315047d;

    public C113751f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C113751f.class), aVar);
        this.f315045a = C68236af.m98549d(dVar);
        this.f315046c = C68236af.m98549d(dVar2);
        this.f315047d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Void voidR = (Void) list.get(0);
        C58881cr crVar = (C58881cr) list.get(1);
        if (((Boolean) list.get(2)).booleanValue()) {
            Collection.EL.stream((Set) crVar.mo6453a()).forEach(C113749d.f315041a);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f315045a.mo60297gq(), this.f315046c.mo60297gq(), this.f315047d.mo60297gq());
    }
}
