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

/* renamed from: com.google.android.apps.search.googleapp.discover.y.n */
/* compiled from: PG */
public final class C135263n extends C135244be {

    /* renamed from: a */
    private final int f368490a;

    /* renamed from: b */
    private final Instant f368491b;

    /* renamed from: c */
    private final C135050dx f368492c;

    public C135263n(int i, Instant instant, C135050dx dxVar) {
        C69664n.m101061g(instant, "fragmentCreationTime");
        C69664n.m101061g(dxVar, "requestConfig");
        this.f368490a = i;
        this.f368491b = instant;
        this.f368492c = dxVar;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217877a("Size", this.f368490a, pVar, arrayList);
        C134297q.m217881e("Inhibit loading", true, pVar, arrayList);
        C134297q.m217878b("Fragment creation time", this.f368491b, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        List list2 = dVar.f365788a;
        C134284d dVar2 = new C134284d();
        List list3 = dVar2.f365788a;
        C134296p pVar2 = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar2, "sensitivity");
        ArrayList arrayList2 = new ArrayList();
        C134297q.m217880d("Request type", "First range request", pVar2, arrayList2);
        C69540x.m100811r(list3, arrayList2);
        list2.add(C134268c.m217846a("Request type", dVar2));
        return C134268c.m217846a("Last request", dVar);
    }

    /* renamed from: b */
    public final int mo112180b() {
        return this.f368490a;
    }

    /* renamed from: c */
    public final C135050dx mo112181c() {
        return this.f368492c;
    }

    /* renamed from: d */
    public final Instant mo112182d() {
        return this.f368491b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135263n)) {
            return false;
        }
        C135263n nVar = (C135263n) obj;
        return this.f368490a == nVar.f368490a && C69664n.m101066l(this.f368491b, nVar.f368491b) && C69664n.m101066l(this.f368492c, nVar.f368492c);
    }

    public final int hashCode() {
        return (((this.f368490a * 31) + this.f368491b.hashCode()) * 31) + this.f368492c.hashCode();
    }

    public final String toString() {
        int i = this.f368490a;
        Instant instant = this.f368491b;
        C135050dx dxVar = this.f368492c;
        return "InhibitLoadingRequest(size=" + i + ", fragmentCreationTime=" + instant + ", requestConfig=" + dxVar + ")";
    }
}
