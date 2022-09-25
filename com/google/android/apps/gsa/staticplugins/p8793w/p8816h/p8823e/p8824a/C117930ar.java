package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8826g.C118060c;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8826g.C118061d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57960f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.ar */
/* compiled from: PG */
public final class C117930ar extends C68247h {

    /* renamed from: a */
    private final C68283d f327324a;

    /* renamed from: c */
    private final C68283d f327325c;

    /* renamed from: d */
    private final C68283d f327326d;

    /* renamed from: e */
    private final C68283d f327327e;

    public C117930ar(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117930ar.class), aVar);
        this.f327324a = C68236af.m98549d(dVar);
        this.f327325c = C68236af.m98549d(dVar2);
        this.f327326d = C68236af.m98549d(dVar3);
        this.f327327e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118060c a = ((C118061d) list.get(1)).mo103506a((Query) list.get(0), (String) list.get(2));
        Objects.requireNonNull(a);
        ((C57960f) list.get(3)).mo54567b(new C117929aq(a));
        return C60856cj.m92900i(a.mo87118a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327324a.mo60297gq(), this.f327325c.mo60297gq(), this.f327326d.mo60297gq(), this.f327327e.mo60297gq());
    }
}
