package com.google.frameworks.client.data.android.p4641h;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.frameworks.client.data.android.p4642i.C61511e;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.ad */
/* compiled from: PG */
final class C61471ad extends C70898m {

    /* renamed from: a */
    public final Executor f166185a;

    /* renamed from: b */
    public final Set f166186b = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: c */
    public final Deque f166187c;

    /* renamed from: d */
    public int f166188d;

    /* renamed from: e */
    public C61470ac f166189e;

    /* renamed from: f */
    public C70897l f166190f;

    /* renamed from: g */
    public boolean f166191g = false;

    /* renamed from: h */
    public final C61469ab f166192h;

    /* renamed from: i */
    public boolean f166193i = false;

    /* renamed from: j */
    public C70898m f166194j;

    /* renamed from: k */
    private final C70888j f166195k;

    /* renamed from: l */
    private final C70338di f166196l;

    /* renamed from: m */
    private final C58485gu f166197m;

    /* renamed from: n */
    private final LinkedHashMap f166198n = new LinkedHashMap();

    /* renamed from: o */
    private final Set f166199o = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: p */
    private final Queue f166200p;

    /* renamed from: q */
    private C70851i f166201q;

    /* renamed from: r */
    private final Queue f166202r;

    /* renamed from: s */
    private int f166203s;

    /* renamed from: t */
    private C70334de f166204t;

    public C61471ad(C70888j jVar, C70338di diVar, C70851i iVar, C58485gu guVar) {
        this.f166195k = jVar;
        this.f166196l = diVar;
        this.f166201q = iVar;
        this.f166197m = guVar;
        this.f166187c = new ArrayDeque();
        this.f166202r = new ArrayDeque();
        this.f166200p = new ArrayDeque();
        this.f166189e = new C61470ac(guVar.size(), 1, 0, 0);
        Executor executor = iVar.f189017c;
        C61469ab abVar = new C61469ab(executor == null ? C60826bg.f164896a : executor);
        this.f166192h = abVar;
        this.f166185a = new C61492m(this, new C60904dr(abVar));
    }

    /* renamed from: m */
    private final C61481b m94158m(C70851i iVar, C70334de deVar, String str) {
        C70338di diVar = this.f166196l;
        diVar.getClass();
        iVar.getClass();
        deVar.getClass();
        str.getClass();
        return new C61481b(diVar, iVar, deVar, str);
    }

    /* renamed from: n */
    private final C61481b m94159n(C61481b bVar) {
        C70851i iVar = this.f166201q;
        return iVar == bVar.f166236b ? bVar : m94158m(iVar, bVar.f166235a, bVar.f166238d);
    }

