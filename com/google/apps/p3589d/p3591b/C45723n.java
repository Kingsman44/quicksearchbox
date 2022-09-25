package com.google.apps.p3589d.p3591b;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.google.apps.d.b.n */
/* compiled from: PG */
public final class C45723n extends C45716g {

    /* renamed from: b */
    public static final Comparator f120225b = new C45722m();

    private C45723n() {
        this(0);
    }

    /* renamed from: g */
    public static C45723n m81491g(C45716g gVar) {
        C45723n nVar = new C45723n(gVar.f120220a.size());
        nVar.mo49832k(gVar);
        return nVar;
    }

    /* renamed from: h */
    public static C45723n m81492h(Object obj) {
        C45723n nVar = new C45723n(0);
        nVar.f120220a.add(obj);
        return nVar;
    }

    /* renamed from: f */
    public final C45719j mo49829f() {
        C45719j jVar = new C45719j(this.f120220a);
        this.f120220a = new ArrayList();
        return jVar;
    }

    /* renamed from: i */
    public final void mo49830i(int i, Object obj) {
        if (i < 0 || i >= this.f120220a.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f120220a.set(i, obj);
    }

    /* renamed from: j */
    public final void mo49831j(int i) {
        if (i < this.f120220a.size()) {
            ArrayList arrayList = this.f120220a;
            arrayList.subList(i, arrayList.size()).clear();
        }
    }

    /* renamed from: k */
    public final void mo49832k(C45716g gVar) {
        this.f120220a.addAll(gVar.f120220a);
    }

    /* renamed from: l */
    public final void mo49833l(C45716g gVar, int i, int i2) {
        int min = Math.min(i2, gVar.f120220a.size());
        for (int max = Math.max(i, 0); max < min; max++) {
            this.f120220a.add(gVar.mo49815d(max));
        }
    }

    public C45723n(int i) {
        super(new ArrayList(i));
    }
}
