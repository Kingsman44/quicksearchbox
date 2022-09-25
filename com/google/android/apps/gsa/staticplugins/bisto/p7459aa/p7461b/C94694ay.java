package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.ay */
/* compiled from: PG */
public final class C94694ay extends C68247h {

    /* renamed from: a */
    private final C68283d f264819a;

    /* renamed from: c */
    private final C68283d f264820c;

    /* renamed from: d */
    private final C68283d f264821d;

    /* renamed from: e */
    private final C68283d f264822e;

    public C94694ay(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C94694ay.class), aVar);
        this.f264819a = C68236af.m98549d(dVar);
        this.f264820c = C68236af.m98549d(dVar2);
        this.f264821d = C68236af.m98549d(dVar3);
        this.f264822e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C86232bo boVar = (C86232bo) list.get(1);
        C22871g gVar = (C22871g) list.get(2);
        C94785f fVar = (C94785f) list.get(3);
        SettableFuture settableFuture = new SettableFuture();
        new C90873ag(boVar.mo79894r(), gVar, "getActionDataWithOfflineFallback", new C94689at(boVar, gVar, fVar, settableFuture)).mo85223a(new C94690au(boVar, gVar, fVar));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264819a.mo60297gq(), this.f264820c.mo60297gq(), this.f264821d.mo60297gq(), this.f264822e.mo60297gq());
    }
}
