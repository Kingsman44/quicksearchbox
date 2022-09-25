package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45750i;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import java.util.ArrayList;

/* renamed from: com.google.apps.d.e.ab */
/* compiled from: PG */
final class C45770ab extends C45750i {

    /* renamed from: a */
    public boolean f120354a = false;

    /* renamed from: b */
    C45729e f120355b = null;

    /* renamed from: c */
    public final C45723n f120356c = new C45723n(0);

    /* renamed from: d */
    private final int f120357d;

    /* renamed from: e */
    private final int f120358e;

    /* renamed from: f */
    private final boolean f120359f;

    public C45770ab(C45703t tVar, boolean z) {
        this.f120357d = tVar.mo49798d();
        this.f120358e = tVar.mo49797c();
        this.f120359f = z;
    }

    /* renamed from: c */
    private final void m81619c(C45723n nVar, C45755n nVar2) {
        C45763v vVar;
        C45763v vVar2;
        Object obj;
        if (m81620d(nVar2.f120315d)) {
            vVar = null;
        } else {
            vVar = nVar2.f120315d;
        }
        if (m81620d(nVar2.f120316e)) {
            vVar2 = null;
        } else {
            vVar2 = nVar2.f120316e;
        }
        if (nVar.f120220a.isEmpty()) {
            obj = null;
        } else {
            ArrayList arrayList = nVar.f120220a;
            obj = arrayList.remove(arrayList.size() - 1);
        }
        C45755n nVar3 = (C45755n) obj;
        if (nVar3 != null && (!nVar3.mo49893m() || !this.f120359f)) {
            this.f120355b = new C45729e(nVar3, (C45755n) null, (C45763v) null);
            nVar.f120220a.add(nVar3);
            nVar3 = null;
        }
        if (nVar3 == null) {
            if (vVar != null || vVar2 != null) {
                nVar3 = C45755n.m81570c();
            } else {
                return;
            }
        }
        C45755n b = nVar3.mo49886b(C45771ac.m81622a(nVar3.f120315d, mo49884b(vVar)), C45771ac.m81622a(nVar3.f120316e, mo49884b(vVar2)));
        nVar.f120220a.add(b);
        this.f120356c.f120220a.add(nVar2.mo49886b((C45763v) null, (C45763v) null));
        this.f120355b = new C45729e((C45755n) null, b, (C45763v) null);
    }

