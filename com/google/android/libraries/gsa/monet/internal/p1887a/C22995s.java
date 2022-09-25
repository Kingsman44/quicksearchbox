package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23033b;
import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.p1886a.C22940e;
import com.google.android.libraries.gsa.monet.shared.C23125u;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23068c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23092f;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23105h;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.s */
/* compiled from: PG */
public final class C22995s {

    /* renamed from: a */
    public static final String f63252a = C23033b.m43154a("DC", "root");

    /* renamed from: b */
    public final Map f63253b;

    /* renamed from: c */
    public final Map f63254c;

    /* renamed from: d */
    public final C23096b f63255d;

    C22995s() {
        this.f63253b = new HashMap();
        this.f63254c = new HashMap();
        C23125u uVar = C23125u.f63473a;
        throw null;
    }

    /* renamed from: a */
    public final C22977at mo28386a(String str) {
        return (C22977at) this.f63253b.get(str);
    }

    /* renamed from: b */
    public final Set mo28387b() {
        boolean z = true;
        if (!this.f63253b.isEmpty() && !this.f63253b.containsKey("DC")) {
            z = false;
        }
        C23067b.m43233f(z, "If there are any models, one of them must be the display coordinator's.");
        HashSet hashSet = new HashSet(this.f63253b.keySet());
        hashSet.remove("DC");
        return new C23092f(hashSet);
    }

    /* renamed from: c */
    public final void mo28388c(String str, C23035b bVar) {
        String str2 = bVar.f63371c;
        C23067b.m43230c(this.f63253b.containsKey(str), "No such parent: %s", str);
        C23067b.m43230c(!this.f63253b.containsKey(str2), "A child feature already exists with ID: %s", str2);
        C22977at atVar = (C22977at) this.f63253b.get(str);
        atVar.getClass();
        atVar.f63194b.mo28474j(bVar);
        this.f63254c.put(str2, str);
    }

    /* renamed from: d */
    public final void mo28389d(C22977at atVar, ArrayList arrayList) {
        if (atVar.f63193a == C23105h.INITIALIZED_BY_CONTROLLER) {
            FeatureStateSnapshot a = atVar.f63194b.mo28465a();
            arrayList.add(a);
            if (a.f63362b == null) {
                for (C23035b bVar : a.mo28454a().f63378d) {
                    C22977at atVar2 = (C22977at) this.f63253b.get(bVar.f63371c);
                    if (atVar2 != null) {
                        mo28389d(atVar2, arrayList);
                    }
                }
                return;
            }
            return;
        }
        throw new C22940e(String.format("Unexpectedly found a controllerless feature model while traversing the current feature tree: %s", new Object[]{atVar.f63194b.f63388a}));
    }

    /* renamed from: e */
    public final void mo28390e(String str, C23109a aVar) {
        C22977at atVar = (C22977at) this.f63253b.get(str);
        if (atVar != null) {
            aVar.mo28347a(atVar);
            C23088b e = atVar.f63194b.mo28469e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                mo28390e((String) e.get(i), aVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo28391f(C22977at atVar) {
        String str = atVar.f63194b.f63388a;
        C23067b.m43230c(!this.f63253b.containsKey(str), "A UiSideFeatureState already exists for ID: %s", str);
        String str2 = atVar.f63194b.f63388a;
        if (!str2.equals("DC")) {
            String str3 = (String) this.f63254c.get(str2);
            C23067b.m43230c(str3 != null, "No parent feature found with child: %s", str2);
            C22977at atVar2 = (C22977at) this.f63253b.get(str3);
            atVar2.getClass();
            C23042g gVar = atVar2.f63194b;
            C23035b b = gVar.mo28466b(str2);
            C23067b.m43231d(b != null, "Parent must reference child before the child can be added to the ModelStore; parent: %s, parent's children: %s, child: %s", str3, gVar.mo28470f(), str2);
            b.getClass();
            boolean equals = b.f63372d.equals(atVar.f63194b.f63391d.f63478c);
            String str4 = b.f63372d;
            C23129y yVar = atVar.f63194b.f63391d;
            if (!equals) {
                throw new IllegalArgumentException(C23068c.m43237a("Parent references child with the same ID but different type; parent: %s, child: %s, child type according to parent: %s, actual child type: %s", str3, str2, str4, yVar));
            }
        }
        this.f63253b.put(atVar.f63194b.f63388a, atVar);
        C23088b e = atVar.f63194b.mo28469e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            String str5 = (String) e.get(i);
            C23067b.m43234g(!this.f63253b.containsKey(str5), "A child feature already exists with ID: %s", str5);
            this.f63254c.put(str5, str);
        }
    }

    /* renamed from: g */
    public final void mo28392g(String str) {
        C22977at atVar = (C22977at) this.f63253b.remove(str);
        if (atVar != null) {
            C23088b e = atVar.f63194b.mo28469e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) e.get(i);
                this.f63254c.remove(str2);
                mo28392g(str2);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo28393h(String str) {
        return this.f63253b.containsKey(str);
    }

    public C22995s(C22977at atVar, C23096b bVar) {
        HashMap hashMap = new HashMap();
        this.f63253b = hashMap;
        this.f63254c = new HashMap();
        this.f63255d = bVar;
        C23067b.m43228a(atVar.f63194b.f63388a.equals("DC"));
        hashMap.put("DC", atVar);
    }
}
