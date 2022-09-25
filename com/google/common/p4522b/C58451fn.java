package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.common.b.fn */
/* compiled from: PG */
final class C58451fn extends C58457ft {

    /* renamed from: a */
    final /* synthetic */ C58458fu f156060a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58451fn(C58458fu fuVar) {
        super(fuVar);
        this.f156060a = fuVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55310a(int i) {
        return new C58449fl(this.f156060a, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.f156060a.mo55333b(key, C58462fy.m89758b(key));
            if (b == -1 || !C58832aw.m90831a(value, this.f156060a.f156072b[b])) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int b = C58462fy.m89758b(key);
        int b2 = this.f156060a.mo55333b(key, b);
        if (b2 == -1 || !C58832aw.m90831a(value, this.f156060a.f156072b[b2])) {
            return false;
        }
        this.f156060a.mo55341g(b2, b);
        return true;
    }
}
