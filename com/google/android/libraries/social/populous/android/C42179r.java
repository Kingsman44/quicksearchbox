package com.google.android.libraries.social.populous.android;

import com.google.android.libraries.social.populous.logging.C42570e;
import com.google.android.libraries.social.populous.logging.C42573h;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42589x;
import com.google.android.libraries.social.populous.logging.C42590y;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.android.r */
/* compiled from: PG */
final class C42179r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f110462a;

    /* renamed from: b */
    final /* synthetic */ C42181t f110463b;

    /* renamed from: c */
    final /* synthetic */ int f110464c;

    public C42179r(C42181t tVar, C58872ci ciVar, int i) {
        this.f110463b = tVar;
        this.f110462a = ciVar;
        this.f110464c = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        int a = this.f110463b.mo44862b().mo45231a();
        C42591z zVar = this.f110463b.f110478l;
        int b = C69314v.m100612c() ? C42570e.m75128b(th) : 4;
        C42589x g = C42590y.m75179g();
        C42573h hVar = (C42573h) g;
        hVar.f111719c = this.f110464c;
        hVar.f111720d = a;
        zVar.mo45637g(11, b, g.mo45650a(), (Integer) null, C42576k.f111734a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        int a = this.f110463b.mo44862b().mo45231a();
        C42591z zVar = this.f110463b.f110478l;
        C42589x g = C42590y.m75179g();
        C42573h hVar = (C42573h) g;
        hVar.f111717a = this.f110462a;
        g.mo45651b(1);
        hVar.f111719c = this.f110464c;
        hVar.f111720d = a;
        zVar.mo45637g(11, 2, g.mo45650a(), (Integer) null, C42576k.f111734a);
    }
}
