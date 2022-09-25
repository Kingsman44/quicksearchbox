package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p */
/* compiled from: PG */
public final class C125751p {

    /* renamed from: a */
    public final C125034a f346563a;

    /* renamed from: b */
    public final List f346564b;

    /* renamed from: c */
    public final C125703b f346565c;

    public C125751p(C125034a aVar, List list, C125703b bVar) {
        C69664n.m101061g(aVar, "triggerType");
        C69664n.m101061g(list, "clientOps");
        C69664n.m101061g(bVar, "fulfiller");
        this.f346563a = aVar;
        this.f346564b = list;
        this.f346565c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125751p)) {
            return false;
        }
        C125751p pVar = (C125751p) obj;
        return this.f346563a == pVar.f346563a && C69664n.m101066l(this.f346564b, pVar.f346564b) && C69664n.m101066l(this.f346565c, pVar.f346565c);
    }

    public final int hashCode() {
        return (((this.f346563a.hashCode() * 31) + this.f346564b.hashCode()) * 31) + this.f346565c.hashCode();
    }

    public final String toString() {
        C125034a aVar = this.f346563a;
        List list = this.f346564b;
        C125703b bVar = this.f346565c;
        return "FulfillmentResult(triggerType=" + aVar + ", clientOps=" + list + ", fulfiller=" + bVar + ")";
    }
}
