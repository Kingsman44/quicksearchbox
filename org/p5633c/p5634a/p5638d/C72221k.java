package org.p5633c.p5634a.p5638d;

import java.io.Serializable;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.d.k */
/* compiled from: PG */
public final class C72221k extends C72291o implements Serializable {

    /* renamed from: a */
    public static final C72291o f192190a = new C72221k();
    private static final long serialVersionUID = 2656707858124633367L;

    private C72221k() {
    }

    private Object readResolve() {
        return f192190a;
    }

    /* renamed from: a */
    public final int mo63473a(long j, long j2) {
        return C72218h.m106355a(C72218h.m106359e(j, j2));
    }

    /* renamed from: b */
    public final long mo63474b(long j, int i) {
        return C72218h.m106356b(j, (long) i);
    }

    /* renamed from: c */
    public final long mo63475c(long j, long j2) {
        return C72218h.m106356b(j, j2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((C72291o) obj).mo63488e();
        if (e == 1) {
            return 0;
        }
        return e > 1 ? -1 : 1;
    }

    /* renamed from: d */
    public final long mo63476d(long j, long j2) {
        return C72218h.m106359e(j, j2);
    }

    /* renamed from: e */
    public final long mo63488e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C72221k)) {
            return false;
        }
        C72221k kVar = (C72221k) obj;
        return true;
    }

    /* renamed from: g */
    public final C72293q mo63565g() {
        return C72293q.f192447l;
    }

    /* renamed from: h */
    public final boolean mo63489h() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public final boolean mo63566i() {
        return true;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
