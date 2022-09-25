package com.google.common.p4522b;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: com.google.common.b.ad */
/* compiled from: PG */
class C58306ad extends C58807y implements SortedSet {

    /* renamed from: g */
    final /* synthetic */ C58307ae f155872g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58306ad(C58307ae aeVar, Object obj, SortedSet sortedSet, C58807y yVar) {
        super(aeVar, obj, sortedSet, yVar);
        this.f155872g = aeVar;
    }

    public final Comparator comparator() {
        return mo54882d().comparator();
    }

    /* renamed from: d */
    public SortedSet mo54882d() {
        return (SortedSet) this.f156597b;
    }

    public final Object first() {
        mo56049b();
        return mo54882d().first();
    }

    public final SortedSet headSet(Object obj) {
        mo56049b();
        C58307ae aeVar = this.f155872g;
        Object obj2 = this.f156596a;
        SortedSet headSet = mo54882d().headSet(obj);
        C58807y yVar = this.f156598c;
        if (yVar == null) {
            yVar = this;
        }
        return new C58306ad(aeVar, obj2, headSet, yVar);
    }

    public final Object last() {
        mo56049b();
        return mo54882d().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        mo56049b();
        C58307ae aeVar = this.f155872g;
        Object obj3 = this.f156596a;
        SortedSet subSet = mo54882d().subSet(obj, obj2);
        C58807y yVar = this.f156598c;
        if (yVar == null) {
            yVar = this;
        }
        return new C58306ad(aeVar, obj3, subSet, yVar);
    }

    public final SortedSet tailSet(Object obj) {
        mo56049b();
        C58307ae aeVar = this.f155872g;
        Object obj2 = this.f156596a;
        SortedSet tailSet = mo54882d().tailSet(obj);
        C58807y yVar = this.f156598c;
        if (yVar == null) {
            yVar = this;
        }
        return new C58306ad(aeVar, obj2, tailSet, yVar);
    }
}
