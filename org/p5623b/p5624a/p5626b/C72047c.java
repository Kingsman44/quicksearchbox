package org.p5623b.p5624a.p5626b;

import java.util.Enumeration;
import java.util.Hashtable;
import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72091d;
import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;
import org.p5623b.p5624a.C72113z;
import org.p5623b.p5624a.p5626b.p5627a.C72043a;
import org.p5623b.p5624a.p5626b.p5627a.C72044b;
import org.p5623b.p5624a.p5626b.p5627a.C72045c;

/* renamed from: org.b.a.b.c */
/* compiled from: PG */
public final class C72047c extends C72101n implements C72091d {

    /* renamed from: e */
    private static final C72043a f191841e = C72044b.f191810J;

    /* renamed from: a */
    private boolean f191842a;

    /* renamed from: b */
    private int f191843b;

    /* renamed from: c */
    private C72046b[] f191844c;

    /* renamed from: d */
    private C72054bg f191845d;

    /* renamed from: f */
    private C72043a f191846f;

    private C72047c(C72043a aVar, C72110w wVar) {
        C72046b bVar;
        this.f191846f = aVar;
        this.f191844c = new C72046b[wVar.mo63272e()];
        Enumeration i = wVar.mo63273i();
        boolean z = true;
        int i2 = 0;
        while (i.hasMoreElements()) {
            Object nextElement = i.nextElement();
            if (nextElement instanceof C72046b) {
                bVar = (C72046b) nextElement;
            } else {
                bVar = nextElement != null ? new C72046b(C72113z.m105645e(nextElement)) : null;
            }
            z &= bVar == nextElement;
            this.f191844c[i2] = bVar;
            i2++;
        }
        if (z) {
            this.f191845d = (C72054bg) wVar.mo63228f();
        } else {
            this.f191845d = new C72054bg((C72092e[]) this.f191844c);
        }
    }

    /* renamed from: a */
    public static C72047c m105415a(Object obj) {
        if (obj instanceof C72047c) {
            return (C72047c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new C72047c(f191841e, C72110w.m105637k(obj));
    }

    /* renamed from: b */
    public final C72046b[] mo63248b() {
        return (C72046b[]) this.f191844c.clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C72047c) && !(obj instanceof C72110w)) {
            return false;
        }
        C72092e eVar = (C72092e) obj;
        if (this.f191845d.mo63309r(eVar.mo63233g())) {
            return true;
        }
        try {
            C72047c cVar = new C72047c(f191841e, C72110w.m105637k(eVar.mo63233g()));
            C72046b[] b = mo63248b();
            C72046b[] b2 = cVar.mo63248b();
            if (b.length == b2.length) {
                boolean z = (b[0].mo63245a() == null || b2[0].mo63245a() == null) ? false : !b[0].mo63245a().f191800a.mo63309r(b2[0].mo63245a().f191800a);
                loop0:
                for (int i = 0; i != b.length; i++) {
                    C72046b bVar = b[i];
                    if (z) {
                        int length = b2.length;
                        while (true) {
                            length--;
                            if (length < 0) {
                                break loop0;
                            }
                            C72046b bVar2 = b2[length];
                            if (bVar2 != null && C72045c.m105410d(bVar, bVar2)) {
                                b2[length] = null;
                                break;
                            }
                        }
                    } else {
                        int i2 = 0;
                        while (i2 != b2.length) {
                            C72046b bVar3 = b2[i2];
                            if (bVar3 == null || !C72045c.m105410d(bVar, bVar3)) {
                                i2++;
                            } else {
                                b2[i2] = null;
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        return this.f191845d;
    }

    public final int hashCode() {
        if (this.f191842a) {
            return this.f191843b;
        }
        this.f191842a = true;
        C72046b[] b = mo63248b();
        int i = 0;
        for (int i2 = 0; i2 != b.length; i2++) {
            if (b[i2].mo63246b()) {
                C72042a[] c = b[i2].mo63247c();
                for (int i3 = 0; i3 != c.length; i3++) {
                    i = (i ^ c[i3].f191800a.f191932a.hashCode()) ^ C72045c.m105407a(C72045c.m105408b(c[i3].f191801b)).hashCode();
                }
            } else {
                i = (i ^ b[i2].mo63245a().f191800a.f191932a.hashCode()) ^ C72045c.m105407a(C72045c.m105408b(b[i2].mo63245a().f191801b)).hashCode();
            }
        }
        this.f191843b = i;
        return i;
    }

    public final String toString() {
        C72043a aVar = this.f191846f;
        StringBuffer stringBuffer = new StringBuffer();
        C72046b[] b = mo63248b();
        int i = 0;
        boolean z = true;
        while (i < b.length) {
            if (!z) {
                stringBuffer.append(',');
            }
            C72046b bVar = b[i];
            Hashtable hashtable = ((C72044b) aVar).f191839I;
            if (bVar.mo63246b()) {
                C72042a[] c = bVar.mo63247c();
                int i2 = 0;
                boolean z2 = true;
                while (i2 != c.length) {
                    if (!z2) {
                        stringBuffer.append('+');
                    }
                    C72045c.m105409c(stringBuffer, c[i2], hashtable);
                    i2++;
                    z2 = false;
                }
            } else if (bVar.mo63245a() != null) {
                C72045c.m105409c(stringBuffer, bVar.mo63245a(), hashtable);
            }
            i++;
            z = false;
        }
        return stringBuffer.toString();
    }
}
