package com.google.common.p4522b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: com.google.common.b.eg */
/* compiled from: PG */
abstract class C58417eg extends C58442fe implements C58765rd {

    /* renamed from: a */
    private transient Comparator f156027a;

    /* renamed from: b */
    private transient NavigableSet f156028b;

    /* renamed from: c */
    private transient Set f156029c;

    /* renamed from: c */
    public abstract C58765rd mo5948hU();

    public final Comparator comparator() {
        Comparator comparator = this.f156027a;
        if (comparator != null) {
            return comparator;
        }
        C58710pc c = C58710pc.m90487d(mo5948hU().comparator()).mo55783c();
        this.f156027a = c;
        return c;
    }

    /* renamed from: e */
    public abstract Iterator mo54989e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C58692ol mo55217f() {
        return mo5948hU();
    }

    /* renamed from: g */
    public final C58691ok mo54991g() {
        return mo5948hU().mo54992n();
    }

    public Iterator iterator() {
        return C58700ot.m90437a(this);
    }

    /* renamed from: lw */
    public final C58765rd mo55218lw(Object obj, int i) {
        return mo5948hU().mo55219lx(obj, i).mo54995q();
    }

    /* renamed from: lx */
    public final C58765rd mo55219lx(Object obj, int i) {
        return mo5948hU().mo55218lw(obj, i).mo54995q();
    }

    /* renamed from: m */
    public final Set mo54975m() {
        Set set = this.f156029c;
        if (set != null) {
            return set;
        }
        C58416ef efVar = new C58416ef(this);
        this.f156029c = efVar;
        return efVar;
    }

    /* renamed from: n */
    public final C58691ok mo54992n() {
        return mo5948hU().mo54991g();
    }

    /* renamed from: o */
    public final C58691ok mo54993o() {
        return mo5948hU().mo54994p();
    }

    /* renamed from: p */
    public final C58691ok mo54994p() {
        return mo5948hU().mo54993o();
    }

    /* renamed from: q */
    public final C58765rd mo54995q() {
        return mo5948hU();
    }

    /* renamed from: s */
    public final NavigableSet mo54974l() {
        NavigableSet navigableSet = this.f156028b;
        if (navigableSet != null) {
            return navigableSet;
        }
        C58767rf rfVar = new C58767rf(this);
        this.f156028b = rfVar;
        return rfVar;
    }

    /* renamed from: t */
    public final C58765rd mo54998t(Object obj, int i, Object obj2, int i2) {
        return mo5948hU().mo54998t(obj2, i2, obj, i).mo54995q();
    }

    public final Object[] toArray() {
        return mo55252r();
    }

    public final String toString() {
        return mo54975m().toString();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58704ox.m90449b(this, objArr);
    }
}
