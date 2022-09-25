package org.p5623b.p5624a;

import java.io.IOException;

/* renamed from: org.b.a.aq */
/* compiled from: PG */
public final class C72031aq implements C72092e, C72084cb {

    /* renamed from: a */
    private final boolean f191785a;

    /* renamed from: b */
    private final int f191786b;

    /* renamed from: c */
    private final C72016ab f191787c;

    public C72031aq(boolean z, int i, C72016ab abVar) {
        this.f191785a = z;
        this.f191786b = i;
        this.f191787c = abVar;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        try {
            return mo63230j();
        } catch (IOException e) {
            throw new C72107t(e.getMessage());
        }
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        return this.f191787c.mo63225c(this.f191785a, this.f191786b);
    }
}
