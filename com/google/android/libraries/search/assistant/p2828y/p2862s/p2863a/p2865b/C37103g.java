package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import com.google.assistant.p3897e.p3921j.C52629yv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.g */
/* compiled from: PG */
final class C37103g {

    /* renamed from: a */
    public final String f96643a;

    /* renamed from: b */
    public final String f96644b;

    /* renamed from: c */
    public final C52629yv f96645c;

    /* renamed from: d */
    public final boolean f96646d;

    public C37103g(String str, String str2, C52629yv yvVar, boolean z) {
        this.f96643a = str;
        this.f96644b = str2;
        this.f96645c = yvVar;
        this.f96646d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37103g)) {
            return false;
        }
        C37103g gVar = (C37103g) obj;
        return C69664n.m101066l(this.f96643a, gVar.f96643a) && C69664n.m101066l(this.f96644b, gVar.f96644b) && C69664n.m101066l(this.f96645c, gVar.f96645c) && this.f96646d == gVar.f96646d;
    }

    public final int hashCode() {
        return (((((this.f96643a.hashCode() * 31) + this.f96644b.hashCode()) * 31) + this.f96645c.hashCode()) * 31) + (this.f96646d ? 1 : 0);
    }

    public final String toString() {
        String str = this.f96643a;
        String str2 = this.f96644b;
        C52629yv yvVar = this.f96645c;
        boolean z = this.f96646d;
        return "ContactPart(contactId=" + str + ", displayName=" + str2 + ", phone=" + yvVar + ", isStarred=" + z + ")";
    }
}
