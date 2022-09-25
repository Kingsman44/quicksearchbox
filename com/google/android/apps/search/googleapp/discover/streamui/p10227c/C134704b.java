package com.google.android.apps.search.googleapp.discover.streamui.p10227c;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.c.b */
/* compiled from: PG */
public final class C134704b implements C47388b {

    /* renamed from: a */
    public final String f366821a;

    /* renamed from: b */
    public final Map f366822b;

    public C134704b(String str, Map map) {
        C69664n.m101061g(str, "query");
        C69664n.m101061g(map, "cgiParams");
        this.f366821a = str;
        this.f366822b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134704b)) {
            return false;
        }
        C134704b bVar = (C134704b) obj;
        return C69664n.m101066l(this.f366821a, bVar.f366821a) && C69664n.m101066l(this.f366822b, bVar.f366822b);
    }

    public final int hashCode() {
        return (this.f366821a.hashCode() * 31) + this.f366822b.hashCode();
    }

    public final String toString() {
        String str = this.f366821a;
        Map map = this.f366822b;
        return "DiscoverSearchQueryEvent(query=" + str + ", cgiParams=" + map + ")";
    }
}
