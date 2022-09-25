package com.google.android.libraries.web.base;

import com.google.android.libraries.web.profile.p3431a.p3436c.C44052a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.b */
/* compiled from: PG */
public final class C43234b {

    /* renamed from: a */
    public final boolean f112982a;

    /* renamed from: b */
    public final boolean f112983b;

    /* renamed from: c */
    public final String f112984c;

    /* renamed from: d */
    public final boolean f112985d;

    /* renamed from: e */
    private final boolean f112986e = false;

    /* renamed from: f */
    private final boolean f112987f;

    /* renamed from: g */
    private final C44052a f112988g;

    public C43234b(boolean z, boolean z2, C44052a aVar, String str, boolean z3) {
        this.f112982a = z;
        this.f112983b = z2;
        this.f112987f = false;
        this.f112988g = aVar;
        this.f112984c = str;
        this.f112985d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43234b)) {
            return false;
        }
        C43234b bVar = (C43234b) obj;
        if (this.f112982a != bVar.f112982a) {
            return false;
        }
        boolean z = bVar.f112986e;
        if (this.f112983b != bVar.f112983b) {
            return false;
        }
        boolean z2 = bVar.f112987f;
        return C69664n.m101066l(this.f112988g, bVar.f112988g) && C69664n.m101066l(this.f112984c, bVar.f112984c) && this.f112985d == bVar.f112985d;
    }

    public final int hashCode() {
        return ((((((((this.f112982a ? 1 : 0) * true) + (this.f112983b ? 1 : 0)) * 961) + 1) * 31) + this.f112984c.hashCode()) * 31) + (this.f112985d ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f112982a;
        boolean z2 = this.f112983b;
        C44052a aVar = this.f112988g;
        String str = this.f112984c;
        boolean z3 = this.f112985d;
        return "ApplicationWebConfig(isRemoteDebuggingEnabled=" + z + ", isWebViewAccountSynchronisationEnabled=false, isUseGsaUserAgentForZwiebackGen204Enabled=" + z2 + ", isFetchZwiebackCookiesOnCookiesClearedEnabled=false, cookieJarSyncConfig=" + aVar + ", attributionTag=" + str + ", collectWebStateWithFlows=" + z3 + ")";
    }
}
