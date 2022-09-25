package p5462h.p5473f.p5475b;

import p5462h.p5473f.C69638b;
import p5462h.p5481k.C69703a;
import p5462h.p5481k.C69713k;

/* renamed from: h.f.b.z */
/* compiled from: PG */
public abstract class C69676z extends C69655e implements C69713k {
    public C69676z() {
        Object obj = C69655e.f186032b;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C69676z) {
            C69676z zVar = (C69676z) obj;
            return mo61375f().equals(zVar.mo61375f()) && this.f186035d.equals(zVar.f186035d) && this.f186036e.equals(zVar.f186036e) && C69664n.m101066l(this.f186034c, zVar.f186034c);
        } else if (obj instanceof C69713k) {
            return obj.equals(mo61374d());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return (((mo61375f().hashCode() * 31) + this.f186035d.hashCode()) * 31) + this.f186036e.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C69713k mo61395i() {
        C69703a d = mo61374d();
        if (d != this) {
            return (C69713k) d;
        }
        throw new C69638b();
    }

    public final String toString() {
        C69703a d = mo61374d();
        if (d != this) {
            return d.toString();
        }
        return "property " + this.f186035d + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69676z(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
