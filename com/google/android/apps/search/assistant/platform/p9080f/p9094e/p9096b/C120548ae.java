package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.ae */
/* compiled from: PG */
public final class C120548ae {

    /* renamed from: a */
    public final C52083ep f335253a;

    /* renamed from: b */
    public final C52070ec f335254b;

    public C120548ae(C52083ep epVar, C52070ec ecVar) {
        C69664n.m101061g(epVar, "sourceInteraction");
        C69664n.m101061g(ecVar, "clientOpResult");
        this.f335253a = epVar;
        this.f335254b = ecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C120548ae)) {
            return false;
        }
        C120548ae aeVar = (C120548ae) obj;
        return C69664n.m101066l(this.f335253a, aeVar.f335253a) && C69664n.m101066l(this.f335254b, aeVar.f335254b);
    }

    public final int hashCode() {
        return (this.f335253a.hashCode() * 31) + this.f335254b.hashCode();
    }

    public final String toString() {
        C52083ep epVar = this.f335253a;
        C52070ec ecVar = this.f335254b;
        return "InteractionResult(sourceInteraction=" + epVar + ", clientOpResult=" + ecVar + ")";
    }
}
