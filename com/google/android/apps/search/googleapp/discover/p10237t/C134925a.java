package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.a */
/* compiled from: PG */
public final class C134925a {

    /* renamed from: a */
    public final C60218r f367363a;

    /* renamed from: b */
    public final C57051b f367364b;

    /* renamed from: c */
    public final List f367365c;

    /* renamed from: d */
    public final C134591i f367366d;

    /* renamed from: e */
    public final boolean f367367e;

    /* renamed from: f */
    public final boolean f367368f;

    /* renamed from: g */
    public final C134548am f367369g;

    public C134925a(C60218r rVar, C57051b bVar, List list, C134591i iVar, boolean z, boolean z2, C134548am amVar) {
        C69664n.m101061g(rVar, "rootResponseEventId");
        C69664n.m101061g(bVar, "feedId");
        C69664n.m101061g(list, "dataOperations");
        C69664n.m101061g(iVar, "eligibilityStatus");
        C69664n.m101061g(amVar, "contentLifetime");
        this.f367363a = rVar;
        this.f367364b = bVar;
        this.f367365c = list;
        this.f367366d = iVar;
        this.f367367e = z;
        this.f367368f = z2;
        this.f367369g = amVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134925a)) {
            return false;
        }
        C134925a aVar = (C134925a) obj;
        return C69664n.m101066l(this.f367363a, aVar.f367363a) && C69664n.m101066l(this.f367364b, aVar.f367364b) && C69664n.m101066l(this.f367365c, aVar.f367365c) && this.f367366d == aVar.f367366d && this.f367367e == aVar.f367367e && this.f367368f == aVar.f367368f && C69664n.m101066l(this.f367369g, aVar.f367369g);
    }

    public final int hashCode() {
        return (((((((((((this.f367363a.hashCode() * 31) + this.f367364b.hashCode()) * 31) + this.f367365c.hashCode()) * 31) + this.f367366d.hashCode()) * 31) + (this.f367367e ? 1 : 0)) * 31) + (this.f367368f ? 1 : 0)) * 31) + this.f367369g.hashCode();
    }

    public final String toString() {
        C60218r rVar = this.f367363a;
        C57051b bVar = this.f367364b;
        List list = this.f367365c;
        C134591i iVar = this.f367366d;
        boolean z = this.f367367e;
        boolean z2 = this.f367368f;
        C134548am amVar = this.f367369g;
        return "ClientResponse(rootResponseEventId=" + rVar + ", feedId=" + bVar + ", dataOperations=" + list + ", eligibilityStatus=" + iVar + ", hasContent=" + z + ", isPinnedContentFulfilled=" + z2 + ", contentLifetime=" + amVar + ")";
    }
}
