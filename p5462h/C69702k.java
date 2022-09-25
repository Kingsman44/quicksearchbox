package p5462h;

import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.k */
/* compiled from: PG */
public final class C69702k implements Serializable {

    /* renamed from: a */
    public final Object f186073a;

    public /* synthetic */ C69702k(Object obj) {
        this.f186073a = obj;
    }

    /* renamed from: a */
    public static final Throwable m101124a(Object obj) {
        if (obj instanceof C69692j) {
            return ((C69692j) obj).f186058a;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m101125b(Object obj) {
        return !(obj instanceof C69692j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C69702k) && C69664n.m101066l(this.f186073a, ((C69702k) obj).f186073a);
    }

    public final int hashCode() {
        Object obj = this.f186073a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f186073a;
        if (obj instanceof C69692j) {
            return ((C69692j) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
