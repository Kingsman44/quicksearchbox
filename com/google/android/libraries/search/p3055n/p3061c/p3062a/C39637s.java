package com.google.android.libraries.search.p3055n.p3061c.p3062a;

/* renamed from: com.google.android.libraries.search.n.c.a.s */
/* compiled from: PG */
final class C39637s extends C39411b {

    /* renamed from: a */
    private final String f104348a;

    /* renamed from: b */
    private final C39389ae f104349b;

    public C39637s(String str, C39389ae aeVar) {
        this.f104348a = str;
        this.f104349b = aeVar;
    }

    /* renamed from: a */
    public final C39389ae mo41820a() {
        return this.f104349b;
    }

    /* renamed from: b */
    public final String mo41821b() {
        return this.f104348a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39411b) {
            C39411b bVar = (C39411b) obj;
            return this.f104348a.equals(bVar.mo41821b()) && this.f104349b.equals(bVar.mo41820a());
        }
    }

    public final int hashCode() {
        return ((this.f104348a.hashCode() ^ 1000003) * 1000003) ^ this.f104349b.hashCode();
    }

    public final String toString() {
        String str = this.f104348a;
        String num = Integer.toString(this.f104349b.getNumber());
        return "ActionRequestInfo{appFlowLoggingTag=" + str + ", requester=" + num + "}";
    }
}
