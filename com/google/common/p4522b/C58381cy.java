package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.common.b.cy */
/* compiled from: PG */
final class C58381cy extends C58312aj {

    /* renamed from: a */
    final /* synthetic */ C58384da f155961a;

    /* renamed from: b */
    private final Object f155962b;

    /* renamed from: c */
    private int f155963c;

    public C58381cy(C58384da daVar, int i) {
        this.f155961a = daVar;
        this.f155962b = daVar.mo55111s()[i];
        this.f155963c = i;
    }

    /* renamed from: a */
    private final void m89419a() {
        int i = this.f155963c;
        if (i != -1 && i < this.f155961a.size()) {
            Object obj = this.f155962b;
            C58384da daVar = this.f155961a;
            if (C58832aw.m90831a(obj, daVar.mo55111s()[this.f155963c])) {
                return;
            }
        }
        this.f155963c = this.f155961a.mo55093f(this.f155962b);
    }

    public final Object getKey() {
        return this.f155962b;
    }

    public final Object getValue() {
        Map k = this.f155961a.mo55100k();
        if (k != null) {
            return k.get(this.f155962b);
        }
        m89419a();
        int i = this.f155963c;
        if (i == -1) {
            return null;
        }
        return this.f155961a.mo55113t()[i];
    }

    public final Object setValue(Object obj) {
        Map k = this.f155961a.mo55100k();
        if (k != null) {
            return k.put(this.f155962b, obj);
        }
        m89419a();
        int i = this.f155963c;
        if (i == -1) {
            this.f155961a.put(this.f155962b, obj);
            return null;
        }
        Object obj2 = this.f155961a.mo55113t()[i];
        C58384da daVar = this.f155961a;
        daVar.mo55113t()[this.f155963c] = obj;
        return obj2;
    }
}