    /* renamed from: o */
    private final void m94160o() {
        while (!this.f166187c.isEmpty()) {
            C61468aa aaVar = (C61468aa) this.f166187c.peek();
            if (aaVar.f166176b.isEmpty() && aaVar.f166177c == aaVar.f166178d.f166189e.f166180a) {
                Object obj = ((C61468aa) this.f166187c.poll()).f166175a;
                if (this.f166189e.f166184e == 4) {
                    this.f166194j.mo27483h(obj);
                } else {
                    this.f166200p.add(obj);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private final void m94161p(C61468aa aaVar, int i, int i2) {
        C58838bb.m90884s(aaVar.f166175a instanceof MessageLite, "Only MessageLite is supported");
        C61482c cVar = new C61482c((MessageLite) aaVar.f166175a);
        while (i < i2) {
            C58485gu guVar = (C58485gu) this.f166197m.get(i);
            int size = guVar.size();
            int i3 = 0;
            while (i3 < size) {
                C61485f fVar = (C61485f) guVar.get(i3);
                C61479al f = fVar.mo39488f();
                if (f.f166230f == 4) {
                    C60870cx a = f.mo58078a();
                    aaVar.f166176b.put(fVar, a);
                    a.mo4106b(C47810es.m84977q(new C61498s(this, cVar, aaVar)), this.f166185a);
                }
                i3++;
                if (m94163r(f)) {
                    return;
                }
            }
            i++;
        }
        aaVar.f166177c = i2;
        if (aaVar.f166176b.isEmpty()) {
            m94160o();
            mo58074j();
        }
    }

    /* renamed from: q */
    private final void m94162q() {
        C61470ac acVar;
        C61470ac acVar2 = this.f166189e;
        C58838bb.m90884s(!(acVar2.f166184e == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = acVar2.f166184e;
        if (i == 3) {
            acVar = new C61470ac(acVar2.f166180a, 4, acVar2.f166181b, acVar2.f166182c);
        } else if (i != 1 || !acVar2.f166183d) {
            int i2 = acVar2.f166181b;
            int i3 = i2 + 1;
            int i4 = acVar2.f166180a;
            acVar = i3 < i4 ? new C61470ac(i4, 1, i3, acVar2.f166182c) : new C61470ac(i4, 3, i2, acVar2.f166182c);
        } else {
            int i5 = acVar2.f166180a;
            int i6 = acVar2.f166181b;
            acVar = new C61470ac(i5, 2, i6, i6);
        }
        this.f166189e = acVar;
        int i7 = acVar.f166184e - 1;
        if (i7 == 0) {
            mo58076l(this.f166204t);
        } else if (i7 != 2) {
            mo58075k();
        } else {
            C70898m a = this.f166195k.mo39510a(this.f166196l, this.f166201q);
            this.f166194j = a;
            a.mo27478a(this.f166190f, this.f166204t);
            int i8 = this.f166188d;
            if (i8 > 0) {
                this.f166194j.mo27482g(i8);
            }
            for (Object h : this.f166200p) {
                this.f166194j.mo27483h(h);
            }
            if (this.f166191g && this.f166187c.isEmpty()) {
                this.f166194j.mo27481f();
            }
            m94162q();
        }
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        this.f166190f = new C61505z(this, new C61511e(new C61473af(lVar, this.f166197m, this.f166199o)));
        this.f166204t = deVar;
        this.f166185a.execute(C47810es.m84977q(new C61499t(this, deVar)));
    }

    /* renamed from: c */
    public final void mo58072c(C61481b bVar) {
        if (!this.f166198n.isEmpty()) {
            Iterator it = this.f166198n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((C60870cx) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                C61485f fVar = (C61485f) entry.getKey();
                C61479al a = fVar.mo39483a(m94159n(bVar));
                if (a.f166230f == 4) {
                    C60870cx a2 = a.mo58078a();
                    this.f166198n.put(fVar, a2);
                    a2.mo4106b(C47810es.m84977q(new C61490k(this, bVar)), this.f166185a);
                }
                if (m94163r(a)) {
                    return;
                }
            }
            if (this.f166198n.isEmpty() && !this.f166193i) {
                m94162q();
            }
        }
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        this.f166185a.execute(C47810es.m84977q(new C61491l(this, str, th)));
    }

    /* renamed from: e */
    public final void mo58073e(C61482c cVar, C61468aa aaVar) {
        Iterator it = aaVar.f166176b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((C60870cx) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            C61485f fVar = (C61485f) entry.getKey();
            C61479al e = fVar.mo39487e();
            if (e.f166230f == 4) {
                C60870cx a = e.mo58078a();
                aaVar.f166176b.put(fVar, a);
                a.mo4106b(C47810es.m84977q(new C61500u(this, cVar, aaVar)), this.f166185a);
            }
            if (m94163r(e)) {
                return;
            }
        }
        if (aaVar.f166176b.isEmpty()) {
            m94160o();
            mo58074j();
        }
    }

    /* renamed from: f */
    public final void mo27481f() {
        this.f166185a.execute(C47810es.m84977q(new C61493n(this)));
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        synchronized (this.f166202r) {
            this.f166203s += i;
        }
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        synchronized (this.f166202r) {
            if (!this.f166202r.isEmpty()) {
                int i2 = this.f166203s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = this.f166202r.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.f166203s--;
                    }
                }
                boolean isEmpty = this.f166202r.isEmpty();
                for (Object i4 : arrayDeque) {
                    this.f166190f.mo27487i(i4);
                }
                if (isEmpty) {
                    this.f166190f.mo27484b(Status.f186902OK, (C70334de) null);
                }
            }
        }
        this.f166185a.execute(C47810es.m84977q(new C61497r(this, i)));
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        this.f166185a.execute(C47810es.m84977q(new C61489j(this, obj)));
    }

    /* renamed from: j */
    public final void mo58074j() {
        if (this.f166191g) {
            C61468aa aaVar = (C61468aa) this.f166187c.peekLast();
            int i = this.f166189e.f166184e - 1;
            if (i != 1) {
                if (i == 3 && aaVar == null) {
                    this.f166194j.mo27481f();
                }
            } else if (aaVar == null || (aaVar.f166176b.isEmpty() && aaVar.f166177c == aaVar.f166178d.f166189e.f166182c + 1)) {
                m94162q();
            }
        }
    }

    /* renamed from: k */
    public final void mo58075k() {
        int i = this.f166189e.f166184e - 1;
        if (i == 1) {
            for (C61468aa aaVar : this.f166187c) {
                int i2 = aaVar.f166177c;
                int i3 = this.f166189e.f166182c;
                if (i2 <= i3) {
                    m94161p(aaVar, i2, i3 + 1);
                }
            }
        } else if (i == 3) {
            for (C61468aa aaVar2 : this.f166187c) {
                m94161p(aaVar2, aaVar2.f166177c, this.f166189e.f166180a);
            }
        }
    }

    /* renamed from: l */
    public final void mo58076l(C70334de deVar) {
        C61481b m = m94158m(this.f166201q, deVar, this.f166195k.mo39511b());
        C58485gu guVar = (C58485gu) this.f166197m.get(this.f166189e.f166181b);
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C61485f fVar = (C61485f) guVar.get(i);
            C61479al b = fVar.mo39484b(m94159n(m));
            if (b.f166230f == 4) {
                C60870cx a = b.mo58078a();
                this.f166198n.put(fVar, a);
                a.mo4106b(C47810es.m84977q(new C61495p(this, m)), this.f166185a);
            }
            if (!m94163r(b)) {
                this.f166199o.add(fVar);
                i++;
            } else {
                return;
            }
        }
        if (this.f166198n.isEmpty()) {
            m94162q();
        }
    }

    /* renamed from: r */
    private final boolean m94163r(C61479al alVar) {
        int i = alVar.f166230f - 1;
        if (i == 0) {
            C70851i iVar = alVar.f166229e;
            if (iVar != null) {
                if (this.f166189e.f166184e != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                    this.f166190f.mo27484b(Status.m102100d(illegalStateException), new C70334de());
                    if (this.f166189e.f166184e == 4) {
                        this.f166194j.mo27480d("Interceptor returned invalid outcome", illegalStateException);
                    }
                    return true;
                }
                this.f166201q = iVar;
            }
            return false;
        } else if (i == 1) {
            C61474ag agVar = alVar.f166228d;
            this.f166190f.mo27484b(agVar.f166220a, agVar.f166221b);
            if (this.f166189e.f166184e == 4) {
                this.f166194j.mo27480d("Aborted RPC with exception", agVar.f166220a.f186920q);
            }
            this.f166193i = true;
            return true;
        } else if (i == 2) {
            C61478ak akVar = alVar.f166227c;
            throw null;
        } else if (i != 3) {
            this.f166189e.f166183d = true;
            return false;
        } else {
            C60870cx a = alVar.mo58078a();
            this.f166186b.add(a);
            a.mo4106b(C47810es.m84977q(new C61494o(this, a)), this.f166185a);
            return false;
        }
    }
}
