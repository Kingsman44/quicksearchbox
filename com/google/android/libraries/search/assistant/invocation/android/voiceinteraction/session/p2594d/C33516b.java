package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b */
/* compiled from: PG */
public final class C33516b {

    /* renamed from: a */
    public final boolean f89677a;

    /* renamed from: b */
    public final boolean f89678b;

    /* renamed from: c */
    public final C34093db f89679c;

    public C33516b(boolean z, boolean z2, C34093db dbVar) {
        C69664n.m101061g(dbVar, "parameters");
        this.f89677a = z;
        this.f89678b = z2;
        this.f89679c = dbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33516b)) {
            return false;
        }
        C33516b bVar = (C33516b) obj;
        return this.f89677a == bVar.f89677a && this.f89678b == bVar.f89678b && C69664n.m101066l(this.f89679c, bVar.f89679c);
    }

    public final int hashCode() {
        return ((((this.f89677a ? 1 : 0) * true) + (this.f89678b ? 1 : 0)) * 31) + this.f89679c.hashCode();
    }

    public final String toString() {
        boolean z = this.f89677a;
        boolean z2 = this.f89678b;
        C34093db dbVar = this.f89679c;
        return "VisConfiguration(withAssistData=" + z + ", withScreenshot=" + z2 + ", parameters=" + dbVar + ")";
    }
}
