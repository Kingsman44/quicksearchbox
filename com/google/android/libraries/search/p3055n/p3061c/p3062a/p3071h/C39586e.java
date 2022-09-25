package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.n.c.a.h.e */
/* compiled from: PG */
final class C39586e extends C39602u {

    /* renamed from: a */
    public final C60870cx f104208a;

    /* renamed from: b */
    public final C60870cx f104209b;

    public C39586e(C60870cx cxVar, C60870cx cxVar2) {
        this.f104208a = cxVar;
        this.f104209b = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo41928a() {
        return this.f104209b;
    }

    /* renamed from: b */
    public final C60870cx mo41929b() {
        return this.f104208a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39602u) {
            C39602u uVar = (C39602u) obj;
            return this.f104208a.equals(uVar.mo41929b()) && this.f104209b.equals(uVar.mo41928a());
        }
    }

    public final int hashCode() {
        return ((this.f104208a.hashCode() ^ 1000003) * 1000003) ^ this.f104209b.hashCode();
    }

    public final String toString() {
        String obj = this.f104208a.toString();
        String obj2 = ((C60842bw) this.f104209b).f164926b.toString();
        return "AudioPushResult{audioCaptureStartFuture=" + obj + ", audioCaptureEndFuture=" + obj2 + "}";
    }
}
