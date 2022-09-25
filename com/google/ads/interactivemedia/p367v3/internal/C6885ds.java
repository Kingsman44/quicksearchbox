package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ds */
/* compiled from: PG */
final class C6885ds {

    /* renamed from: a */
    private final List f21914a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap f21915b = new IdentityHashMap();

    /* renamed from: c */
    private final Map f21916c = new HashMap();

    /* renamed from: d */
    private final C6884dr f21917d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7332ug f21918e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7033je f21919f;

    /* renamed from: g */
    private final HashMap f21920g;

    /* renamed from: h */
    private final Set f21921h;

    /* renamed from: i */
    private boolean f21922i;

    /* renamed from: j */
    private adh f21923j;

    /* renamed from: k */
    private C7357ve f21924k = new C7357ve();

    public C6885ds(C6884dr drVar, C6957gj gjVar, Handler handler) {
        this.f21917d = drVar;
        C7332ug ugVar = new C7332ug();
        this.f21918e = ugVar;
        C7033je jeVar = new C7033je();
        this.f21919f = jeVar;
        this.f21920g = new HashMap();
        this.f21921h = new HashSet();
        if (gjVar != null) {
            ugVar.mo16553b(handler, gjVar);
            jeVar.mo16068b(handler, gjVar);
        }
    }

    /* renamed from: p */
    private final void m20067p() {
        Iterator it = this.f21921h.iterator();
        while (it.hasNext()) {
            C6883dq dqVar = (C6883dq) it.next();
            if (dqVar.f21911c.isEmpty()) {
                m20068q(dqVar);
                it.remove();
            }
        }
    }

    /* renamed from: q */
    private final void m20068q(C6883dq dqVar) {
        C6882dp dpVar = (C6882dp) this.f21920g.get(dqVar);
        if (dpVar != null) {
            dpVar.f21906a.mo16481p(dpVar.f21907b);
        }
    }

