package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.b */
/* compiled from: PG */
final class C121725b {

    /* renamed from: a */
    public final C33514d f337764a;

    /* renamed from: b */
    public final boolean f337765b;

    /* renamed from: c */
    public final boolean f337766c;

    /* renamed from: d */
    public final boolean f337767d;

    /* renamed from: e */
    public final List f337768e;

    public C121725b(C33514d dVar, boolean z, boolean z2, boolean z3, List list) {
        C69664n.m101061g(list, "events");
        this.f337764a = dVar;
        this.f337765b = z;
        this.f337766c = z2;
        this.f337767d = z3;
        this.f337768e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121725b)) {
            return false;
        }
        C121725b bVar = (C121725b) obj;
        return C69664n.m101066l(this.f337764a, bVar.f337764a) && this.f337765b == bVar.f337765b && this.f337766c == bVar.f337766c && this.f337767d == bVar.f337767d && C69664n.m101066l(this.f337768e, bVar.f337768e);
    }

    public final int hashCode() {
        long j = this.f337764a.f89676a;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + (this.f337765b ? 1 : 0)) * 31) + (this.f337766c ? 1 : 0)) * 31) + (this.f337767d ? 1 : 0)) * 31) + this.f337768e.hashCode();
    }

    public final String toString() {
        C33514d dVar = this.f337764a;
        boolean z = this.f337765b;
        boolean z2 = this.f337766c;
        boolean z3 = this.f337767d;
        List list = this.f337768e;
        return "DebugData(sessionId=" + dVar + ", needsAssistData=" + z + ", needsScreenshot=" + z2 + ", needsDirectAction=" + z3 + ", events=" + list + ")";
    }
}
