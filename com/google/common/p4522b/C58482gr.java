package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.common.b.gr */
/* compiled from: PG */
final class C58482gr extends C58485gu {

    /* renamed from: a */
    private final transient C58485gu f156110a;

    public C58482gr(C58485gu guVar) {
        this.f156110a = guVar;
    }

    /* renamed from: H */
    private final int m89822H(int i) {
        return (this.f156110a.size() - 1) - i;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return this.f156110a.mo55032a();
    }

    /* renamed from: c */
    public final C58485gu mo55398c(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f156110a.size());
        C58485gu guVar = this.f156110a;
        return guVar.subList(guVar.size() - i2, this.f156110a.size() - i).mo55401lD();
    }

    public final boolean contains(Object obj) {
        return this.f156110a.contains(obj);
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, this.f156110a.size(), "index");
        return this.f156110a.get(m89822H(i));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f156110a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return m89822H(lastIndexOf);
        }
        return -1;
    }

    /* renamed from: lD */
    public final C58485gu mo55401lD() {
        return this.f156110a;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f156110a.indexOf(obj);
        if (indexOf >= 0) {
            return m89822H(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.f156110a.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
