package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72213c;

/* renamed from: org.c.a.b.aj */
/* compiled from: PG */
final class C72164aj extends C72213c {
    private static final long serialVersionUID = -485345310999208286L;

    /* renamed from: a */
    final C72291o f192038a;

    /* renamed from: b */
    final boolean f192039b;

    /* renamed from: c */
    final C72288l f192040c;

    public C72164aj(C72291o oVar, C72288l lVar) {
        super(oVar.mo63565g());
        if (oVar.mo63566i()) {
            this.f192038a = oVar;
            this.f192039b = C72165ak.m105885X(oVar);
            this.f192040c = lVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    private final int m105876j(long j) {
        int i = this.f192040c.mo63661i(j);
        long j2 = (long) i;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return i;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    /* renamed from: k */
    private final int m105877k(long j) {
        int a = this.f192040c.mo37823a(j);
        long j2 = (long) a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* renamed from: a */
    public final int mo63473a(long j, long j2) {
        int i;
        int k = m105877k(j2);
        C72291o oVar = this.f192038a;
        if (this.f192039b) {
            i = k;
        } else {
            i = m105877k(j);
        }
        return oVar.mo63473a(j + ((long) i), j2 + ((long) k));
    }

    /* renamed from: b */
    public final long mo63474b(long j, int i) {
        int k = m105877k(j);
        long b = this.f192038a.mo63474b(j + ((long) k), i);
        if (!this.f192039b) {
            k = m105876j(b);
        }
        return b - ((long) k);
    }

    /* renamed from: c */
    public final long mo63475c(long j, long j2) {
        int k = m105877k(j);
        long c = this.f192038a.mo63475c(j + ((long) k), j2);
        if (!this.f192039b) {
            k = m105876j(c);
        }
        return c - ((long) k);
    }

    /* renamed from: d */
    public final long mo63476d(long j, long j2) {
        int i;
        int k = m105877k(j2);
        C72291o oVar = this.f192038a;
        if (this.f192039b) {
            i = k;
        } else {
            i = m105877k(j);
        }
        return oVar.mo63476d(j + ((long) i), j2 + ((long) k));
    }

    /* renamed from: e */
    public final long mo63488e() {
        return this.f192038a.mo63488e();
    }

    /* renamed from: h */
    public final boolean mo63489h() {
        if (this.f192039b) {
            return this.f192038a.mo63489h();
        }
        return this.f192038a.mo63489h() && this.f192040c.mo37831h();
    }
}
