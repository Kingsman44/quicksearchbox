package androidx.mediarouter.p175a;

import android.os.Bundle;

/* renamed from: androidx.mediarouter.a.m */
/* compiled from: PG */
public final class C3740m {

    /* renamed from: a */
    public final Bundle f12010a;

    /* renamed from: b */
    public C3753z f12011b;

    public C3740m(C3753z zVar, boolean z) {
        if (zVar != null) {
            Bundle bundle = new Bundle();
            this.f12010a = bundle;
            this.f12011b = zVar;
            bundle.putBundle("selector", zVar.f12043b);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: a */
    public final void mo7903a() {
        if (this.f12011b == null) {
            C3753z a = C3753z.m10882a(this.f12010a.getBundle("selector"));
            this.f12011b = a;
            if (a == null) {
                this.f12011b = C3753z.f12042a;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo7904b() {
        return this.f12010a.getBoolean("activeScan");
    }

    /* renamed from: c */
    public final boolean mo7905c() {
        mo7903a();
        C3753z zVar = this.f12011b;
        zVar.mo7926c();
        return !zVar.f12044c.contains((Object) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3740m) {
            C3740m mVar = (C3740m) obj;
            mo7903a();
            C3753z zVar = this.f12011b;
            mVar.mo7903a();
            if (!zVar.equals(mVar.f12011b) || mo7904b() != mVar.mo7904b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        mo7903a();
        return this.f12011b.hashCode() ^ mo7904b() ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        mo7903a();
        sb.append(this.f12011b);
        sb.append(", activeScan=");
        sb.append(mo7904b());
        sb.append(", isValid=");
        sb.append(mo7905c());
        sb.append(" }");
        return sb.toString();
    }
}
