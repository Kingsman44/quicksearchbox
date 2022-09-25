package com.google.android.apps.search.podcasts.settings.p10612a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.b */
/* compiled from: PG */
public final class C141049b {

    /* renamed from: a */
    public final boolean f382930a;

    /* renamed from: b */
    public final String f382931b;

    public C141049b(boolean z, String str) {
        C69664n.m101061g(str, "languageNames");
        this.f382930a = z;
        this.f382931b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141049b)) {
            return false;
        }
        C141049b bVar = (C141049b) obj;
        return this.f382930a == bVar.f382930a && C69664n.m101066l(this.f382931b, bVar.f382931b);
    }

    public final int hashCode() {
        return ((this.f382930a ? 1 : 0) * true) + this.f382931b.hashCode();
    }

    public final String toString() {
        boolean z = this.f382930a;
        String str = this.f382931b;
        return "PreferredLanguage(enablePreferredLanguage=" + z + ", languageNames=" + str + ")";
    }
}
