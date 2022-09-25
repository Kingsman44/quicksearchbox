package p5488io.p5490b;

import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70089j;

/* renamed from: io.b.k */
/* compiled from: PG */
public final class C70112k {

    /* renamed from: a */
    public static final C70112k f186863a = new C70112k((Object) null);

    /* renamed from: b */
    public final Object f186864b;

    public C70112k(Object obj) {
        this.f186864b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70112k) {
            return C69841j.m101336a(this.f186864b, ((C70112k) obj).f186864b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f186864b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f186864b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (C70089j.m101991d(obj)) {
            String valueOf = String.valueOf(C70089j.m101989b(obj));
            return "OnErrorNotification[" + valueOf + "]";
        }
        String valueOf2 = String.valueOf(this.f186864b);
        return "OnNextNotification[" + valueOf2 + "]";
    }
}
