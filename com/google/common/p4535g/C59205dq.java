package com.google.common.p4535g;

import com.google.common.base.C58838bb;
import java.util.AbstractList;

/* renamed from: com.google.common.g.dq */
/* compiled from: PG */
final class C59205dq extends AbstractList {

    /* renamed from: a */
    final int f157275a;

    /* renamed from: b */
    final /* synthetic */ C59173cl f157276b;

    /* renamed from: c */
    final /* synthetic */ int f157277c;

    public C59205dq(C59173cl clVar, int i) {
        this.f157276b = clVar;
        this.f157277c = i;
        C59133az azVar = (C59133az) clVar;
        C58838bb.m90861B(i, azVar.mo56419a(), "index");
        this.f157275a = azVar.mo56420b();
    }

    /* renamed from: a */
    public final C59136bb get(int i) {
        C59133az azVar = (C59133az) this.f157276b;
        C58838bb.m90861B(this.f157277c, azVar.mo56419a(), "index");
        return azVar.mo56481i(i);
    }

    public final int size() {
        return this.f157275a;
    }
}
