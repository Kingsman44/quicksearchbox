package com.google.common.p4536h;

import com.google.common.p4522b.C58758qx;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.common.h.u */
/* compiled from: PG */
final class C59264u extends C59265v {

    /* renamed from: d */
    private Set f157374d;

    public C59264u(C59249f fVar) {
        super(fVar);
        this.f157374d = C58758qx.m90649g(fVar.mo56699c().size() + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55143a() {
        do {
            Objects.requireNonNull(this.f157374d);
            while (this.f157376c.hasNext()) {
                Object next = this.f157376c.next();
                if (!this.f157374d.contains(next)) {
                    return new C59261r(next, Objects.requireNonNull(this.f157375b));
                }
            }
            this.f157374d.add(this.f157375b);
        } while (mo56733c());
        this.f157374d = null;
        this.f156164a = 3;
        return null;
    }
}
