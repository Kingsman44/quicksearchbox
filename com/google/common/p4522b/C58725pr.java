package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.AbstractMap;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.pr */
/* compiled from: PG */
final class C58725pr extends C58485gu {

    /* renamed from: a */
    final /* synthetic */ C58726ps f156475a;

    public C58725pr(C58726ps psVar) {
        this.f156475a = psVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f156475a.f156478d, "index");
        C58726ps psVar = this.f156475a;
        int i2 = i + i;
        Object requireNonNull = Objects.requireNonNull(psVar.f156476a[psVar.f156477b + i2]);
        C58726ps psVar2 = this.f156475a;
        return new AbstractMap.SimpleImmutableEntry(requireNonNull, Objects.requireNonNull(psVar2.f156476a[i2 + (psVar2.f156477b ^ 1)]));
    }

    public final int size() {
        return this.f156475a.f156478d;
    }
}
