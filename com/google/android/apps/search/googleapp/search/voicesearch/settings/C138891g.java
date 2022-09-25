package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.g */
/* compiled from: PG */
public final class C138891g {

    /* renamed from: a */
    public final String f377785a;

    /* renamed from: b */
    public final String f377786b;

    /* renamed from: c */
    public boolean f377787c = false;

    public C138891g(String str, String str2) {
        C69664n.m101061g(str, "displayName");
        C69664n.m101061g(str2, "languageCode");
        this.f377785a = str;
        this.f377786b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138891g)) {
            return false;
        }
        C138891g gVar = (C138891g) obj;
        return C69664n.m101066l(this.f377785a, gVar.f377785a) && C69664n.m101066l(this.f377786b, gVar.f377786b) && this.f377787c == gVar.f377787c;
    }

    public final int hashCode() {
        return (((this.f377785a.hashCode() * 31) + this.f377786b.hashCode()) * 31) + (this.f377787c ? 1 : 0);
    }

    public final String toString() {
        String str = this.f377785a;
        String str2 = this.f377786b;
        boolean z = this.f377787c;
        return "LanguageListEntry(displayName=" + str + ", languageCode=" + str2 + ", isSelected=" + z + ")";
    }
}
