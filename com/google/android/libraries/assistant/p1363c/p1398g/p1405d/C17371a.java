package com.google.android.libraries.assistant.p1363c.p1398g.p1405d;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.d.a */
/* compiled from: PG */
public final class C17371a {

    /* renamed from: a */
    public final C17508k f50235a;

    /* renamed from: b */
    public final C17477am f50236b;

    /* renamed from: c */
    public final C60870cx f50237c;

    /* renamed from: d */
    public final C60870cx f50238d;

    /* renamed from: e */
    public final C60870cx f50239e;

    public C17371a(C17508k kVar, C17477am amVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        C69664n.m101061g(kVar, "clientInfo");
        C69664n.m101061g(amVar, "sessionToken");
        C69664n.m101061g(cxVar, "synthesisStatus");
        C69664n.m101061g(cxVar2, "playbackStartStatus");
        C69664n.m101061g(cxVar3, "playbackEndStatus");
        this.f50235a = kVar;
        this.f50236b = amVar;
        this.f50237c = cxVar;
        this.f50238d = cxVar2;
        this.f50239e = cxVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17371a)) {
            return false;
        }
        C17371a aVar = (C17371a) obj;
        return C69664n.m101066l(this.f50235a, aVar.f50235a) && C69664n.m101066l(this.f50236b, aVar.f50236b) && C69664n.m101066l(this.f50237c, aVar.f50237c) && C69664n.m101066l(this.f50238d, aVar.f50238d) && C69664n.m101066l(this.f50239e, aVar.f50239e);
    }

    public final int hashCode() {
        return (((((((this.f50235a.hashCode() * 31) + this.f50236b.hashCode()) * 31) + this.f50237c.hashCode()) * 31) + this.f50238d.hashCode()) * 31) + this.f50239e.hashCode();
    }

    public final String toString() {
        C17508k kVar = this.f50235a;
        C17477am amVar = this.f50236b;
        C60870cx cxVar = this.f50237c;
        C60870cx cxVar2 = this.f50238d;
        C60870cx cxVar3 = this.f50239e;
        return "TtsSessionDebugData(clientInfo=" + kVar + ", sessionToken=" + amVar + ", synthesisStatus=" + cxVar + ", playbackStartStatus=" + cxVar2 + ", playbackEndStatus=" + cxVar3 + ")";
    }
}
