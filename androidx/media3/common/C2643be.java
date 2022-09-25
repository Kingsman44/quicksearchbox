package androidx.media3.common;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.be */
/* compiled from: PG */
public final class C2643be {

    /* renamed from: a */
    public final C2677u f7318a;

    public C2643be(C2677u uVar) {
        this.f7318a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2643be)) {
            return false;
        }
        return this.f7318a.equals(((C2643be) obj).f7318a);
    }

    public final int hashCode() {
        C2677u uVar = this.f7318a;
        int i = C2612ak.f7249a;
        return uVar.f7443a.hashCode();
    }
}
