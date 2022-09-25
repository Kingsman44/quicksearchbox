package com.google.common.p4543n.p4546c;

import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58518i;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.n.c.e */
/* compiled from: PG */
final class C59397e extends C58518i {

    /* renamed from: b */
    final /* synthetic */ C59398f f157603b;

    /* renamed from: c */
    private int f157604c = 0;

    /* renamed from: d */
    private final C58872ci f157605d;

    public C59397e(C59398f fVar) {
        this.f157603b = fVar;
        this.f157605d = C58872ci.m90947d(fVar.f157606a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55143a() {
        long c = this.f157603b.f157607b.mo56917c(this.f157604c, this.f157605d.mo56158a(TimeUnit.MILLISECONDS));
        if (c < 0) {
            this.f156164a = 3;
            return null;
        }
        this.f157604c++;
        return Long.valueOf(c);
    }
}
