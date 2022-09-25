package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.am */
/* compiled from: PG */
public final class C20800am extends C6405o {

    /* renamed from: a */
    public C20801an f58233a;

    /* renamed from: d */
    private final String[] f58234d = {"children", "flexDirection"};

    /* renamed from: e */
    private final BitSet f58235e = new BitSet(2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13260b(C6407q qVar) {
        this.f58233a = (C20801an) qVar;
    }

    /* renamed from: c */
    public final C20801an mo13259a() {
        m17225m(2, this.f58235e, this.f58234d);
        return this.f58233a;
    }

    /* renamed from: d */
    public final void mo25884d(List list) {
        this.f58233a.f58246c = list;
        this.f58235e.set(0);
    }

    /* renamed from: e */
    public final void mo25885e(C6411u uVar, C20801an anVar) {
        super.mo13449w(uVar, anVar);
        this.f58233a = anVar;
        this.f58235e.clear();
    }

    /* renamed from: f */
    public final void mo25886f(int i) {
        this.f58233a.f58243H = i;
        this.f58235e.set(1);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13268k() {
    }
}
