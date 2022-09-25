package com.google.common.p4535g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.google.common.g.ab */
/* compiled from: PG */
public final class C59109ab {

    /* renamed from: a */
    public C59218l f157082a;

    /* renamed from: b */
    private final C59142bh f157083b;

    /* renamed from: c */
    private int f157084c;

    /* renamed from: d */
    private boolean f157085d;

    /* renamed from: e */
    private final List f157086e;

    /* renamed from: f */
    private final PriorityQueue f157087f = new PriorityQueue();

    /* renamed from: g */
    private C59126as f157088g;

    /* renamed from: h */
    private final ArrayList f157089h;

    /* renamed from: i */
    private final List f157090i;

    /* renamed from: j */
    private final C59141bg[] f157091j;

    /* renamed from: k */
    private final PriorityQueue f157092k;

    /* renamed from: l */
    private C59219m f157093l;

    public C59109ab(C59142bh bhVar) {
        ArrayList arrayList = new ArrayList();
        this.f157086e = arrayList;
        new ArrayList();
        this.f157089h = new ArrayList();
        new ArrayList();
        this.f157090i = new ArrayList();
        this.f157091j = new C59141bg[12];
        this.f157092k = new PriorityQueue();
        this.f157083b = bhVar;
        this.f157084c = Integer.MAX_VALUE;
        this.f157082a = C59218l.f157297a;
        this.f157088g = bhVar.mo56514a();
        boolean z = bhVar.f157175a.size() <= 150;
        this.f157085d = z;
        if (!z) {
            arrayList.clear();
            C59126as asVar = this.f157088g;
            asVar.f157130b = 0;
            if (!asVar.mo56446g()) {
                C59126as d = this.f157088g.mo56442d();
                C59226t b = d.mo56440b();
                C59126as d2 = this.f157088g.mo56442d();
                d2.f157130b = d2.f157129a.size();
                d2.mo56451k();
                C59226t b2 = d2.mo56440b();
                if (!d.mo56447h(d2)) {
                    int c = b.mo56665c(b2) + 1;
                    C59226t w = b2.mo56676w(c);
                    for (C59226t w2 = b.mo56676w(c); !w2.equals(w) && !d.mo56446g(); w2 = w2.mo56674u()) {
                        C59226t x = w2.mo56677x();
                        if (d.mo56439a(x) <= 0) {
                            d.mo56443e(x.mo56674u());
                            C59226t b3 = d.mo56440b();
                            C59126as d3 = d.mo56442d();
                            d3.mo56451k();
                            m91547c(b, d3.mo56440b());
                            b = b3;
                        }
                    }
                }
                m91547c(b, b2);
            }
        }
    }

    /* renamed from: c */
    private final void m91547c(C59226t tVar, C59226t tVar2) {
        this.f157086e.add(tVar.mo56676w(tVar.mo56665c(tVar2)));
    }

    /* renamed from: d */
    private final void m91548d(C59141bg bgVar, C59108aa aaVar) {
        C59219m c = aaVar.mo56415c(bgVar.f157172a, this.f157093l);
        if (c != this.f157093l) {
            if (this.f157092k.size() >= this.f157084c) {
                this.f157092k.poll();
            }
            this.f157092k.add(new C59232z(c, bgVar));
            if (this.f157092k.size() >= this.f157084c) {
                this.f157093l = ((C59232z) this.f157092k.peek()).f157336a;
            }
        }
    }

