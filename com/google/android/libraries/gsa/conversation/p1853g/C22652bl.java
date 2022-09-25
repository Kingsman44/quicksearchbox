package com.google.android.libraries.gsa.conversation.p1853g;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.p1852f.C22581h;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51273bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.gsa.conversation.g.bl */
/* compiled from: PG */
final class C22652bl implements C57974a, C22653bm {

    /* renamed from: a */
    public final C22618ae f62391a;

    /* renamed from: b */
    public final SettableFuture f62392b;

    /* renamed from: c */
    public boolean f62393c = false;

    /* renamed from: d */
    public C60870cx f62394d = C60856cj.m92900i(C118826c.f331422a);

    /* renamed from: e */
    public C57996c f62395e;

    /* renamed from: f */
    public long f62396f;

    /* renamed from: g */
    final /* synthetic */ C22654bn f62397g;

    /* renamed from: h */
    private final C22669m f62398h;

    /* renamed from: i */
    private C58833ax f62399i = C58836b.f156633a;

    /* renamed from: j */
    private final C58585km f62400j = new C58331bb();

    /* renamed from: k */
    private final C22616ac f62401k = new C22616ac();

    /* renamed from: l */
    private C58833ax f62402l;

    public C22652bl(C22654bn bnVar, C22618ae aeVar, SettableFuture settableFuture, C22669m mVar, C58833ax axVar) {
        this.f62397g = bnVar;
        this.f62391a = aeVar;
        this.f62392b = settableFuture;
        this.f62398h = mVar;
        this.f62402l = axVar;
        bnVar.f62414l.add(this);
    }

    /* renamed from: j */
    private final void m42160j(boolean z) {
        this.f62397g.f62405c.execute(C47810es.m84977q(new C22647bg(this, z)));
    }

