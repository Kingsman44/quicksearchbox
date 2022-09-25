package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.ab */
/* compiled from: PG */
public final class C135214ab extends C135216ad {

    /* renamed from: a */
    public final C135270u f368310a;

    /* renamed from: b */
    private final List f368311b;

    /* renamed from: c */
    private final C135275z f368312c;

    public C135214ab(List list, C135270u uVar) {
        C69664n.m101061g(list, "slices");
        C69664n.m101061g(uVar, "failureReason");
        this.f368311b = list;
        this.f368310a = uVar;
        this.f368312c = new C135275z(uVar);
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217880d("Failure reason", this.f368310a.name().toString(), pVar, arrayList);
        C134297q.m217877a("Number of slices", ((C58724pq) this.f368311b).f156474d, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        return C134268c.m217846a("Terminally failed renderable stream", dVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C135213aa mo112170b() {
        return this.f368312c;
    }

    /* renamed from: c */
    public final List mo112171c() {
        return this.f368311b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135214ab)) {
            return false;
        }
        C135214ab abVar = (C135214ab) obj;
        return C69664n.m101066l(this.f368311b, abVar.f368311b) && this.f368310a == abVar.f368310a;
    }

    public final int hashCode() {
        return (this.f368311b.hashCode() * 31) + this.f368310a.hashCode();
    }

    public final String toString() {
        List list = this.f368311b;
        C135270u uVar = this.f368310a;
        return "TerminalFailure(slices=" + list + ", failureReason=" + uVar + ")";
    }
}
