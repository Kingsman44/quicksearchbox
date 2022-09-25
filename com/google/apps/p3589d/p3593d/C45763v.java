package com.google.apps.p3589d.p3593d;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import java.util.Iterator;

/* renamed from: com.google.apps.d.d.v */
/* compiled from: PG */
public final class C45763v implements Iterable {

    /* renamed from: a */
    public final C45719j f120342a;

    /* renamed from: b */
    public C45751j f120343b = C45751j.f120311c;

    public C45763v(C45719j jVar) {
        this.f120342a = jVar;
    }

    /* renamed from: d */
    public static C45763v m81596d() {
        return new C45763v(C45719j.f120222b);
    }

    /* renamed from: e */
    public static C45763v m81597e(C45723n nVar) {
        return new C45763v(nVar.mo49829f());
    }

    /* renamed from: f */
    public static C45763v m81598f(C45755n nVar) {
        return new C45763v(C45719j.m81477h(nVar));
    }

    /* renamed from: a */
    public final C45755n mo49895a(int i) {
        return (C45755n) this.f120342a.mo49815d(i);
    }

    /* renamed from: b */
    public final C45755n mo49896b(int i) {
        return (C45755n) this.f120342a.mo49816e(i);
    }

    /* renamed from: c */
    public final C45755n mo49897c() {
        if (this.f120342a.f120220a.isEmpty()) {
            return null;
        }
        C45719j jVar = this.f120342a;
        return (C45755n) jVar.mo49815d(jVar.f120220a.size() - 1);
    }

    /* renamed from: g */
    public final void mo49898g(C45741ai aiVar, C45742aj ajVar, C45755n nVar) {
        ajVar.mo49866a(this, nVar);
        C45712c cVar = new C45712c(this.f120342a);
        while (cVar.hasNext()) {
            ((C45755n) cVar.next()).mo49863g(aiVar, ajVar);
        }
    }

    public final Iterator iterator() {
        return new C45712c(this.f120342a);
    }
}