    /* renamed from: k */
    private static final boolean m42161k(C51274bq bqVar, C58833ax axVar) {
        C51273bp bpVar = bqVar.f133494f;
        if (bpVar == null) {
            bpVar = C51273bp.f133483c;
        }
        if ((bpVar.f133485a & 1) == 0) {
            return false;
        }
        C51273bp bpVar2 = bqVar.f133494f;
        if (bpVar2 == null) {
            bpVar2 = C51273bp.f133483c;
        }
        if (bpVar2.f133486b.equals(axVar.mo56111f())) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final C58495hd m42162l(Collection collection, int i) {
        C58490gz gzVar = new C58490gz(4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C52081en enVar = (C52081en) it.next();
            if (i == 4) {
                gzVar.mo55433l(this.f62401k.mo27734a(enVar));
            }
            this.f62394d = C60922j.m93045h(this.f62394d, C47810es.m84966f(new C22642bb(this, enVar, i, gzVar)), this.f62397g.f62405c);
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62397g.f62405c.execute(C47810es.m84977q(new C22650bj(this, (C22581h) obj)));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62397g.f62405c.execute(C47810es.m84977q(new C22648bh(this, cVar)));
    }

    /* renamed from: e */
    public final C60870cx mo27758e(C52081en enVar) {
        C58976aa aaVar = C58975e.f156826a;
        C22719w wVar = new C22719w();
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        wVar.mo27876c(exVar);
        C51274bq c = C22654bn.m42173c(wVar);
        int i = (!c.f133492d || m42161k(c, this.f62402l)) ? 4 : 3;
        long j = c.f133493e;
        if (i == 3) {
            this.f62400j.mo54920x(Long.valueOf(j), enVar);
            if (!this.f62397g.f62408f.mo27803d()) {
                return this.f62394d;
            }
        }
        if (this.f62399i.mo56113h() && !((Long) this.f62399i.mo56107c()).equals(Long.valueOf(j))) {
            List g = this.f62400j.mo55277g((Long) this.f62399i.mo56107c());
            g.size();
            this.f62399i.mo56107c();
            m42162l(g, 6);
        }
        Long valueOf = Long.valueOf(j);
        this.f62399i = C58833ax.m90834k(valueOf);
        C58495hd hdVar = C58729pv.f156485a;
        if (i == 4) {
            List g2 = this.f62400j.mo55277g(valueOf);
            g2.size();
            C58495hd l = m42162l(g2, 4);
            this.f62400j.mo55278h(valueOf);
            C22616ac acVar = this.f62401k;
            Collection.EL.stream(enVar.f136684d).map(C22682z.f62470a).collect(Collectors.joining(", "));
            long longValue = C22616ac.m42137b(enVar).longValue();
            boolean z = acVar.f62311c.mo56113h() && longValue != ((Long) acVar.f62311c.mo56107c()).longValue();
            acVar.f62311c = C58833ax.m90834k(Long.valueOf(longValue));
            if (z) {
                acVar.mo27735c();
            }
            if (!Collection.EL.stream(enVar.f136684d).map(C22614aa.f62307a).anyMatch(C22615ab.f62308a)) {
                boolean z2 = false;
                for (C52083ep epVar : enVar.f136684d) {
                    C2164c cVar = (C2164c) acVar.f62310b.get(Integer.valueOf(epVar.f136694d));
                    if (cVar != null) {
                        cVar.mo5437b(C58833ax.m90834k(epVar));
                        acVar.f62310b.remove(Integer.valueOf(epVar.f136694d));
                        z2 = true;
                    }
                }
                if (z2) {
                    return this.f62394d;
                }
            }
            C58490gz gzVar = new C58490gz(4);
            gzVar.mo55433l(l);
            gzVar.mo55433l(this.f62401k.mo27734a(enVar));
            hdVar = gzVar.mo55427f(false);
        }
        return C60922j.m93045h(this.f62394d, C47810es.m84966f(new C22649bi(this, enVar, i, hdVar)), this.f62397g.f62405c);
    }

    /* renamed from: f */
    public final void mo27759f(boolean z) {
        this.f62397g.f62414l.remove(this);
        this.f62401k.mo27735c();
        this.f62392b.mo57358p(this.f62394d);
        C60856cj.m92911t(this.f62392b, C47810es.m84974n(new C22651bk(this, z)), this.f62397g.f62405c);
    }

    /* renamed from: g */
    public final void mo27760g() {
        C57996c cVar = this.f62395e;
        if (cVar != null) {
            cVar.mo21018g();
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        m42160j(true);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        m42160j(false);
    }

    /* renamed from: h */
    public final void mo27761h(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62402l = C58833ax.m90834k(str);
        for (C52081en enVar : this.f62400j.mo54949B()) {
            C22719w wVar = new C22719w();
            C52091ex exVar = enVar.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            wVar.mo27876c(exVar);
            C51274bq c = C22654bn.m42173c(wVar);
            if (m42161k(c, C58833ax.m90834k(str))) {
                long j = c.f133493e;
                C58585km kmVar = this.f62400j;
                Long valueOf = Long.valueOf(j);
                C58485gu j2 = C58485gu.m89842j(kmVar.mo55278h(valueOf));
                if (!j2.isEmpty()) {
                    this.f62400j.mo54957J(valueOf, j2.subList(0, j2.size() - 1));
                    this.f62394d = mo27758e((C52081en) C58557jl.m90131l(j2));
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: i */
    public final C22668l mo27762i(C52081en enVar, int i, C58495hd hdVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f62392b.isDone()) {
            C22654bn bnVar = this.f62397g;
            if (bnVar.f62413k != null) {
                C22668l q = bnVar.mo27775q(enVar, i, hdVar, this.f62391a, false, this.f62398h);
                C52081en enVar2 = enVar;
                this.f62397g.mo27769k(enVar2, q.mo27779b(), C60856cj.m92892a(q.mo27778a()).mo57334a(new C22643bc(this, q), this.f62397g.f62405c), false, this.f62391a);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f62397g.f62413k.f62439c);
                arrayList.addAll(q.f62439c);
                this.f62397g.f62413k = new C22668l(q.f62438b, C58485gu.m89842j(arrayList));
                return this.f62397g.f62413k;
            }
        }
        mo27760g();
        return C22668l.f62437a;
    }
}
