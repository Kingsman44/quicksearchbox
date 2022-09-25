package org.p5623b.p5624a.p5628c;

import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72103p;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;

/* renamed from: org.b.a.c.a */
/* compiled from: PG */
public final class C72075a extends C72101n {

    /* renamed from: a */
    private C72103p f191869a;

    /* renamed from: b */
    private C72092e f191870b;

    private C72075a(C72110w wVar) {
        if (wVar.mo63272e() <= 0 || wVar.mo63272e() > 2) {
            int e = wVar.mo63272e();
            throw new IllegalArgumentException("Bad sequence size: " + e);
        }
        this.f191869a = C72103p.m105596i(wVar.mo63275j(0));
        this.f191870b = wVar.mo63272e() == 2 ? wVar.mo63275j(1) : null;
    }

    /* renamed from: a */
    public static C72075a m105516a(Object obj) {
        if (obj instanceof C72075a) {
            return (C72075a) obj;
        }
        if (obj != null) {
            return new C72075a(C72110w.m105637k(obj));
        }
        return null;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        C72093f fVar = new C72093f(2);
        fVar.mo63279b(this.f191869a);
        C72092e eVar = this.f191870b;
        if (eVar != null) {
            fVar.mo63279b(eVar);
        }
        return new C72054bg(fVar);
    }
}
