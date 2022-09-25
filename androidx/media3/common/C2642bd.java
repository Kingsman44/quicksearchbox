package androidx.media3.common;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.bd */
/* compiled from: PG */
public final class C2642bd implements C2668l {

    /* renamed from: b */
    public static final /* synthetic */ int f7316b = 0;

    /* renamed from: a */
    public final C2677u f7317a;

    static {
        C2641bc.m7056a(new C2676t());
    }

    public C2642bd(C2677u uVar) {
        this.f7317a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2642bd)) {
            return false;
        }
        return this.f7317a.equals(((C2642bd) obj).f7317a);
    }

    public final int hashCode() {
        C2677u uVar = this.f7317a;
        int i = C2612ak.f7249a;
        return uVar.f7443a.hashCode();
    }
}
