package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.a */
/* compiled from: PG */
public final class C133975a {

    /* renamed from: a */
    public final Duration f364922a;

    /* renamed from: b */
    public final C57299d f364923b;

    /* renamed from: c */
    public final C57528m f364924c;

    public C133975a(Duration duration, C57299d dVar, C57528m mVar) {
        C69664n.m101061g(duration, "duration");
        C69664n.m101061g(dVar, "payload");
        C69664n.m101061g(mVar, "surface");
        this.f364922a = duration;
        this.f364923b = dVar;
        this.f364924c = mVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C133975a m217301a(C133975a aVar, Duration duration) {
        C57299d dVar = aVar.f364923b;
        C57528m mVar = aVar.f364924c;
        C69664n.m101061g(duration, "duration");
        C69664n.m101061g(dVar, "payload");
        C69664n.m101061g(mVar, "surface");
        return new C133975a(duration, dVar, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C133975a)) {
            return false;
        }
        C133975a aVar = (C133975a) obj;
        return C69664n.m101066l(this.f364922a, aVar.f364922a) && C69664n.m101066l(this.f364923b, aVar.f364923b) && this.f364924c == aVar.f364924c;
    }

    public final int hashCode() {
        return (((this.f364922a.hashCode() * 31) + this.f364923b.hashCode()) * 31) + this.f364924c.hashCode();
    }

    public final String toString() {
        Duration duration = this.f364922a;
        C57299d dVar = this.f364923b;
        C57528m mVar = this.f364924c;
        return "ViewActionData(duration=" + duration + ", payload=" + dVar + ", surface=" + mVar + ")";
    }
}
