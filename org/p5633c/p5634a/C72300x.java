package org.p5633c.p5634a;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.p5633c.p5634a.p5635a.C72140h;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5639e.C72234a;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.x */
/* compiled from: PG */
public final class C72300x extends C72140h implements Serializable, C72151ai {

    /* renamed from: a */
    private static final Set f192457a;
    private static final long serialVersionUID = -12873158713873L;

    /* renamed from: b */
    private final long f192458b;

    /* renamed from: c */
    private final C72132a f192459c;

    static {
        new C72300x(0, 0, C72156ab.f192017E);
        HashSet hashSet = new HashSet();
        f192457a = hashSet;
        hashSet.add(C72293q.f192447l);
        hashSet.add(C72293q.f192446k);
        hashSet.add(C72293q.f192445j);
        hashSet.add(C72293q.f192444i);
    }

    public C72300x() {
        Map map = C72285i.f192411a;
        throw null;
    }

    /* renamed from: d */
    public static C72300x m106856d(C72288l lVar) {
        if (lVar != null) {
            C72284h hVar = C72285i.f192412b;
            return new C72300x(System.currentTimeMillis(), C72156ab.m105789X(lVar));
        }
        throw new NullPointerException("Zone must not be null");
    }

    private Object readResolve() {
        if (this.f192459c == null) {
            return new C72300x(this.f192458b, C72156ab.f192017E);
        }
        return !C72288l.f192416b.equals(this.f192459c.mo63325C()) ? new C72300x(this.f192458b, this.f192459c.mo63347d()) : this;
    }

    /* renamed from: a */
    public final int mo63391a(C72151ai aiVar) {
        if (this == aiVar) {
            return 0;
        }
        if (aiVar instanceof C72300x) {
            C72300x xVar = (C72300x) aiVar;
            if (this.f192459c.equals(xVar.f192459c)) {
                long j = this.f192458b;
                long j2 = xVar.f192458b;
                if (j < j2) {
                    return -1;
                }
                if (j != j2) {
                    return 1;
                }
                return 0;
            }
        }
        return super.compareTo(aiVar);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((C72151ai) obj);
    }

    /* renamed from: e */
    public final int mo63438e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72300x) {
            C72300x xVar = (C72300x) obj;
            if (this.f192459c.equals(xVar.f192459c)) {
                if (this.f192458b == xVar.f192458b) {
                    return true;
                }
                return false;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C72132a mo63439f() {
        return this.f192459c;
    }

    /* renamed from: g */
    public final boolean mo63691g(C72293q qVar) {
        if (qVar == null) {
            return false;
        }
        C72291o a = qVar.mo63674a(this.f192459c);
        if (f192457a.contains(qVar) || a.mo63488e() < this.f192459c.mo63327E().mo63488e()) {
            return a.mo63566i();
        }
        return false;
    }

    /* renamed from: h */
    public final C72233e mo63395h(int i, C72132a aVar) {
        if (i == 0) {
            return aVar.mo63357n();
        }
        if (i == 1) {
            return aVar.mo63362s();
        }
        if (i == 2) {
            return aVar.mo63366v();
        }
        if (i == 3) {
            return aVar.mo63360q();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    /* renamed from: i */
    public final boolean mo63397i(C72283g gVar) {
        if (!mo63691g(gVar.mo63647b())) {
            return false;
        }
        C72293q c = gVar.mo63648c();
        if (mo63691g(c) || c == C72293q.f192442g) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final String mo63692j() {
        return C72234a.m106517a("HH:mm").mo63597c(this);
    }

    public final String toString() {
        return C72267x.f192323d.mo63597c(this);
    }

    /* renamed from: b */
    public final int mo63392b(C72283g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo63397i(gVar)) {
            return gVar.mo63646a(this.f192459c).mo63444a(this.f192458b);
        } else {
            String obj = gVar.toString();
            throw new IllegalArgumentException("Field '" + obj + "' is not supported");
        }
    }

    public C72300x(int i, int i2, C72132a aVar) {
        C72132a d = C72285i.m106775c(aVar).mo63347d();
        long T = d.mo63342T(0, i, i2);
        this.f192459c = d;
        this.f192458b = T;
    }

    /* renamed from: c */
    public final int mo63437c(int i) {
        if (i == 0) {
            return this.f192459c.mo63357n().mo63444a(this.f192458b);
        }
        if (i == 1) {
            return this.f192459c.mo63362s().mo63444a(this.f192458b);
        }
        if (i == 2) {
            return this.f192459c.mo63366v().mo63444a(this.f192458b);
        }
        if (i == 3) {
            return this.f192459c.mo63360q().mo63444a(this.f192458b);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public C72300x(long j, C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        long k = c.mo63325C().mo63664k(C72288l.f192416b, j);
        C72132a d = c.mo63347d();
        this.f192458b = (long) d.mo63359p().mo63444a(k);
        this.f192459c = d;
    }
}
