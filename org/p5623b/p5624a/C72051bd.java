package org.p5623b.p5624a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.b.a.bd */
/* compiled from: PG */
public final class C72051bd implements C72105r {

    /* renamed from: a */
    private final C72083ca f191850a;

    public C72051bd(C72083ca caVar) {
        this.f191850a = caVar;
    }

    /* renamed from: e */
    public final InputStream mo63238e() {
        return this.f191850a;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        try {
            return mo63230j();
        } catch (IOException e) {
            throw new C72107t("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        return new C72050bc(this.f191850a.mo63264a());
    }
}
