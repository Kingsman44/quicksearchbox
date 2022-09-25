package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c;

import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.c.c */
/* compiled from: PG */
public final class C37116c {

    /* renamed from: a */
    public final Instant f96678a;

    /* renamed from: b */
    public final int f96679b;

    /* renamed from: c */
    public final String f96680c;

    /* renamed from: d */
    public final List f96681d;

    public C37116c(Instant instant, int i, String str, List list) {
        C69664n.m101061g(list, "recipients");
        this.f96678a = instant;
        this.f96679b = i;
        this.f96680c = str;
        this.f96681d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37116c)) {
            return false;
        }
        C37116c cVar = (C37116c) obj;
        return C69664n.m101066l(this.f96678a, cVar.f96678a) && this.f96679b == cVar.f96679b && C69664n.m101066l(this.f96680c, cVar.f96680c) && C69664n.m101066l(this.f96681d, cVar.f96681d);
    }

    public final int hashCode() {
        int hashCode = ((this.f96678a.hashCode() * 31) + this.f96679b) * 31;
        String str = this.f96680c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96681d.hashCode();
    }

    public final String toString() {
        Instant instant = this.f96678a;
        int i = this.f96679b;
        String str = this.f96680c;
        List list = this.f96681d;
        return "Text(timestamp=" + instant + ", length=" + i + ", sender=" + str + ", recipients=" + list + ")";
    }
}
