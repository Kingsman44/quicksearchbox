package org.p5623b.p5624a;

import java.io.IOException;

/* renamed from: org.b.a.ag */
/* compiled from: PG */
public final class C72021ag implements C72092e, C72084cb {

    /* renamed from: a */
    private final int f191776a;

    /* renamed from: b */
    private final C72016ab f191777b;

    public C72021ag(int i, C72016ab abVar) {
        this.f191776a = i;
        this.f191777b = abVar;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        try {
            return mo63230j();
        } catch (IOException e) {
            throw new C72107t(e.getMessage(), e);
        }
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        return new C72020af(this.f191776a, this.f191777b.mo63224b());
    }
}
