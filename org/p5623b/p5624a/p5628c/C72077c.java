package org.p5623b.p5624a.p5628c;

import java.io.IOException;
import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72074c;
import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72103p;
import org.p5623b.p5624a.C72104q;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.c.c */
/* compiled from: PG */
public final class C72077c extends C72101n {

    /* renamed from: a */
    public static final C72103p f191873a = new C72103p("2.5.29.17").mo63297j();

    /* renamed from: b */
    public C72103p f191874b;

    /* renamed from: c */
    public boolean f191875c;

    /* renamed from: d */
    public C72104q f191876d;

    static {
        new C72103p("2.5.29.9").mo63297j();
        new C72103p("2.5.29.14").mo63297j();
        new C72103p("2.5.29.15").mo63297j();
        new C72103p("2.5.29.16").mo63297j();
        new C72103p("2.5.29.18").mo63297j();
        new C72103p("2.5.29.19").mo63297j();
        new C72103p("2.5.29.20").mo63297j();
        new C72103p("2.5.29.21").mo63297j();
        new C72103p("2.5.29.23").mo63297j();
        new C72103p("2.5.29.24").mo63297j();
        new C72103p("2.5.29.27").mo63297j();
        new C72103p("2.5.29.28").mo63297j();
        new C72103p("2.5.29.29").mo63297j();
        new C72103p("2.5.29.30").mo63297j();
        new C72103p("2.5.29.31").mo63297j();
        new C72103p("2.5.29.32").mo63297j();
        new C72103p("2.5.29.33").mo63297j();
        new C72103p("2.5.29.35").mo63297j();
        new C72103p("2.5.29.36").mo63297j();
        new C72103p("2.5.29.37").mo63297j();
        new C72103p("2.5.29.46").mo63297j();
        new C72103p("2.5.29.54").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.1").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.11").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.12").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.2").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.3").mo63297j();
        new C72103p("1.3.6.1.5.5.7.1.4").mo63297j();
        new C72103p("2.5.29.56").mo63297j();
        new C72103p("2.5.29.55").mo63297j();
        new C72103p("2.5.29.60").mo63297j();
    }

    private C72077c(C72110w wVar) {
        C72074c cVar;
        if (wVar.mo63272e() == 2) {
            this.f191874b = C72103p.m105596i(wVar.mo63275j(0));
            this.f191875c = false;
            this.f191876d = C72104q.m105606i(wVar.mo63275j(1));
        } else if (wVar.mo63272e() == 3) {
            this.f191874b = C72103p.m105596i(wVar.mo63275j(0));
            C72092e j = wVar.mo63275j(1);
            if (j == null || (j instanceof C72074c)) {
                cVar = (C72074c) j;
            } else if (j instanceof byte[]) {
                try {
                    cVar = (C72074c) C72074c.m105626q((byte[]) j);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct boolean from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            } else {
                throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(j.getClass().getName())));
            }
            this.f191875c = cVar.mo63260e();
            this.f191876d = C72104q.m105606i(wVar.mo63275j(2));
        } else {
            int e2 = wVar.mo63272e();
            throw new IllegalArgumentException("Bad sequence size: " + e2);
        }
    }

    /* renamed from: a */
    public static C72077c m105520a(Object obj) {
        if (obj instanceof C72077c) {
            return (C72077c) obj;
        }
        if (obj != null) {
            return new C72077c(C72110w.m105637k(obj));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C72077c)) {
            return false;
        }
        C72077c cVar = (C72077c) obj;
        if (!cVar.f191874b.mo63309r(this.f191874b) || !cVar.f191876d.mo63309r(this.f191876d) || cVar.f191875c != this.f191875c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        C72093f fVar = new C72093f(3);
        fVar.mo63279b(this.f191874b);
        if (this.f191875c) {
            fVar.mo63279b(C72074c.f191867b);
        }
        fVar.mo63279b(this.f191876d);
        return new C72054bg(fVar);
    }

    public final int hashCode() {
        if (this.f191875c) {
            return C72123b.m105659a(this.f191876d.mo63236k()) ^ this.f191874b.f191932a.hashCode();
        }
        return (C72123b.m105659a(this.f191876d.mo63236k()) ^ this.f191874b.f191932a.hashCode()) ^ -1;
    }
}
