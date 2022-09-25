package com.google.android.libraries.notifications.p2268e.p2277e.p2278a;

import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29793g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.C29828s;
import com.google.android.libraries.notifications.data.impl.C29805j;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.p2293h.C30015h;
import com.google.android.libraries.notifications.p2293h.C30016i;
import com.google.android.libraries.notifications.p2293h.C30017j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.e.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C29848a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29849b f80916a;

    /* renamed from: b */
    public final /* synthetic */ C29820k f80917b;

    /* renamed from: c */
    public final /* synthetic */ List f80918c;

    /* renamed from: d */
    public final /* synthetic */ C30007h f80919d;

    /* renamed from: e */
    public final /* synthetic */ C29839c f80920e;

    /* renamed from: f */
    public final /* synthetic */ boolean f80921f;

    public /* synthetic */ C29848a(C29849b bVar, C29820k kVar, List list, C30007h hVar, C29839c cVar, boolean z) {
        this.f80916a = bVar;
        this.f80917b = kVar;
        this.f80918c = list;
        this.f80919d = hVar;
        this.f80920e = cVar;
        this.f80921f = z;
    }

    public final void run() {
        EnumMap enumMap;
        ArrayList arrayList;
        int i;
        int i2;
        C58485gu guVar;
        ArrayList arrayList2;
        int i3;
        int i4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        EnumMap enumMap2;
        C58485gu guVar2;
        C29827r rVar;
        C29827r rVar2;
        C29849b bVar = this.f80916a;
        C29820k kVar = this.f80917b;
        List<C29827r> list = this.f80918c;
        C30007h hVar = this.f80919d;
        C29839c cVar = this.f80920e;
        boolean z = this.f80921f;
        String[] strArr = new String[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            strArr[i5] = ((C29827r) list.get(i5)).mo35063j();
        }
        List<C29828s> b = ((C29805j) bVar.f80923b.mo35400a(kVar != null ? kVar.mo35009h() : null)).f80819a.mo35115z().mo35117b(strArr);
        HashMap hashMap = new HashMap();
        for (C29828s sVar : b) {
            hashMap.put(sVar.mo35124d(), sVar);
        }
        C58480gp f = C58485gu.m89838f(list.size());
        ArrayList arrayList5 = new ArrayList();
        for (C29827r rVar3 : list) {
            C29828s sVar2 = (C29828s) hashMap.get(rVar3.mo35063j());
            if (sVar2 != null && sVar2.mo35122b() > rVar3.mo35060h().longValue()) {
                C29793g t = rVar3.mo35073t();
                t.mo35049h(sVar2.mo35128g());
                t.mo35048g(sVar2.mo35127f());
                t.mo35047f(sVar2.mo35125e());
                t.mo35051j(sVar2.mo35129h());
                C29827r a = t.mo35042a();
                boolean d = C29849b.m55259d(rVar3);
                boolean z2 = !C29849b.m55259d(a);
                if ((!d) && !z2) {
                    arrayList5.add(a);
                }
                rVar3 = a;
            }
            f.mo55395g(rVar3);
        }
        if (!arrayList5.isEmpty()) {
            C29834a b2 = bVar.f80927f.mo35160b(54);
            b2.mo35145j(kVar);
            b2.mo35140e(arrayList5);
            b2.mo35157v();
            b2.mo35151p(cVar);
            b2.mo35136a();
        }
        C58485gu f2 = f.mo55394f();
        EnumMap enumMap3 = new EnumMap(C30015h.class);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int i6 = ((C58724pq) f2).f156474d;
        int i7 = 0;
        while (i7 < i6) {
            C29827r rVar4 = (C29827r) f2.get(i7);
            if (!C29849b.m55259d(rVar4) && (rVar4.mo35056e().longValue() <= 0 || TimeUnit.MILLISECONDS.convert(rVar4.mo35056e().longValue(), TimeUnit.MICROSECONDS) > bVar.f80924c.mo26870b())) {
                for (C29987a c : (Set) bVar.f80925d.mo27525b()) {
                    int c2 = c.mo35292c();
                    if (c2 == 0) {
                        throw null;
                    } else if (c2 != 1) {
                        i3 = i7;
                        i4 = i6;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList6;
                        enumMap2 = enumMap3;
                        guVar2 = f2;
                    }
                }
                if (((C58833ax) bVar.f80926e.mo27525b()).mo56113h()) {
                    long c3 = bVar.f80924c.mo26871c();
                    C30016i a2 = ((C30017j) ((C58833ax) bVar.f80926e.mo27525b()).mo56107c()).mo35341a(kVar, rVar4);
                    long c4 = bVar.f80924c.mo26871c() - c3;
                    if (a2.mo35320b()) {
                        C30015h a3 = a2.mo35319a();
                        if (!enumMap3.containsKey(a3)) {
                            enumMap3.put(a3, new ArrayList());
                        }
                        ((List) enumMap3.get(a3)).add(rVar4);
                        rVar = rVar4;
                        i2 = i7;
                        i = i6;
                        arrayList2 = arrayList7;
                        arrayList = arrayList6;
                        enumMap = enumMap3;
                        guVar = f2;
                        arrayList2.add(rVar);
                        i7 = i2 + 1;
                        arrayList7 = arrayList2;
                        f2 = guVar;
                        i6 = i;
                        arrayList6 = arrayList;
                        enumMap3 = enumMap;
                    } else {
                        cVar.f80897e = Long.valueOf(c4);
                        rVar2 = rVar4;
                        i2 = i7;
                        i = i6;
                        arrayList2 = arrayList7;
                        arrayList = arrayList6;
                        enumMap = enumMap3;
                        guVar = f2;
                        bVar.f80922a.mo35246a(kVar, rVar2, false, z, hVar, (C30004l) null, cVar);
                    }
                } else {
                    rVar2 = rVar4;
                    i2 = i7;
                    i = i6;
                    arrayList2 = arrayList7;
                    arrayList = arrayList6;
                    enumMap = enumMap3;
                    guVar = f2;
                    bVar.f80922a.mo35246a(kVar, rVar2, false, z, hVar, (C30004l) null, cVar);
                }
                rVar = rVar2;
                arrayList2.add(rVar);
                i7 = i2 + 1;
                arrayList7 = arrayList2;
                f2 = guVar;
                i6 = i;
                arrayList6 = arrayList;
                enumMap3 = enumMap;
            } else {
                arrayList6.add(rVar4.mo35063j());
                arrayList7.add(rVar4);
                i3 = i7;
                i4 = i6;
                arrayList3 = arrayList7;
                arrayList4 = arrayList6;
                enumMap2 = enumMap3;
                guVar2 = f2;
            }
            i7 = i2 + 1;
            arrayList7 = arrayList2;
            f2 = guVar;
            i6 = i;
            arrayList6 = arrayList;
            enumMap3 = enumMap;
        }
        ArrayList arrayList8 = arrayList6;
        EnumMap enumMap4 = enumMap3;
        if (!arrayList7.isEmpty()) {
            for (C29987a g : (Set) bVar.f80925d.mo27525b()) {
                g.mo35296g();
            }
        }
        if (!arrayList8.isEmpty()) {
            List b3 = bVar.f80922a.mo35247b(kVar, arrayList8, cVar, 8);
            if (!b3.isEmpty()) {
                bVar.mo35175c(kVar, b3, cVar);
            }
        }
        for (C30015h hVar2 : enumMap4.keySet()) {
            C29834a b4 = bVar.f80927f.mo35160b(4);
            b4.mo35145j(kVar);
            b4.mo35140e((List) enumMap4.get(hVar2));
            b4.mo35157v();
            b4.mo35142g(hVar2);
            b4.mo35151p(cVar);
            b4.mo35136a();
        }
    }
}
