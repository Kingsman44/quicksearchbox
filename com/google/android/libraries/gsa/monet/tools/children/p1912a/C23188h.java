package com.google.android.libraries.gsa.monet.tools.children.p1912a;

import android.util.Log;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105232c;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23068c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23239h;
import com.google.android.libraries.gsa.monet.tools.children.shared.ChildData;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23281e;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23282f;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23283g;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23284h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.a.h */
/* compiled from: PG */
public final class C23188h {

    /* renamed from: a */
    public final C23239h f63585a;

    /* renamed from: b */
    public final Map f63586b = new HashMap();

    /* renamed from: c */
    public final List f63587c = new ArrayList();

    /* renamed from: d */
    public final C23052c f63588d;

    /* renamed from: e */
    public C23181a f63589e;

    /* renamed from: f */
    public int f63590f = 1;

    /* renamed from: g */
    private final C23281e f63591g;

    /* renamed from: h */
    private final C23282f f63592h;

    public C23188h(C23052c cVar, C23239h hVar, C23281e eVar, C23282f fVar) {
        new ArrayList();
        this.f63585a = hVar;
        this.f63588d = cVar;
        this.f63591g = eVar;
        this.f63592h = fVar;
        cVar.mo28427o(new C23187g(this, hVar));
    }

    /* renamed from: l */
    private final void m43404l(ChildData childData) {
        this.f63588d.mo28365x(childData.f63675b);
    }

    /* renamed from: a */
    public final C23056g mo28636a(int i) {
        String str;
        int b = this.f63585a.mo28704b();
        if (i < 0 || i > b) {
            if (i < 0) {
                str = C23068c.m43237a("%s (%s) must not be negative", "Index of child controller out of bounds.", Integer.valueOf(i));
            } else if (b < 0) {
                throw new IllegalArgumentException("negative size: " + b);
            } else {
                str = C23068c.m43237a("%s (%s) must not be greater than size (%s)", "Index of child controller out of bounds.", Integer.valueOf(i), Integer.valueOf(b));
            }
            throw new IndexOutOfBoundsException(str);
        }
        return this.f63588d.mo28421a(this.f63585a.mo28706d(i).f63675b);
    }

    /* renamed from: b */
    public final C23056g mo28637b() {
        C23067b.m43233f(this.f63585a.mo28704b() > 0, "Requesting last element on an empty child list.");
        C23239h hVar = this.f63585a;
        return this.f63588d.mo28421a(hVar.mo28706d(hVar.mo28704b() - 1).f63675b);
    }

    /* renamed from: c */
    public final ChildData mo28638c(C23056g gVar) {
        ChildData childData = (ChildData) this.f63586b.remove(gVar);
        if (childData == null) {
            return null;
        }
        mo28639d();
        this.f63585a.mo28703a(childData);
        return childData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo28639d() {
        this.f63587c.clear();
        mo28644i(3);
    }

    /* renamed from: e */
    public final void mo28640e(ChildData childData, C23056g gVar, int i) {
        this.f63585a.mo28709h(childData, i);
        this.f63586b.put(gVar, childData);
        mo28639d();
    }

    /* renamed from: f */
    public final void mo28641f() {
        ArrayList arrayList = new ArrayList(new C23088b(this.f63585a.f63698d));
        this.f63585a.mo28711j();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m43404l((ChildData) arrayList.get(i));
        }
        this.f63586b.clear();
        mo28639d();
    }

    /* renamed from: g */
    public final void mo28642g(C23056g gVar) {
        ChildData c = mo28638c(gVar);
        if (c == null) {
            Log.w("CntrChildManagerHelper", "Trying to remove a child that does not belong to this child helper");
        } else {
            m43404l(c);
        }
    }

    /* renamed from: h */
    public final void mo28643h(String str) {
        ArrayList arrayList = new ArrayList(this.f63585a.mo28705c(str));
        C23239h hVar = this.f63585a;
        ArrayList arrayList2 = new ArrayList();
        for (ChildData childData : hVar.f63698d) {
            if (childData.f63674a.equals(str)) {
                arrayList2.add(childData);
            }
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            hVar.f63698d.remove((ChildData) arrayList2.get(i));
        }
        if (!arrayList2.isEmpty()) {
            hVar.mo28712k();
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ChildData childData2 = (ChildData) arrayList.get(i2);
            this.f63586b.values().remove(childData2);
            m43404l(childData2);
        }
        mo28639d();
    }

    /* renamed from: i */
    public final void mo28644i(int i) {
        this.f63590f = i;
        C23283g gVar = this.f63592h.f63756a;
        if (i == 3 && !gVar.f63759c.isEmpty()) {
            gVar.f63758b.clear();
            for (Set<C23284h> it : gVar.f63759c.values()) {
                for (C23284h a : it) {
                    a.mo28759a();
                }
            }
            gVar.f63759c.clear();
        }
    }

    /* renamed from: j */
    public final void mo28645j(C23028x xVar) {
        C23087a aVar = new C23087a();
        for (ChildData childData : this.f63587c) {
            xVar.mo28449a(childData.f63675b);
            C23056g a = this.f63588d.mo28421a(childData.f63675b);
            this.f63586b.put(a, childData);
            aVar.mo28530a(a);
        }
        C23239h hVar = this.f63585a;
        hVar.mo28708g(new C23088b(this.f63587c));
        hVar.mo28712k();
        C23088b<C23056g> bVar = new C23088b(aVar.f63434a);
        C23283g gVar = this.f63591g.f63755a;
        gVar.f63758b.clear();
        HashMap hashMap = new HashMap();
        for (C23056g gVar2 : bVar) {
            C23188h hVar2 = gVar.f63757a;
            ChildData childData2 = hVar2 != null ? (ChildData) hVar2.f63586b.get(gVar2) : null;
            if (childData2 != null) {
                List list = (List) hashMap.get(childData2.f63674a);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(childData2.f63674a, list);
                }
                list.add(gVar2);
            }
        }
        for (String str : gVar.f63759c.keySet()) {
            for (C23284h hVar3 : (Set) gVar.f63759c.get(str)) {
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                hVar3.mo28760b(list2);
            }
        }
        gVar.f63759c.clear();
        mo28639d();
        if (this.f63589e != null) {
            int size = bVar.size();
            for (int i = 0; i < size; i++) {
                C23181a aVar2 = this.f63589e;
                aVar2.getClass();
                ((C105232c) aVar2).f293504a.mo94711l((C23056g) bVar.get(i));
            }
        }
    }

    /* renamed from: k */
    public final boolean mo28646k(C23028x xVar, String str) {
        boolean z = false;
        boolean z2 = true;
        for (ChildData childData : this.f63587c) {
            if (childData.f63674a.equals(str)) {
                if (z2) {
                    if (xVar.f63351a.f63353a.containsKey(childData.f63675b)) {
                        z2 = true;
                        z = true;
                    }
                }
                z2 = false;
                z = true;
            }
        }
        return z && z2;
    }
}
