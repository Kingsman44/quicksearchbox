package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.Comparator;
import p5462h.p5465b.C69544a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.ao */
/* compiled from: PG */
public final class C140666ao {

    /* renamed from: a */
    public final C140646b f382044a;

    /* renamed from: b */
    public final boolean f382045b;

    /* renamed from: c */
    public final C63042fg f382046c;

    /* renamed from: d */
    private final C63042fg f382047d;

    public C140666ao(C140646b bVar, boolean z, C63042fg fgVar) {
        C69664n.m101061g(bVar, "showItem");
        C69664n.m101061g(fgVar, "lastListenTime");
        this.f382044a = bVar;
        this.f382045b = z;
        this.f382047d = fgVar;
        C63042fg fgVar2 = bVar.f382011q;
        fgVar2 = fgVar2 == null ? C63042fg.f170152c : fgVar2;
        Comparator n = C62953e.m95489n();
        C69664n.m101060f(n, "comparator()");
        Object b = C69544a.m100955b(fgVar2, fgVar, n);
        C69664n.m101060f(b, "maxOf(showItem.subscript… Timestamps.comparator())");
        this.f382046c = (C63042fg) b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140666ao)) {
            return false;
        }
        C140666ao aoVar = (C140666ao) obj;
        return C69664n.m101066l(this.f382044a, aoVar.f382044a) && this.f382045b == aoVar.f382045b && C69664n.m101066l(this.f382047d, aoVar.f382047d);
    }

    public final int hashCode() {
        return (((this.f382044a.hashCode() * 31) + (this.f382045b ? 1 : 0)) * 31) + this.f382047d.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f382044a;
        boolean z = this.f382045b;
        C63042fg fgVar = this.f382047d;
        return "SubscriptionItem(showItem=" + bVar + ", showNewBadge=" + z + ", lastListenTime=" + fgVar + ")";
    }
}
