package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a */
/* compiled from: PG */
public final class C125521a implements C125703b {

    /* renamed from: a */
    public final C125038d f346123a;

    public C125521a(C125038d dVar) {
        C69664n.m101061g(dVar, "loggingData");
        this.f346123a = dVar;
    }

    /* renamed from: a */
    public final int mo107031a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125521a) && C69664n.m101066l(this.f346123a, ((C125521a) obj).f346123a);
    }

    public final int hashCode() {
        return this.f346123a.hashCode();
    }

    public final String toString() {
        C125038d dVar = this.f346123a;
        return "EmojiFulfillmentResult(loggingData=" + dVar + ")";
    }
}
