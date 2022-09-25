package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.protobuf.C62940bt;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.ac */
/* compiled from: PG */
public final class C117959ac extends C68247h {

    /* renamed from: a */
    private final C68283d f327384a;

    /* renamed from: c */
    private final C68283d f327385c;

    /* renamed from: d */
    private final C68283d f327386d;

    public C117959ac(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117959ac.class), aVar);
        this.f327384a = C68236af.m98549d(dVar);
        this.f327385c = C68236af.m98549d(dVar2);
        this.f327386d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118027cq cqVar = (C118027cq) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        if (C57940c.m88583j(cVar) && tVar.mo79746e(C90086ek.f250345bQ) && ((C58833ax) cVar.mo60292a()).mo56113h() && ((Boolean) ((C58833ax) cVar.mo60292a()).mo56107c()).booleanValue()) {
            C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
            C62940bt btVar = C87722bd.f237197a;
            C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
            C16730ar arVar = C16730ar.OFFLINE;
            beVar.copyOnWrite();
            C87724bf bfVar = (C87724bf) beVar.instance;
            bfVar.f237201b = arVar.f48937e;
            bfVar.f237200a = 1 | bfVar.f237200a;
            alVar.mo81965b(btVar, (C87724bf) beVar.build());
            cqVar.mo103503e(alVar.mo81964a());
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327384a.mo60297gq(), C68236af.m98546a(this.f327385c.mo60297gq()), this.f327386d.mo60297gq());
    }
}
