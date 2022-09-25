package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p964a;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13539o;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13498a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13519e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13520f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13521g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13522h;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13523i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13524j;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13525k;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13526l;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13439a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13440b f41269a;

    /* renamed from: b */
    public final /* synthetic */ C13543s f41270b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f41271c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f41272d;

    public /* synthetic */ C13439a(C13440b bVar, C13543s sVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f41269a = bVar;
        this.f41270b = sVar;
        this.f41271c = cxVar;
        this.f41272d = cxVar2;
    }

    public final Object call() {
        int i;
        C13546v vVar;
        boolean z;
        int i2;
        C13440b bVar = this.f41269a;
        C13543s sVar = this.f41270b;
        C60870cx cxVar = this.f41271c;
        C60870cx cxVar2 = this.f41272d;
        C58490gz gzVar = new C58490gz(4);
        Map.EL.forEach(Collections.unmodifiableMap(sVar.f41505f), new C13520f(gzVar));
        C13498a aVar = new C13498a(C58485gu.m89842j(sVar.f41507i), gzVar.mo55427f(false));
        C13546v vVar2 = (C13546v) C60856cj.m92909r(cxVar);
        C13546v vVar3 = (C13546v) C60856cj.m92909r(cxVar2);
        ((C59052c) ((C59052c) C13526l.f41459c.mo56224b()).mo56372aa(44857)).mo56386p("#process");
        int i3 = vVar2.f41511b;
        int b = C13545u.m29827b(i3);
        if (b != 0 && b == 7 ? (i = C13545u.m29827b(vVar3.f41511b)) == 0 : (i = C13545u.m29827b(i3)) == 0) {
            i = 1;
        }
        int i4 = vVar3.f41511b;
        C13545u.m29826a(i);
        if (i != 3) {
            ((C59052c) ((C59052c) C13526l.f41459c.mo56226d()).mo56372aa(44860)).mo56387q("Returns error status %d without any candidate", C13545u.m29826a(i));
            C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
            tVar.copyOnWrite();
            ((C13546v) tVar.instance).f41511b = C13545u.m29826a(i);
            vVar = (C13546v) tVar.build();
        } else {
            ArrayList arrayList = new ArrayList(vVar2.f41512c);
            int b2 = C13545u.m29827b(vVar3.f41511b);
            if (b2 != 0 && b2 == 3) {
                arrayList.addAll(vVar3.f41512c);
            }
            arrayList.size();
            Collection.EL.removeIf(arrayList, new C13521g(aVar));
            arrayList.size();
            Collections.sort(arrayList, Comparator.EL.reversed(Comparator.EL.thenComparing(Comparator.CC.comparing(C13522h.f41455a), (Function) C13523i.f41456a)));
            Optional empty = Optional.empty();
            if (!arrayList.isEmpty()) {
                C13529e a = C13529e.m29814a(((C13530f) arrayList.get(0)).f41478c);
                if (a == null) {
                    a = C13529e.UNRECOGNIZED;
                }
                if (C13526l.m29807c(a)) {
                    empty = Optional.m71637of((C13530f) arrayList.get(0));
                }
            }
            Collection.EL.removeIf(arrayList, C13524j.f41457a);
            if (empty.isPresent()) {
                arrayList.add(0, (C13530f) empty.get());
                arrayList.size();
            }
            HashSet hashSet = new HashSet();
            int i5 = 0;
            while (i5 < arrayList.size()) {
                if (hashSet.add(((C13530f) arrayList.get(i5)).f41480e)) {
                    i5++;
                } else {
                    arrayList.remove(i5);
                }
            }
            arrayList.size();
            if (!aVar.f41406a.isEmpty()) {
                List m = C58485gu.m89845m();
                C58485gu guVar = aVar.f41406a;
                int size = guVar.size();
                for (int i6 = 0; i6 < size; i6++) {
                    C13539o oVar = (C13539o) guVar.get(i6);
                    List arrayList2 = new ArrayList(arrayList);
                    Collection.EL.removeIf(arrayList2, new C13525k(oVar));
                    if (oVar.f41489a > 0 && arrayList2.size() > (i2 = oVar.f41489a)) {
                        arrayList2 = arrayList2.subList(0, i2);
                    }
                    if (!m.isEmpty()) {
                        if (!arrayList2.isEmpty()) {
                            float f = ((C13530f) m.get(0)).f41481f;
                            boolean z2 = ((C13530f) arrayList2.get(0)).f41481f > f || (((C13530f) arrayList2.get(0)).f41481f == f && arrayList2.size() > m.size());
                            C13529e a2 = C13529e.m29814a(((C13530f) arrayList2.get(0)).f41478c);
                            if (a2 == null) {
                                a2 = C13529e.UNRECOGNIZED;
                            }
                            if (C13526l.m29807c(a2)) {
                                C13529e a3 = C13529e.m29814a(((C13530f) m.get(0)).f41478c);
                                if (a3 == null) {
                                    a3 = C13529e.UNRECOGNIZED;
                                }
                                if (!C13526l.m29807c(a3)) {
                                    z = true;
                                    if (!z2 || z) {
                                        ((C59052c) ((C59052c) C13526l.f41459c.mo56224b()).mo56372aa(44867)).mo56386p("New candidates to return");
                                    }
                                }
                            }
                            z = false;
                            if (!z2) {
                            }
                            ((C59052c) ((C59052c) C13526l.f41459c.mo56224b()).mo56372aa(44867)).mo56386p("New candidates to return");
                        }
                    }
                    m = arrayList2;
                }
                m.size();
                arrayList = m;
            }
            ((C59052c) ((C59052c) C13526l.f41459c.mo56224b()).mo56372aa(44858)).mo56387q("Returns %d candidate(s) after all post processing", arrayList.size());
            C13528n.m29813d(arrayList);
            C13544t tVar2 = (C13544t) C13546v.f41508e.createBuilder();
            tVar2.copyOnWrite();
            ((C13546v) tVar2.instance).f41511b = C13545u.m29826a(3);
            tVar2.mo21161a(arrayList);
            vVar = (C13546v) tVar2.build();
        }
        bVar.f41273a.mo22352b(C13519e.m29803a(2, vVar));
        return vVar;
    }
}
