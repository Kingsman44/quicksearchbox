package kotlinx.coroutines.p5573a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.ab */
/* compiled from: PG */
public final class C71348ab {

    /* renamed from: a */
    public static final C71347aa f190539a = new C71347aa();

    /* renamed from: b */
    public final Object f190540b;

    public /* synthetic */ C71348ab(Object obj) {
        this.f190540b = obj;
    }

    /* renamed from: a */
    public static final Object m103983a(Object obj) {
        if (!(obj instanceof C71347aa)) {
            return obj;
        }
        return null;
    }

    /* renamed from: b */
    public static final Throwable m103984b(Object obj) {
        C71393z zVar = obj instanceof C71393z ? (C71393z) obj : null;
        if (zVar != null) {
            return zVar.f190598a;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m103985c(Object obj) {
        return !(obj instanceof C71347aa);
    }

    /* renamed from: d */
    public static final void m103986d(Object obj) {
        Throwable th;
        if (obj instanceof C71347aa) {
            if (!(obj instanceof C71393z) || (th = ((C71393z) obj).f190598a) == null) {
                new StringBuilder("Trying to call 'getOrThrow' on a failed channel result: ").append(obj);
                throw new IllegalStateException("Trying to call 'getOrThrow' on a failed channel result: ".concat(String.valueOf(obj)));
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C71348ab) && C69664n.m101066l(this.f190540b, ((C71348ab) obj).f190540b);
    }

    public final int hashCode() {
        Object obj = this.f190540b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f190540b;
        if (obj instanceof C71393z) {
            return ((C71393z) obj).toString();
        }
        return "Value(" + obj + ")";
    }
}
