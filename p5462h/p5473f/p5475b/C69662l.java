package p5462h.p5473f.p5475b;

import p5462h.p5481k.C69703a;
import p5462h.p5481k.C69706d;

/* renamed from: h.f.b.l */
/* compiled from: PG */
public class C69662l extends C69655e implements C69661k, C69706d {

    /* renamed from: a */
    private final int f186046a;

    /* renamed from: f */
    private final int f186047f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69662l(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.f186046a = i;
        this.f186047f = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C69662l) {
            C69662l lVar = (C69662l) obj;
            if (this.f186035d.equals(lVar.f186035d) && this.f186036e.equals(lVar.f186036e)) {
                int i = lVar.f186047f;
                return this.f186046a == lVar.f186046a && C69664n.m101066l(this.f186034c, lVar.f186034c) && C69664n.m101066l(mo61375f(), lVar.mo61375f());
            }
        } else if (obj instanceof C69706d) {
            return obj.equals(mo61374d());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo61377h() {
        int i = C69649af.f186028a;
    }

    public final int hashCode() {
        return (((mo61375f() == null ? 0 : mo61375f().hashCode() * 31) + this.f186035d.hashCode()) * 31) + this.f186036e.hashCode();
    }

    /* renamed from: jS */
    public final int mo61347jS() {
        return this.f186046a;
    }

    public final String toString() {
        C69703a d = mo61374d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(this.f186035d)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.f186035d + " (Kotlin reflection is not available)";
    }
}
