package com.google.android.libraries.search.p2871b.p2899m;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2888c.C37219b;
import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57913b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.b.m.j */
/* compiled from: PG */
public final class C37296j implements C37287a {

    /* renamed from: a */
    public final Object f99098a = new Object();

    /* renamed from: b */
    public C58833ax f99099b = C58836b.f156633a;

    /* renamed from: c */
    private final LinkedList f99100c = new LinkedList();

    /* renamed from: d */
    private final C58331bb f99101d = new C58331bb();

    /* renamed from: e */
    private final Set f99102e = new HashSet();

    /* renamed from: f */
    private final C37219b f99103f;

    /* renamed from: g */
    private final Map f99104g = new HashMap();

    /* renamed from: h */
    private final C21370a f99105h;

    public C37296j(C21370a aVar, C58833ax axVar) {
        this.f99105h = aVar;
        this.f99103f = (C37219b) axVar.mo56109e(C37219b.m66045b().mo40699a());
    }

    /* renamed from: d */
    private static boolean m66246d(Map map, Map map2) {
        for (String str : map2.keySet()) {
            if (map.containsKey(str) && !C58758qx.m90646d((Set) map.get(str), (Set) map2.get(str)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized C58833ax mo40830a(C37256e eVar) {
        C37291e eVar2;
        C37293g a;
        if (this.f99100c.size() + 1 > this.f99103f.mo40700a()) {
            C37256e eVar3 = (C37256e) this.f99100c.pollFirst();
            if (eVar3 != null) {
                this.f99101d.mo55278h(eVar3);
                this.f99102e.remove(eVar3);
                if (eVar3.mo40798c().f98879d && this.f99104g.containsKey(eVar3)) {
                    C60870cx cxVar = (C60870cx) this.f99104g.get(eVar3);
                    if (!cxVar.isDone()) {
                        cxVar.cancel(false);
                    }
                }
            }
        }
        C58495hd f = eVar.mo40800f();
        LinkedList linkedList = this.f99100c;
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        C58833ax axVar = C58836b.f156633a;
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            C37256e eVar4 = (C37256e) listIterator.previous();
            C57863d dVar = ((C57913b) eVar4.mo40797b().instance).f154902c;
            if (dVar == null) {
                dVar = C57863d.f154580d;
            }
            C63042fg fgVar = dVar.f154583b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C57863d dVar2 = ((C57913b) eVar.mo40797b().instance).f154902c;
            if (dVar2 == null) {
                dVar2 = C57863d.f154580d;
            }
            C63042fg fgVar2 = dVar2.f154583b;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            if (C62953e.m95476a(fgVar, fgVar2) <= 0) {
                listIterator.next();
                break;
            } else if (eVar4.mo40798c().f98878c && eVar4.mo40798c().mo40697b().contains(eVar.mo40798c().f98876a)) {
                if ((f.isEmpty() || eVar4.mo40800f().isEmpty() || m66246d(eVar4.mo40800f(), f)) && !axVar.mo56113h()) {
                    axVar = C58833ax.m90834k(eVar4);
                }
            }
        }
        listIterator.add(eVar);
        if (axVar.mo56113h()) {
            listIterator.previous();
            this.f99101d.mo54920x(eVar, ((C37256e) axVar.mo56107c()).mo40798c().f98881f);
            eVar2 = new C37291e(listIterator, 2, axVar);
        } else {
            if (eVar.mo40798c().f98879d) {
                if (this.f99103f.mo40701c().mo56113h()) {
                    if (eVar.mo40798c().f98880e.mo56113h()) {
                        long c = this.f99105h.mo26871c();
                        C57863d dVar3 = ((C57913b) eVar.mo40797b().instance).f154902c;
                        if (dVar3 == null) {
                            dVar3 = C57863d.f154580d;
                        }
                        C63042fg fgVar3 = dVar3.f154583b;
                        if (fgVar3 == null) {
                            fgVar3 = C63042fg.f170152c;
                        }
                        long c2 = C62953e.m95478c(fgVar3);
                        if (c2 > c) {
                            c2 = c;
                        }
                        long a2 = eVar.mo40798c().mo40696a() - (c - c2);
                        if (a2 <= 0) {
                            mo40848c(eVar);
                        } else {
                            this.f99104g.put(eVar, ((C60888db) this.f99103f.mo40701c().mo56107c()).mo29164d(new C37295i(new C37294h(this), eVar), a2, TimeUnit.MILLISECONDS));
                        }
                    }
                }
            }
            eVar2 = new C37291e(listIterator, 1, C58836b.f156633a);
        }
        if (eVar2.f99094c - 1 != 0) {
            C58495hd f2 = eVar.mo40800f();
            C37289c cVar = new C37289c();
            C58480gp e = C58485gu.m89837e();
            while (eVar2.f99092a.hasNext()) {
                C37256e eVar5 = (C37256e) eVar2.f99092a.next();
                if (f2.isEmpty() || eVar5.mo40800f().isEmpty() || m66246d(eVar5.mo40800f(), f2)) {
                    e.mo55395g(eVar5);
                    if (eVar5 == eVar2.f99093b.mo56107c()) {
                        break;
                    }
                }
            }
            cVar.mo40834b(e.mo55394f());
            cVar.f99088a = 7;
            return C58833ax.m90834k(cVar.mo40833a());
        } else if (eVar.mo40798c().f98878c) {
            ListIterator listIterator2 = eVar2.f99092a;
            C58495hd f3 = eVar.mo40800f();
            C58528ij b = eVar.mo40798c().mo40697b();
            C37234c cVar2 = eVar.mo40798c().f98881f;
            C37289c cVar3 = new C37289c();
            C58480gp e2 = C58485gu.m89837e();
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    cVar3.mo40834b(C58485gu.m89842j(this.f99100c));
                    cVar3.f99088a = 3;
                    a = cVar3.mo40833a();
                    break;
                }
                C37256e eVar6 = (C37256e) listIterator2.previous();
                if (f3.isEmpty() || eVar6.mo40800f().isEmpty() || m66246d(eVar6.mo40800f(), f3)) {
                    arrayDeque.add(eVar6);
                    if (b.contains(eVar6.mo40798c().f98876a)) {
                        if (this.f99103f.mo40701c().mo56113h()) {
                            C60870cx cxVar2 = (C60870cx) this.f99104g.remove(eVar6);
                            if (cxVar2 != null) {
                                cxVar2.cancel(false);
                            }
                        }
                        if (this.f99102e.contains(eVar6)) {
                            cVar3.f99088a = 6;
                        } else if (this.f99101d.mo54952E(eVar6, cVar2)) {
                            cVar3.f99088a = 5;
                        } else {
                            this.f99101d.mo54920x(eVar6, cVar2);
                            cVar3.f99088a = 2;
                        }
                        e2.mo55397i(arrayDeque.descendingIterator());
                        cVar3.mo40834b(e2.mo55394f());
                        a = cVar3.mo40833a();
                    }
                }
            }
            return C58833ax.m90834k(a);
        } else {
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final synchronized C58485gu mo40831b() {
        return C58485gu.m89842j(this.f99100c);
    }

    /* renamed from: c */
    public final void mo40848c(C37256e eVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        C37289c cVar = new C37289c();
        C58480gp e = C58485gu.m89837e();
        synchronized (this) {
            this.f99104g.remove(eVar);
            this.f99102e.add(eVar);
            LinkedList linkedList = this.f99100c;
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                C37256e eVar2 = (C37256e) listIterator.previous();
                if (eVar2 == eVar) {
                    break;
                }
                arrayDeque.add(eVar2);
            }
        }
        arrayDeque.add(eVar);
        e.mo55397i(arrayDeque.descendingIterator());
        cVar.mo40834b(e.mo55394f());
        cVar.f99088a = 4;
        synchronized (this.f99098a) {
            ((C37288b) this.f99099b.mo56107c()).mo40832g(cVar.mo40833a());
        }
    }
}
