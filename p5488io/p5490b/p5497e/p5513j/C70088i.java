package p5488io.p5490b.p5497e.p5513j;

import java.io.Serializable;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.j.i */
/* compiled from: PG */
public final class C70088i implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;

    /* renamed from: a */
    public final Throwable f186818a;

    public C70088i(Throwable th) {
        this.f186818a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70088i) {
            return C69841j.m101336a(this.f186818a, ((C70088i) obj).f186818a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f186818a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f186818a);
        return "NotificationLite.Error[" + valueOf + "]";
    }
}
