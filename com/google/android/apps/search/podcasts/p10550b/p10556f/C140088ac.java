package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58671nr;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.f.ac */
/* compiled from: PG */
public final class C140088ac {

    /* renamed from: a */
    public final boolean f380702a;

    /* renamed from: b */
    private List f380703b;

    /* renamed from: c */
    private long f380704c;

    /* renamed from: d */
    private boolean f380705d;

    /* renamed from: e */
    private List f380706e;

    /* renamed from: f */
    private long f380707f;

    /* renamed from: g */
    private boolean f380708g;

    /* renamed from: h */
    private boolean f380709h;

    /* renamed from: i */
    private C58671nr f380710i;

    public C140088ac(long j, boolean z, List list, boolean z2) {
        this.f380704c = j;
        this.f380703b = new ArrayList(list);
        this.f380705d = z;
        this.f380707f = j;
        this.f380702a = z2;
        this.f380710i = m227747p(list);
    }

    /* renamed from: p */
    private static C58671nr m227747p(List list) {
        C58459fv fvVar = new C58459fv();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C97920j jVar = (C97920j) it.next();
            fvVar.mo54920x(jVar.f273431d, jVar);
        }
        return fvVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo115443a() {
        return this.f380704c;
    }

    /* renamed from: b */
    public final synchronized C58485gu mo115444b(List list) {
        if (list.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C97920j jVar = (C97920j) G.next();
            if (!mo115451i(jVar)) {
                e.mo55395g(jVar);
                this.f380710i.mo54920x(jVar.f273431d, jVar);
            }
        }
        C58485gu f = e.mo55394f();
        this.f380703b.addAll(f);
        return f;
    }

    /* renamed from: c */
    public final synchronized C58485gu mo115445c(List list) {
        if (!list.isEmpty()) {
            if (!this.f380703b.isEmpty()) {
                C58480gp e = C58485gu.m89837e();
                Iterator it = this.f380703b.iterator();
                while (it.hasNext()) {
                    C97920j jVar = (C97920j) it.next();
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C140968d.m228924b(jVar, (C97920j) it2.next())) {
                                e.mo55395g(jVar);
                                this.f380710i.mo54956I(jVar.f273431d, jVar);
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return e.mo55394f();
            }
        }
        return C58485gu.m89845m();
    }

    /* renamed from: d */
    public final synchronized List mo115446d(List list) {
        C58485gu c;
        c = mo115445c(list);
        this.f380703b.addAll(0, list);
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C97920j jVar = (C97920j) G.next();
            this.f380710i.mo54920x(jVar.f273431d, jVar);
        }
        return c;
    }

