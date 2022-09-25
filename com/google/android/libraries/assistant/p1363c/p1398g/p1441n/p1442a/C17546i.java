package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1442a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1449e.C17588a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.n.a.i */
/* compiled from: PG */
public final class C17546i extends C68247h {

    /* renamed from: a */
    private final C68283d f50595a;

    public C17546i(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C17546i.class), aVar);
        this.f50595a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional optional;
        Optional optional2 = (Optional) obj;
        if (!optional2.isPresent()) {
            optional = Optional.empty();
        } else {
            C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
            ((C17404a) optional2.get()).mo23346a(cdVar);
            optional = Optional.m71637of(C17588a.m34879a((C66607ce) cdVar.build()));
        }
        return C60856cj.m92900i(optional);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f50595a.mo60297gq();
    }
}
