package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.Future;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.o */
/* compiled from: PG */
public final class C117656o extends C68247h {

    /* renamed from: a */
    private final C68283d f326584a;

    public C117656o(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C117656o.class), aVar);
        this.f326584a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C117634ae aeVar = (C117634ae) obj;
        C58976aa aaVar = C58975e.f156826a;
        Future future = aeVar.f326533d;
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
        C60870cx cxVar = aeVar.f326535f;
        if (cxVar != null && !cxVar.isDone()) {
            cxVar.cancel(true);
        }
        Future future2 = aeVar.f326536g;
        if (future2 != null && !future2.isDone()) {
            future2.cancel(true);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f326584a.mo60297gq();
    }
}
