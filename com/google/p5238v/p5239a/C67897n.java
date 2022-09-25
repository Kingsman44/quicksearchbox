package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5250f.C67613t;
import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.v.a.n */
/* compiled from: PG */
final class C67897n implements C67899o {

    /* renamed from: a */
    final /* synthetic */ C67613t f184074a;

    /* renamed from: b */
    final /* synthetic */ C67600g f184075b;

    public C67897n(C67613t tVar, C67600g gVar) {
        this.f184074a = tVar;
        this.f184075b = gVar;
    }

    /* renamed from: a */
    public final C67642j mo59985a(Class cls) {
        try {
            return new C67535af(this.f184074a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public final C67642j mo59986b() {
        C67613t tVar = this.f184074a;
        return new C67535af(tVar, tVar.f183537c);
    }

    /* renamed from: c */
    public final Class mo59987c() {
        return this.f184074a.getClass();
    }

    /* renamed from: d */
    public final Class mo59988d() {
        return this.f184075b.getClass();
    }

    /* renamed from: e */
    public final Set mo59989e() {
        return this.f184074a.mo59938j();
    }
}
