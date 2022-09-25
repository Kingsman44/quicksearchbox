package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.u */
/* compiled from: PG */
public final class C120036u {

    /* renamed from: a */
    public final C120124o f334196a;

    /* renamed from: b */
    public final boolean f334197b;

    /* renamed from: c */
    private final C120124o f334198c;

    /* renamed from: d */
    private final String f334199d;

    public C120036u(C120124o oVar, C120124o oVar2, String str) {
        C69664n.m101061g(oVar, "sessionVariance");
        C69664n.m101061g(oVar2, "platformVariance");
        this.f334198c = oVar;
        this.f334196a = oVar2;
        this.f334199d = str;
        this.f334197b = C120124o.APA == oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C120036u)) {
            return false;
        }
        C120036u uVar = (C120036u) obj;
        return this.f334198c == uVar.f334198c && this.f334196a == uVar.f334196a && C69664n.m101066l(this.f334199d, uVar.f334199d);
    }

    public final int hashCode() {
        return (((this.f334198c.hashCode() * 31) + this.f334196a.hashCode()) * 31) + this.f334199d.hashCode();
    }

    public final String toString() {
        C120124o oVar = this.f334198c;
        C120124o oVar2 = this.f334196a;
        String str = this.f334199d;
        return "SessionDecision(sessionVariance=" + oVar + ", platformVariance=" + oVar2 + ", justification=" + str + ")";
    }
}
