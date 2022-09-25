package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66279b;
import com.google.research.p5181a.p5182a.C66284g;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.research.a.c.c */
/* compiled from: PG */
public final class C66312c extends C66310a {
    public C66312c() {
        this.f180324g = 5;
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "local_app_usage_history";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ArrayList mo59512g(C66278a aVar, C66376a aVar2, long j, long j2, int i) {
        this.f180325h.clear();
        this.f180326i.clear();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        List<C66376a> a = C66279b.m96854a(aVar, 1);
        Collections.sort(a, new C66311b());
        for (C66376a aVar3 : a) {
            if (aVar2.mo59467j().mo59503c() - aVar3.mo59467j().mo59503c() <= j) {
                int e = mo59510e(aVar3.mo59460c(), aVar2.mo59467j().mo59503c());
                if (!this.f180325h.contains(aVar3.mo59460c())) {
                    this.f180325h.add(aVar3.mo59460c());
                }
                Integer valueOf = Integer.valueOf(e);
                C66284g gVar = (C66284g) hashMap.get(valueOf);
                if (gVar == null) {
                    if (hashMap.size() >= i) {
                        break;
                    }
                    gVar = new C66284g(e);
                    hashMap.put(valueOf, gVar);
                }
                gVar.f180263b += 1.0f;
            }
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    /* renamed from: j */
    public final boolean mo59515j(C66376a aVar) {
        return aVar.mo59463f() == 1;
    }

    /* renamed from: n */
    public final C66312c mo59511f() {
        C66312c cVar = new C66312c(this.f180321d);
        for (Map.Entry entry : this.f180318a.entrySet()) {
            cVar.f180318a.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f180319b.entrySet()) {
            cVar.f180319b.put(entry2.getKey(), entry2.getValue());
        }
        boolean[] zArr = this.f180320c;
        cVar.f180320c = Arrays.copyOf(zArr, zArr.length);
        cVar.f180329j = this.f180329j;
        return cVar;
    }

    public C66312c(int i) {
        super(i);
        this.f180324g = 5;
    }
}
