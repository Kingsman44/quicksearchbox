package dagger.p5295b;

import java.util.concurrent.ExecutionException;

/* renamed from: dagger.b.a */
/* compiled from: PG */
final class C68229a extends C68282c {

    /* renamed from: a */
    private final Throwable f184592a;

    public C68229a(Throwable th) {
        this.f184592a = th;
    }

    /* renamed from: a */
    public final Object mo60292a() {
        throw new ExecutionException(this.f184592a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C68229a) {
            return this.f184592a.equals(((C68229a) obj).f184592a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f184592a.hashCode();
    }

    public final String toString() {
        return "Produced[failed with " + this.f184592a.getClass().getCanonicalName() + "]";
    }
}
