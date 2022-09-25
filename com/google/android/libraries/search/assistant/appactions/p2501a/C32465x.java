package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52815ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.x */
/* compiled from: PG */
public final class C32465x {

    /* renamed from: a */
    public final C52813ac f87001a;

    /* renamed from: b */
    public final boolean f87002b;

    /* renamed from: c */
    private final C52815ae f87003c;

    public C32465x(C52813ac acVar, C52815ae aeVar, boolean z) {
        this.f87001a = acVar;
        this.f87003c = aeVar;
        this.f87002b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32465x)) {
            return false;
        }
        C32465x xVar = (C32465x) obj;
        return C69664n.m101066l(this.f87001a, xVar.f87001a) && C69664n.m101066l(this.f87003c, xVar.f87003c) && this.f87002b == xVar.f87002b;
    }

    public final int hashCode() {
        C52813ac acVar = this.f87001a;
        return ((((acVar == null ? 0 : acVar.hashCode()) * 31) + this.f87003c.hashCode()) * 31) + (this.f87002b ? 1 : 0);
    }

    public final String toString() {
        C52813ac acVar = this.f87001a;
        C52815ae aeVar = this.f87003c;
        boolean z = this.f87002b;
        return "ManualInputResponse(fulfillmentResponse=" + acVar + ", manualInputMetadata=" + aeVar + ", dialogTerminated=" + z + ")";
    }
}
