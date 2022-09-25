package com.google.android.libraries.search.video.players;

import com.google.android.libraries.search.video.conductor.AutoplayConductorImpl;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.search.video.players.f */
/* compiled from: PG */
final class C41571f implements C41592w {

    /* renamed from: a */
    public final C41592w f108680a;

    /* renamed from: b */
    final /* synthetic */ PlayerWrapperImpl f108681b;

    /* renamed from: c */
    private final Integer f108682c;

    /* renamed from: d */
    private final Supplier f108683d;

    public C41571f(PlayerWrapperImpl playerWrapperImpl, Integer num, C41592w wVar, Supplier supplier) {
        this.f108681b = playerWrapperImpl;
        this.f108680a = wVar;
        this.f108682c = num;
        this.f108683d = supplier;
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        this.f108681b.f108581d.put(this.f108682c, new C41570e(this, ((AutoplayConductorImpl) aVar).f108349f, aVar));
        this.f108681b.f108582e.mo50445g(new C46438d((C60870cx) this.f108683d.get()), new C46436b(this.f108682c), this.f108681b.f108579b);
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        this.f108680a.mo43994b(aVar);
    }

    /* renamed from: e */
    public final Duration mo44082e() {
        return this.f108680a.mo44082e();
    }

    /* renamed from: f */
    public final Optional mo44083f() {
        return this.f108680a.mo44083f();
    }

    /* renamed from: g */
    public final void mo44084g(C41590u uVar) {
        this.f108680a.mo44084g(uVar);
    }

    /* renamed from: h */
    public final void mo44085h(C41591v vVar) {
        this.f108680a.mo44085h(vVar);
    }

    /* renamed from: i */
    public final void mo44086i() {
        this.f108680a.mo44086i();
    }

    /* renamed from: j */
    public final void mo44087j() {
        this.f108681b.f108581d.put(this.f108682c, new C41569d(this));
        this.f108681b.f108582e.mo50445g(new C46438d((C60870cx) this.f108683d.get()), new C46436b(this.f108682c), this.f108681b.f108579b);
    }

    /* renamed from: k */
    public final void mo44088k() {
        this.f108680a.mo44088k();
        this.f108681b.f108581d.remove(this.f108682c);
    }

    /* renamed from: l */
    public final void mo44089l(C41591v vVar) {
        this.f108680a.mo44089l(vVar);
    }

    /* renamed from: m */
    public final void mo44090m(Duration duration) {
        this.f108680a.mo44090m(duration);
    }

    /* renamed from: n */
    public final void mo44091n(boolean z) {
        this.f108680a.mo44091n(z);
    }

    /* renamed from: o */
    public final void mo44092o() {
        this.f108680a.mo44092o();
    }

    /* renamed from: p */
    public final void mo44093p() {
        this.f108680a.mo44093p();
    }

    /* renamed from: q */
    public final int mo44094q() {
        return this.f108680a.mo44094q();
    }

    /* renamed from: r */
    public final void mo44095r(C41533l lVar) {
        this.f108680a.mo44095r(lVar);
    }

    /* renamed from: s */
    public final C41506e mo43990s() {
        return this.f108680a.mo43990s();
    }
}
