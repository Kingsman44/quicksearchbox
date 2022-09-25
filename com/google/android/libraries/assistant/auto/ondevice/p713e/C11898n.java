package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3745ab.C48292ct;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p5277z.p5281b.C67988i;
import com.google.protobuf.C62947c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.n */
/* compiled from: PG */
public final class C11898n implements C11897m {

    /* renamed from: a */
    private static final C58974d f38267a = C58974d.m91134h("ClientLogger");

    /* renamed from: b */
    private static final HashSet f38268b = new HashSet(Arrays.asList(new String[]{"##.##.##.#############!!!"}));

    /* renamed from: c */
    private final C11890f f38269c;

    /* renamed from: d */
    private final C85710c f38270d;

    /* renamed from: e */
    private final C86124t f38271e;

    /* renamed from: f */
    private final C11904t f38272f;

    public C11898n(C11890f fVar, C85710c cVar, C86124t tVar, C11904t tVar2) {
        this.f38272f = tVar2;
        this.f38269c = fVar;
        this.f38270d = cVar;
        this.f38271e = tVar;
    }

    /* renamed from: l */
    private final void m27701l(Query query, C11889e eVar) {
        int a;
        if (m27703n(query)) {
            C11903s b = ((C11896l) this.f38269c).mo20279b(query.f252749G);
            b.f38281c.mo20291a(eVar);
            int i = eVar.f38252a;
            if (C11886b.m27682a(i) == 7 && !(i == 8 && (a = C11888d.m27683a(((Integer) eVar.f38253b).intValue())) != 0 && a == 3)) {
                b.f38280b = true;
            }
            if (C11886b.m27682a(eVar.f38252a) != 1 && !this.f38269c.mo20278a(query.f252749G)) {
                m27702m(query);
            }
        }
    }

    /* renamed from: m */
    private final void m27702m(Query query) {
        if (m27703n(query)) {
            String obj = query.f252768g.toString();
            if (!f38268b.contains(obj)) {
                C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
                aVar.copyOnWrite();
                C11889e eVar = (C11889e) aVar.instance;
                obj.getClass();
                eVar.f38252a = 1;
                eVar.f38253b = obj;
                m27701l(query, (C11889e) aVar.build());
                if (this.f38270d != null) {
                    C11885a aVar2 = (C11885a) C11889e.f38250c.createBuilder();
                    String a = this.f38270d.mo79343a();
                    aVar2.copyOnWrite();
                    C11889e eVar2 = (C11889e) aVar2.instance;
                    a.getClass();
                    eVar2.f38252a = 5;
                    eVar2.f38253b = a;
                    m27701l(query, (C11889e) aVar2.build());
                }
                String bf = query.mo84347bf("user-agent-suffix");
                if (bf != null) {
                    C11885a aVar3 = (C11885a) C11889e.f38250c.createBuilder();
                    aVar3.copyOnWrite();
                    C11889e eVar3 = (C11889e) aVar3.instance;
                    eVar3.f38252a = 7;
                    eVar3.f38253b = bf;
                    m27701l(query, (C11889e) aVar3.build());
                } else {
                    ((C58970a) ((C58970a) f38267a.mo56226d()).mo56372aa(43779)).mo56386p("no user agent is populated for the query request.");
                }
                if (query.mo84338bW()) {
                    C11885a aVar4 = (C11885a) C11889e.f38250c.createBuilder();
                    aVar4.copyOnWrite();
                    C11889e eVar4 = (C11889e) aVar4.instance;
                    eVar4.f38252a = 9;
                    eVar4.f38253b = true;
                    m27701l(query, (C11889e) aVar4.build());
                }
                if (query.mo84355bn() != null) {
                    C11885a aVar5 = (C11885a) C11889e.f38250c.createBuilder();
                    String bn = query.mo84355bn();
                    bn.getClass();
                    aVar5.copyOnWrite();
                    C11889e eVar5 = (C11889e) aVar5.instance;
                    eVar5.f38252a = 10;
                    eVar5.f38253b = bn;
                    m27701l(query, (C11889e) aVar5.build());
                }
            }
        }
    }

