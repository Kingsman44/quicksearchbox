package com.google.android.apps.gsa.p6486s;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;

/* renamed from: com.google.android.apps.gsa.s.g */
/* compiled from: PG */
public final class C84267g extends C84277q {

    /* renamed from: a */
    private final String f229336a = "opa";

    /* renamed from: b */
    private final C88431bb f229337b;

    public C84267g(C88431bb bbVar) {
        if (bbVar != null) {
            this.f229337b = bbVar;
            return;
        }
        throw new NullPointerException("Null sessionContext");
    }

    /* renamed from: a */
    public final C88431bb mo77778a() {
        return this.f229337b;
    }

    /* renamed from: b */
    public final String mo77779b() {
        return this.f229336a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84277q) {
            C84277q qVar = (C84277q) obj;
            return this.f229336a.equals(qVar.mo77779b()) && this.f229337b.equals(qVar.mo77778a());
        }
    }

    public final int hashCode() {
        return ((this.f229336a.hashCode() ^ 1000003) * 1000003) ^ this.f229337b.hashCode();
    }

    public final String toString() {
        String str = this.f229336a;
        String obj = this.f229337b.toString();
        return "UiSessionData{sessionType=" + str + ", sessionContext=" + obj + "}";
    }
}
