package org.p5633c.p5634a.p5638d;

import java.io.Serializable;
import java.util.HashMap;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.d.u */
/* compiled from: PG */
public final class C72231u extends C72291o implements Serializable {

    /* renamed from: a */
    private static HashMap f192208a = null;
    private static final long serialVersionUID = -6390301302770925357L;

    /* renamed from: b */
    private final C72293q f192209b;

    private C72231u(C72293q qVar) {
        this.f192209b = qVar;
    }

    /* renamed from: j */
    public static synchronized C72231u m106458j(C72293q qVar) {
        C72231u uVar;
        synchronized (C72231u.class) {
            HashMap hashMap = f192208a;
            if (hashMap == null) {
                f192208a = new HashMap(7);
                uVar = null;
            } else {
                uVar = (C72231u) hashMap.get(qVar);
            }
            if (uVar != null) {
                return uVar;
            }
            C72231u uVar2 = new C72231u(qVar);
            f192208a.put(qVar, uVar2);
            return uVar2;
        }
    }

    /* renamed from: k */
    private final UnsupportedOperationException m106459k() {
        return new UnsupportedOperationException(this.f192209b.f192448m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return m106458j(this.f192209b);
    }

    /* renamed from: a */
    public final int mo63473a(long j, long j2) {
        throw m106459k();
    }

    /* renamed from: b */
    public final long mo63474b(long j, int i) {
        throw m106459k();
    }

    /* renamed from: c */
    public final long mo63475c(long j, long j2) {
        throw m106459k();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C72291o oVar = (C72291o) obj;
        return 0;
    }

    /* renamed from: d */
    public final long mo63476d(long j, long j2) {
        throw m106459k();
    }

    /* renamed from: e */
    public final long mo63488e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72231u) {
            return ((C72231u) obj).f192209b.f192448m.equals(this.f192209b.f192448m);
        }
        return false;
    }

    /* renamed from: g */
    public final C72293q mo63565g() {
        return this.f192209b;
    }

    /* renamed from: h */
    public final boolean mo63489h() {
        return true;
    }

    public final int hashCode() {
        return this.f192209b.f192448m.hashCode();
    }

    /* renamed from: i */
    public final boolean mo63566i() {
        return false;
    }

    public final String toString() {
        String str = this.f192209b.f192448m;
        return "UnsupportedDurationField[" + str + "]";
    }
}
