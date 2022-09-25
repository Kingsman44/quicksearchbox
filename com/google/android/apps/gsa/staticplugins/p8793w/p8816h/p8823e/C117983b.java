package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.b */
/* compiled from: PG */
public final class C117983b extends C68247h {

    /* renamed from: a */
    private final C68283d f327472a;

    public C117983b(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C117983b.class), aVar);
        this.f327472a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C68282c cVar = (C68282c) obj;
        if (C57940c.m88583j(cVar)) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                obj2 = (C58833ax) cVar.mo60292a();
            } catch (ExecutionException e) {
                C59104x d = C117911a.f327275a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ActionDataVoiceProducer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(18800)).mo56386p("Fetching optional online actiondata failed");
            }
            return C60856cj.m92900i(obj2);
        }
        obj2 = C58836b.f156633a;
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f327472a.mo60297gq());
    }
}
