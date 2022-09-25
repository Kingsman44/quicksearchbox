package org.p5623b.p5624a;

import java.io.IOException;

/* renamed from: org.b.a.av */
/* compiled from: PG */
public final class C72036av implements C72092e, C72084cb {

    /* renamed from: a */
    private final C72016ab f191792a;

    public C72036av(C72016ab abVar) {
        this.f191792a = abVar;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        try {
            return mo63230j();
        } catch (IOException e) {
            throw new C72107t("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C72107t("unable to get DER object", e2);
        }
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        try {
            return new C72066bs(this.f191792a.mo63224b());
        } catch (IllegalArgumentException e) {
            throw new C72095h(e.getMessage(), e);
        }
    }
}
