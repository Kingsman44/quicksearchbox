package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95517ag;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95519ai;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95628x;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95629y;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94638b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60251ly;
import com.google.common.p4552o.C60261mb;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.o */
/* compiled from: PG */
public class C95691o implements C94641e {

    /* renamed from: b */
    private static final C59071e f267885b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.i.o");

    /* renamed from: a */
    public final Object f267886a = new Object();

    /* renamed from: c */
    private final int f267887c;

    /* renamed from: d */
    private final C95598as f267888d;

    /* renamed from: e */
    private final C95706l f267889e;

    /* renamed from: f */
    private final C95293ae f267890f;

    /* renamed from: g */
    private final List f267891g = new ArrayList();

    /* renamed from: h */
    private final C60251ly f267892h;

    /* renamed from: i */
    private final C95600au f267893i;

    /* renamed from: j */
    private final C68214a f267894j;

    /* renamed from: k */
    private final C68214a f267895k;

    /* renamed from: l */
    private final C89656k f267896l;

    /* renamed from: m */
    private final C95307m f267897m;

    /* renamed from: n */
    private final C21370a f267898n;

    /* renamed from: o */
    private final C95692p f267899o;

    /* renamed from: p */
    private C95519ai f267900p;

    /* renamed from: q */
    private boolean f267901q;

    /* renamed from: r */
    private boolean f267902r;

    /* renamed from: s */
    private C94640d f267903s;

    /* renamed from: t */
    private C95515ae f267904t;

    public C95691o(C95598as asVar, int i, C95706l lVar, C95293ae aeVar, C95600au auVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3, C95692p pVar) {
        C60251ly lyVar = (C60251ly) C60261mb.f163036g.createBuilder();
        this.f267892h = lyVar;
        this.f267887c = i;
        this.f267888d = asVar;
        this.f267889e = lVar;
        this.f267890f = aeVar;
        this.f267893i = auVar;
        this.f267894j = aVar;
        this.f267895k = aVar2;
        this.f267896l = kVar;
        this.f267897m = mVar;
        this.f267898n = aVar3;
        this.f267899o = pVar;
        lyVar.copyOnWrite();
        C60261mb mbVar = (C60261mb) lyVar.instance;
        mbVar.f163043f = 1;
        mbVar.f163038a |= 512;
    }

    /* renamed from: B */
    private final void m158435B() {
        if (!this.f267902r) {
            this.f267900p = m158436t();
            this.f267902r = true;
        }
    }

    /* renamed from: t */
    private final C95519ai m158436t() {
        List list;
        if (!mo89642z()) {
            C59104x b = f267885b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifAnnouncementSource");
            ((C59052c) ((C59052c) b).mo56372aa(16364)).mo56386p("Not creating queue since all permissions aren't granted.");
            return null;
        }
        int i = this.f267887c;
        if (i == 0) {
            list = this.f267888d.mo89540c(new C95628x());
        } else if (i != 1) {
            C59104x d = f267885b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifAnnouncementSource");
            ((C59052c) ((C59052c) d).mo56372aa(16362)).mo56387q("Unknown playback type: %d", this.f267887c);
            int i2 = C90755l.f253831a;
            list = this.f267888d.mo89540c(new C95629y());
        } else {
            list = this.f267888d.mo89540c(new C95629y());
        }
        List list2 = list;
        C58976aa aaVar = C58975e.f156826a;
        list2.size();
        if (list2.isEmpty()) {
            return null;
        }
        return new C95519ai(list2, this.f267887c == 1, this.f267888d, this.f267889e, this.f267890f, this.f267893i, this.f267894j, this.f267895k, this.f267896l, this.f267897m, this.f267898n);
    }

