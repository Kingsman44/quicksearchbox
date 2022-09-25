package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4573p.C60716f;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.common.b.ko */
/* compiled from: PG */
class C58587ko extends AbstractList {

    /* renamed from: a */
    final List f156282a;

    /* renamed from: b */
    final int f156283b;

    public C58587ko(List list, int i) {
        this.f156282a = list;
        this.f156283b = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, size(), "index");
        int i2 = this.f156283b;
        int i3 = i * i2;
        return this.f156282a.subList(i3, Math.min(i2 + i3, this.f156282a.size()));
    }

    public final boolean isEmpty() {
        return this.f156282a.isEmpty();
    }

    public final int size() {
        return C60716f.m92646c(this.f156282a.size(), this.f156283b, RoundingMode.CEILING);
    }
}