    /* renamed from: n */
    private final boolean m27703n(Query query) {
        if (this.f38271e.mo79746e(C90086ek.f250528z)) {
            return true;
        }
        if (!this.f38271e.mo79746e(C90086ek.f250326ay) || !query.mo84412cs()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final void m27704o(Query query, int i) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        eVar.f38253b = Integer.valueOf(i - 1);
        eVar.f38252a = 8;
        m27701l(query, (C11889e) aVar.build());
    }

    /* renamed from: a */
    public final C58833ax mo20280a(Query query) {
        C58833ax axVar;
        C11890f fVar = this.f38269c;
        long j = query.f252749G;
        synchronized (((C11896l) fVar).f38262a) {
            axVar = (C58833ax) Collection.EL.stream(((C11896l) fVar).f38264c).filter(new C11892h(j)).findFirst().map(C11893i.f38257a).orElse(C58836b.f156633a);
            if (axVar.mo56113h()) {
                ((C11896l) fVar).f38264c.remove(axVar.mo56107c());
            }
        }
        if (!axVar.mo56113h() || ((C11903s) axVar.mo56107c()).f38280b) {
            return C58836b.f156633a;
        }
        C11899o oVar = (C11899o) C11900p.f38273b.createBuilder();
        List a = ((C11903s) axVar.mo56107c()).mo20293a();
        oVar.copyOnWrite();
        C11900p pVar = (C11900p) oVar.instance;
        pVar.mo20292a();
        C62947c.addAll((Iterable) a, (List) pVar.f38275a);
        return C58833ax.m90834k((C11900p) oVar.build());
    }

    /* renamed from: b */
    public final void mo20281b(Query query, ActionData actionData) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        String name = actionData.f235998h.name();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        name.getClass();
        eVar.f38252a = 2;
        eVar.f38253b = name;
        m27701l(query, (C11889e) aVar.build());
    }

    /* renamed from: c */
    public final void mo20282c(Query query, C52081en enVar) {
        C58833ax a = C11902r.m27718a(enVar);
        if (a.mo56113h() && !((List) a.mo56107c()).isEmpty()) {
            for (Integer intValue : (List) a.mo56107c()) {
                int intValue2 = intValue.intValue();
                C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
                aVar.copyOnWrite();
                C11889e eVar = (C11889e) aVar.instance;
                eVar.f38252a = 6;
                eVar.f38253b = Integer.valueOf(intValue2);
                m27701l(query, (C11889e) aVar.build());
            }
        } else if (!this.f38269c.mo20278a(query.f252749G)) {
            m27702m(query);
        }
    }

    /* renamed from: d */
    public final void mo20283d(Query query, String str) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        str.getClass();
        eVar.f38252a = 2;
        eVar.f38253b = str;
        m27701l(query, (C11889e) aVar.build());
    }

    /* renamed from: e */
    public final void mo20284e(Query query) {
        m27704o(query, 2);
    }

    /* renamed from: f */
    public final void mo20285f(Query query) {
        m27704o(query, 3);
    }

    /* renamed from: g */
    public final void mo20286g(Query query, C19088t tVar) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        tVar.getClass();
        eVar.f38253b = tVar;
        eVar.f38252a = 13;
        m27701l(query, (C11889e) aVar.build());
    }

    /* renamed from: h */
    public final void mo20287h(Query query) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        eVar.f38252a = 6;
        eVar.f38253b = 23202;
        m27701l(query, (C11889e) aVar.build());
    }

    /* renamed from: i */
    public final void mo20288i(Query query, C48292ct ctVar) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        eVar.f38253b = Integer.valueOf(ctVar.f124907o);
        eVar.f38252a = 4;
        m27701l(query, (C11889e) aVar.build());
        if (this.f38271e.mo79746e(C90086ek.f250327az)) {
            switch (ctVar.ordinal()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    ((C58970a) ((C58970a) f38267a.mo56224b()).mo56372aa(43780)).mo56389s("punt VE from response status: %s", ctVar);
                    mo20287h(query);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: j */
    public final void mo20289j(Query query, C11900p pVar) {
        C11890f fVar = this.f38269c;
        long j = query.f252749G;
        synchronized (((C11896l) fVar).f38262a) {
            ((C11896l) fVar).f38264c.remove(new C11903s(j));
        }
        C11903s sVar = new C11903s(query.f252749G);
        for (C11889e a : pVar.f38275a) {
            sVar.f38281c.mo20291a(a);
        }
        this.f38272f.mo20296a(sVar);
    }

    /* renamed from: k */
    public final void mo20290k(Query query, int i) {
        C11885a aVar = (C11885a) C11889e.f38250c.createBuilder();
        aVar.copyOnWrite();
        C11889e eVar = (C11889e) aVar.instance;
        eVar.f38253b = Integer.valueOf(C67988i.m98229a(i));
        eVar.f38252a = 12;
        m27701l(query, (C11889e) aVar.build());
    }
}
