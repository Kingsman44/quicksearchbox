package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.i */
/* compiled from: PG */
public final class C59215i implements Serializable {

    /* renamed from: a */
    public final C59214h f157291a;

    /* renamed from: b */
    public final C59214h f157292b;

    public C59215i() {
        this(new C59214h(), new C59214h());
    }

    public C59215i(C59214h hVar, C59214h hVar2) {
        this.f157291a = hVar;
        this.f157292b = hVar2;
    }

    /* renamed from: a */
    public static C59215i m91857a() {
        return new C59215i(C59214h.m91849b(), C59214h.m91849b());
    }

    /* renamed from: b */
    public final C59215i mo56595b(double d) {
        C59216j jVar = new C59216j(d, d);
        C59214h c = this.f157291a.mo56587c(jVar.f157293a);
        C59214h c2 = this.f157292b.mo56587c(jVar.f157294b);
        return (c.mo56592h() || c2.mo56592h()) ? m91857a() : new C59215i(c, c2);
    }

    /* renamed from: c */
    public final C59216j mo56596c() {
        return new C59216j(this.f157291a.f157289a, this.f157292b.f157289a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59215i) {
            C59215i iVar = (C59215i) obj;
            if (!this.f157291a.equals(iVar.f157291a) || !this.f157292b.equals(iVar.f157292b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f157291a.hashCode() * 701) + this.f157292b.hashCode();
    }

    public final String toString() {
        return "[Lo" + mo56596c() + ", Hi" + new C59216j(this.f157291a.f157290b, this.f157292b.f157290b) + "]";
    }

    public C59215i(C59215i iVar) {
        this(new C59214h(iVar.f157291a), new C59214h(iVar.f157292b));
    }
}
