package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.rn */
/* compiled from: PG */
final class C58775rn extends C58777rp {

    /* renamed from: a */
    final /* synthetic */ C58776ro f156556a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58775rn(C58776ro roVar) {
        super(roVar.f156557a);
        this.f156556a = roVar;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C58374cr.m89412d(this.f156556a.f156557a.f156559a.entrySet(), entry)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return C58662ni.m90352k(this.f156556a.f156557a.f156559a.keySet(), new C58774rm(this));
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !this.f156556a.f156557a.f156559a.entrySet().remove(entry)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f156556a.f156557a.f156559a.size();
    }
}
