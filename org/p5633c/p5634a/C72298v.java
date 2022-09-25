package org.p5633c.p5634a;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.p5633c.p5634a.p5635a.C72140h;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5637c.C72195d;
import org.p5633c.p5634a.p5637c.C72202k;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.v */
/* compiled from: PG */
public final class C72298v extends C72140h implements Serializable, C72151ai {

    /* renamed from: c */
    private static final Set f192451c;
    private static final long serialVersionUID = -8775358157899L;

    /* renamed from: a */
    public final long f192452a;

    /* renamed from: b */
    public final C72132a f192453b;

    /* renamed from: d */
    private volatile transient int f192454d;

    static {
        HashSet hashSet = new HashSet();
        f192451c = hashSet;
        hashSet.add(C72293q.f192442g);
        hashSet.add(C72293q.f192441f);
        hashSet.add(C72293q.f192440e);
        hashSet.add(C72293q.f192438c);
        hashSet.add(C72293q.f192439d);
        hashSet.add(C72293q.f192437b);
        hashSet.add(C72293q.f192436a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C72298v() {
        this(System.currentTimeMillis(), (C72132a) C72156ab.m105788W());
        C72284h hVar = C72285i.f192412b;
    }

    private Object readResolve() {
        if (this.f192453b == null) {
            return new C72298v(this.f192452a, (C72132a) C72156ab.f192017E);
        }
        return !C72288l.f192416b.equals(this.f192453b.mo63325C()) ? new C72298v(this.f192452a, this.f192453b.mo63347d()) : this;
    }

    /* renamed from: a */
    public final int mo63391a(C72151ai aiVar) {
        if (this == aiVar) {
            return 0;
        }
        if (aiVar instanceof C72298v) {
            C72298v vVar = (C72298v) aiVar;
            if (this.f192453b.equals(vVar.f192453b)) {
                long j = this.f192452a;
                long j2 = vVar.f192452a;
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

    /* renamed from: d */
    public final int mo63679d() {
        return this.f192453b.mo63370z().mo63444a(this.f192452a);
    }

    /* renamed from: e */
    public final int mo63438e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72298v) {
            C72298v vVar = (C72298v) obj;
            if (this.f192453b.equals(vVar.f192453b)) {
                if (this.f192452a == vVar.f192452a) {
                    return true;
                }
                return false;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C72132a mo63439f() {
        return this.f192453b;
    }

    /* renamed from: g */
    public final C72210d mo63680g(C72288l lVar) {
        C72288l e = C72285i.m106777e(lVar);
        C72132a e2 = this.f192453b.mo63348e(e);
        return new C72210d(e2.mo63352i().mo63453p(e.mo63666s(this.f192452a + 21600000)), e2);
    }

    /* renamed from: h */
    public final C72233e mo63395h(int i, C72132a aVar) {
        if (i == 0) {
            return aVar.mo63370z();
        }
        if (i == 1) {
            return aVar.mo63363t();
        }
        if (i == 2) {
            return aVar.mo63352i();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public final int hashCode() {
        int i = this.f192454d;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.f192454d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public final boolean mo63397i(C72283g gVar) {
        C72293q b = gVar.mo63647b();
        if (f192451c.contains(b) || b.mo63674a(this.f192453b).mo63488e() >= this.f192453b.mo63327E().mo63488e()) {
            return gVar.mo63646a(this.f192453b).mo63558E();
        }
        return false;
    }

    public final String toString() {
        return C72267x.f192321b.mo63597c(this);
    }

    /* renamed from: b */
    public final int mo63392b(C72283g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo63397i(gVar)) {
            return gVar.mo63646a(this.f192453b).mo63444a(this.f192452a);
        } else {
            String obj = gVar.toString();
            throw new IllegalArgumentException("Field '" + obj + "' is not supported");
        }
    }

    /* renamed from: c */
    public final int mo63437c(int i) {
        if (i == 0) {
            return this.f192453b.mo63370z().mo63444a(this.f192452a);
        }
        if (i == 1) {
            return this.f192453b.mo63363t().mo63444a(this.f192452a);
        }
        if (i == 2) {
            return this.f192453b.mo63352i().mo63444a(this.f192452a);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public C72298v(int i, int i2, int i3, C72132a aVar) {
        C72132a d = C72285i.m106775c(aVar).mo63347d();
        long b = d.mo63345b(i, i2, i3, 0);
        this.f192453b = d;
        this.f192452a = b;
    }

    public C72298v(long j, C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        long k = c.mo63325C().mo63664k(C72288l.f192416b, j);
        C72132a d = c.mo63347d();
        this.f192452a = d.mo63352i().mo63453p(k);
        this.f192453b = d;
    }

    public C72298v(Object obj, C72288l lVar) {
        C72202k b = C72195d.m106217a().mo63537b(obj);
        C72132a c = C72285i.m106775c(b.mo63530b(obj, lVar));
        C72132a d = c.mo63347d();
        this.f192453b = d;
        int[] e = b.mo63542e(this, obj, c, C72267x.f192325f);
        this.f192452a = d.mo63345b(e[0], e[1], e[2], 0);
    }
}
