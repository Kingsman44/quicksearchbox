package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import com.google.android.apps.gsa.search.core.google.C85895br;
import com.google.android.apps.gsa.search.core.google.C85965dk;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.h */
/* compiled from: PG */
public final class C86521h extends C68247h {

    /* renamed from: a */
    private final C68283d f233809a;

    /* renamed from: c */
    private final C68283d f233810c;

    public C86521h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86521h.class), aVar);
        this.f233809a = C68236af.m98549d(dVar);
        this.f233810c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C85965dk dkVar = (C85965dk) list.get(1);
        if (axVar.mo56113h()) {
            dkVar.f232475a.f232497e.put("Cookie", (String) axVar.mo56107c());
        }
        UriRequest b = dkVar.mo79626b((C85966dl) null);
        C58976aa aaVar = C58975e.f156826a;
        C66566aw awVar = (C66566aw) C85895br.m138021a(b).toBuilder();
        awVar.copyOnWrite();
        C66567ax axVar2 = (C66567ax) awVar.instance;
        axVar2.f181072a |= 4;
        axVar2.f181076e = false;
        return C60856cj.m92900i((C66567ax) awVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233809a.mo60297gq(), this.f233810c.mo60297gq());
    }
}
