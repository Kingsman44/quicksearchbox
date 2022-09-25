package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67600g;
import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.v.a.m */
/* compiled from: PG */
final class C67826m implements C67899o {

    /* renamed from: a */
    final /* synthetic */ C67600g f183915a;

    public C67826m(C67600g gVar) {
        this.f183915a = gVar;
    }

    /* renamed from: a */
    public final C67642j mo59985a(Class cls) {
        try {
            return new C67814l(this.f183915a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public final C67642j mo59986b() {
        C67600g gVar = this.f183915a;
        return new C67814l(gVar, gVar.f183537c);
    }

    /* renamed from: c */
    public final Class mo59987c() {
        return this.f183915a.getClass();
    }

    /* renamed from: d */
    public final Class mo59988d() {
        return null;
    }

    /* renamed from: e */
    public final Set mo59989e() {
        return this.f183915a.mo59938j();
    }
}