    /* renamed from: d */
    private final boolean m81620d(C45763v vVar) {
        if (vVar == null) {
            return false;
        }
        int i = this.f120357d;
        C45745d dVar = (C45745d) vVar.f120343b;
        return i < dVar.f120265a && dVar.f120266b <= this.f120358e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r6 == 13) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.p3589d.p3593d.C45763v mo49883a(com.google.apps.p3589d.p3593d.C45763v r12) {
        /*
            r11 = this;
            com.google.apps.d.b.n r0 = new com.google.apps.d.b.n
            r1 = 0
            r0.<init>(r1)
            com.google.apps.d.b.j r1 = r12.f120342a
            com.google.apps.d.b.c r2 = new com.google.apps.d.b.c
            r2.<init>(r1)
        L_0x000d:
            boolean r1 = r2.hasNext()
            r3 = 0
            if (r1 == 0) goto L_0x0117
            java.lang.Object r1 = r2.next()
            com.google.apps.d.d.n r1 = (com.google.apps.p3589d.p3593d.C45755n) r1
            com.google.apps.d.d.a r4 = r1.f120318g
            int r5 = r11.f120357d
            com.google.apps.d.d.b r4 = (com.google.apps.p3589d.p3593d.C45743b) r4
            int r6 = r4.f120262d
            if (r5 >= r6) goto L_0x0103
            int r7 = r4.f120260b
            int r8 = r11.f120358e
            if (r7 < r8) goto L_0x002c
            goto L_0x0103
        L_0x002c:
            if (r5 > r7) goto L_0x0038
            if (r6 > r8) goto L_0x0038
            com.google.apps.d.b.n r3 = r11.f120356c
            java.util.ArrayList r3 = r3.f120220a
            r3.add(r1)
            goto L_0x000d
        L_0x0038:
            if (r5 > r7) goto L_0x0043
            int r6 = r4.f120261c
            if (r6 <= r8) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            r11.m81619c(r0, r1)
            goto L_0x000d
        L_0x0043:
            int r6 = r1.f120319h
            r9 = 1
            r10 = 13
            if (r6 != r10) goto L_0x0073
            if (r5 > r7) goto L_0x0075
            com.google.apps.d.d.t r1 = (com.google.apps.p3589d.p3593d.C45761t) r1
            com.google.apps.d.d.v r3 = r1.f120344i
            com.google.apps.d.d.v r3 = r11.mo49883a(r3)
            com.google.apps.d.d.v r4 = r1.f120315d
            com.google.apps.d.d.v r5 = r1.f120316e
            com.google.apps.d.b.j r3 = r3.f120342a
            r0.mo49832k(r3)
            com.google.apps.d.d.f r1 = r1.f120337a
            com.google.apps.d.d.g r1 = r1.mo49871b()
            com.google.apps.d.d.n r1 = com.google.apps.p3589d.p3596g.C45833ai.m81767f(r1)
            com.google.apps.d.d.n r1 = r1.mo49886b(r4, r5)
            java.util.ArrayList r3 = r0.f120220a
            r3.add(r1)
            r11.f120354a = r9
            goto L_0x000d
        L_0x0073:
            if (r6 != r10) goto L_0x00b9
        L_0x0075:
            int r6 = r4.f120261c
            if (r8 < r6) goto L_0x00b9
            if (r5 >= r6) goto L_0x00b9
            com.google.apps.d.d.t r1 = (com.google.apps.p3589d.p3593d.C45761t) r1
            com.google.apps.d.d.v r4 = r1.f120344i
            com.google.apps.d.d.v r4 = r11.mo49883a(r4)
            com.google.apps.d.d.f r5 = r1.f120337a
            com.google.apps.d.d.g r5 = r5.mo49870a()
            com.google.apps.d.d.n r5 = com.google.apps.p3589d.p3596g.C45833ai.m81767f(r5)
            java.util.ArrayList r6 = r0.f120220a
            r6.add(r5)
            com.google.apps.d.b.j r6 = r4.f120342a
            r0.mo49832k(r6)
            com.google.apps.d.d.v r6 = r1.f120315d
            if (r6 != 0) goto L_0x00b2
            com.google.apps.d.d.v r6 = r1.f120316e
            if (r6 == 0) goto L_0x00a0
            goto L_0x00b2
        L_0x00a0:
            com.google.apps.d.b.j r1 = r4.f120342a
            java.util.ArrayList r1 = r1.f120220a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b5
            com.google.apps.d.c.e r1 = new com.google.apps.d.c.e
            r1.<init>(r5, r3, r3)
            r11.f120355b = r1
            goto L_0x00b5
        L_0x00b2:
            r11.m81619c(r0, r1)
        L_0x00b5:
            r11.f120354a = r9
            goto L_0x000d
        L_0x00b9:
            com.google.apps.d.d.n r5 = r1.mo49862a(r11)
            com.google.apps.d.d.v r6 = r1.f120315d
            boolean r6 = r11.m81620d(r6)
            if (r6 == 0) goto L_0x00c7
            r6 = r3
            goto L_0x00c9
        L_0x00c7:
            com.google.apps.d.d.v r6 = r5.f120315d
        L_0x00c9:
            com.google.apps.d.d.v r1 = r1.f120316e
            boolean r1 = r11.m81620d(r1)
            if (r1 == 0) goto L_0x00d3
            r1 = r3
            goto L_0x00d5
        L_0x00d3:
            com.google.apps.d.d.v r1 = r5.f120316e
        L_0x00d5:
            com.google.apps.d.d.v r7 = r5.f120315d
            if (r6 != r7) goto L_0x00dd
            com.google.apps.d.d.v r7 = r5.f120316e
            if (r1 == r7) goto L_0x00e1
        L_0x00dd:
            com.google.apps.d.d.n r5 = r5.mo49886b(r6, r1)
        L_0x00e1:
            boolean r1 = r5.mo49891k()
            if (r1 == 0) goto L_0x00ef
            com.google.apps.d.d.v r1 = r5.f120315d
            if (r1 != 0) goto L_0x00ef
            com.google.apps.d.d.v r1 = r5.f120316e
            if (r1 == 0) goto L_0x000d
        L_0x00ef:
            java.util.ArrayList r1 = r0.f120220a
            r1.add(r5)
            int r1 = r4.f120261c
            int r4 = r11.f120357d
            if (r1 != r4) goto L_0x000d
            com.google.apps.d.c.e r1 = new com.google.apps.d.c.e
            r1.<init>(r3, r5, r3)
            r11.f120355b = r1
            goto L_0x000d
        L_0x0103:
            java.util.ArrayList r5 = r0.f120220a
            r5.add(r1)
            int r4 = r4.f120262d
            int r5 = r11.f120357d
            if (r4 != r5) goto L_0x000d
            com.google.apps.d.c.e r4 = new com.google.apps.d.c.e
            r4.<init>(r1, r3, r3)
            r11.f120355b = r4
            goto L_0x000d
        L_0x0117:
            com.google.apps.d.d.v r0 = com.google.apps.p3589d.p3593d.C45763v.m81597e(r0)
            com.google.apps.d.d.j r12 = r12.f120343b
            com.google.apps.d.d.d r12 = (com.google.apps.p3589d.p3593d.C45745d) r12
            int r12 = r12.f120265a
            int r1 = r11.f120357d
            if (r12 != r1) goto L_0x012c
            com.google.apps.d.c.e r12 = new com.google.apps.d.c.e
            r12.<init>(r3, r3, r0)
            r11.f120355b = r12
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3594e.C45770ab.mo49883a(com.google.apps.d.d.v):com.google.apps.d.d.v");
    }
}
