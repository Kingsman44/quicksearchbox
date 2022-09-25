package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6517ak.C84568a;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.i */
/* compiled from: PG */
public final class C113470i extends C68247h {

    /* renamed from: a */
    private final C68283d f314184a;

    /* renamed from: c */
    private final C68283d f314185c;

    /* renamed from: d */
    private final C68283d f314186d;

    /* renamed from: e */
    private final C68283d f314187e;

    /* renamed from: f */
    private final C69464a f314188f;

    public C113470i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C69464a aVar3) {
        super(aVar2, new C68277d(C113470i.class), aVar);
        this.f314184a = C68236af.m98549d(dVar);
        this.f314185c = C68236af.m98549d(dVar2);
        this.f314186d = C68236af.m98549d(dVar3);
        this.f314187e = C68236af.m98549d(dVar4);
        this.f314188f = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68214a a = C68219e.m98518a(this.f314188f);
        C58976aa aaVar = C58975e.f156826a;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        C84568a a2 = ((C84600b) list.get(3)).mo78367a(d.mo41492a());
        C92444a aVar = new C92444a();
        aVar.mo87128d((C92302a) list.get(2));
        aVar.mo87130f((C89994f) list.get(1));
        aVar.f257822c = C58833ax.m90834k(a2);
        aVar.f257826g = C58833ax.m90834k(((bm) a.mo27525b()).b());
        aVar.f257828i = C58833ax.m90834k(true);
        return ((C90931ca) list.get(0)).mo85138c(new C92452i(aVar.mo87125a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f314184a.mo60297gq(), this.f314185c.mo60297gq(), this.f314186d.mo60297gq(), this.f314187e.mo60297gq());
    }
}
