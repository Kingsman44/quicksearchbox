package com.google.android.libraries.search.video.players;

import android.view.ViewGroup;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57184o;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.i */
/* compiled from: PG */
public final class C41574i implements C41592w {

    /* renamed from: a */
    final C41586q f108688a;

    public C41574i(C41587r rVar, ViewGroup viewGroup, C57194y yVar, C41452k kVar) {
        C57184o oVar;
        C57194y yVar2 = yVar;
        C41573h hVar = new C41573h(this);
        if (yVar2.f152695b == 3) {
            oVar = (C57184o) yVar2.f152696c;
        } else {
            oVar = C57184o.f152665c;
        }
        C41587r rVar2 = rVar;
        this.f108688a = rVar.mo44152a(hVar, viewGroup, new C41567b(oVar.f152667a, Duration.ZERO, true, yVar2.f152697d, Optional.empty(), Optional.empty(), false, true, true), kVar);
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        this.f108688a.mo44140f();
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        this.f108688a.mo44150p();
    }

    /* renamed from: e */
    public final Duration mo44082e() {
        return this.f108688a.mo44135a();
    }

    /* renamed from: f */
    public final Optional mo44083f() {
        return this.f108688a.mo44136b();
    }

    /* renamed from: g */
    public final void mo44084g(C41590u uVar) {
        this.f108688a.mo44137c(uVar);
    }

    /* renamed from: h */
    public final void mo44085h(C41591v vVar) {
        this.f108688a.mo44138d(vVar);
    }

    /* renamed from: i */
    public final void mo44086i() {
        this.f108688a.mo44139e();
    }

    /* renamed from: j */
    public final void mo44087j() {
        this.f108688a.mo44140f();
    }

    /* renamed from: k */
    public final void mo44088k() {
        this.f108688a.mo44141h();
    }

    /* renamed from: l */
    public final void mo44089l(C41591v vVar) {
        this.f108688a.mo44146l(vVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo44090m(Duration duration) {
    }

    /* renamed from: n */
    public final void mo44091n(boolean z) {
        this.f108688a.mo44147m(z);
    }

    /* renamed from: o */
    public final void mo44092o() {
        this.f108688a.mo44148n();
    }

    /* renamed from: p */
    public final /* synthetic */ void mo44093p() {
    }

    /* renamed from: q */
    public final int mo44094q() {
        return this.f108688a.f108709c;
    }

    /* renamed from: r */
    public final void mo44095r(C41533l lVar) {
        this.f108688a.f108711e = lVar;
    }

    /* renamed from: s */
    public final C41506e mo43990s() {
        return this.f108688a.mo44151q();
    }
}
