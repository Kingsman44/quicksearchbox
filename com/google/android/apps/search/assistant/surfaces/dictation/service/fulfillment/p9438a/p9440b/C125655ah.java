package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ah */
/* compiled from: PG */
public final class C125655ah extends C125693z {

    /* renamed from: a */
    public final List f346325a;

    public C125655ah(List list) {
        this.f346325a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125655ah) && C69664n.m101066l(this.f346325a, ((C125655ah) obj).f346325a);
    }

    public final int hashCode() {
        return this.f346325a.hashCode();
    }

    public final String toString() {
        List list = this.f346325a;
        return "RemoveItems(items=" + list + ")";
    }
}
