package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.x */
/* compiled from: PG */
final class C131643x {

    /* renamed from: a */
    public final C131638s f359684a;

    /* renamed from: b */
    public final boolean f359685b;

    public C131643x(C131638s sVar, boolean z) {
        this.f359684a = sVar;
        this.f359685b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C131643x)) {
            return false;
        }
        C131643x xVar = (C131643x) obj;
        return C69664n.m101066l(this.f359684a, xVar.f359684a) && this.f359685b == xVar.f359685b;
    }

    public final int hashCode() {
        return (this.f359684a.hashCode() * 31) + C131626h.m214058a(this.f359685b);
    }

    public final String toString() {
        C131638s sVar = this.f359684a;
        String b = C131626h.m214059b(this.f359685b);
        return "TimersContext(connectionStatus=" + sVar + ", settingEnabled=" + b + ")";
    }
}
