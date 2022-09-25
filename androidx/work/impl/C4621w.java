package androidx.work.impl;

import androidx.work.impl.p207b.C4509r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.w */
/* compiled from: PG */
public final class C4621w {

    /* renamed from: a */
    private final Object f14520a = new Object();

    /* renamed from: b */
    private final Map f14521b = new LinkedHashMap();

    /* renamed from: a */
    public final C4620v mo9561a(C4509r rVar) {
        C4620v vVar;
        synchronized (this.f14520a) {
            vVar = (C4620v) this.f14521b.remove(rVar);
        }
        return vVar;
    }

    /* renamed from: b */
    public final C4620v mo9562b(C4509r rVar) {
        C4620v vVar;
        synchronized (this.f14520a) {
            Object vVar2 = new C4620v(rVar);
            Map map = this.f14521b;
            Object obj = map.get(rVar);
            if (obj == null) {
                map.put(rVar, vVar2);
            } else {
                vVar2 = obj;
            }
            vVar = (C4620v) vVar2;
        }
        return vVar;
    }

    /* renamed from: c */
    public final List mo9563c(String str) {
        List V;
        C69664n.m101061g(str, "workSpecId");
        synchronized (this.f14520a) {
            Map map = this.f14521b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C69664n.m101066l(((C4509r) entry.getKey()).f14269a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (C4509r remove : linkedHashMap.keySet()) {
                this.f14521b.remove(remove);
            }
            V = C69540x.m100840V(linkedHashMap.values());
        }
        return V;
    }
}
