package dagger.p5295b;

import com.google.common.base.C58832aw;

/* renamed from: dagger.b.b */
/* compiled from: PG */
public final class C68266b extends C68282c {

    /* renamed from: a */
    private final Object f184628a;

    public C68266b(Object obj) {
        this.f184628a = obj;
    }

    /* renamed from: a */
    public final Object mo60292a() {
        return this.f184628a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C68266b) {
            return C58832aw.m90831a(this.f184628a, ((C68266b) obj).f184628a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f184628a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Produced[" + this.f184628a + "]";
    }
}
