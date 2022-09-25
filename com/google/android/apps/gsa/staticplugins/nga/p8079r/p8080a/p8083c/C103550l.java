package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.micro.GoogleEndpointerData;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.io.InputStream;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.l */
/* compiled from: PG */
public final class C103550l extends C68247h {

    /* renamed from: a */
    private final C68283d f288502a;

    /* renamed from: c */
    private final C68283d f288503c;

    /* renamed from: d */
    private final C68283d f288504d;

    /* renamed from: e */
    private final C68283d f288505e;

    /* renamed from: f */
    private final C68283d f288506f;

    /* renamed from: g */
    private final C68283d f288507g;

    public C103550l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C103550l.class), aVar);
        this.f288502a = C68236af.m98549d(dVar);
        this.f288503c = C68236af.m98549d(dVar2);
        this.f288504d = C68236af.m98549d(dVar3);
        this.f288505e = C68236af.m98549d(dVar4);
        this.f288506f = C68236af.m98549d(dVar5);
        this.f288507g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        C60887da daVar = (C60887da) list.get(2);
        C58833ax axVar3 = (C58833ax) list.get(3);
        C58833ax axVar4 = (C58833ax) list.get(4);
        C86124t tVar = (C86124t) list.get(5);
        if (!tVar.mo79746e(C90126fx.f251297gE) && !query.mo84324bI()) {
            C59104x b = C103546h.f288495a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
            ((C59052c) ((C59052c) b).mo56372aa(21608)).mo56386p("Offline micro endpointer disabled");
            obj2 = C58836b.f156633a;
        } else if (!axVar2.mo56113h()) {
            C59104x b2 = C103546h.f288495a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
            ((C59052c) ((C59052c) b2).mo56372aa(21607)).mo56386p("No voice input data present");
            obj2 = C58836b.f156633a;
        } else {
            try {
                C58833ax axVar5 = ((C103560v) axVar2.mo56107c()).f288524c;
                if (axVar5.mo56113h()) {
                    axVar = C58833ax.m90834k(((C103561w) axVar5.mo56107c()).f288525a.mo28823a().f63864a);
                } else {
                    axVar = C58836b.f156633a;
                }
                if (!axVar.mo56113h()) {
                    C59104x b3 = C103546h.f288495a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
                    ((C59052c) ((C59052c) b3).mo56372aa(21605)).mo56386p("No input stream present");
                    obj2 = C58836b.f156633a;
                } else if (!axVar3.mo56113h()) {
                    C59104x b4 = C103546h.f288495a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
                    ((C59052c) ((C59052c) b4).mo56372aa(21604)).mo56386p("Google endpointer not present");
                    obj2 = C58836b.f156633a;
                } else if (!axVar4.mo56113h()) {
                    C59104x b5 = C103546h.f288495a.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
                    ((C59052c) ((C59052c) b5).mo56372aa(21603)).mo56386p("Google endpointer data not present");
                    obj2 = C58836b.f156633a;
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                    obj2 = C58833ax.m90834k(new C103542d(((C103560v) axVar2.mo56107c()).f288522a, (InputStream) axVar.mo56107c(), (GoogleEndpointerData) axVar4.mo56107c(), (GoogleEndpointer) axVar3.mo56107c(), daVar, tVar.mo79743a(C90126fx.f251583lZ)));
                }
            } catch (C90457d e) {
                C59104x d = C103546h.f288495a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21606)).mo56386p("MicroEndpointer unavailable, because failed to split the voice input stream.");
                obj2 = C58836b.f156633a;
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288502a.mo60297gq(), this.f288503c.mo60297gq(), this.f288504d.mo60297gq(), this.f288505e.mo60297gq(), this.f288506f.mo60297gq(), this.f288507g.mo60297gq());
    }
}
