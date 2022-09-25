package org.p5633c.p5634a;

import java.io.Serializable;
import org.p5633c.p5634a.p5635a.C72138f;
import org.p5633c.p5634a.p5635a.C72139g;
import org.p5633c.p5634a.p5636b.C72156ab;

/* renamed from: org.c.a.d */
/* compiled from: PG */
public final class C72210d extends C72138f implements Serializable, C72147ae {
    private static final long serialVersionUID = -5171125899451703815L;

    public C72210d() {
    }

    @Deprecated
    /* renamed from: b */
    public final C72153b mo63544b() {
        return new C72153b(this.f191962a, this.f191963b);
    }

    /* renamed from: c */
    public final C72210d mo63545c(int i) {
        return mo63546d(this.f191963b.mo63330H().mo63474b(this.f191962a, i));
    }

    /* renamed from: d */
    public final C72210d mo63546d(long j) {
        return j == this.f191962a ? this : new C72210d(j, this.f191963b);
    }

    /* renamed from: e */
    public final C72210d mo63547e() {
        return mo63548f().mo63680g(this.f191963b.mo63325C());
    }

    /* renamed from: f */
    public final C72298v mo63548f() {
        return new C72298v(this.f191962a, this.f191963b);
    }

    /* renamed from: g */
    public final C72210d mo63549g() {
        return mo63546d(this.f191963b.mo63330H().mo63673f(this.f191962a, 1));
    }

    /* renamed from: h */
    public final C72210d mo63550h() {
        return mo63546d(this.f191963b.mo63327E().mo63474b(this.f191962a, 1));
    }

    /* renamed from: i */
    public final C72210d mo63551i(C72148af afVar) {
        if (afVar != null) {
            long j = ((C72139g) afVar).f191964b;
            if (j != 0) {
                return mo63546d(this.f191963b.mo63344a(this.f191962a, j, 1));
            }
        }
        return this;
    }

    public C72210d(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4, 0, 0, 0, C72156ab.m105788W());
    }

    public C72210d(int i, int i2, int i3, int i4, int i5, int i6, int i7, C72132a aVar) {
        super(i, i2, i3, i4, i5, i6, i7, aVar);
    }

    public C72210d(int i, int i2, int i3, int i4, int i5, C72288l lVar) {
        super(i, i2, i3, i4, i5, 0, 0, C72156ab.m105789X(lVar));
    }

    public C72210d(long j) {
        super(j, C72156ab.m105788W());
    }

    public C72210d(long j, C72132a aVar) {
        super(j, aVar);
    }

    public C72210d(long j, C72288l lVar) {
        super(j, C72156ab.m105789X(lVar));
    }

    public C72210d(Object obj) {
        super(obj);
    }
}