    /* renamed from: e */
    private final boolean m91549e(C59226t tVar, C59126as asVar, boolean z, C59108aa aaVar) {
        if (z) {
            asVar.mo56443e(tVar.mo56678y());
        }
        if (tVar.mo56661G()) {
            while (!asVar.mo56446g() && asVar.mo56439a(tVar) == 0) {
                m91548d((C59141bg) asVar.mo56441c(), aaVar);
                asVar.mo56450j();
            }
            return false;
        }
        C59226t x = tVar.mo56677x();
        int i = 0;
        while (!asVar.mo56446g() && asVar.mo56439a(x) <= 0) {
            if (i == 12) {
                C59219m b = aaVar.mo56414b(new C59225s(tVar));
                if (b.compareTo(this.f157093l) >= 0) {
                    return true;
                }
                this.f157087f.add(new C59231y(b, tVar));
                return true;
            }
            this.f157091j[i] = (C59141bg) asVar.mo56441c();
            asVar.mo56450j();
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            m91548d(this.f157091j[i2], aaVar);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo56417a(C59108aa aaVar) {
        ArrayList arrayList;
        C59108aa aaVar2 = aaVar;
        this.f157093l = C59219m.m91874e(this.f157082a);
        if (this.f157085d) {
            this.f157088g.f157130b = 0;
            while (!this.f157088g.mo56446g()) {
                m91548d((C59141bg) this.f157088g.mo56441c(), aaVar2);
                this.f157088g.mo56450j();
            }
            return;
        }
        if (this.f157084c == 1) {
            this.f157088g.mo56443e(C59226t.m91939t(aaVar.mo56416d()));
            if (!this.f157088g.mo56446g()) {
                m91548d((C59141bg) this.f157088g.mo56441c(), aaVar2);
            }
            if (!this.f157088g.mo56445f()) {
                this.f157088g.mo56451k();
                m91548d((C59141bg) this.f157088g.mo56441c(), aaVar2);
            }
        }
        List list = this.f157086e;
        C59167cf b = C59171cj.m91769b();
        b.f157214a = 4;
        C59171cj cjVar = new C59171cj(b);
        if (!this.f157093l.mo56620f()) {
            C59224r c = C59224r.m91905c(aaVar.mo56416d(), new C59218l(aaVar.mo56413a() + this.f157093l.mo56617c().f157299c));
            ArrayList arrayList2 = this.f157089h;
            arrayList2.clear();
            C59221o oVar = C59164cc.f157204f.f157207g;
            double d = c.f157320b.mo56617c().f157299c;
            int min = Math.min(oVar.mo56639a(d + d), 29);
            if (min == 0) {
                Collections.addAll(arrayList2, C59226t.f157329a);
            } else {
                C59226t.m91939t(c.f157319a).mo56656B(min, arrayList2);
            }
            C59227u.m91962d(arrayList2);
            while (arrayList2.size() > cjVar.f157225e) {
                int i = -1;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i4 >= arrayList2.size()) {
                        break;
                    }
                    int c2 = ((C59226t) arrayList2.get(i3)).mo56665c((C59226t) arrayList2.get(i4));
                    int i5 = c2 > i ? c2 : i;
                    if (c2 > i) {
                        i2 = i3;
                    }
                    i3 = i4;
                    i = i5;
                }
                if (i < 0) {
                    break;
                }
                arrayList2.set(i2, ((C59226t) arrayList2.get(i2)).mo56676w(i));
                C59227u.m91962d(arrayList2);
            }
            ArrayList arrayList3 = this.f157089h;
            List list2 = this.f157090i;
            list2.clear();
            int i6 = 0;
            int i7 = 0;
            while (i6 < list.size() && i7 < arrayList3.size()) {
                C59226t tVar = (C59226t) list.get(i6);
                C59226t y = tVar.mo56678y();
                C59226t tVar2 = (C59226t) arrayList3.get(i7);
                C59226t y2 = tVar2.mo56678y();
                if (!y.mo56659E(y2)) {
                    if (!y2.mo56659E(y)) {
                        arrayList = arrayList3;
                        if (C59226t.m91921L(tVar.f157334b, tVar2.f157334b)) {
                            list2.add(tVar);
                            i6++;
                        } else {
                            list2.add(tVar2);
                            i7++;
                        }
                    } else if (tVar2.mo56662H(tVar.mo56677x())) {
                        list2.add(tVar2);
                        i7++;
                    } else {
                        i6 = C59227u.m91961a(list, y2, i6 + 1);
                        int i8 = i6 - 1;
                        if (tVar2.mo56662H(((C59226t) list.get(i8)).mo56677x())) {
                            arrayList = arrayList3;
                            i6 = i8;
                        }
                    }
                    arrayList3 = arrayList;
                } else if (tVar.mo56662H(tVar2.mo56677x())) {
                    list2.add(tVar);
                    i6++;
                } else {
                    i7 = C59227u.m91961a(arrayList3, y, i7 + 1);
                    int i9 = i7 - 1;
                    if (tVar.mo56662H(((C59226t) arrayList3.get(i9)).mo56677x())) {
                        arrayList = arrayList3;
                        i7 = i9;
                        arrayList3 = arrayList;
                    }
                }
                arrayList = arrayList3;
                arrayList3 = arrayList;
            }
            list = this.f157090i;
        }
        this.f157088g.f157130b = 0;
        for (int i10 = 0; i10 < list.size() && !this.f157088g.mo56446g(); i10++) {
            C59226t tVar3 = (C59226t) list.get(i10);
            m91549e(tVar3, this.f157088g, this.f157088g.mo56439a(tVar3.mo56678y()) <= 0, aaVar2);
        }
        while (!this.f157087f.isEmpty()) {
            C59231y yVar = (C59231y) this.f157087f.poll();
            if (yVar.f157336a.compareTo(this.f157093l) < 0) {
                C59226t p = yVar.f157340b.mo56672p();
                int i11 = 0;
                boolean z = true;
                while (i11 < 4) {
                    z = m91549e(p, this.f157088g, z, aaVar2);
                    i11++;
                    p = p.mo56674u();
                }
            } else {
                this.f157087f.clear();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo56418b(List list) {
        int size = this.f157092k.size();
        int size2 = list.size() + size;
        list.addAll(Collections.nCopies(size, (Object) null));
        while (true) {
            int i = size - 1;
            if (size > 0) {
                size2--;
                list.set(size2, (C59232z) this.f157092k.poll());
                size = i;
            } else {
                return;
            }
        }
    }
}
