package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.common.b.ek */
/* compiled from: PG */
final class C58421ek extends C58401dr {
    public C58421ek(C58419ei eiVar) {
        super(eiVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        return false;
    }

    /* renamed from: d */
    public final C58401dr mo55151d(Comparable comparable, boolean z) {
        return this;
    }

    public final /* synthetic */ Iterator descendingIterator() {
        return C58566ju.f156231a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public final /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    /* renamed from: g */
    public final C58401dr mo55154g(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final C58401dr mo55158i(Comparable comparable, boolean z) {
        return this;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return C58566ju.f156231a;
    }

    /* renamed from: j */
    public final C58541iw mo55159j() {
        return C58541iw.m90070U(C58739qe.f156510a);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return C58566ju.f156231a;
    }

    public final /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    /* renamed from: lz */
    public final C58800sl mo55213lz() {
        return C58566ju.f156231a;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C58541iw mo55162m(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C58541iw mo55165p(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return this;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C58541iw mo55168s(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    public final int size() {
        return 0;
    }

    /* renamed from: t */
    public final C58714pg mo55171t() {
        throw new NoSuchElementException();
    }

    public final String toString() {
        return "[]";
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        return C58485gu.m89845m();
    }

    /* renamed from: v */
    public final boolean mo55230v() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58420ej(this.f156001a);
    }
}
