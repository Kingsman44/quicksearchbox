package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.os */
/* compiled from: PG */
public final class C58699os extends C58442fe implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58692ol f156426a;

    /* renamed from: b */
    transient Set f156427b;

    /* renamed from: c */
    transient Set f156428c;

    public C58699os(C58692ol olVar) {
        this.f156426a = olVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f156426a;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final int mo54924d(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C58692ol mo55217f() {
        return this.f156426a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156426a;
    }

    /* renamed from: i */
    public final boolean mo54929i(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final Iterator iterator() {
        return C58570jy.m90153e(C58700ot.m90437a(this.f156426a));
    }

    /* renamed from: l */
    public final Set mo54974l() {
        Set set = this.f156427b;
        if (set != null) {
            return set;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(this.f156426a.mo54974l());
        this.f156427b = unmodifiableSet;
        return unmodifiableSet;
    }

    /* renamed from: lF */
    public final int mo54931lF(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public final Set mo54975m() {
        Set set = this.f156428c;
        if (set != null) {
            return set;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(this.f156426a.mo54975m());
        this.f156428c = unmodifiableSet;
        return unmodifiableSet;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
