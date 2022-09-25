package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.conversation.p1852f.C22574a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
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
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.i */
/* compiled from: PG */
public final class C94753i extends C68247h {

    /* renamed from: a */
    private final C68283d f264973a;

    /* renamed from: c */
    private final C68283d f264974c;

    /* renamed from: d */
    private final C68283d f264975d;

    /* renamed from: e */
    private final C68283d f264976e;

    /* renamed from: f */
    private final C68283d f264977f;

    /* renamed from: g */
    private final C68283d f264978g;

    /* renamed from: h */
    private final C68283d f264979h;

    /* renamed from: i */
    private final C68283d f264980i;

    public C94753i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8) {
        super(aVar2, new C68277d(C94753i.class), aVar);
        this.f264973a = C68236af.m98549d(dVar);
        this.f264974c = C68236af.m98549d(dVar2);
        this.f264975d = C68236af.m98549d(dVar3);
        this.f264976e = C68236af.m98549d(dVar4);
        this.f264977f = C68236af.m98549d(dVar5);
        this.f264978g = C68236af.m98549d(dVar6);
        this.f264979h = C68236af.m98549d(dVar7);
        this.f264980i = C68236af.m98549d(dVar8);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        C86232bo boVar = (C86232bo) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C94785f fVar = (C94785f) list.get(2);
        C84370p pVar = (C84370p) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        Query query = (Query) list.get(6);
        C85005h hVar = (C85005h) list.get(7);
        if (C86253h.CONVERSATION_DELTA.equals(((C58833ax) list.get(5)).mo56111f())) {
            if (!axVar.mo56113h()) {
                gVar.mo28212l("failed", new C94669a(fVar));
            } else {
                C51195j jVar = (C51195j) axVar.mo56107c();
                hVar.mo78641z(jVar, query);
                if ((jVar.f133266a & 128) != 0) {
                    C59104x b = C94750f.f264970a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "BistoCclProducerModule");
                    ((C59052c) ((C59052c) b).mo56372aa(16829)).mo56386p("CCL response. Rendering.");
                    String str = jVar.f133271f;
                    C22574a aVar = new C22574a();
                    aVar.mo27666b(str);
                    C58833ax k = C58833ax.m90834k(aVar.mo27665a());
                    Objects.requireNonNull(fVar);
                    gVar.mo28212l("Render", new C94723c(fVar));
                    C52081en enVar = jVar.f133275j;
                    if (enVar == null) {
                        enVar = C52081en.f136679i;
                    }
                    gVar.mo28212l("notifyConversationClient", new C94748d(pVar, enVar, query, k, fVar, boVar));
                    z = true;
                } else {
                    gVar.mo28212l("failed", new C94696b(fVar));
                }
            }
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264973a.mo60297gq(), this.f264974c.mo60297gq(), this.f264975d.mo60297gq(), this.f264976e.mo60297gq(), this.f264977f.mo60297gq(), this.f264978g.mo60297gq(), this.f264979h.mo60297gq(), this.f264980i.mo60297gq());
    }
}
