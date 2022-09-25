package org.p5623b.p5624a.p5628c;

import java.util.Enumeration;
import org.p5623b.p5624a.C72034at;
import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;

/* renamed from: org.b.a.c.e */
/* compiled from: PG */
public final class C72079e extends C72101n {

    /* renamed from: a */
    public C72034at f191879a;

    /* renamed from: b */
    private C72075a f191880b;

    public C72079e(C72110w wVar) {
        if (wVar.mo63272e() == 2) {
            Enumeration i = wVar.mo63273i();
            this.f191880b = C72075a.m105516a(i.nextElement());
            this.f191879a = C72034at.m105368i(i.nextElement());
            return;
        }
        int e = wVar.mo63272e();
        throw new IllegalArgumentException("Bad sequence size: " + e);
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        C72093f fVar = new C72093f(2);
        fVar.mo63279b(this.f191880b);
        fVar.mo63279b(this.f191879a);
        return new C72054bg(fVar);
    }
}
