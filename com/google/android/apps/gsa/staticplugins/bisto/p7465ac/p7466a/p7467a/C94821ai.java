package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ai */
/* compiled from: PG */
public final class C94821ai implements C94818af {

    /* renamed from: c */
    private static final C59071e f265138c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ai");

    /* renamed from: a */
    volatile C94819ag f265139a;

    /* renamed from: b */
    public volatile C94838m f265140b;

    /* renamed from: d */
    private final C60887da f265141d;

    /* renamed from: e */
    private final Deque f265142e = new ArrayDeque();

    /* renamed from: f */
    private final Deque f265143f = new ArrayDeque();

    /* renamed from: g */
    private final AtomicInteger f265144g = new AtomicInteger(0);

    public C94821ai(C60887da daVar) {
        this.f265141d = daVar;
    }

    /* renamed from: i */
    private final void m156397i(int i) {
        C59104x b = f265138c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(17535)).mo56393w("Move from %s to %s", this.f265144g.get(), i);
        this.f265144g.set(i);
    }

    /* renamed from: j */
    private final void m156398j() {
        C58833ax axVar;
        if (this.f265144g.get() <= 0) {
            if (!this.f265142e.isEmpty()) {
                axVar = C58833ax.m90833j((C94819ag) this.f265142e.pop());
            } else {
                axVar = !this.f265143f.isEmpty() ? C58833ax.m90833j((C94819ag) this.f265143f.pop()) : C58836b.f156633a;
            }
            C94819ag agVar = (C94819ag) axVar.mo56111f();
            if (agVar != null) {
                m156397i(1);
                agVar.f265134a = this;
                this.f265139a = agVar;
                C60870cx b = this.f265141d.mo19399b(this.f265139a);
                b.mo4106b(new C94820ah(this, b), this.f265141d);
                return;
            }
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final synchronized void mo88631a(C94823ak akVar) {
        C59104x b = f265138c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(17536)).mo56389s("Received response: %s", akVar.mo88640a());
        C94841p a = akVar.mo88640a();
        if (mo88639h(a)) {
            mo88634c();
            return;
        }
        if (this.f265140b != null) {
            this.f265140b.mo88660f(new C94851z(a));
        }
        mo88634c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo88633b(C94936d dVar) {
        boolean z;
        Iterator it = this.f265143f.iterator();
        while (it.hasNext()) {
            C94826an anVar = (C94826an) it.next();
            C94936d dVar2 = C94936d.CONTROL_INPUT;
            int ordinal = dVar.ordinal();
            if (ordinal == 1) {
                z = "389e8365-158f-4308-9204-756f29b6a87c".equals(anVar.f265154c);
            } else if (ordinal == 3) {
                z = "dd1d1206-568f-4b2d-a48c-969d8ad1f457".equals(anVar.f265154c);
            } else if (ordinal == 5) {
                z = "d9f83634-adf5-4cf6-a3c9-cdb149f6469c".equals(anVar.f265154c);
            } else if (ordinal == 7) {
                z = "95c93772-7ef8-4b38-96bd-24b351208157".equals(anVar.f265154c);
            }
            if (z) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public final void mo88634c() {
        C59104x b = f265138c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(17534)).mo56386p("Mark request as complete");
        this.f265139a = null;
        m156397i(0);
        m156398j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo88635d(C94819ag agVar) {
        C59104x b = f265138c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(17537)).mo56386p("Queue gacs request");
        this.f265142e.add(agVar);
        m156398j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo88636e(C94826an anVar) {
        C59104x b = f265138c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(17538)).mo56386p("Queue gacs write request");
        this.f265143f.add(anVar);
        m156398j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo88637f(C94838m mVar) {
        this.f265140b = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo88638g() {
        this.f265142e.clear();
        this.f265143f.clear();
        m156397i(0);
        this.f265139a = null;
    }

    /* renamed from: h */
    public final boolean mo88639h(C94841p pVar) {
        boolean z = this.f265139a != null && this.f265139a.f265135b.decrementAndGet() >= 0;
        if (pVar == C94841p.NON_FATAL_ERROR && z) {
            C59104x b = f265138c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsRequestProcessor");
            ((C59052c) ((C59052c) b).mo56372aa(17540)).mo56386p("Retry request");
            if (this.f265139a != null) {
                this.f265142e.addFirst(this.f265139a);
                return true;
            }
        }
        return false;
    }
}