    /* renamed from: r */
    private final void m20069r(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                C6883dq dqVar = (C6883dq) this.f21914a.remove(i2);
                this.f21916c.remove(dqVar.f21910b);
                m20070s(i2, -dqVar.f21909a.mo16539C().mo15780s());
                dqVar.f21913e = true;
                if (this.f21922i) {
                    m20072u(dqVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    private final void m20070s(int i, int i2) {
        while (i < this.f21914a.size()) {
            ((C6883dq) this.f21914a.get(i)).f21912d += i2;
            i++;
        }
    }

    /* renamed from: t */
    private final void m20071t(C6883dq dqVar) {
        C7317ts tsVar = dqVar.f21909a;
        C6880dn dnVar = new C6880dn(this);
        C6881do doVar = new C6881do(this, dqVar);
        this.f21920g.put(dqVar, new C6882dp(tsVar, dnVar, doVar));
        tsVar.mo16476k(aeu.m18543m(), doVar);
        tsVar.mo16478m(aeu.m18543m(), doVar);
        tsVar.mo16479n(dnVar, this.f21923j);
    }

    /* renamed from: u */
    private final void m20072u(C6883dq dqVar) {
        if (dqVar.f21913e && dqVar.f21911c.isEmpty()) {
            C6882dp dpVar = (C6882dp) this.f21920g.remove(dqVar);
            ary.m19467t(dpVar);
            dpVar.f21906a.mo16482q(dpVar.f21907b);
            dpVar.f21906a.mo16477l(dpVar.f21908c);
            this.f21921h.remove(dqVar);
        }
    }

    /* renamed from: a */
    public final boolean mo15719a() {
        return this.f21922i;
    }

    /* renamed from: b */
    public final int mo15720b() {
        return this.f21914a.size();
    }

    /* renamed from: c */
    public final void mo15721c(adh adh) {
        ary.m19464q(!this.f21922i);
        this.f21923j = adh;
        for (int i = 0; i < this.f21914a.size(); i++) {
            C6883dq dqVar = (C6883dq) this.f21914a.get(i);
            m20071t(dqVar);
            this.f21921h.add(dqVar);
        }
        this.f21922i = true;
    }

    /* renamed from: d */
    public final void mo15722d(C7320tv tvVar) {
        C6883dq dqVar = (C6883dq) this.f21915b.remove(tvVar);
        ary.m19467t(dqVar);
        dqVar.f21909a.mo16523V(tvVar);
        dqVar.f21911c.remove(((C7314tp) tvVar).f23833b);
        if (!this.f21915b.isEmpty()) {
            m20067p();
        }
        m20072u(dqVar);
    }

    /* renamed from: e */
    public final void mo15723e() {
        for (C6882dp dpVar : this.f21920g.values()) {
            try {
                dpVar.f21906a.mo16482q(dpVar.f21907b);
            } catch (RuntimeException e) {
                adu.m18341b("MediaSourceList", "Failed to release child source.", e);
            }
            dpVar.f21906a.mo16477l(dpVar.f21908c);
        }
        this.f21920g.clear();
        this.f21921h.clear();
        this.f21922i = false;
    }

    /* renamed from: f */
    public final C6912es mo15724f() {
        if (this.f21914a.isEmpty()) {
            return C6912es.f22059a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f21914a.size(); i2++) {
            C6883dq dqVar = (C6883dq) this.f21914a.get(i2);
            dqVar.f21912d = i;
            i += dqVar.f21909a.mo16539C().mo15780s();
        }
        return new C6895eb(this.f21914a, this.f21924k);
    }

    /* renamed from: i */
    public final C6912es mo15725i(List list, C7357ve veVar) {
        m20069r(0, this.f21914a.size());
        return mo15726j(this.f21914a.size(), list, veVar);
    }

    /* renamed from: j */
    public final C6912es mo15726j(int i, List list, C7357ve veVar) {
        if (!list.isEmpty()) {
            this.f21924k = veVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C6883dq dqVar = (C6883dq) list.get(i2 - i);
                if (i2 > 0) {
                    C6883dq dqVar2 = (C6883dq) this.f21914a.get(i2 - 1);
                    dqVar.mo15718c(dqVar2.f21912d + dqVar2.f21909a.mo16539C().mo15780s());
                } else {
                    dqVar.mo15718c(0);
                }
                m20070s(i2, dqVar.f21909a.mo16539C().mo15780s());
                this.f21914a.add(i2, dqVar);
                this.f21916c.put(dqVar.f21910b, dqVar);
                if (this.f21922i) {
                    m20071t(dqVar);
                    if (this.f21915b.isEmpty()) {
                        this.f21921h.add(dqVar);
                    } else {
                        m20068q(dqVar);
                    }
                }
            }
        }
        return mo15724f();
    }

    /* renamed from: k */
    public final C6912es mo15727k(int i, int i2, C7357ve veVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo15720b()) {
            z = true;
        }
        ary.m19462o(z);
        this.f21924k = veVar;
        m20069r(i, i2);
        return mo15724f();
    }

    /* renamed from: l */
    public final C6912es mo15728l(C7357ve veVar) {
        int b = mo15720b();
        if (veVar.mo16638a() != b) {
            veVar = veVar.mo16645h().mo16643f(0, b);
        }
        this.f21924k = veVar;
        return mo15724f();
    }

    /* renamed from: m */
    public final C7320tv mo15729m(C7321tw twVar, acc acc, long j) {
        Object a = C6895eb.m19689a(twVar.f23859a);
        C7321tw a2 = twVar.mo16541a(C6895eb.m19690b(twVar.f23859a));
        C6883dq dqVar = (C6883dq) this.f21916c.get(a);
        ary.m19467t(dqVar);
        this.f21921h.add(dqVar);
        C6882dp dpVar = (C6882dp) this.f21920g.get(dqVar);
        if (dpVar != null) {
            dpVar.f21906a.mo16480o(dpVar.f21907b);
        }
        dqVar.f21911c.add(a2);
        C7314tp D = dqVar.f21909a.mo16524W(a2, acc, j);
        this.f21915b.put(D, dqVar);
        m20067p();
        return D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo15730n() {
        this.f21917d.mo15596j();
    }

    /* renamed from: o */
    public final C6912es mo15731o() {
        ary.m19462o(mo15720b() >= 0);
        this.f21924k = null;
        return mo15724f();
    }
}
