package dagger.p5295b.p5297b;

import p3186j$.util.Objects;

/* renamed from: dagger.b.b.d */
/* compiled from: PG */
public final class C68277d {

    /* renamed from: a */
    public final Class f184638a;

    /* renamed from: b */
    private final String f184639b = null;

    public C68277d(Class cls) {
        this.f184638a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C68277d) {
            C68277d dVar = (C68277d) obj;
            if (Objects.equals(this.f184638a, dVar.f184638a)) {
                String str = dVar.f184639b;
                if (Objects.equals((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.f184638a) ^ 1000003) * 1000003) ^ Objects.hashCode((Object) null);
    }

    public final String toString() {
        return this.f184638a.getCanonicalName();
    }
}
