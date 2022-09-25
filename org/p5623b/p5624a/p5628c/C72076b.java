package org.p5623b.p5624a.p5628c;

import org.p5623b.p5624a.C72034at;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;

/* renamed from: org.b.a.c.b */
/* compiled from: PG */
public final class C72076b extends C72101n {

    /* renamed from: a */
    final C72110w f191871a;

    /* renamed from: b */
    public C72080f f191872b;

    private C72076b(C72110w wVar) {
        this.f191871a = wVar;
        if (wVar.mo63272e() == 3) {
            this.f191872b = C72080f.m105526a(wVar.mo63275j(0));
            C72075a.m105516a(wVar.mo63275j(1));
            C72034at.m105368i(wVar.mo63275j(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    /* renamed from: a */
    public static C72076b m105518a(Object obj) {
        if (obj instanceof C72076b) {
            return (C72076b) obj;
        }
        if (obj != null) {
            return new C72076b(C72110w.m105637k(obj));
        }
        return null;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        return this.f191871a;
    }
}
