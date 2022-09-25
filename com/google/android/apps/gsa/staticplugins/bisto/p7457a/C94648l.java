package com.google.android.apps.gsa.staticplugins.bisto.p7457a;

import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a.l */
/* compiled from: PG */
public class C94648l implements C94641e {

    /* renamed from: a */
    private static final C59071e f264721a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.a.l");

    /* renamed from: b */
    private final Object f264722b = new Object();

    /* renamed from: c */
    private final List f264723c;

    /* renamed from: d */
    private int f264724d = -1;

    /* renamed from: e */
    private boolean f264725e;

    /* renamed from: f */
    private boolean f264726f;

    public C94648l(C94640d dVar) {
        ArrayList arrayList = new ArrayList();
        this.f264723c = arrayList;
        arrayList.add(dVar);
    }

    /* renamed from: a */
    public C94639c mo88582a(C95455a aVar, C95065ab abVar, Runnable runnable) {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (mo88596o()) {
                if (b != null) {
                    C94639c b2 = b.mo88568b(aVar, abVar, runnable);
                    b2.getClass();
                    return b2;
                }
            }
            C94639c cVar = new C94639c(false, false);
            return cVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d mo88583b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f264722b
            monitor-enter(r0)
            int r1 = r3.f264724d     // Catch:{ all -> 0x001f }
            if (r1 < 0) goto L_0x001c
            java.util.List r2 = r3.f264723c     // Catch:{ all -> 0x001f }
            int r2 = r2.size()     // Catch:{ all -> 0x001f }
            if (r1 < r2) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            java.util.List r1 = r3.f264723c     // Catch:{ all -> 0x001f }
            int r2 = r3.f264724d     // Catch:{ all -> 0x001f }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x001f }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = (com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d) r1     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r1
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            r0 = 0
            return r0
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l.mo88583b():com.google.android.apps.gsa.staticplugins.bisto.a.d");
    }

    /* renamed from: c */
    public final Integer mo88584c() {
        C58976aa aaVar = C58975e.f156826a;
        return null;
    }

    /* renamed from: d */
    public Integer mo88585d() {
        return 7;
    }

    /* renamed from: e */
    public final Integer mo88586e() {
        return null;
    }

    /* renamed from: f */
    public Integer mo88587f() {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b != null) {
                if (mo88595n()) {
                    C58976aa aaVar = C58975e.f156826a;
                    C94638b a = b.mo88567a();
                    this.f264726f = a.f264707a;
                    if (!a.f264708b) {
                        return null;
                    }
                    if (a.f264709c) {
                        return 2;
                    }
                    return 5;
                }
            }
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
    }

    /* renamed from: g */
    public void mo88588g(int i) {
        synchronized (this.f264722b) {
            C58976aa aaVar = C58975e.f156826a;
            mo88593l();
            this.f264725e = true;
            int size = this.f264723c.size();
            while (true) {
                size--;
                if (size > this.f264724d) {
                    this.f264723c.remove(size);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo88589h() {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b != null) {
                b.mo88572f(true);
            }
            while (true) {
                if (!mo88594m()) {
                    break;
                }
                C94640d b2 = mo88583b();
                if (b2 == null) {
                    break;
                }
                b2.mo88572f(false);
            }
        }
    }

    /* renamed from: i */
    public final void mo88590i(String str, Runnable runnable) {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b != null) {
                b.mo88574h(str, runnable);
            }
        }
    }

    /* renamed from: j */
    public final void mo88591j(Set set) {
        synchronized (this.f264722b) {
            if (!this.f264725e) {
                int size = this.f264723c.size();
                while (true) {
                    size--;
                    if (size <= this.f264724d) {
                        this.f264726f = false;
                        return;
                    } else if (set.contains(((C94640d) this.f264723c.get(size)).mo88570d())) {
                        C58976aa aaVar = C58975e.f156826a;
                        this.f264723c.remove(size);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo88592k(boolean z) {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b != null) {
                b.mo88573g(z);
            }
        }
    }

    /* renamed from: l */
    public final void mo88593l() {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b != null) {
                b.mo88575i();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        return r2;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88594m() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f264722b
            monitor-enter(r0)
            boolean r1 = r5.mo88603t()     // Catch:{ all -> 0x005a }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x000e:
            boolean r1 = r5.f264726f     // Catch:{ all -> 0x005a }
            r3 = 1
            if (r1 == 0) goto L_0x0020
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005a }
            r5.f264726f = r2     // Catch:{ all -> 0x005a }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r5.mo88583b()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0020:
            int r1 = r5.f264724d     // Catch:{ all -> 0x005a }
            java.util.List r4 = r5.f264723c     // Catch:{ all -> 0x005a }
            int r4 = r4.size()     // Catch:{ all -> 0x005a }
            int r4 = r4 + -1
            if (r1 < r4) goto L_0x004a
            com.google.common.f.e r1 = f264721a     // Catch:{ all -> 0x005a }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x005a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "FixedListAnnSrc"
            r1.mo56378ag(r3, r4)     // Catch:{ all -> 0x005a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x005a }
            r3 = 14561(0x38e1, float:2.0404E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x005a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "At end of source. Shouldn't have happened here."
            r1.mo56386p(r3)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x004a:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005a }
            int r1 = r5.f264724d     // Catch:{ all -> 0x005a }
            int r1 = r1 + r3
            r5.f264724d = r1     // Catch:{ all -> 0x005a }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r5.mo88583b()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0058
            r2 = 1
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l.mo88594m():boolean");
    }

    /* renamed from: n */
    public final boolean mo88595n() {
        boolean z;
        synchronized (this.f264722b) {
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
        synchronized (this.f264722b) {
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
        return false;
    }

    /* renamed from: q */
    public final boolean mo88598q(C95285o oVar, C95284n nVar) {
        synchronized (this.f264722b) {
            C94640d b = mo88583b();
            if (b == null) {
                return false;
            }
            b.mo88581n(oVar, nVar);
            return true;
        }
    }

    /* renamed from: r */
    public boolean mo88599r() {
        boolean z;
        synchronized (this.f264722b) {
            z = false;
            if (!this.f264726f && mo88603t()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return false;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88600s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f264722b
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r3.mo88583b()     // Catch:{ all -> 0x0019 }
            boolean r2 = r3.mo88596o()     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0016
            if (r1 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            boolean r1 = r1.mo88579m()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            r0 = 0
            return r0
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l.mo88600s():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r2;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88603t() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f264722b
            monitor-enter(r0)
            boolean r1 = r5.f264725e     // Catch:{ all -> 0x0030 }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x000c:
            boolean r1 = r5.f264726f     // Catch:{ all -> 0x0030 }
            r3 = 1
            if (r1 == 0) goto L_0x001c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0030 }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r1 = r5.mo88583b()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x001c:
            int r1 = r5.f264724d     // Catch:{ all -> 0x0030 }
            java.util.List r4 = r5.f264723c     // Catch:{ all -> 0x0030 }
            int r4 = r4.size()     // Catch:{ all -> 0x0030 }
            int r4 = r4 + -1
            if (r1 >= r4) goto L_0x002c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r3
        L_0x002c:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l.mo88603t():boolean");
    }
}
