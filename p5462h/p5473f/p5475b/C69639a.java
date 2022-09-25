package p5462h.p5473f.p5475b;

import java.io.Serializable;

/* renamed from: h.f.b.a */
/* compiled from: PG */
public class C69639a implements Serializable, C69661k {

    /* renamed from: a */
    private final Class f186016a;

    /* renamed from: b */
    protected final Object f186017b;

    /* renamed from: c */
    private final String f186018c;

    /* renamed from: d */
    private final String f186019d;

    /* renamed from: e */
    private final boolean f186020e = false;

    /* renamed from: f */
    private final int f186021f;

    /* renamed from: g */
    private final int f186022g;

    public C69639a(int i, Object obj, Class cls, String str, String str2) {
        this.f186017b = obj;
        this.f186016a = cls;
        this.f186018c = str;
        this.f186019d = str2;
        this.f186021f = i;
        this.f186022g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69639a)) {
            return false;
        }
        C69639a aVar = (C69639a) obj;
        boolean z = aVar.f186020e;
        if (this.f186021f == aVar.f186021f) {
            int i = aVar.f186022g;
            return C69664n.m101066l(this.f186017b, aVar.f186017b) && C69664n.m101066l(this.f186016a, aVar.f186016a) && this.f186018c.equals(aVar.f186018c) && this.f186019d.equals(aVar.f186019d);
        }
    }

    public final int hashCode() {
        Object obj = this.f186017b;
        return ((((((((((((obj != null ? obj.hashCode() : 0) * 31) + this.f186016a.hashCode()) * 31) + this.f186018c.hashCode()) * 31) + this.f186019d.hashCode()) * 31) + 1237) * 31) + this.f186021f) * 31) + 2;
    }

    /* renamed from: jS */
    public final int mo61347jS() {
        return this.f186021f;
    }

    public final String toString() {
        int i = C69649af.f186028a;
        return C69650ag.m101035a(this);
    }
}
