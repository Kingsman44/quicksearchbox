package com.facebook.litho.p329g.p331b;

import com.facebook.litho.C6157ce;
import com.facebook.litho.C6405o;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p329g.C6335n;
import java.util.BitSet;

/* renamed from: com.facebook.litho.g.b.k */
/* compiled from: PG */
public final class C6309k extends C6405o {

    /* renamed from: a */
    public C6311m f18640a;

    /* renamed from: d */
    C6411u f18641d;

    /* renamed from: e */
    private final String[] f18642e = {"section"};

    /* renamed from: f */
    private final BitSet f18643f = new BitSet(1);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13260b(C6407q qVar) {
        this.f18640a = (C6311m) qVar;
    }

    /* renamed from: c */
    public final C6311m mo13259a() {
        m17225m(1, this.f18643f, this.f18642e);
        C6311m mVar = this.f18640a;
        int i = C6311m.f18652R;
        String p = mVar.mo13460p();
        C6157ce ceVar = this.f18640a.f18667O;
        if (ceVar == null) {
            ceVar = C6311m.m15820aw(this.f18641d, p, -1505688212);
        }
        C6311m mVar2 = this.f18640a;
        mVar2.f18667O = ceVar;
        C6157ce ceVar2 = mVar2.f18668P;
        if (ceVar2 == null) {
            ceVar2 = C6311m.m15820aw(this.f18641d, p, -238194236);
        }
        C6311m mVar3 = this.f18640a;
        mVar3.f18668P = ceVar2;
        return mVar3;
    }

    /* renamed from: d */
    public final void mo13310d(float f) {
        this.f18640a.f18670a = this.f18979b.mo13257a(f);
    }

    /* renamed from: e */
    public final void mo13311e(C6411u uVar, C6311m mVar) {
        super.mo13449w(uVar, mVar);
        this.f18640a = mVar;
        this.f18641d = uVar;
        this.f18643f.clear();
    }

    /* renamed from: f */
    public final void mo13312f(float f) {
        this.f18640a.f18658F = this.f18979b.mo13257a(f);
    }

    /* renamed from: g */
    public final void mo13313g(float f) {
        this.f18640a.f18664L = this.f18979b.mo13257a(f);
    }

    /* renamed from: h */
    public final void mo13314h(C6335n nVar) {
        this.f18640a.f18665M = nVar;
        this.f18643f.set(0);
    }

    /* renamed from: i */
    public final void mo13315i(float f) {
        this.f18640a.f18666N = this.f18979b.mo13257a(f);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13268k() {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo13316s(boolean z) {
        this.f18640a.f18672c = z;
    }
}
