package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.qy */
/* compiled from: PG */
public final class C58759qy extends C58528ij {

    /* renamed from: a */
    public final transient Object f156534a;

    public C58759qy(Object obj) {
        obj.getClass();
        this.f156534a = obj;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        return this.f156534a.equals(obj);
    }

    public final int hashCode() {
        return this.f156534a.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58565jt(this.f156534a);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return new C58565jt(this.f156534a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.f156534a.toString() + ']';
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        return C58485gu.m89846n(this.f156534a);
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        objArr[i] = this.f156534a;
        return i + 1;
    }
}
