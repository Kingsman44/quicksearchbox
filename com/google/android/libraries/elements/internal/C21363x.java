package com.google.android.libraries.elements.internal;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import java.util.BitSet;

/* renamed from: com.google.android.libraries.elements.internal.x */
/* compiled from: PG */
public final class C21363x extends C6405o {

    /* renamed from: a */
    public C21365z f59729a;

    /* renamed from: d */
    private final String[] f59730d = {"componentCallable"};

    /* renamed from: e */
    private final BitSet f59731e = new BitSet(1);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13260b(C6407q qVar) {
        this.f59729a = (C21365z) qVar;
    }

    /* renamed from: c */
    public final C21365z mo13259a() {
        m17225m(1, this.f59731e, this.f59730d);
        return this.f59729a;
    }

    /* renamed from: d */
    public final void mo26866d(C21342c cVar) {
        this.f59729a.f59734a = cVar;
        this.f59731e.set(0);
    }

    /* renamed from: e */
    public final void mo26867e(C6411u uVar, C21365z zVar) {
        super.mo13449w(uVar, zVar);
        this.f59729a = zVar;
        this.f59731e.clear();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13268k() {
    }
}
