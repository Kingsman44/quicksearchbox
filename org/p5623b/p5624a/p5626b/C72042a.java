package org.p5623b.p5624a.p5626b;

import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72103p;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;

/* renamed from: org.b.a.b.a */
/* compiled from: PG */
public final class C72042a extends C72101n {

    /* renamed from: a */
    public final C72103p f191800a;

    /* renamed from: b */
    public final C72092e f191801b;

    private C72042a(C72110w wVar) {
        this.f191800a = (C72103p) wVar.mo63275j(0);
        this.f191801b = wVar.mo63275j(1);
    }

    /* renamed from: a */
    public static C72042a m105404a(Object obj) {
        if (obj instanceof C72042a) {
            return (C72042a) obj;
        }
        if (obj != null) {
            return new C72042a(C72110w.m105637k(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        C72093f fVar = new C72093f(2);
        fVar.mo63279b(this.f191800a);
        fVar.mo63279b(this.f191801b);
        return new C72054bg(fVar);
    }
}
