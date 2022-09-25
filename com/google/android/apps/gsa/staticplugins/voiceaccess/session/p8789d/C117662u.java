package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6719dp.C85407a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.u */
/* compiled from: PG */
public final class C117662u extends C68247h {

    /* renamed from: a */
    private final C68283d f326601a;

    /* renamed from: c */
    private final C68283d f326602c;

    /* renamed from: d */
    private final C68283d f326603d;

    public C117662u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117662u.class), aVar);
        this.f326601a = C68236af.m98549d(dVar);
        this.f326602c = C68236af.m98549d(dVar2);
        this.f326603d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C85407a aVar = (C85407a) list.get(1);
        C117634ae aeVar = (C117634ae) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        int i = aeVar.f326540k;
        if (i == 1 || i == 4) {
            return C118826c.f331423b;
        }
        aeVar.f326540k = 4;
        return aVar.mo78924a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326601a.mo60297gq(), this.f326602c.mo60297gq(), this.f326603d.mo60297gq());
    }
}
