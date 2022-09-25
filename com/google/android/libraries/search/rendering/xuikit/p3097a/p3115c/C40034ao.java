package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.ao */
/* compiled from: PG */
public final class C40034ao extends C40035ap {

    /* renamed from: a */
    public final C57696b f105193a;

    /* renamed from: b */
    private final C66192df f105194b;

    public C40034ao(C57696b bVar, C66192df dfVar) {
        C69664n.m101061g(bVar, "clientLoggingProperties");
        C69664n.m101061g(dfVar, "loggingNode");
        this.f105193a = bVar;
        this.f105194b = dfVar;
    }

    /* renamed from: a */
    public final Integer mo42136a(C66190dd ddVar) {
        C69664n.m101061g(ddVar, "gestureType");
        if (ddVar != C66190dd.GESTURE_TYPE_CLICK) {
            return null;
        }
        C57696b bVar = this.f105193a;
        if ((bVar.f154140a & 256) != 0) {
            return Integer.valueOf(bVar.f154149j);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo42137b(C66190dd ddVar) {
        C69664n.m101061g(ddVar, "gestureType");
        if (C40033an.f105192a[ddVar.ordinal()] == 1) {
            return this.f105193a.f154145f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40034ao)) {
            return false;
        }
        C40034ao aoVar = (C40034ao) obj;
        return C69664n.m101066l(this.f105193a, aoVar.f105193a) && C69664n.m101066l(this.f105194b, aoVar.f105194b);
    }

    public final int hashCode() {
        return (this.f105193a.hashCode() * 31) + this.f105194b.hashCode();
    }

    public final String toString() {
        C57696b bVar = this.f105193a;
        C66192df dfVar = this.f105194b;
        return "ServerImpressedVe(clientLoggingProperties=" + bVar + ", loggingNode=" + dfVar + ")";
    }
}
