package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.y */
/* compiled from: PG */
public final class C94769y extends C68247h {

    /* renamed from: a */
    private final C68283d f264999a;

    /* renamed from: c */
    private final C68283d f265000c;

    /* renamed from: d */
    private final C68283d f265001d;

    /* renamed from: e */
    private final C68283d f265002e;

    /* renamed from: f */
    private final C68283d f265003f;

    public C94769y(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C94769y.class), aVar);
        this.f264999a = C68236af.m98549d(dVar);
        this.f265000c = C68236af.m98549d(dVar2);
        this.f265001d = C68236af.m98549d(dVar3);
        this.f265002e = C68236af.m98549d(dVar4);
        this.f265003f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86232bo boVar = (C86232bo) list.get(0);
        Query query = (Query) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C94785f fVar = (C94785f) list.get(3);
        C22871g gVar = (C22871g) list.get(4);
        if (!axVar.mo56113h()) {
            C90456c o = boVar.mo79891o();
            if (o != null) {
                gVar.mo28212l("failed", new C94757m(fVar, query, o));
            } else {
                gVar.mo28212l("failed", new C94758n(fVar));
            }
            return C60856cj.m92900i(false);
        } else if (!C86253h.LEGACY_ASSISTANT_RESPONSE.equals(axVar.mo56111f())) {
            return C60856cj.m92900i(false);
        } else {
            C59104x b = C94765u.f264995a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoLegacyModule");
            ((C59052c) ((C59052c) b).mo56372aa(16832)).mo56386p("Legacy response. Rendering.");
            Objects.requireNonNull(fVar);
            gVar.mo28212l("SendTtsToClient", new C94759o(fVar));
            Objects.requireNonNull(fVar);
            return C60922j.m93044g(gVar.mo28202b("playTts", new C94760p(fVar)), C94761q.f264991a, C60826bg.f164896a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264999a.mo60297gq(), this.f265000c.mo60297gq(), this.f265001d.mo60297gq(), this.f265002e.mo60297gq(), this.f265003f.mo60297gq());
    }
}
