package com.google.common.p4536h;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58518i;
import com.google.common.p4522b.C58733pz;
import java.util.Iterator;

/* renamed from: com.google.common.h.v */
/* compiled from: PG */
public abstract class C59265v extends C58518i {

    /* renamed from: b */
    Object f157375b = null;

    /* renamed from: c */
    Iterator f157376c = C58733pz.f156496a.mo55229u().listIterator(0);

    /* renamed from: d */
    private final C59249f f157377d;

    /* renamed from: e */
    private final Iterator f157378e;

    public C59265v(C59249f fVar) {
        this.f157377d = fVar;
        this.f157378e = fVar.mo56699c().iterator();
    }

    /* renamed from: b */
    public static C59265v m92012b(C59249f fVar) {
        if (fVar.mo56702f()) {
            return new C59263t(fVar);
        }
        return new C59264u(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo56733c() {
        C58838bb.m90883r(!this.f157376c.hasNext());
        if (!this.f157378e.hasNext()) {
            return false;
        }
        Object next = this.f157378e.next();
        this.f157375b = next;
        this.f157376c = this.f157377d.mo56700d(next).iterator();
        return true;
    }
}
