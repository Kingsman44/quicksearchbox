package com.facebook.litho;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.p322a.C6078k;
import com.facebook.litho.p322a.C6085r;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6051j;
import com.facebook.p313c.C6058q;
import com.facebook.p313c.C6060s;
import com.facebook.p313c.C6063v;
import com.facebook.p313c.C6064w;
import com.facebook.p313c.C6065x;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import com.facebook.p313c.p316c.C6033a;
import com.facebook.p313c.p316c.C6034b;
import com.facebook.p313c.p316c.C6036d;
import com.facebook.p313c.p317d.C6038a;
import com.facebook.p313c.p317d.C6039b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.he */
/* compiled from: PG */
public final class C6380he extends C6022b implements C6065x {

    /* renamed from: a */
    public static final C6380he f18885a = new C6380he();

    private C6380he() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.facebook.litho.gr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m17100i(com.facebook.p313c.p314a.C6021a r10, com.facebook.p313c.p316c.C6036d r11) {
        /*
            java.lang.Object r10 = r10.f17741b
            com.facebook.litho.hd r10 = (com.facebook.litho.C6379hd) r10
            com.facebook.p313c.p317d.C6039b.m15532a()
            boolean r0 = r10.f18881g
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.facebook.litho.dg r11 = (com.facebook.litho.C6187dg) r11
            java.util.List r1 = r11.f18269B
            if (r1 == 0) goto L_0x001a
            r0.addAll(r1)
        L_0x001a:
            com.facebook.litho.u r1 = r11.f18298c
            com.facebook.litho.ComponentTree r1 = r1.f19017j
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0024
            r4 = r3
            goto L_0x008c
        L_0x0024:
            java.util.List r4 = r11.f18320y
            java.util.List r5 = r11.f18321z
            if (r4 == 0) goto L_0x0051
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0031
            goto L_0x0051
        L_0x0031:
            com.facebook.litho.fi r6 = r1.f17874E
            if (r6 != 0) goto L_0x0036
            goto L_0x0051
        L_0x0036:
            int r6 = r4.size()
            if (r6 > 0) goto L_0x003d
            goto L_0x0051
        L_0x003d:
            java.lang.Object r10 = r4.get(r2)
            com.facebook.litho.q r10 = (com.facebook.litho.C6407q) r10
            java.lang.Object r10 = r5.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "Trying to apply previous render data to component that doesn't support it"
            r10.<init>(r11)
            throw r10
        L_0x0051:
            java.util.List r4 = r11.f18320y
            if (r4 == 0) goto L_0x007b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r5 = r11.f18320y
            int r5 = r5.size()
            r6 = 0
        L_0x0061:
            if (r6 >= r5) goto L_0x007c
            java.util.List r7 = r11.f18320y
            java.lang.Object r7 = r7.get(r6)
            com.facebook.litho.q r7 = (com.facebook.litho.C6407q) r7
            java.util.List r8 = r11.f18321z
            java.lang.Object r8 = r8.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            com.facebook.litho.C6103an.m15882i(r7)
            com.facebook.litho.u r7 = r7.f18995r
            int r6 = r6 + 1
            goto L_0x0061
        L_0x007b:
            r4 = r3
        L_0x007c:
            java.util.List r1 = r1.mo12710f()
            if (r1 == 0) goto L_0x008c
            if (r4 != 0) goto L_0x0089
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0089:
            r4.addAll(r1)
        L_0x008c:
            if (r4 == 0) goto L_0x00a4
            java.util.Iterator r1 = r4.iterator()
        L_0x0092:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r1.next()
            com.facebook.litho.gr r4 = (com.facebook.litho.C6365gr) r4
            java.lang.String r5 = r11.f18312q
            com.facebook.p313c.p316c.C6035c.m15517a(r4, r0, r5)
            goto L_0x0092
        L_0x00a4:
            com.facebook.litho.gk r1 = new com.facebook.litho.gk
            r1.<init>()
            com.facebook.litho.gk r4 = new com.facebook.litho.gk
            r4.<init>()
            com.facebook.litho.gt r5 = r11.f18311p
            if (r5 == 0) goto L_0x00f0
            int r6 = r0.size()
            r7 = 0
        L_0x00b7:
            if (r7 >= r6) goto L_0x00f0
            java.lang.Object r8 = r0.get(r7)
            com.facebook.litho.gr r8 = (com.facebook.litho.C6365gr) r8
            if (r8 == 0) goto L_0x00ce
            com.facebook.litho.a.i r9 = com.facebook.litho.p322a.C6075h.f17958c
            com.facebook.p313c.p316c.C6035c.m15520d(r5, r8, r9, r1)
            com.facebook.litho.a.i r9 = com.facebook.litho.p322a.C6075h.f17959d
            com.facebook.p313c.p316c.C6035c.m15520d(r5, r8, r9, r4)
            int r7 = r7 + 1
            goto L_0x00b7
        L_0x00ce:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.f18312q
            java.lang.String r0 = r5.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "NULL_TRANSITION when collecting root bounds anim. Root: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = ", root TransitionId: "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            boolean r5 = r1.f18808a
            r6 = 1
            if (r6 == r5) goto L_0x00f6
            r1 = r3
        L_0x00f6:
            boolean r5 = r4.f18808a
            if (r6 == r5) goto L_0x00fb
            r4 = r3
        L_0x00fb:
            com.facebook.litho.u r11 = r11.f18298c
            com.facebook.litho.ComponentTree r11 = r11.f19017j
            if (r11 == 0) goto L_0x0105
            r11.f17920w = r1
            r11.f17921x = r4
        L_0x0105:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x010c
            goto L_0x011f
        L_0x010c:
            int r11 = r0.size()
            if (r11 != r6) goto L_0x011a
            java.lang.Object r11 = r0.get(r2)
            r3 = r11
            com.facebook.litho.gr r3 = (com.facebook.litho.C6365gr) r3
            goto L_0x011f
        L_0x011a:
            com.facebook.litho.fc r3 = new com.facebook.litho.fc
            r3.<init>(r0)
        L_0x011f:
            r10.f18882h = r3
            r10.f18881g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6380he.m17100i(com.facebook.c.a.a, com.facebook.c.c.d):void");
    }

    /* renamed from: j */
    public static void m17101j(C6021a aVar, C6259fb fbVar) {
        C6379hd hdVar = (C6379hd) aVar.f17741b;
        C6367gt gtVar = ((C6185de) hdVar.f18876b.get(((C6051j) fbVar.mo13250b()).f17806d.f17827b)).f18260j;
        C6376ha haVar = hdVar.f18879e;
        if (!(haVar == null || gtVar == null)) {
            haVar.mo13394f(gtVar, (C6259fb) null);
        }
        short s = fbVar.f18498b;
        for (int i = 0; i < s; i++) {
            m17106u(aVar, (C6051j) fbVar.f18497a[fbVar.mo13249a(i)], true);
        }
    }

    /* renamed from: l */
    public static void m17102l(C6021a aVar, C6036d dVar, int i, boolean z) {
        int s = m17104s(dVar, i);
        for (int i2 = i; i2 <= s; i2++) {
            long j = ((C6201du) dVar.mo12598d(i2).f17827b).f18345a.f18263m;
            if (z) {
                if (!aVar.mo12573e(j)) {
                    aVar.mo12570b(j, false);
                }
            } else if (aVar.mo12573e(j)) {
                aVar.mo12572d(j, false);
            }
        }
        C6060s sVar = dVar.mo12598d(i).f17826a;
        while (sVar != null && sVar.f17826a != null) {
            long j2 = ((C6201du) sVar.f17827b).f18345a.f18263m;
            if (z) {
                if (!aVar.mo12573e(j2)) {
                    aVar.mo12570b(j2, false);
                }
                if (!aVar.mo12573e(j2)) {
                    aVar.mo12570b(j2, false);
                }
            } else if (aVar.mo12573e(j2)) {
                aVar.mo12572d(j2, false);
            }
            sVar = sVar.f17826a;
        }
    }

    /* renamed from: o */
    public static final void m17103o(C6021a aVar, C6036d dVar) {
        C6379hd hdVar;
        C6036d dVar2;
        C6367gt gtVar;
        C6369gv gvVar;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        Map map;
        C6021a aVar2 = aVar;
        C6036d dVar3 = dVar;
        C6379hd hdVar2 = (C6379hd) aVar2.f17741b;
        hdVar2.f18877c = dVar3;
        if (((C6187dg) dVar3).f18315t != hdVar2.f18878d) {
            hdVar2.f18883i = null;
        }
        C6058q.m15623a();
        try {
            if (hdVar2.f18878d != ((C6187dg) dVar3).f18315t) {
                C6379hd hdVar3 = (C6379hd) aVar2.f17741b;
                if (hdVar3.f18879e != null) {
                    for (C6259fb j : hdVar3.f18875a.values()) {
                        m17101j(aVar2, j);
                    }
                    aVar.mo12571c();
                    hdVar3.f18875a.clear();
                    hdVar3.f18876b.clear();
                    hdVar3.f18880f.clear();
                    C6376ha haVar = hdVar3.f18879e;
                    for (C6367gt a : haVar.f18862b.mo13382c()) {
                        C6369gv gvVar2 = (C6369gv) haVar.f18862b.mo13380a(a);
                        haVar.mo13395h(gvVar2, (C6259fb) null);
                        C6376ha.m17089b(gvVar2);
                    }
                    C6368gu guVar = haVar.f18862b;
                    guVar.f18828a.clear();
                    guVar.f18829b.clear();
                    guVar.f18830c.clear();
                    guVar.f18831d.clear();
                    haVar.f18863c.mo3728g();
                    haVar.f18861a.clear();
                    int size = haVar.f18865e.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((C6078k) haVar.f18865e.get(size)).mo12772e();
                    }
                    haVar.f18865e.clear();
                    haVar.f18869i = null;
                    haVar.f18870j.clear();
                }
                if (!hdVar2.f18877c.mo12599q()) {
                    int b = aVar2.f17740a.f17798b.mo12628b();
                    hdVar = (C6379hd) aVar2.f17741b;
                    if (hdVar.f18883i != null && b != 0) {
                        int i5 = 1;
                        while (i5 < b) {
                            if (m17108w(hdVar, dVar3) && m17107v(hdVar) && hdVar.f18879e != null && (dVar2 = hdVar.f18883i) != null && (gtVar = ((C6201du) dVar2.mo12598d(i5).f17827b).f18345a.f18260j) != null && (gvVar = (C6369gv) hdVar.f18879e.f18862b.mo13380a(gtVar)) != null && gvVar.f18834c == 2 && gvVar.f18839h) {
                                int s = m17104s(hdVar.f18883i, i5);
                                for (int i6 = i5; i6 <= s; i6++) {
                                    if (aVar2.f17740a.f17798b.mo12629h(i6) == null) {
                                        long j2 = ((C6201du) hdVar.f18883i.mo12598d(i6).f17827b).f18345a.f18263m;
                                        if (aVar2.mo12573e(j2)) {
                                            z = false;
                                            aVar2.mo12572d(j2, false);
                                        } else {
                                            z = false;
                                        }
                                        aVar2.mo12570b(j2, true);
                                        aVar2.mo12572d(j2, z);
                                    }
                                    C6063v vVar = aVar2.f17740a.f17798b.mo12629h(i6).f17806d.f17827b;
                                    Map map2 = hdVar.f18876b;
                                    C6036d dVar4 = hdVar.f18883i;
                                    map2.put(vVar, ((C6201du) vVar).f18345a);
                                }
                                C6051j h = aVar2.f17740a.f17798b.mo12629h(i5);
                                if (h != null) {
                                    C6040e eVar = aVar2.f17740a.f17798b.mo12630i().f17804b;
                                    C6040e eVar2 = h.f17804b;
                                    if (eVar2 != null) {
                                        if (eVar != eVar2) {
                                            Object obj = h.f17803a;
                                            if (obj != null) {
                                                int i7 = 0;
                                                int i8 = 0;
                                                for (C6040e eVar3 = eVar2; eVar3 != eVar; eVar3 = (C6040e) eVar3.getParent()) {
                                                    i7 += eVar3.getLeft();
                                                    i8 += eVar3.getTop();
                                                }
                                                if (obj instanceof View) {
                                                    View view = (View) obj;
                                                    i4 = i7 + view.getLeft();
                                                    i3 = i8 + view.getTop();
                                                    i = view.getWidth() + i4;
                                                    i2 = view.getHeight();
                                                } else {
                                                    Rect bounds = ((Drawable) obj).getBounds();
                                                    i4 = i7 + bounds.left;
                                                    i = bounds.width() + i4;
                                                    i3 = i8 + bounds.top;
                                                    i2 = bounds.height();
                                                }
                                                eVar2.mo12605o(h);
                                                C6038a.m15530b(new Rect(i4, i3, i, i2 + i3), (Rect) null, obj, false);
                                                eVar.mo12603i(i5, h);
                                                h.f17804b = eVar;
                                            } else {
                                                throw new IllegalStateException("Disappearing item content should never be null. Index: " + i5);
                                            }
                                        }
                                        C6036d dVar5 = hdVar.f18883i;
                                        C6185de deVar = ((C6201du) h.f17806d.f17827b).f18345a;
                                        C6367gt gtVar2 = deVar.f18260j;
                                        C6259fb fbVar = (C6259fb) hdVar.f18875a.get(gtVar2);
                                        if (fbVar == null) {
                                            fbVar = new C6259fb();
                                            hdVar.f18875a.put(gtVar2, fbVar);
                                        }
                                        fbVar.mo13251c(deVar.mo13154a(), h);
                                        aVar2.f17740a.f17798b.mo12638u(((C6201du) h.f17806d.f17827b).f18345a.f18263m);
                                        i5 = s;
                                    } else {
                                        throw new IllegalStateException("Disappearing item host should never be null. Index: " + i5);
                                    }
                                } else {
                                    throw new IllegalStateException("The root of the disappearing subtree should not be null, acquireMountReference on this index should be called before this. Index: " + i5);
                                }
                            }
                            i5++;
                        }
                        return;
                    }
                }
            }
            if (!hdVar2.f18875a.isEmpty()) {
                C6379hd hdVar4 = (C6379hd) aVar2.f17741b;
                for (C6367gt remove : ((C6187dg) dVar3).f18268A.keySet()) {
                    C6259fb fbVar2 = (C6259fb) hdVar4.f18875a.remove(remove);
                    if (fbVar2 != null) {
                        m17101j(aVar2, fbVar2);
                    }
                }
            }
            if (m17108w(hdVar2, dVar3)) {
                m17100i(aVar, dVar);
                if (m17107v(hdVar2)) {
                    C6365gr grVar = hdVar2.f18882h;
                    C6379hd hdVar5 = (C6379hd) aVar2.f17741b;
                    if (hdVar5.f18879e == null) {
                        hdVar5.f18879e = new C6376ha(new C6378hc(aVar2));
                    }
                    C6036d dVar6 = hdVar5.f18883i;
                    if (dVar6 == null) {
                        map = null;
                    } else {
                        map = ((C6187dg) dVar6).f18268A;
                    }
                    C6376ha haVar2 = hdVar5.f18879e;
                    Map map3 = ((C6187dg) dVar3).f18268A;
                    C6058q.m15623a();
                    for (C6369gv gvVar3 : haVar2.f18862b.mo13381b()) {
                        gvVar3.f18837f = false;
                    }
                    if (map == null) {
                        for (Map.Entry entry : map3.entrySet()) {
                            haVar2.mo13392c((C6367gt) entry.getKey(), (C6259fb) null, (C6259fb) entry.getValue());
                        }
                    } else {
                        HashSet hashSet = new HashSet();
                        for (C6367gt gtVar3 : map3.keySet()) {
                            int i9 = gtVar3.f18824a;
                            C6259fb fbVar3 = (C6259fb) map3.get(gtVar3);
                            C6259fb fbVar4 = (C6259fb) map.get(gtVar3);
                            if (fbVar3 != null) {
                                hashSet.add(gtVar3);
                            } else if (i9 == 3) {
                            }
                            haVar2.mo13392c(gtVar3, fbVar4, fbVar3);
                        }
                        for (C6367gt gtVar4 : map.keySet()) {
                            if (!hashSet.contains(gtVar4)) {
                                haVar2.mo13392c(gtVar4, (C6259fb) map.get(gtVar4), (C6259fb) null);
                            }
                        }
                    }
                    haVar2.f18869i = haVar2.mo13391a(grVar);
                    HashSet<C6367gt> hashSet2 = new HashSet<>();
                    for (C6367gt gtVar5 : haVar2.f18862b.mo13382c()) {
                        C6369gv gvVar4 = (C6369gv) haVar2.f18862b.mo13380a(gtVar5);
                        if (gvVar4.f18832a.isEmpty()) {
                            haVar2.mo13395h(gvVar4, (C6259fb) null);
                            C6376ha.m17089b(gvVar4);
                            hashSet2.add(gtVar5);
                        }
                    }
                    for (C6367gt d : hashSet2) {
                        haVar2.f18862b.mo13383d(d);
                    }
                    C6057p pVar = C6058q.f17821a;
                    for (C6367gt gtVar6 : ((C6187dg) dVar3).f18268A.keySet()) {
                        if (hdVar5.f18879e.f18862b.f18831d.containsKey(gtVar6)) {
                            hdVar5.f18880f.add(gtVar6);
                        }
                    }
                }
            }
            C6376ha haVar3 = hdVar2.f18879e;
            if (haVar3 != null) {
                ArrayList arrayList = new ArrayList(haVar3.f18862b.mo13381b());
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    C6369gv gvVar5 = (C6369gv) arrayList.get(i10);
                    if (gvVar5.f18838g) {
                        gvVar5.f18838g = false;
                        ArrayList arrayList2 = new ArrayList(gvVar5.f18832a.values());
                        int size3 = arrayList2.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            C6078k kVar = ((C6370gw) arrayList2.get(i11)).f18841b;
                            if (kVar != null) {
                                kVar.mo12772e();
                                haVar3.f18866f.mo13385e(kVar);
                            }
                        }
                    }
                }
            }
            aVar.mo12571c();
            if (!hdVar2.f18880f.isEmpty()) {
                C6379hd hdVar6 = (C6379hd) aVar2.f17741b;
                for (Map.Entry entry2 : ((C6187dg) dVar3).f18268A.entrySet()) {
                    if (hdVar6.f18880f.contains(entry2.getKey())) {
                        C6259fb fbVar5 = (C6259fb) entry2.getValue();
                        short s2 = fbVar5.f18498b;
                        for (int i12 = 0; i12 < s2; i12++) {
                            m17102l(aVar2, dVar3, dVar3.mo12622f(((C6185de) fbVar5.f18497a[fbVar5.mo13249a(i12)]).f18263m), true);
                        }
                    }
                }
            }
            C6057p pVar2 = C6058q.f17821a;
            int b2 = aVar2.f17740a.f17798b.mo12628b();
            hdVar = (C6379hd) aVar2.f17741b;
            if (hdVar.f18883i != null) {
            }
        } finally {
            C6057p pVar3 = C6058q.f17821a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0014 A[ADDED_TO_REGION] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17104s(com.facebook.p313c.p316c.C6036d r3, int r4) {
        /*
            com.facebook.c.s r0 = r3.mo12598d(r4)
            int r4 = r4 + 1
            int r1 = r3.mo12597a()
        L_0x000a:
            if (r4 >= r1) goto L_0x0020
            com.facebook.c.s r2 = r3.mo12598d(r4)
            com.facebook.c.s r2 = r2.f17826a
        L_0x0012:
            if (r2 == r0) goto L_0x001d
            if (r2 == 0) goto L_0x001a
            com.facebook.c.s r2 = r2.f17826a
            if (r2 != 0) goto L_0x0012
        L_0x001a:
            int r4 = r4 + -1
            return r4
        L_0x001d:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0020:
            int r3 = r3.mo12597a()
            int r3 = r3 + -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6380he.m17104s(com.facebook.c.c.d, int):int");
    }

    /* renamed from: t */
    private static void m17105t(View view) {
        C6039b.m15532a();
        if (view instanceof C6033a) {
            ((C6033a) view).mo12593v(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m17105t(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: u */
    private static void m17106u(C6021a aVar, C6051j jVar, boolean z) {
        C6379hd hdVar = (C6379hd) aVar.f17741b;
        Object obj = jVar.f17803a;
        if ((obj instanceof C6040e) && !(obj instanceof C6064w)) {
            C6040e eVar = (C6040e) obj;
            int a = eVar.mo12601a();
            while (true) {
                a--;
                if (a < 0) {
                    break;
                }
                m17106u(aVar, eVar.mo12602c(a), false);
            }
            if (eVar.mo12601a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
            }
        }
        C6040e eVar2 = jVar.f17804b;
        if (eVar2 != null) {
            if (z) {
                ((C6034b) eVar2).mo12595f(jVar);
            } else {
                eVar2.mo12605o(jVar);
            }
            aVar.f17740a.f17798b.mo12623B(jVar);
            hdVar.f18876b.remove(jVar.f17806d.f17827b);
            return;
        }
        throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
    }

    /* renamed from: v */
    private static boolean m17107v(C6379hd hdVar) {
        return hdVar.f18882h != null;
    }

    /* renamed from: w */
    private static boolean m17108w(C6379hd hdVar, C6036d dVar) {
        return hdVar.f18878d == ((C6187dg) dVar).f18315t || hdVar.f18877c.mo12599q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12574a() {
        return new C6379hd();
    }

    /* renamed from: c */
    public final void mo12576c(C6021a aVar, C6063v vVar, Object obj) {
        C6367gt gtVar;
        C6369gv gvVar;
        C6259fb fbVar;
        C6379hd hdVar = (C6379hd) aVar.f17741b;
        C6259fb fbVar2 = null;
        if (obj instanceof C6040e) {
            C6040e eVar = (C6040e) obj;
            int a = eVar.mo12601a();
            for (int i = 0; i < a; i++) {
                C6185de deVar = (C6185de) hdVar.f18876b.get(eVar.mo12602c(i).f17806d.f17827b);
                if (deVar != null) {
                    hdVar.f18879e.mo13394f(deVar.f18260j, (C6259fb) null);
                }
            }
        }
        C6185de deVar2 = hdVar.f18877c != null ? ((C6201du) vVar).f18345a : null;
        if (deVar2 != null && (gtVar = deVar2.f18260j) != null) {
            int a2 = deVar2.mo13154a();
            C6376ha haVar = hdVar.f18879e;
            if (haVar != null && (gvVar = (C6369gv) haVar.f18862b.mo13380a(gtVar)) != null && (fbVar = gvVar.f18833b) != null && fbVar.f18497a[a2] != null) {
                if (fbVar.f18498b > 1) {
                    C6259fb fbVar3 = new C6259fb(fbVar);
                    fbVar3.mo13252d(a2, (Object) null);
                    fbVar2 = fbVar3;
                }
                haVar.mo13395h(gvVar, fbVar2);
            }
        }
    }

    /* renamed from: d */
    public final void mo12577d(C6021a aVar) {
        C6379hd hdVar = (C6379hd) aVar.f17741b;
        if (hdVar.f18879e != null) {
            C6058q.m15623a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(hdVar.f18880f.size());
            int b = aVar.f17740a.f17798b.mo12628b();
            for (int i = 0; i < b; i++) {
                C6051j h = aVar.f17740a.f17798b.mo12629h(i);
                if (h != null) {
                    C6036d dVar = hdVar.f18877c;
                    C6185de deVar = ((C6201du) h.f17806d.f17827b).f18345a;
                    if (deVar.f18260j != null) {
                        int a = deVar.mo13154a();
                        C6259fb fbVar = (C6259fb) linkedHashMap.get(deVar.f18260j);
                        if (fbVar == null) {
                            fbVar = new C6259fb();
                            linkedHashMap.put(deVar.f18260j, fbVar);
                        }
                        fbVar.mo13252d(a, h.f17803a);
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                hdVar.f18879e.mo13394f((C6367gt) entry.getKey(), (C6259fb) entry.getValue());
            }
            for (Map.Entry entry2 : hdVar.f18875a.entrySet()) {
                C6259fb fbVar2 = (C6259fb) entry2.getValue();
                C6259fb fbVar3 = new C6259fb();
                short s = fbVar2.f18498b;
                for (int i2 = 0; i2 < s; i2++) {
                    fbVar3.mo13251c(fbVar2.mo13249a(i2), ((C6051j) fbVar2.f18497a[fbVar2.mo13249a(i2)]).f17803a);
                }
                hdVar.f18879e.mo13394f((C6367gt) entry2.getKey(), fbVar3);
            }
            C6057p pVar = C6058q.f17821a;
        }
        if (m17108w(hdVar, hdVar.f18877c) && m17107v(hdVar)) {
            C6376ha haVar = hdVar.f18879e;
            C6058q.m15623a();
            for (C6085r rVar : haVar.f18864d.keySet()) {
                float floatValue = ((Float) haVar.f18864d.get(rVar)).floatValue();
                C6259fb fbVar4 = ((C6369gv) haVar.f18862b.mo13380a(rVar.f17977a)).f18833b;
                if (fbVar4 != null) {
                    C6376ha.m17091g(rVar.f17978b, floatValue, fbVar4);
                }
            }
            haVar.f18864d.clear();
            C6078k kVar = haVar.f18869i;
            if (kVar != null) {
                kVar.mo12769b(haVar.f18867g);
                haVar.f18869i.mo12774g(haVar.f18868h);
                haVar.f18869i = null;
            }
            C6057p pVar2 = C6058q.f17821a;
        }
        ((C6187dg) hdVar.f18877c).f18298c.f19017j.f17919v = false;
        C6036d dVar2 = hdVar.f18877c;
        hdVar.f18883i = dVar2;
        hdVar.f18881g = false;
        hdVar.f18878d = ((C6187dg) dVar2).f18315t;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.c.c.d, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo12578e(com.facebook.p313c.p314a.C6021a r1, java.lang.Object r2, android.graphics.Rect r3) {
        /*
            r0 = this;
            m17103o(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6380he.mo12578e(com.facebook.c.a.a, java.lang.Object, android.graphics.Rect):void");
    }

    /* renamed from: f */
    public final void mo12579f(C6021a aVar) {
        aVar.mo12571c();
    }

    /* renamed from: g */
    public final void mo12580g(C6021a aVar) {
        aVar.mo12571c();
        mo13396h(aVar);
    }

    /* renamed from: h */
    public final void mo13396h(C6021a aVar) {
        ((C6379hd) aVar.f17741b).f18878d = -1;
    }

    /* renamed from: k */
    public final void mo12660k(C6021a aVar, C6051j jVar, C6040e eVar) {
        C6379hd hdVar = (C6379hd) aVar.f17741b;
        C6185de deVar = (C6185de) hdVar.f18876b.get(jVar.f17806d.f17827b);
        C6259fb fbVar = (C6259fb) hdVar.f18875a.get(deVar.f18260j);
        if (fbVar != null) {
            if (fbVar.f18497a[deVar.mo13154a()] != null) {
                ((C6034b) eVar).mo12596n(jVar);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo12661m(C6021a aVar, C6051j jVar) {
        return ((C6379hd) aVar.f17741b).f18876b.containsKey(jVar.f17806d.f17827b);
    }

    /* renamed from: n */
    public final void mo12581n(C6021a aVar, C6063v vVar, Object obj) {
        C6201du duVar = (C6201du) vVar;
        if (aVar.mo12573e(duVar.f18345a.f18263m) && ((C6379hd) aVar.f17741b).f18877c.mo12600r(duVar.f18345a.f18263m)) {
            m17105t((View) obj);
        }
    }
}
