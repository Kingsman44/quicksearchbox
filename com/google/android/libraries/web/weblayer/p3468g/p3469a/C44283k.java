package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.google.android.libraries.web.p3353c.C43323b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.k */
/* compiled from: PG */
public final class C44283k {

    /* renamed from: a */
    public final String f115170a;

    /* renamed from: b */
    public final String f115171b;

    /* renamed from: c */
    public final C43323b f115172c;

    /* renamed from: d */
    public final boolean f115173d;

    /* renamed from: e */
    public final boolean f115174e;

    /* renamed from: f */
    public final int f115175f;

    /* renamed from: g */
    public final int f115176g;

    /* renamed from: h */
    public final List f115177h;

    /* renamed from: i */
    public final boolean f115178i;

    /* renamed from: j */
    private final String f115179j;

    public C44283k(String str, String str2, String str3, C43323b bVar, boolean z, boolean z2, int i, int i2, List list, boolean z3) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(str2, "title");
        C69664n.m101061g(str3, "referrer");
        C69664n.m101061g(bVar, "clientData");
        this.f115170a = str;
        this.f115179j = str2;
        this.f115171b = str3;
        this.f115172c = bVar;
        this.f115173d = z;
        this.f115174e = z2;
        this.f115175f = i;
        this.f115176g = i2;
        this.f115177h = list;
        this.f115178i = z3;
    }

    /* renamed from: a */
    public final C44283k mo47192a() {
        String str = this.f115170a;
        String str2 = this.f115179j;
        String str3 = this.f115171b;
        C43323b bVar = this.f115172c;
        boolean z = this.f115173d;
        boolean z2 = this.f115174e;
        int i = this.f115175f;
        int i2 = this.f115176g;
        List list = this.f115177h;
        C69664n.m101061g(str, "url");
        C69664n.m101061g(str2, "title");
        C69664n.m101061g(str3, "referrer");
        C69664n.m101061g(bVar, "clientData");
        return new C44283k(str, str2, str3, bVar, z, z2, i, i2, list, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44283k)) {
            return false;
        }
        C44283k kVar = (C44283k) obj;
        return C69664n.m101066l(this.f115170a, kVar.f115170a) && C69664n.m101066l(this.f115179j, kVar.f115179j) && C69664n.m101066l(this.f115171b, kVar.f115171b) && C69664n.m101066l(this.f115172c, kVar.f115172c) && this.f115173d == kVar.f115173d && this.f115174e == kVar.f115174e && this.f115175f == kVar.f115175f && this.f115176g == kVar.f115176g && C69664n.m101066l(this.f115177h, kVar.f115177h) && this.f115178i == kVar.f115178i;
    }

    public final int hashCode() {
        return (((((((((((((((((this.f115170a.hashCode() * 31) + this.f115179j.hashCode()) * 31) + this.f115171b.hashCode()) * 31) + this.f115172c.hashCode()) * 31) + (this.f115173d ? 1 : 0)) * 31) + (this.f115174e ? 1 : 0)) * 31) + this.f115175f) * 31) + this.f115176g) * 31) + this.f115177h.hashCode()) * 31) + (this.f115178i ? 1 : 0);
    }

    public final String toString() {
        String str = this.f115170a;
        String str2 = this.f115179j;
        String str3 = this.f115171b;
        C43323b bVar = this.f115172c;
        boolean z = this.f115173d;
        boolean z2 = this.f115174e;
        int i = this.f115175f;
        int i2 = this.f115176g;
        List list = this.f115177h;
        boolean z3 = this.f115178i;
        return "PageNavigationInfo(url=" + str + ", title=" + str2 + ", referrer=" + str3 + ", clientData=" + bVar + ", isRefresh=" + z + ", isFormSubmission=" + z2 + ", chromeMajorVersion=" + i + ", httpStatusCode=" + i2 + ", redirectChain=" + list + ", isLogged=" + z3 + ")";
    }
}
