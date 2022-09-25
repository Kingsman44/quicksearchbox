package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bf */
/* compiled from: PG */
public final class C94702bf extends C68247h {

    /* renamed from: a */
    private final C68283d f264837a;

    /* renamed from: c */
    private final C68283d f264838c;

    /* renamed from: d */
    private final C68283d f264839d;

    /* renamed from: e */
    private final C68283d f264840e;

    /* renamed from: f */
    private final C68283d f264841f;

    /* renamed from: g */
    private final C68283d f264842g;

    public C94702bf(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C94702bf.class), aVar);
        this.f264837a = C68236af.m98549d(dVar);
        this.f264838c = C68236af.m98549d(dVar2);
        this.f264839d = C68236af.m98549d(dVar3);
        this.f264840e = C68236af.m98549d(dVar4);
        this.f264841f = C68236af.m98549d(dVar5);
        this.f264842g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118826c cVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C85005h hVar = (C85005h) list.get(2);
        C94785f fVar = (C94785f) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        C89656k kVar = (C89656k) list.get(5);
        if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16835)).mo56386p("No AssistantResponse");
            gVar.mo28212l("failed", new C94685ap(fVar, new SearchError(query, (String) null, new C90452a(211, C89885b.HTTP_NO_CONNECTIVITY_NO_SIGNAL_WIFI_ON.f246280a))));
            cVar = C118826c.f331422a;
        } else {
            hVar.mo78641z((C51195j) axVar.mo56107c(), query);
            cVar = C118826c.f331422a;
        }
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264837a.mo60297gq(), this.f264838c.mo60297gq(), this.f264839d.mo60297gq(), this.f264840e.mo60297gq(), this.f264841f.mo60297gq(), this.f264842g.mo60297gq());
    }
}
