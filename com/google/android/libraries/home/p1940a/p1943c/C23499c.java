package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.c */
/* compiled from: PG */
public final class C23499c {

    /* renamed from: a */
    private String f64246a;

    /* renamed from: b */
    private String f64247b;

    /* renamed from: c */
    private String f64248c;

    /* renamed from: d */
    private String f64249d;

    public C23499c() {
        this((String) null);
    }

    public /* synthetic */ C23499c(String str) {
        C69664n.m101061g(str, "id");
        this.f64246a = str;
        this.f64247b = BuildConfig.FLAVOR;
        this.f64248c = BuildConfig.FLAVOR;
        this.f64249d = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23499c)) {
            return false;
        }
        C23499c cVar = (C23499c) obj;
        return C69664n.m101066l(this.f64246a, cVar.f64246a) && C69664n.m101066l(this.f64247b, cVar.f64247b) && C69664n.m101066l(this.f64248c, cVar.f64248c) && C69664n.m101066l(this.f64249d, cVar.f64249d);
    }

    public final int hashCode() {
        return (((((this.f64246a.hashCode() * 31) + this.f64247b.hashCode()) * 31) + this.f64248c.hashCode()) * 31) + this.f64249d.hashCode();
    }

    public final String toString() {
        String str = this.f64246a;
        String str2 = this.f64247b;
        String str3 = this.f64248c;
        String str4 = this.f64249d;
        return "HomeAutomationAgentInfo(id=" + str + ", iconUrl=" + str2 + ", appDeepLink=" + str3 + ", webDeepLink=" + str4 + ")";
    }
}
