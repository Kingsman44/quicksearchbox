package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1299k;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66612cj;
import com.google.speech.p5208h.C66613ck;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.k.a */
/* compiled from: PG */
public final class C16593a extends C68247h {

    /* renamed from: a */
    private final C68283d f48658a;

    public C16593a(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16593a.class), aVar);
        this.f48658a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C66612cj cjVar = (C66612cj) C66613ck.f181215c.createBuilder();
        C13007y yVar = ((C12991i) obj).f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        String b = C39191a.m68623b(yVar.f40416b);
        cjVar.copyOnWrite();
        C66613ck ckVar = (C66613ck) cjVar.instance;
        b.getClass();
        ckVar.f181218a |= 1;
        ckVar.f181219b = b;
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C66613ck) cjVar.build()), C66613ck.f181216d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48658a.mo60297gq();
    }
}
