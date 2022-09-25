package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.o */
/* compiled from: PG */
public final class C117788o extends C68247h {

    /* renamed from: a */
    private final C68283d f326915a;

    /* renamed from: c */
    private final C68283d f326916c;

    /* renamed from: d */
    private final C68283d f326917d;

    public C117788o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117788o.class), aVar);
        this.f326915a = C68236af.m98549d(dVar);
        this.f326916c = C68236af.m98549d(dVar2);
        this.f326917d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C68283d dVar = this.f326916c;
        C68282c cVar = (C68282c) list.get(1);
        if (!axVar.mo56113h()) {
            return dVar.mo60297gq();
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en enVar = (C52081en) axVar.mo56107c();
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        enVar.getClass();
        jVar.f133275j = enVar;
        jVar.f133266a |= 128;
        return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326915a.mo60297gq(), C68236af.m98546a(this.f326917d.mo60297gq()));
    }
}
