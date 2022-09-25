package com.google.android.libraries.gsa.monet.tools.children.shared;

import android.os.Bundle;
import android.support.p033v7.p040e.C0424f;
import android.support.p033v7.p040e.C0429k;
import android.util.Log;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105738q;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23286b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23288d;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23289e;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23290f;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23293i;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23294j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23295k;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23296l;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.h */
/* compiled from: PG */
public class C23239h {

    /* renamed from: a */
    private final String f63695a = "cm_data_key";

    /* renamed from: b */
    private final C23234c f63696b;

    /* renamed from: c */
    public final C23117m f63697c;

    /* renamed from: d */
    public final List f63698d = new ArrayList();

    /* renamed from: e */
    public final List f63699e = new ArrayList();

    /* renamed from: f */
    public final Map f63700f = new HashMap();

    /* renamed from: g */
    public int f63701g = 0;

    /* renamed from: h */
    public C23295k f63702h;

    public C23239h(C23117m mVar, C23234c cVar) {
        this.f63697c = mVar;
        this.f63696b = cVar;
        mo28710i(mVar.mo28336e());
        mVar.mo28343n(new C23230a(this));
    }

    /* renamed from: f */
    static String m43528f(String str, int i) {
        return String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: a */
    public void mo28703a(ChildData childData) {
        childData.equals(mo28707e(childData));
    }

    /* renamed from: b */
    public final int mo28704b() {
        return this.f63698d.size();
    }

    /* renamed from: c */
    public final C23088b mo28705c(String str) {
        C23087a aVar = new C23087a();
        for (ChildData childData : this.f63698d) {
            if (childData.f63674a.equals(str)) {
                aVar.mo28530a(childData);
            }
        }
        return new C23088b(aVar.f63434a);
    }

    /* renamed from: d */
    public final ChildData mo28706d(int i) {
        return (ChildData) this.f63698d.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ChildData mo28707e(ChildData childData) {
        if (this.f63698d.remove(childData)) {
            mo28712k();
            return childData;
        }
        Log.w("BaseChildCoordinator", "Trying to remove a child that does not exist");
        return null;
    }

    /* renamed from: g */
    public final void mo28708g(List list) {
        this.f63698d.clear();
        this.f63698d.addAll(list);
    }

    /* renamed from: h */
    public final void mo28709h(ChildData childData, int i) {
        if (this.f63698d.contains(childData)) {
            Log.e("BaseChildCoordinator", "Cannot add duplicate children");
            return;
        }
        if (i >= this.f63698d.size()) {
            this.f63698d.add(childData);
        } else if (i < 0) {
            this.f63698d.add(0, childData);
        } else {
            this.f63698d.add(i, childData);
        }
        mo28712k();
    }

    /* renamed from: i */
    public final void mo28710i(C23120p pVar) {
        C23295k kVar;
        C23120p a = pVar.mo28564a(this.f63695a);
        if (a != null) {
            ClassLoader classLoader = getClass().getClassLoader();
            classLoader.getClass();
            a.f63472a.setClassLoader(classLoader);
            ArrayList c = a.mo28566c();
            if (c != null) {
                C23234c cVar = this.f63696b;
                cVar.getClass();
                if (cVar.mo28700b()) {
                    C23234c cVar2 = this.f63696b;
                    ArrayList arrayList = new ArrayList();
                    int size = c.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) c.get(i);
                        if (cVar2.mo28699a(str)) {
                            arrayList.add(str);
                        }
                    }
                    c = arrayList;
                }
                ArrayList arrayList2 = new ArrayList(c.size());
                int size2 = c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ChildData childData = (ChildData) a.f63472a.getParcelable((String) c.get(i2));
                    if (childData != null) {
                        arrayList2.add(childData);
                    }
                }
                this.f63701g = a.mo28565b();
                if (this.f63702h == null) {
                    mo28708g(arrayList2);
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f63698d);
                C0424f a2 = C0429k.m1383a(new C23235d(arrayList2, arrayList3), true);
                ArrayList<C23237f> arrayList4 = new ArrayList<>();
                C23236e eVar = new C23236e(arrayList4, arrayList3);
                a2.mo1398a(eVar);
                for (int i3 = 0; i3 < eVar.f63685a.size(); i3++) {
                    C23237f fVar = (C23237f) eVar.f63685a.get(i3);
                    if (fVar.f63687a == null) {
                        fVar.f63687a = (ChildData) arrayList2.get(i3);
                    }
                }
                mo28708g(arrayList2);
                if (!arrayList4.isEmpty() && (kVar = this.f63702h) != null) {
                    for (C23237f fVar2 : arrayList4) {
                        int i4 = fVar2.f63690d;
                        if (i4 != 0) {
                            C23238g gVar = new C23238g(i4, fVar2.f63687a, fVar2.f63688b, fVar2.f63689c);
                            ChildData childData2 = gVar.f63691a;
                            childData2.getClass();
                            int i5 = gVar.f63694d - 1;
                            if (i5 == 1) {
                                int i6 = gVar.f63692b;
                                RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = (RecyclingChildCoordinator$RecyclingChildData) childData2;
                                C23294j jVar = (C23294j) kVar.f63785a.f63126Q.mo28335d(recyclingChildCoordinator$RecyclingChildData.f63803c).mo28562a(C23294j.class);
                                if (jVar == null || !jVar.mo28787a()) {
                                    C22939d i7 = kVar.f63785a.f63126Q.mo28305i(recyclingChildCoordinator$RecyclingChildData.f63803c);
                                    C23067b.m43234g(i7 instanceof C23296l, "A child inserted into a RecyclingChildManager must extend from RecyclableContainer or be @Recyclable, but %s is neither.", recyclingChildCoordinator$RecyclingChildData.f63803c);
                                    C23296l lVar = (C23296l) i7;
                                    C22945j jVar2 = kVar.f63785a.f63126Q;
                                    jVar2.mo28306q(lVar, jVar2.mo28341k(recyclingChildCoordinator$RecyclingChildData.f63675b));
                                    C23296l lVar2 = kVar.f63785a;
                                    String iH = lVar.mo28296iH();
                                    C23067b.m43234g(lVar2.mo28773U(iH) == null, "Container child %s already exists", iH);
                                    lVar.f63765E = lVar2.f63766F;
                                    C23289e a3 = C23288d.m43678a(lVar, lVar.mo28296iH());
                                    lVar2.mo28776X(i6, a3);
                                    int R = lVar2.mo28770R(a3.f63762b);
                                    C23286b bVar = lVar2.f63765E;
                                    if (bVar != null) {
                                        String l = lVar2.f63126Q.mo28342l();
                                        ArrayList arrayList5 = new ArrayList();
                                        lVar.mo28777Y(arrayList5);
                                        bVar.mo28764d(l, R, arrayList5);
                                    }
                                    C23296l lVar3 = kVar.f63785a;
                                    lVar3.mo28792jj(i6, recyclingChildCoordinator$RecyclingChildData.f63675b, lVar);
                                    for (C105738q c2 : lVar3.f63788I) {
                                        c2.mo95025c(lVar);
                                    }
                                } else {
                                    String k = kVar.f63785a.f63126Q.mo28341k(recyclingChildCoordinator$RecyclingChildData.f63675b);
                                    C23296l lVar4 = kVar.f63785a;
                                    C23293i iVar = new C23293i(k, recyclingChildCoordinator$RecyclingChildData, lVar4);
                                    C23067b.m43234g(lVar4.mo28773U(k) == null, "Child %s already exists", k);
                                    C23289e a4 = C23288d.m43678a((C23290f) null, k);
                                    lVar4.mo28776X(i6, a4);
                                    a4.f63763c = iVar;
                                    int R2 = lVar4.mo28770R(a4.f63762b);
                                    C23286b bVar2 = lVar4.f63765E;
                                    if (bVar2 != null) {
                                        bVar2.mo28761a(lVar4.f63126Q.mo28342l(), R2, iVar);
                                    }
                                    C23296l lVar5 = kVar.f63785a;
                                    lVar5.mo28789jd(i6, k);
                                    for (C105738q qVar : lVar5.f63788I) {
                                    }
                                }
                            } else if (i5 == 2) {
                                kVar.mo28788a(gVar.f63693c, (RecyclingChildCoordinator$RecyclingChildData) childData2);
                            } else if (i5 != 3) {
                                Log.w("BaseChildCoordinator", "Received an update with an operation type of NONE");
                            } else {
                                int i8 = gVar.f63693c;
                                int i9 = gVar.f63692b;
                                RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData2 = (RecyclingChildCoordinator$RecyclingChildData) childData2;
                                if (((C23296l) kVar.f63785a.mo28775W(i8)) != null) {
                                    C23296l lVar6 = kVar.f63785a;
                                    C23289e T = lVar6.mo28772T(i8);
                                    C23067b.m43236i(T, "Move attempted on an untracked child");
                                    C23067b.m43233f(T.f63761a != null, "Not a container child, please call moveChild()");
                                    int R3 = lVar6.mo28770R(T.f63762b);
                                    lVar6.mo28778Z(i8, i9);
                                    int R4 = lVar6.mo28770R(T.f63762b);
                                    C23286b bVar3 = lVar6.f63765E;
                                    if (bVar3 != null) {
                                        bVar3.mo28765e(lVar6.f63126Q.mo28342l(), R3, R4, T.mo28767a());
                                    }
                                    C23296l lVar7 = kVar.f63785a;
                                    lVar7.mo28795jo(i8, i9);
                                    for (C105738q qVar2 : lVar7.f63788I) {
                                    }
                                } else {
                                    C23296l lVar8 = kVar.f63785a;
                                    C23289e T2 = lVar8.mo28772T(i8);
                                    C23067b.m43236i(T2, "Move attempted on an untracked child");
                                    C23067b.m43233f(T2.f63761a == null, "Container child, please call moveContainerChild()");
                                    int R5 = lVar8.mo28770R(T2.f63762b);
                                    lVar8.mo28778Z(i8, i9);
                                    int R6 = lVar8.mo28770R(T2.f63762b);
                                    C23286b bVar4 = lVar8.f63765E;
                                    if (bVar4 != null) {
                                        bVar4.mo28762b(lVar8.f63126Q.mo28342l(), R5, R6);
                                    }
                                    C23296l lVar9 = kVar.f63785a;
                                    lVar9.mo28793jm(i8, i9);
                                    for (C105738q qVar3 : lVar9.f63788I) {
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo28711j() {
        if (!this.f63698d.isEmpty()) {
            this.f63698d.clear();
            mo28712k();
        }
    }

    /* renamed from: k */
    public final void mo28712k() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList(this.f63698d.size());
        for (ChildData childData : this.f63698d) {
            arrayList.add(childData.f63675b);
            bundle2.putParcelable(childData.f63675b, childData);
        }
        bundle2.putStringArrayList("child_array", arrayList);
        bundle2.putInt("counter", this.f63701g);
        bundle.putBundle(this.f63695a, bundle2);
        this.f63697c.mo28332B(bundle);
    }

    /* renamed from: l */
    public final boolean mo28713l(String str) {
        for (ChildData childData : this.f63698d) {
            if (childData.f63674a.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