    /* renamed from: e */
    public final synchronized List mo115447e() {
        return Collections.unmodifiableList(this.f380703b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo115448f(boolean z) {
        this.f380709h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo115449g() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List r0 = r3.f380706e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            boolean r1 = r3.mo115452j()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            long r1 = r3.f380707f     // Catch:{ all -> 0x002d }
            r3.f380704c = r1     // Catch:{ all -> 0x002d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x002d }
            r1.<init>(r0)     // Catch:{ all -> 0x002d }
            r3.f380703b = r1     // Catch:{ all -> 0x002d }
            java.util.List r0 = r3.f380706e     // Catch:{ all -> 0x002d }
            r0.getClass()
            com.google.common.b.nr r0 = m227747p(r0)     // Catch:{ all -> 0x002d }
            r3.f380710i = r0     // Catch:{ all -> 0x002d }
            r0 = 0
            r3.f380705d = r0     // Catch:{ all -> 0x002d }
            r3.f380708g = r0     // Catch:{ all -> 0x002d }
            r0 = 0
            r3.f380706e = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return
        L_0x002b:
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10556f.C140088ac.mo115449g():void");
    }

    /* renamed from: h */
    public final synchronized void mo115450h(List list) {
        ArrayList arrayList = new ArrayList(list);
        this.f380703b = arrayList;
        this.f380710i = m227747p(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo115451i(com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.common.b.nr r0 = r3.f380710i     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r4.f273431d     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.mo54952E(r1, r4)     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            com.google.common.b.nr r0 = r3.f380710i     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r4.f273431d     // Catch:{ all -> 0x0035 }
            com.google.common.b.at r0 = (com.google.common.p4522b.C58322at) r0     // Catch:{ all -> 0x0035 }
            java.util.Set r0 = r0.mo54986h(r2)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001e:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.staticplugins.cl.b.j r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r2     // Catch:{ all -> 0x0035 }
            boolean r2 = com.google.android.apps.search.podcasts.p10601r.C140968d.m228925c(r4, r2)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x001e
            monitor-exit(r3)
            return r1
        L_0x0032:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0039
        L_0x0038:
            throw r4
        L_0x0039:
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10556f.C140088ac.mo115451i(com.google.android.apps.gsa.staticplugins.cl.b.j):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized boolean mo115452j() {
        return this.f380709h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo115453k(int r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.f380703b     // Catch:{ all -> 0x001f }
            int r0 = r0.size()     // Catch:{ all -> 0x001f }
            if (r2 == r3) goto L_0x001c
            if (r2 < 0) goto L_0x001c
            if (r2 >= r0) goto L_0x001c
            if (r3 < 0) goto L_0x001c
            if (r3 >= r0) goto L_0x001c
            java.util.List r0 = r1.f380703b     // Catch:{ all -> 0x001f }
            com.google.android.apps.search.podcasts.p10601r.C140991m.m228953a(r0, r2, r3)     // Catch:{ all -> 0x001f }
            r1.mo115456n()     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x001c:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10556f.C140088ac.mo115453k(int, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final synchronized boolean mo115454l() {
        return this.f380705d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        return true;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo115455m(long r11, java.util.List r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.f380707f     // Catch:{ all -> 0x0053 }
            r2 = 0
            r3 = 1
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0019
            long r0 = r11 - r0
            r4 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0012
            r2 = 1
        L_0x0012:
            r10.f380708g = r2     // Catch:{ all -> 0x0053 }
            r10.f380707f = r11     // Catch:{ all -> 0x0053 }
            r10.f380706e = r13     // Catch:{ all -> 0x0053 }
            goto L_0x0051
        L_0x0019:
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0051
            com.google.common.f.e r13 = com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al.f380721a     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x0053 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "QueueManager"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0053 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0053 }
            r0 = 41566(0xa25e, float:5.8246E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r0)     // Catch:{ all -> 0x0053 }
            r4 = r13
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0053 }
            java.lang.String r5 = "Response sync counter (%d) smaller than client (%d)"
            long r8 = r10.f380707f     // Catch:{ all -> 0x0053 }
            r6 = r11
            r4.mo56350C(r5, r6, r8)     // Catch:{ all -> 0x0053 }
            r10.f380704c = r11     // Catch:{ all -> 0x0053 }
            r10.f380707f = r11     // Catch:{ all -> 0x0053 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0053 }
            java.util.List r12 = r10.f380703b     // Catch:{ all -> 0x0053 }
            r11.<init>(r12)     // Catch:{ all -> 0x0053 }
            r10.f380706e = r11     // Catch:{ all -> 0x0053 }
            r10.f380708g = r3     // Catch:{ all -> 0x0053 }
            r10.f380705d = r3     // Catch:{ all -> 0x0053 }
            monitor-exit(r10)
            return r2
        L_0x0051:
            monitor-exit(r10)
            return r3
        L_0x0053:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10556f.C140088ac.mo115455m(long, java.util.List):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo115456n() {
        this.f380705d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized long mo115457o(int i) {
        if (i == 1) {
            if (this.f380708g) {
                return this.f380704c;
            }
        }
        return this.f380707f;
    }
}
