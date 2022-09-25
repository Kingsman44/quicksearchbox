package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import java.util.List;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.a */
/* compiled from: PG */
final class C84072a extends C84074b {

    /* renamed from: a */
    public final String f228977a;

    /* renamed from: b */
    public final List f228978b;

    public C84072a(String str, List list) {
        if (str != null) {
            this.f228977a = str;
            if (list != null) {
                this.f228978b = list;
                return;
            }
            throw new NullPointerException("Null ampUrls");
        }
        throw new NullPointerException("Null groupId");
    }

    /* renamed from: a */
    public final String mo77523a() {
        return this.f228977a;
    }

    /* renamed from: b */
    public final List mo77524b() {
        return this.f228978b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84074b) {
            C84074b bVar = (C84074b) obj;
            return this.f228977a.equals(bVar.mo77523a()) && this.f228978b.equals(bVar.mo77524b());
        }
    }

    public final int hashCode() {
        return ((this.f228977a.hashCode() ^ 1000003) * 1000003) ^ this.f228978b.hashCode();
    }

    public final String toString() {
        String str = this.f228977a;
        String obj = this.f228978b.toString();
        return "PrerenderCandidate{groupId=" + str + ", ampUrls=" + obj + "}";
    }
}
