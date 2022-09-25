package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.am */
/* compiled from: PG */
public final class C23410am {

    /* renamed from: a */
    public static final /* synthetic */ int f63978a = 0;

    /* renamed from: b */
    private final String f63979b;

    /* renamed from: c */
    private final String f63980c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private final String f63981d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private final String f63982e = BuildConfig.FLAVOR;

    static {
        new C23410am(BuildConfig.FLAVOR);
    }

    public C23410am(String str) {
        C69664n.m101061g(str, "manufacturer");
        this.f63979b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23410am)) {
            return false;
        }
        C23410am amVar = (C23410am) obj;
        return C69664n.m101066l(this.f63979b, amVar.f63979b) && C69664n.m101066l(this.f63980c, amVar.f63980c) && C69664n.m101066l(this.f63981d, amVar.f63981d) && C69664n.m101066l(this.f63982e, amVar.f63982e);
    }

    public final int hashCode() {
        return (((((this.f63979b.hashCode() * 31) + this.f63980c.hashCode()) * 31) + this.f63981d.hashCode()) * 31) + this.f63982e.hashCode();
    }

    public final String toString() {
        String str = this.f63979b;
        String str2 = this.f63980c;
        String str3 = this.f63981d;
        String str4 = this.f63982e;
        return "HomeAutomationDeviceInfo(manufacturer=" + str + ", model=" + str2 + ", hwVersion=" + str3 + ", swVersion=" + str4 + ")";
    }
}
