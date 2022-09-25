package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a */
/* compiled from: PG */
public final class C125533a extends C125693z {

    /* renamed from: a */
    public final List f346148a;

    public C125533a(List list) {
        C69664n.m101061g(list, "items");
        this.f346148a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125533a) && C69664n.m101066l(this.f346148a, ((C125533a) obj).f346148a);
    }

    public final int hashCode() {
        return this.f346148a.hashCode();
    }

    public final String toString() {
        List list = this.f346148a;
        return "AddItems(items=" + list + ")";
    }
}
