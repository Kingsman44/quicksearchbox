package com.google.android.libraries.home.p1940a.p1943c;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ar */
/* compiled from: PG */
public final class C23415ar {

    /* renamed from: a */
    public final String f63987a;

    /* renamed from: b */
    public final C58528ij f63988b;

    public C23415ar(String str, C58528ij ijVar) {
        C69664n.m101061g(str, "deviceId");
        this.f63987a = str;
        this.f63988b = ijVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23415ar)) {
            return false;
        }
        C23415ar arVar = (C23415ar) obj;
        return C69664n.m101066l(this.f63987a, arVar.f63987a) && C69664n.m101066l(this.f63988b, arVar.f63988b);
    }

    public final int hashCode() {
        return (this.f63987a.hashCode() * 31) + ((C58759qy) this.f63988b).f156534a.hashCode();
    }

    public final String toString() {
        String str = this.f63987a;
        C58528ij ijVar = this.f63988b;
        return "HomeAutomationDeviceParamsPair(deviceId=" + str + ", parameters=" + ijVar + ")";
    }
}
