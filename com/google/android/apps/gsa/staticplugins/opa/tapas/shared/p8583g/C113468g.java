package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3858ar.p3859a.C49733w;
import com.google.assistant.p3858ar.p3859a.C49734x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66604cb;
import com.google.speech.p5208h.C66605cc;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66612cj;
import com.google.speech.p5208h.C66613ck;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5208h.C66619cq;
import com.google.speech.p5208h.C66620cr;
import com.google.speech.p5208h.p5209a.C66532c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.g */
/* compiled from: PG */
public final class C113468g extends C68247h {

    /* renamed from: a */
    private final C68283d f314178a;

    /* renamed from: c */
    private final C68283d f314179c;

    /* renamed from: d */
    private final C68283d f314180d;

    public C113468g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C113468g.class), aVar);
        this.f314178a = C68236af.m98549d(dVar);
        this.f314179c = C68236af.m98549d(dVar2);
        this.f314180d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        C66606cd a = C118919a.m197403a();
        a.copyOnWrite();
        C66607ce ceVar = (C66607ce) a.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        ceVar.f181193a |= 1;
        ceVar.f181194b = "assistant-tapas";
        long a2 = tVar.mo79743a(C90063do.f249571fz);
        a.mo58885m(C66615cm.f181221k, (C66615cm) list.get(1));
        C62940bt btVar = C66613ck.f181216d;
        C66612cj cjVar = (C66612cj) C66613ck.f181215c.createBuilder();
        String b = C39191a.m68623b(C90719ac.f253778a.f253779b.nextLong());
        cjVar.copyOnWrite();
        C66613ck ckVar = (C66613ck) cjVar.instance;
        b.getClass();
        ckVar.f181218a |= 1;
        ckVar.f181219b = b;
        a.mo58885m(btVar, (C66613ck) cjVar.build());
        a.mo58885m(C66599by.f181160q, (C66599by) list.get(0));
        C62940bt btVar2 = C66620cr.f181240d;
        C66619cq cqVar = (C66619cq) C66620cr.f181239c.createBuilder();
        cqVar.copyOnWrite();
        C66620cr crVar = (C66620cr) cqVar.instance;
        crVar.f181242a |= 1;
        crVar.f181243b = (int) a2;
        a.mo58885m(btVar2, (C66620cr) cqVar.build());
        C62940bt btVar3 = C66532c.f180949a;
        C49733w wVar = (C49733w) C49734x.f128410g.createBuilder();
        wVar.copyOnWrite();
        C49734x xVar = (C49734x) wVar.instance;
        xVar.f128412a |= 8;
        xVar.f128415d = true;
        a.mo58885m(btVar3, (C49734x) wVar.build());
        C66604cb cbVar = (C66604cb) C66605cc.f181187b.createBuilder();
        cbVar.mo59685a(tVar.mo79737h());
        a.mo58885m(C66605cc.f181188c, (C66605cc) cbVar.build());
        return C60856cj.m92900i((C66607ce) a.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f314178a.mo60297gq(), this.f314179c.mo60297gq(), this.f314180d.mo60297gq());
    }
}
