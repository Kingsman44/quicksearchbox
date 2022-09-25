package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.a */
/* compiled from: PG */
final class C112662a extends C112699g {

    /* renamed from: a */
    private final Long f312263a;

    /* renamed from: b */
    private final C48672ag f312264b;

    public C112662a(Long l, C48672ag agVar) {
        this.f312263a = l;
        if (agVar != null) {
            this.f312264b = agVar;
            return;
        }
        throw new NullPointerException("Null sourceType");
    }

    /* renamed from: a */
    public final C48672ag mo99612a() {
        return this.f312264b;
    }

    /* renamed from: b */
    public final Long mo99613b() {
        return this.f312263a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112699g) {
            C112699g gVar = (C112699g) obj;
            return this.f312263a.equals(gVar.mo99613b()) && this.f312264b.equals(gVar.mo99612a());
        }
    }

    public final int hashCode() {
        return ((this.f312263a.hashCode() ^ 1000003) * 1000003) ^ this.f312264b.hashCode();
    }

    public final String toString() {
        Long l = this.f312263a;
        String num = Integer.toString(this.f312264b.f125915O);
        return "RequestSource{requestId=" + l + ", sourceType=" + num + "}";
    }
}
