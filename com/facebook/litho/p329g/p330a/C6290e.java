package com.facebook.litho.p329g.p330a;

import com.facebook.litho.C6128bi;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6411u;
import com.facebook.litho.p329g.C6324c;
import com.facebook.litho.p329g.C6326e;
import com.facebook.litho.widget.C6478cj;
import com.facebook.litho.widget.C6480cl;
import com.facebook.litho.widget.C6481cm;
import com.facebook.litho.widget.C6491cw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.litho.g.a.e */
/* compiled from: PG */
final class C6290e implements C6481cm {

    /* renamed from: a */
    private final C6326e f18566a;

    public C6290e(C6326e eVar) {
        this.f18566a = eVar;
    }

    /* renamed from: b */
    private static List m16868b(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C6478cj cjVar = (C6478cj) it.next();
            int i3 = i2 + 1;
            if (i2 == i) {
                break;
            }
            arrayList.add(cjVar.f19235a);
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List m16869c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6128bi) it.next()).f18144b);
        }
        return arrayList;
    }

    /* renamed from: d */
    private static List m16870d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6128bi) it.next()).f18143a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo13295a(C6411u uVar, List list) {
        int i;
        C6411u uVar2 = uVar;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6480cl clVar = (C6480cl) list.get(i2);
            List list2 = clVar.f19240d;
            List list3 = clVar.f19241e;
            if (list2 == null) {
                i = 1;
            } else {
                i = list2.size();
            }
            int i3 = clVar.f19237a;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        this.f18566a.mo13338f(C6324c.m16964a(clVar.f19238b, clVar.f19239c, ((C6128bi) list3.get(0)).f18144b));
                    } else {
                        int i4 = clVar.f19239c;
                        if (i4 == 1) {
                            this.f18566a.mo13338f(C6324c.m16968e(clVar.f19238b, ((C6128bi) list3.get(0)).f18143a));
                        } else {
                            this.f18566a.mo13338f(new C6324c(-3, clVar.f19238b, -1, i4, (C6491cw) null, C6324c.f18701a, m16870d(list3), (List) null));
                        }
                    }
                } else if (i == 1) {
                    this.f18566a.mo13341i(clVar.f19238b, ((C6478cj) list2.get(0)).f19235a, C6381hf.m17120b(uVar2.f19016i), ((C6128bi) list3.get(0)).f18143a, ((C6128bi) list3.get(0)).f18144b);
                } else {
                    List b = m16868b(i, list2);
                    C6326e eVar = this.f18566a;
                    int i5 = clVar.f19238b;
                    C6381hf b2 = C6381hf.m17120b(uVar2.f19016i);
                    eVar.mo13338f(new C6324c(-2, i5, -1, i, (C6491cw) null, C6326e.m16972e(b, b2), m16870d(list3), m16869c(list3)));
                }
            } else if (i == 1) {
                this.f18566a.mo13339g(clVar.f19238b, ((C6478cj) list2.get(0)).f19235a, C6381hf.m17120b(uVar2.f19016i), ((C6128bi) list3.get(0)).f18144b);
            } else {
                List b3 = m16868b(i, list2);
                C6326e eVar2 = this.f18566a;
                int i6 = clVar.f19238b;
                C6381hf b4 = C6381hf.m17120b(uVar2.f19016i);
                List c = m16869c(list3);
                if (eVar2.f18719b != null) {
                    int size2 = b3.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((C6491cw) b3.get(i7)).mo13535q(eVar2.f18719b.f18740k);
                    }
                }
                eVar2.mo13338f(new C6324c(-1, i6, -1, i, (C6491cw) null, C6326e.m16972e(b3, b4), (List) null, c));
            }
        }
    }
}
