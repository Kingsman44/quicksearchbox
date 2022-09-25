package org.p5623b.p5624a;

import java.util.Enumeration;

/* renamed from: org.b.a.ap */
/* compiled from: PG */
public final class C72030ap extends C72018ad {
    public C72030ap(boolean z, int i, C72092e eVar) {
        super(z, i, eVar);
    }

    /* renamed from: a */
    public final int mo63217a() {
        int b;
        int a = this.f191774c.mo63233g().mo63217a();
        if (this.f191773b) {
            b = C72090ch.m105545b(this.f191772a) + C72090ch.m105544a(a);
        } else {
            b = C72090ch.m105545b(this.f191772a);
            a--;
        }
        return b + a;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        Enumeration enumeration;
        sVar.mo63306k(z, 160, this.f191772a);
        sVar.f191935a.write(128);
        if (!this.f191773b) {
            C72092e eVar = this.f191774c;
            if (eVar instanceof C72104q) {
                if (eVar instanceof C72024aj) {
                    enumeration = ((C72024aj) eVar).mo63237l();
                } else {
                    enumeration = new C72024aj(((C72104q) eVar).mo63236k()).mo63237l();
                }
            } else if (eVar instanceof C72110w) {
                enumeration = ((C72110w) eVar).mo63273i();
            } else if (eVar instanceof C72113z) {
                enumeration = new C72112y((C72113z) eVar);
            } else {
                throw new C72095h("not implemented: ".concat(String.valueOf(eVar.getClass().getName())));
            }
            sVar.mo63300d(enumeration);
        } else {
            sVar.mo63254j(this.f191774c.mo63233g(), true);
        }
        sVar.f191935a.write(0);
        sVar.f191935a.write(0);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return this.f191773b || this.f191774c.mo63233g().mo63220d();
    }
}
