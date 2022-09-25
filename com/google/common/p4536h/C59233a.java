package com.google.common.p4536h;

import com.google.common.p4575r.C60757n;
import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.common.h.a */
/* compiled from: PG */
public final class C59233a extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ C59245b f157342a;

    public C59233a(C59245b bVar) {
        this.f157342a = bVar;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C59262s)) {
            return false;
        }
        C59262s sVar = (C59262s) obj;
        if (sVar.mo56725c() != this.f157342a.mo56702f() || !this.f157342a.mo56699c().contains(sVar.f157372a) || !this.f157342a.mo56700d(sVar.f157372a).contains(sVar.f157373b)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return C59265v.m92012b(this.f157342a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return C60757n.m92748i(this.f157342a.mo56698a());
    }
}
