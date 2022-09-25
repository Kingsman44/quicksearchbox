package com.google.android.libraries.search.assistant.p2828y.p2853n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2828y.p2852m.C37001a;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.n.b */
/* compiled from: PG */
public final class C37005b {

    /* renamed from: a */
    public final List f96372a;

    /* renamed from: b */
    public final String f96373b;

    public C37005b() {
        this((String) null, 3);
    }

    public /* synthetic */ C37005b(String str, int i) {
        List list;
        if ((i & 1) != 0) {
            list = C37001a.f96368a;
            C69664n.m101060f(list, "defaultMediaStickyAppPackageAllowList");
        } else {
            list = null;
        }
        str = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        C69664n.m101061g(list, "mediaStickyAppPackageAllowList");
        C69664n.m101061g(str, "foregroundMediaApp");
        this.f96372a = list;
        this.f96373b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37005b)) {
            return false;
        }
        C37005b bVar = (C37005b) obj;
        return C69664n.m101066l(this.f96372a, bVar.f96372a) && C69664n.m101066l(this.f96373b, bVar.f96373b);
    }

    public final int hashCode() {
        return (this.f96372a.hashCode() * 31) + this.f96373b.hashCode();
    }

    public final String toString() {
        List list = this.f96372a;
        String str = this.f96373b;
        return "MediaParamsConfiguration(mediaStickyAppPackageAllowList=" + list + ", foregroundMediaApp=" + str + ")";
    }
}
