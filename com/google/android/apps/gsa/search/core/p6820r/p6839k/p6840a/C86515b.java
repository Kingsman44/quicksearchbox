package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import com.google.android.apps.gsa.search.core.google.C85886bi;
import com.google.android.apps.gsa.search.core.google.C85965dk;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61985a;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61986b;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61987c;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61988d;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61989e;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61990f;
import com.google.p395al.p398b.p399a.p400a.C8423g;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54193j;
import com.google.p4017at.p4060h.p4068b.p4069a.C54194k;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.b */
/* compiled from: PG */
public final class C86515b extends C68247h {

    /* renamed from: a */
    private final C68283d f233793a;

    /* renamed from: c */
    private final C68283d f233794c;

    /* renamed from: d */
    private final C68283d f233795d;

    /* renamed from: e */
    private final C68283d f233796e;

    /* renamed from: f */
    private final C68283d f233797f;

    /* renamed from: g */
    private final C68283d f233798g;

    public C86515b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C86515b.class), aVar);
        this.f233793a = C68236af.m98549d(dVar);
        this.f233794c = C68236af.m98549d(dVar2);
        this.f233795d = C68236af.m98549d(dVar3);
        this.f233796e = C68236af.m98549d(dVar4);
        this.f233797f = C68236af.m98549d(dVar5);
        this.f233798g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85886bi biVar = (C85886bi) list.get(0);
        Query query = (Query) list.get(1);
        C85981c cVar = (C85981c) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        C90476a aVar = (C90476a) list.get(5);
        C85965dk dkVar = new C85965dk(cVar, (C86338r) list.get(2));
        Map c = dkVar.mo79627c();
        C85981c cVar2 = dkVar.f232475a;
        Map map = cVar2.f232498f;
        Map map2 = cVar2.f232497e;
        C54193j jVar = (C54193j) C54194k.f142224e.createBuilder();
        if (!query.mo84397cd() || !query.mo84371cD()) {
            C8423g a = biVar.mo79519a(query);
            jVar.copyOnWrite();
            C54194k kVar = (C54194k) jVar.instance;
            a.getClass();
            kVar.f142228c = a;
            kVar.f142227b = 1;
            C54188e b = biVar.mo79520b(c, map, map2);
            jVar.copyOnWrite();
            C54194k kVar2 = (C54194k) jVar.instance;
            b.getClass();
            kVar2.f142229d = b;
            kVar2.f142226a |= 4;
        } else {
            String str = query.f252769h;
            C61989e eVar = (C61989e) C61990f.f167528b.createBuilder();
            C61985a aVar2 = (C61985a) C61986b.f167521b.createBuilder();
            C61987c cVar3 = (C61987c) C61988d.f167524c.createBuilder();
            cVar3.copyOnWrite();
            str.getClass();
            ((C61988d) cVar3.instance).f167526a = str;
            cVar3.copyOnWrite();
            ((C61988d) cVar3.instance).f167527b = 1;
            aVar2.copyOnWrite();
            C61988d dVar = (C61988d) cVar3.build();
            dVar.getClass();
            ((C61986b) aVar2.instance).f167523a = dVar;
            eVar.copyOnWrite();
            C61986b bVar = (C61986b) aVar2.build();
            bVar.getClass();
            ((C61990f) eVar.instance).f167530a = bVar;
            C61990f fVar = (C61990f) eVar.build();
            jVar.copyOnWrite();
            C54194k kVar3 = (C54194k) jVar.instance;
            fVar.getClass();
            kVar3.f142228c = fVar;
            kVar3.f142227b = 2;
            C54185b bVar2 = (C54185b) C54188e.f142203f.createBuilder();
            bVar2.copyOnWrite();
            ((C54188e) bVar2.instance).mo54076b().put("client", "kg-sound-search");
            C54188e eVar2 = (C54188e) bVar2.build();
            jVar.copyOnWrite();
            C54194k kVar4 = (C54194k) jVar.instance;
            eVar2.getClass();
            kVar4.f142229d = eVar2;
            kVar4.f142226a |= 4;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((C54194k) jVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233793a.mo60297gq(), this.f233794c.mo60297gq(), this.f233795d.mo60297gq(), this.f233796e.mo60297gq(), this.f233797f.mo60297gq(), this.f233798g.mo60297gq());
    }
}
