package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.common.b.fp */
/* compiled from: PG */
final class C58453fp extends C58457ft {
    public C58453fp(C58458fu fuVar) {
        super(fuVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55310a(int i) {
        return new C58450fm(this.f156070b, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.f156070b.mo55334c(key, C58462fy.m89758b(key));
            if (c == -1 || !C58832aw.m90831a(this.f156070b.f156071a[c], value)) {
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
        int c = this.f156070b.mo55334c(key, b);
        if (c == -1 || !C58832aw.m90831a(this.f156070b.f156071a[c], value)) {
            return false;
        }
        this.f156070b.mo55343i(c, b);
        return true;
    }
}
