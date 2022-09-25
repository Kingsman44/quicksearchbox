package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.m */
/* compiled from: PG */
final class C37109m {

    /* renamed from: a */
    public final String f96657a;

    /* renamed from: b */
    public final String f96658b;

    /* renamed from: c */
    public final String f96659c;

    public C37109m(String str, String str2, String str3) {
        this.f96657a = str;
        this.f96658b = str2;
        this.f96659c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37109m)) {
            return false;
        }
        C37109m mVar = (C37109m) obj;
        return C69664n.m101066l(this.f96657a, mVar.f96657a) && C69664n.m101066l(this.f96658b, mVar.f96658b) && C69664n.m101066l(this.f96659c, mVar.f96659c);
    }

    public final int hashCode() {
        return (((this.f96657a.hashCode() * 31) + this.f96658b.hashCode()) * 31) + this.f96659c.hashCode();
    }

    public final String toString() {
        String str = this.f96657a;
        String str2 = this.f96658b;
        String str3 = this.f96659c;
        return "AccountColumns(contactId=" + str + ", accountType=" + str2 + ", accountName=" + str3 + ")";
    }
}
