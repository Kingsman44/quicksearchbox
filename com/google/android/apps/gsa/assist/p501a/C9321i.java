package com.google.android.apps.gsa.assist.p501a;

import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.assist.a.i */
/* compiled from: PG */
public final class C9321i {

    /* renamed from: a */
    public static final int f32339a = C9318f.values().length;

    /* renamed from: h */
    private static final C59071e f32340h = C59071e.m91332i("com.google.android.apps.gsa.assist.a.i");

    /* renamed from: b */
    public final C90021c f32341b;

    /* renamed from: c */
    public final C22871g f32342c;

    /* renamed from: d */
    public SparseBooleanArray f32343d;

    /* renamed from: e */
    public Integer f32344e;

    /* renamed from: f */
    public final List f32345f = new ArrayList();

    /* renamed from: g */
    public C9410f f32346g;

    /* renamed from: i */
    private final C68214a f32347i;

    /* renamed from: j */
    private final Object f32348j = new Object();

    /* renamed from: k */
    private final C9319g[] f32349k = new C9319g[f32339a];

    public C9321i(C90021c cVar, C22871g gVar, C68214a aVar) {
        this.f32341b = cVar;
        this.f32342c = gVar;
        this.f32347i = aVar;
    }

    /* renamed from: j */
    private final void m23766j(C9318f fVar) {
        C9319g c = mo17526c(fVar);
        if (c.f32337a == null) {
            c.f32337a = new SettableFuture();
        }
        c.f32338b = null;
    }

    /* renamed from: a */
    public final C9418h mo17524a(C9318f fVar) {
        try {
            SettableFuture settableFuture = mo17526c(fVar).f32337a;
            if (settableFuture != null) {
                C90476a aVar = C91018d.f254254a;
                return (C9418h) settableFuture.get();
            }
        } catch (InterruptedException | CancellationException e) {
            ((C59052c) ((C59052c) ((C59052c) f32340h.mo56225c()).mo56382g(e)).mo56372aa(170)).mo56386p("Exception when retrieving AssistData.");
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
        ((C89859i) this.f32347i.mo27525b()).mo74236a(C9324l.m23779a(C89849ae.ASSIST_DATA_MANAGER_GET_NULL_ASSIST_DATA, fVar));
        return null;
    }

    /* renamed from: b */
    public final C9316d mo17525b(C9318f fVar) {
        if (mo17526c(fVar).f32338b != null) {
            C9316d dVar = mo17526c(fVar).f32338b;
            dVar.getClass();
            return dVar;
        }
        ((C59052c) ((C59052c) f32340h.mo56225c()).mo56372aa(171)).mo56389s("getConfig for type: %s was called when config was null", fVar);
        return C9316d.f32330a;
    }

    /* renamed from: c */
    public final C9319g mo17526c(C9318f fVar) {
        C9319g gVar;
        synchronized (this.f32348j) {
            if (this.f32349k[fVar.ordinal()] == null) {
                this.f32349k[fVar.ordinal()] = new C9319g();
            }
            gVar = this.f32349k[fVar.ordinal()];
            gVar.getClass();
        }
        return gVar;
    }

    /* renamed from: d */
    public final C60870cx mo17527d(C9318f fVar) {
        SettableFuture settableFuture = mo17526c(fVar).f32337a;
        if (settableFuture != null) {
            return C60856cj.m92901j(settableFuture);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo17528e() {
        SettableFuture settableFuture;
        for (C9318f fVar : C9318f.values()) {
            synchronized (this.f32348j) {
                C9319g gVar = this.f32349k[fVar.ordinal()];
                if (!(gVar == null || (settableFuture = gVar.f32337a) == null)) {
                    settableFuture.cancel(true);
                    gVar.f32337a = new SettableFuture();
                }
                this.f32349k[fVar.ordinal()] = null;
            }
        }
        this.f32346g = null;
        this.f32344e = null;
    }

    /* renamed from: f */
    public final void mo17529f(C9318f fVar) {
        m23766j(fVar);
        if (mo17532i(fVar)) {
            m23766j(C9318f.SCREENSHOT);
        }
    }

    /* renamed from: g */
    public final void mo17530g(C9418h hVar, C9318f fVar) {
        C89849ae aeVar;
        C9319g c = mo17526c(fVar);
        SettableFuture settableFuture = c.f32337a;
        if (settableFuture == null || settableFuture.isDone()) {
            c.f32337a = new SettableFuture();
        }
        c.f32337a.mo57356n(hVar);
        if (hVar == null) {
            aeVar = C89849ae.ASSIST_DATA_MANAGER_SET_NULL_ASSIST_DATA;
        } else if (hVar.equals(C9418h.f32714k)) {
            aeVar = C89849ae.ASSIST_DATA_MANAGER_SET_EMPTY_ASSIST_DATA;
        } else {
            aeVar = C89849ae.ASSIST_DATA_MANAGER_SET_ASSIST_DATA;
        }
        ((C89859i) this.f32347i.mo27525b()).mo74236a(C9324l.m23779a(aeVar, fVar));
    }

    /* renamed from: h */
    public final boolean mo17531h(C9318f fVar) {
        return mo17526c(fVar).f32337a != null;
    }

    /* renamed from: i */
    public final boolean mo17532i(C9318f fVar) {
        if (fVar != C9318f.CONTEXTUAL) {
            return false;
        }
        Integer num = this.f32344e;
        return num == null || !this.f32343d.get(num.intValue());
    }
}
