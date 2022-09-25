package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72296t;

/* renamed from: org.c.a.b.p */
/* compiled from: PG */
final class C72180p {

    /* renamed from: a */
    private final C72288l f192117a;

    /* renamed from: b */
    private final C72296t f192118b;

    /* renamed from: c */
    private final int f192119c;

    public C72180p(C72288l lVar, C72296t tVar, int i) {
        this.f192117a = lVar;
        this.f192118b = tVar;
        this.f192119c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C72180p)) {
            return false;
        }
        C72180p pVar = (C72180p) obj;
        if (!this.f192118b.equals(pVar.f192118b) || this.f192119c != pVar.f192119c) {
            return false;
        }
        C72288l lVar = this.f192117a;
        C72288l lVar2 = pVar.f192117a;
        if (lVar == null) {
            if (lVar2 != null) {
                return false;
            }
        } else if (!lVar.equals(lVar2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f192118b.hashCode() + 31) * 31) + this.f192119c) * 31;
        C72288l lVar = this.f192117a;
        if (lVar == null) {
            i = 0;
        } else {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }
}
