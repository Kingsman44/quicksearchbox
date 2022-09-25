package com.google.android.libraries.search.p2476a.p2479c;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.a.c.f */
/* compiled from: PG */
public final class C32205f extends C32165a {

    /* renamed from: a */
    private final C60870cx f86417a;

    /* renamed from: b */
    private final C60870cx f86418b;

    /* renamed from: c */
    private final C60870cx f86419c;

    public C32205f(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f86417a = cxVar;
        this.f86418b = cxVar2;
        this.f86419c = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo37980a() {
        return this.f86418b;
    }

    /* renamed from: b */
    public final C60870cx mo37981b() {
        return this.f86417a;
    }

    /* renamed from: c */
    public final C60870cx mo37982c() {
        return this.f86419c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32165a) {
            C32165a aVar = (C32165a) obj;
            return this.f86417a.equals(aVar.mo37981b()) && this.f86418b.equals(aVar.mo37980a()) && this.f86419c.equals(aVar.mo37982c());
        }
    }

    public final int hashCode() {
        return ((((this.f86417a.hashCode() ^ 1000003) * 1000003) ^ this.f86418b.hashCode()) * 1000003) ^ this.f86419c.hashCode();
    }

    public final String toString() {
        String obj = this.f86417a.toString();
        String obj2 = this.f86418b.toString();
        String obj3 = ((C60842bw) this.f86419c).f164926b.toString();
        return "AccountEnabling{accountName=" + obj + ", accountEnabled=" + obj2 + ", accountValidated=" + obj3 + "}";
    }
}
