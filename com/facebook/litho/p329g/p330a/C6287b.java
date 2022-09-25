package com.facebook.litho.p329g.p330a;

import android.support.p033v7.p040e.C0424f;
import android.support.p033v7.p040e.C0429k;
import com.facebook.litho.C6106aq;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6231ee;
import com.facebook.litho.C6261fd;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p329g.C6326e;
import com.facebook.litho.p329g.C6335n;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.widget.C6482cn;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.facebook.litho.g.a.b */
/* compiled from: PG */
public final class C6287b extends C6335n {

    /* renamed from: r */
    public static final /* synthetic */ int f18554r = 0;
    @C6117a(mo12871a = 5)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: m */
    public List f18555m;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: n */
    public Boolean f18556n;

    /* renamed from: o */
    public C6154cb f18557o;

    /* renamed from: p */
    public C6154cb f18558p;

    /* renamed from: q */
    public C6154cb f18559q;

    public C6287b() {
        super("DataDiffSection");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13290f((C6335n) obj);
    }

    /* renamed from: f */
    public final boolean mo13290f(C6335n nVar) {
        if (this == nVar) {
            return true;
        }
        if (nVar == null || getClass() != nVar.getClass()) {
            return false;
        }
        C6287b bVar = (C6287b) nVar;
        List list = this.f18555m;
        if (list == null ? bVar.f18555m != null : !list.equals(bVar.f18555m)) {
            return false;
        }
        Boolean bool = this.f18556n;
        return bool == null ? bVar.f18556n == null : bool.equals(bVar.f18556n);
    }

    /* renamed from: k */
    public final boolean mo13291k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo13292n(C6336o oVar, C6326e eVar, C6335n nVar, C6335n nVar2) {
        List list;
        Boolean bool;
        C6154cb cbVar;
        boolean z;
        C6287b bVar = (C6287b) nVar;
        C6287b bVar2 = (C6287b) nVar2;
        C6261fd fdVar = null;
        if (bVar == null) {
            list = null;
        } else {
            list = bVar.f18555m;
        }
        C6128bi biVar = new C6128bi(list, bVar2 == null ? null : bVar2.f18555m);
        C6128bi biVar2 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar3 = new C6128bi((Object) null, (Object) null);
        if (bVar == null) {
            bool = null;
        } else {
            bool = bVar.f18556n;
        }
        Object obj = new C6128bi(bool, bVar2 == null ? null : bVar2.f18556n).f18144b;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            List list2 = (List) biVar.f18143a;
            List list3 = (List) biVar.f18144b;
            if (oVar.mo13351n() == null) {
                cbVar = null;
            } else {
                cbVar = ((C6287b) oVar.mo13351n()).f18559q;
            }
            C6289d dVar = new C6289d(cbVar);
            C6290e eVar2 = new C6290e(eVar);
            C6288c cVar = new C6288c(oVar, (List) biVar.f18143a, (List) biVar.f18144b);
            C21215m m = oVar.mo13475m();
            if (m != null) {
                fdVar = C6231ee.m16500a(oVar, m, m.mo26269a(oVar, 12));
            }
            boolean z2 = true;
            if (list3 != null) {
                Object obj2 = biVar3.f18144b;
                if (obj2 == null) {
                    z = C6180a.f18234a;
                } else {
                    z = ((Boolean) obj2).booleanValue();
                }
                if (z) {
                    ListIterator listIterator = list3.listIterator();
                    loop0:
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        int nextIndex = listIterator.nextIndex();
                        Object next = listIterator.next();
                        ListIterator listIterator2 = list3.listIterator(nextIndex + 1);
                        while (true) {
                            if (listIterator2.hasNext()) {
                                if (cVar.mo13293f(next, listIterator2.next())) {
                                    C6106aq.m15891b(2, "sections_duplicate_item", "Detected duplicates in data passed to DataDiffSection. Read more here: https://bit.ly/2WPviOR, type: " + next.getClass().getSimpleName() + ", hash: " + System.identityHashCode(next));
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            Object obj3 = biVar2.f18144b;
            if (obj3 != null && !((Boolean) obj3).booleanValue()) {
                z2 = false;
            }
            C0424f a = C0429k.m1383a(cVar, z2);
            if (fdVar != null) {
                C21215m.m39906e(fdVar);
            }
            C6482cn cnVar = new C6482cn(list2, list3, dVar, eVar2);
            a.mo1398a(cnVar);
            cnVar.mo13571e(oVar);
        }
    }
}
