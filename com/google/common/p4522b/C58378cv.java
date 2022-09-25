package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.cv */
/* compiled from: PG */
final class C58378cv extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C58384da f155955a;

    public C58378cv(C58384da daVar) {
        this.f155955a = daVar;
    }

    public final void clear() {
        this.f155955a.clear();
    }

    public final boolean contains(Object obj) {
        Map k = this.f155955a.mo55100k();
        if (k != null) {
            return k.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = this.f155955a.mo55093f(entry.getKey());
            if (f == -1 || !C58832aw.m90831a(this.f155955a.mo55113t()[f], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f155955a.mo55096h();
    }

    public final boolean remove(Object obj) {
        int e;
        int b;
        Map k = this.f155955a.mo55100k();
        if (k != null) {
            return k.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C58384da daVar = this.f155955a;
        if (daVar.mo55108q() || (b = C58387dd.m89457b(entry.getKey(), entry.getValue(), e, Objects.requireNonNull(this.f155955a.f155966b), this.f155955a.mo55109r(), this.f155955a.mo55111s(), this.f155955a.mo55113t())) == -1) {
            return false;
        }
        this.f155955a.mo55105o(b, (e = daVar.mo55091e()));
        C58384da daVar2 = this.f155955a;
        daVar2.f155971g--;
        daVar2.mo55102l();
        return true;
    }

    public final int size() {
        return this.f155955a.size();
    }
}