    /* renamed from: A */
    public final void mo89639A(C94637a aVar) {
        List v = mo89637v();
        if (v.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            aVar.mo88580a(true);
            return;
        }
        C95690n nVar = new C95690n(aVar);
        int i = 0;
        while (i < v.size()) {
            if (v.get(i) instanceof C95515ae) {
                C95515ae aeVar = (C95515ae) v.get(i);
                if (!aeVar.mo89410Y()) {
                    aeVar.mo89409X(this.f267887c == 1, i == v.size() + -1);
                }
            }
            i++;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        v.size();
        v.size();
        new C94647k(v, nVar).mo88602a();
    }

    /* renamed from: a */
    public final C94639c mo88582a(C95455a aVar, C95065ab abVar, Runnable runnable) {
        synchronized (this.f267886a) {
            if (!mo88596o()) {
                C58976aa aaVar = C58975e.f156826a;
                C94639c cVar = new C94639c(false, false);
                return cVar;
            }
            C94640d b = mo88583b();
            if (b == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                C94639c cVar2 = new C94639c(false, false);
                return cVar2;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            C94639c b2 = b.mo88568b(aVar, abVar, runnable);
            return b2;
        }
    }

    /* renamed from: b */
    public C94640d mo88583b() {
        C95515ae aeVar;
        synchronized (this.f267886a) {
            aeVar = this.f267904t;
        }
        return aeVar;
    }

    /* renamed from: c */
    public final Integer mo88584c() {
        return mo88587f();
    }

    /* renamed from: d */
    public final Integer mo88585d() {
        return 7;
    }

    /* renamed from: e */
    public final Integer mo88586e() {
        return null;
    }

    /* renamed from: f */
    public final Integer mo88587f() {
        synchronized (this.f267886a) {
            if (!mo88595n()) {
                C58976aa aaVar = C58975e.f156826a;
                return null;
            }
            C94640d b = mo88583b();
            if (b == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                return null;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            C94638b a = b.mo88567a();
            this.f267901q = a.f264707a;
            if (!a.f264708b) {
                return null;
            }
            if (a.f264709c) {
                return 2;
            }
            return 5;
        }
    }

    /* renamed from: g */
    public final void mo88588g(int i) {
        synchronized (this.f267886a) {
            C58976aa aaVar = C58975e.f156826a;
            mo88593l();
            this.f267897m.mo83545c(mo89636u(i));
            this.f267901q = false;
            if (i == 5) {
                this.f267890f.mo89218k(3);
            }
        }
    }

    /* renamed from: h */
    public final void mo88589h() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            if (b != null) {
                C60251ly lyVar = this.f267892h;
                lyVar.copyOnWrite();
                C60261mb mbVar = (C60261mb) lyVar.instance;
                mbVar.f163038a |= 256;
                mbVar.f163042e = ((C60261mb) lyVar.instance).f163042e + 1;
                b.mo88572f(true);
                mo89640x();
            }
            while (true) {
                if (!mo88594m()) {
                    break;
                }
                C94640d b2 = mo88583b();
                if (b2 == null) {
                    break;
                }
                C60251ly lyVar2 = this.f267892h;
                lyVar2.copyOnWrite();
                C60261mb mbVar2 = (C60261mb) lyVar2.instance;
                mbVar2.f163038a |= 4;
                mbVar2.f163041d = ((C60261mb) lyVar2.instance).f163041d + 1;
                b2.mo88572f(false);
            }
        }
    }

    /* renamed from: i */
    public final void mo88590i(String str, Runnable runnable) {
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            if (b == null) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                b.mo88574h(str, runnable);
            }
        }
    }

    /* renamed from: j */
    public final void mo88591j(Set set) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f267886a) {
            C95519ai aiVar = this.f267900p;
            if (aiVar != null && !aiVar.f267292c) {
                C58557jl.m90145z(aiVar.f267290a, new C95517ag(set));
                aiVar.mo89425b();
            }
        }
    }

    /* renamed from: k */
    public final void mo88592k(boolean z) {
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            if (b != null) {
                C60251ly lyVar = this.f267892h;
                lyVar.copyOnWrite();
                C60261mb mbVar = (C60261mb) lyVar.instance;
                mbVar.f163038a |= 256;
                mbVar.f163042e = ((C60261mb) lyVar.instance).f163042e + 1;
                b.mo88573g(z);
                mo89640x();
            }
        }
    }

    /* renamed from: l */
    public final void mo88593l() {
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            if (b != null) {
                b.mo88575i();
                mo89640x();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        return r2;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo88594m() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f267886a
            monitor-enter(r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005c }
            boolean r1 = r6.mo89638w()     // Catch:{ all -> 0x005c }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return r2
        L_0x000e:
            boolean r1 = r6.mo89641y()     // Catch:{ all -> 0x005c }
            r3 = 1
            if (r1 == 0) goto L_0x0020
            r6.f267901q = r2     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r6.mo88583b()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return r2
        L_0x0020:
            r6.m158435B()     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ai r1 = r6.f267900p     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return r2
        L_0x0029:
            boolean r4 = r1.mo89426c()     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0041
            java.util.List r4 = r1.f267291b     // Catch:{ all -> 0x005c }
            int r5 = r1.f267293d     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r4 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r4     // Catch:{ all -> 0x005c }
            int r5 = r1.f267293d     // Catch:{ all -> 0x005c }
            int r5 = r5 + r3
            r1.f267293d = r5     // Catch:{ all -> 0x005c }
            r1.f267292c = r3     // Catch:{ all -> 0x005c }
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r6.f267904t = r4     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0055
            int r1 = r6.f267887c     // Catch:{ all -> 0x005c }
            if (r1 != r3) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            boolean r5 = r6.mo89638w()     // Catch:{ all -> 0x005c }
            r5 = r5 ^ r3
            r4.mo89409X(r1, r5)     // Catch:{ all -> 0x005c }
        L_0x0055:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r1 = r6.f267904t     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            r2 = 1
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95691o.mo88594m():boolean");
    }

    /* renamed from: n */
    public final boolean mo88595n() {
        boolean z;
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            z = false;
            if (b != null && b.mo88576j()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo88596o() {
        boolean z;
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            z = false;
            if (b != null && b.mo88577k()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public final boolean mo88597p() {
        return mo88595n();
    }

    /* renamed from: q */
    public final boolean mo88598q(C95285o oVar, C95284n nVar) {
        synchronized (this.f267886a) {
            C94640d b = mo88583b();
            if (b == null) {
                return false;
            }
            C58976aa aaVar = C58975e.f156826a;
            b.mo88581n(oVar, new C95689m(this, nVar));
            return true;
        }
    }

    /* renamed from: r */
    public final boolean mo88599r() {
        synchronized (this.f267886a) {
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo88600s() {
        synchronized (this.f267886a) {
            if (!mo88596o()) {
                C58976aa aaVar = C58975e.f156826a;
                return false;
            }
            C94640d b = mo88583b();
            if (b == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                return false;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            boolean m = b.mo88579m();
            return m;
        }
    }

    /* renamed from: v */
    public List mo89637v() {
        synchronized (this.f267886a) {
            C95519ai t = m158436t();
            if (t == null) {
                List emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(t.f267291b);
            return arrayList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        return r2;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89638w() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f267886a
            monitor-enter(r0)
            boolean r1 = r4.mo89641y()     // Catch:{ all -> 0x0026 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r4.mo88583b()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0015:
            r4.m158435B()     // Catch:{ all -> 0x0026 }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ai r1 = r4.f267900p     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0023
            boolean r1 = r1.mo89426c()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95691o.mo89638w():boolean");
    }

    /* renamed from: x */
    public final void mo89640x() {
        C94640d b = mo88583b();
        if (b != null) {
            C94640d dVar = this.f267903s;
            if (dVar == null || b != dVar) {
                this.f267903s = b;
                this.f267891g.add((C60241lo) b.mo88569c().build());
                return;
            }
            List list = this.f267891g;
            list.set(list.size() - 1, (C60241lo) b.mo88569c().build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo89641y() {
        boolean z;
        synchronized (this.f267886a) {
            z = this.f267901q;
        }
        return z;
    }

    /* renamed from: z */
    public final boolean mo89642z() {
        return this.f267899o.mo89608a() && this.f267899o.mo89609b();
    }

    /* renamed from: u */
    public C60298nk mo89636u(int i) {
        if (i == 0) {
            C60251ly lyVar = this.f267892h;
            lyVar.copyOnWrite();
            C60261mb mbVar = (C60261mb) lyVar.instance;
            C60261mb mbVar2 = C60261mb.f163036g;
            mbVar.f163039b = 1;
            mbVar.f163038a = 1 | mbVar.f163038a;
        } else if (i == 2 || i == 3) {
            C60251ly lyVar2 = this.f267892h;
            lyVar2.copyOnWrite();
            C60261mb mbVar3 = (C60261mb) lyVar2.instance;
            C60261mb mbVar4 = C60261mb.f163036g;
            mbVar3.f163039b = 2;
            mbVar3.f163038a = 1 | mbVar3.f163038a;
        } else if (i == 4 || i == 5) {
            C60251ly lyVar3 = this.f267892h;
            lyVar3.copyOnWrite();
            C60261mb mbVar5 = (C60261mb) lyVar3.instance;
            C60261mb mbVar6 = C60261mb.f163036g;
            mbVar5.f163039b = 3;
            mbVar5.f163038a = 1 | mbVar5.f163038a;
        } else {
            C60251ly lyVar4 = this.f267892h;
            lyVar4.copyOnWrite();
            C60261mb mbVar7 = (C60261mb) lyVar4.instance;
            C60261mb mbVar8 = C60261mb.f163036g;
            mbVar7.f163039b = 4;
            mbVar7.f163038a = 1 | mbVar7.f163038a;
        }
        C60251ly lyVar5 = this.f267892h;
        List list = this.f267891g;
        lyVar5.copyOnWrite();
        C60261mb mbVar9 = (C60261mb) lyVar5.instance;
        C62971cq cqVar = mbVar9.f163040c;
        if (!cqVar.mo58948c()) {
            mbVar9.f163040c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) mbVar9.f163040c);
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60251ly lyVar6 = this.f267892h;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60261mb mbVar10 = (C60261mb) lyVar6.build();
        mbVar10.getClass();
        nmVar.f163152f = mbVar10;
        nmVar.f163147a |= 2048;
        return nkVar;
    }
}
