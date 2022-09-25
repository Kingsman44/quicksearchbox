package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: com.google.common.b.ee */
/* compiled from: PG */
final class C58415ee extends C58541iw {

    /* renamed from: a */
    private final C58541iw f156025a;

    public C58415ee(C58541iw iwVar) {
        super(C58710pc.m90487d(iwVar.f156195b).mo55783c());
        this.f156025a = iwVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return this.f156025a.mo55032a();
    }

    public final Object ceiling(Object obj) {
        return this.f156025a.floor(obj);
    }

    public final boolean contains(Object obj) {
        return this.f156025a.contains(obj);
    }

    public final /* synthetic */ Iterator descendingIterator() {
        return this.f156025a.iterator();
    }

    public final /* synthetic */ NavigableSet descendingSet() {
        return this.f156025a;
    }

    public final Object floor(Object obj) {
        return this.f156025a.ceiling(obj);
    }

    public final Object higher(Object obj) {
        return this.f156025a.lower(obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f156025a.descendingIterator();
    }

    /* renamed from: j */
    public final C58541iw mo55159j() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return this.f156025a.descendingIterator();
    }

    public final Object lower(Object obj) {
        return this.f156025a.higher(obj);
    }

    /* renamed from: ly */
    public final C58541iw mo55212ly() {
        return this.f156025a;
    }

    /* renamed from: lz */
    public final C58800sl mo55213lz() {
        return this.f156025a.iterator();
    }

    /* renamed from: m */
    public final C58541iw mo55162m(Object obj, boolean z) {
        return this.f156025a.tailSet(obj, z).descendingSet();
    }

    /* renamed from: p */
    public final C58541iw mo55165p(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f156025a.subSet(obj2, z2, obj, z).descendingSet();
    }

    /* renamed from: s */
    public final C58541iw mo55168s(Object obj, boolean z) {
        return this.f156025a.headSet(obj, z).descendingSet();
    }

    public final int size() {
        return this.f156025a.size();
    }
}
