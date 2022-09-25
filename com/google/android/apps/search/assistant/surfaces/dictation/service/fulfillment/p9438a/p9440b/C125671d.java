package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.d */
/* compiled from: PG */
public final class C125671d extends C125693z {

    /* renamed from: a */
    public final List f346349a;

    public C125671d(List list) {
        this.f346349a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125671d) && C69664n.m101066l(this.f346349a, ((C125671d) obj).f346349a);
    }

    public final int hashCode() {
        return this.f346349a.hashCode();
    }

    public final String toString() {
        List list = this.f346349a;
        return "CheckItems(items=" + list + ")";
    }
}
