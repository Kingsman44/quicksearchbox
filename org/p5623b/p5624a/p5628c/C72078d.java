package org.p5623b.p5624a.p5628c;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72103p;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72110w;

/* renamed from: org.b.a.c.d */
/* compiled from: PG */
public final class C72078d extends C72101n {

    /* renamed from: a */
    public Hashtable f191877a = new Hashtable();

    /* renamed from: b */
    public Vector f191878b = new Vector();

    public C72078d(C72110w wVar) {
        Enumeration i = wVar.mo63273i();
        while (i.hasMoreElements()) {
            C72077c a = C72077c.m105520a(i.nextElement());
            if (!this.f191877a.containsKey(a.f191874b)) {
                this.f191877a.put(a.f191874b, a);
                this.f191878b.addElement(a.f191874b);
            } else {
                throw new IllegalArgumentException("repeated extension found: ".concat(String.valueOf(String.valueOf(a.f191874b))));
            }
        }
    }

    /* renamed from: b */
    public static final C72103p[] m105522b(Vector vector) {
        int size = vector.size();
        C72103p[] pVarArr = new C72103p[size];
        for (int i = 0; i != size; i++) {
            pVarArr[i] = (C72103p) vector.elementAt(i);
        }
        return pVarArr;
    }

    /* renamed from: a */
    public final C72077c mo63262a(C72103p pVar) {
        return (C72077c) this.f191877a.get(pVar);
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        C72093f fVar = new C72093f(this.f191878b.size());
        Enumeration elements = this.f191878b.elements();
        while (elements.hasMoreElements()) {
            fVar.mo63279b((C72077c) this.f191877a.get((C72103p) elements.nextElement()));
        }
        return new C72054bg(fVar);
    }

    public C72078d(C72077c[] cVarArr) {
        for (int i = 0; i != cVarArr.length; i++) {
            C72077c cVar = cVarArr[i];
            this.f191878b.addElement(cVar.f191874b);
            this.f191877a.put(cVar.f191874b, cVar);
        }
    }
}
