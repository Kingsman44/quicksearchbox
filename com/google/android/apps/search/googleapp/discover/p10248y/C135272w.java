package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.w */
/* compiled from: PG */
public final class C135272w implements C134270b {

    /* renamed from: a */
    public final C135359p f368519a;

    /* renamed from: b */
    public final int f368520b;

    /* renamed from: c */
    public final int f368521c;

    public C135272w(C135359p pVar, int i, int i2) {
        this.f368519a = pVar;
        this.f368520b = i;
        this.f368521c = i2;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217881e("Has token", this.f368519a != null, pVar, arrayList);
        C134297q.m217877a("Distance to start", this.f368520b, pVar, arrayList);
        C134297q.m217877a("Distance to end", this.f368521c, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        return C134268c.m217846a("Pagination Data", dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135272w)) {
            return false;
        }
        C135272w wVar = (C135272w) obj;
        return C69664n.m101066l(this.f368519a, wVar.f368519a) && this.f368520b == wVar.f368520b && this.f368521c == wVar.f368521c;
    }

    public final int hashCode() {
        C135359p pVar = this.f368519a;
        return ((((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f368520b) * 31) + this.f368521c;
    }

    public final String toString() {
        C135359p pVar = this.f368519a;
        int i = this.f368520b;
        int i2 = this.f368521c;
        return "PaginationData(token=" + pVar + ", distanceToStart=" + i + ", distanceToEnd=" + i2 + ")";
    }
}
