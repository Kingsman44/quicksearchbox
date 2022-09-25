package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.b */
/* compiled from: PG */
public final class C135239b extends C135244be {

    /* renamed from: a */
    public final C135212a f368390a;

    /* renamed from: b */
    private final int f368391b;

    /* renamed from: c */
    private final Instant f368392c;

    /* renamed from: d */
    private final C135050dx f368393d;

    public C135239b(int i, Instant instant, C135050dx dxVar, C135212a aVar) {
        C69664n.m101061g(instant, "fragmentCreationTime");
        C69664n.m101061g(dxVar, "requestConfig");
        this.f368391b = i;
        this.f368392c = instant;
        this.f368393d = dxVar;
        this.f368390a = aVar;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217877a("Size", this.f368391b, pVar, arrayList);
        C134297q.m217878b("Fragment creation time", this.f368392c, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        C134286f a = this.f368390a.mo111669a();
        C69664n.m101060f(a, "debuggable.debuggableFeature");
        C134268c.m217847b(a, dVar);
        return C134268c.m217846a("Last request", dVar);
    }

    /* renamed from: b */
    public final int mo112180b() {
        return this.f368391b;
    }

    /* renamed from: c */
    public final C135050dx mo112181c() {
        return this.f368393d;
    }

    /* renamed from: d */
    public final Instant mo112182d() {
        return this.f368392c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135239b)) {
            return false;
        }
        C135239b bVar = (C135239b) obj;
        return this.f368391b == bVar.f368391b && C69664n.m101066l(this.f368392c, bVar.f368392c) && C69664n.m101066l(this.f368393d, bVar.f368393d) && C69664n.m101066l(this.f368390a, bVar.f368390a);
    }

    public final int hashCode() {
        return (((((this.f368391b * 31) + this.f368392c.hashCode()) * 31) + this.f368393d.hashCode()) * 31) + this.f368390a.hashCode();
    }

    public final String toString() {
        int i = this.f368391b;
        Instant instant = this.f368392c;
        C135050dx dxVar = this.f368393d;
        C135212a aVar = this.f368390a;
        return "AnchoredRangeRequest(size=" + i + ", fragmentCreationTime=" + instant + ", requestConfig=" + dxVar + ", anchoredRange=" + aVar + ")";
    }
}
