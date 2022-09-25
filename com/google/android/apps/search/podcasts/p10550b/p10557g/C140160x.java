package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.podcasts.b.g.x */
/* compiled from: PG */
public final class C140160x {

    /* renamed from: a */
    public final Map f380824a = new HashMap();

    /* renamed from: b */
    public final ArrayList f380825b;

    public C140160x(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C97929s sVar = (C97929s) it.next();
            this.f380824a.put(sVar.f273456d, sVar);
        }
        this.f380825b = new ArrayList(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C140160x)) {
            return false;
        }
        C140160x xVar = (C140160x) obj;
        if (!this.f380824a.equals(xVar.f380824a) || !this.f380825b.equals(xVar.f380825b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f380824a, this.f380825b);
    }
}
