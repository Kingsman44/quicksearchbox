package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.common.b.gt */
/* compiled from: PG */
final class C58484gt extends C58485gu {

    /* renamed from: a */
    final transient int f156112a;

    /* renamed from: b */
    final transient int f156113b;

    /* renamed from: d */
    final /* synthetic */ C58485gu f156114d;

    public C58484gt(C58485gu guVar, int i, int i2) {
        this.f156114d = guVar;
        this.f156112a = i;
        this.f156113b = i2;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    /* renamed from: c */
    public final C58485gu mo55398c(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f156113b);
        C58485gu guVar = this.f156114d;
        int i3 = this.f156112a;
        return guVar.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, this.f156113b, "index");
        return this.f156114d.get(i + this.f156112a);
    }

    public final int size() {
        return this.f156113b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* renamed from: x */
    public final int mo55384x() {
        return this.f156114d.mo55385y() + this.f156112a + this.f156113b;
    }

    /* renamed from: y */
    public final int mo55385y() {
        return this.f156114d.mo55385y() + this.f156112a;
    }

    /* renamed from: z */
    public final Object[] mo55386z() {
        return this.f156114d.mo55386z();
    }
}
