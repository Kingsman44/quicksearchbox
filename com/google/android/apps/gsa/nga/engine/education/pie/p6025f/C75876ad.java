package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.ad */
/* compiled from: PG */
public final class C75876ad extends C75891l {

    /* renamed from: d */
    public static final /* synthetic */ int f210517d = 0;

    /* renamed from: a */
    public final C83358h f210518a;

    /* renamed from: b */
    public final boolean f210519b;

    /* renamed from: c */
    public final C83363m f210520c;

    /* renamed from: e */
    private final Duration f210521e;

    /* renamed from: f */
    private final C22871g f210522f;

    /* renamed from: g */
    private Optional f210523g = Optional.empty();

    /* renamed from: h */
    private final C22871g f210524h;

    public C75876ad(C75892m mVar, Duration duration, boolean z, C83358h hVar, C22871g gVar, C22871g gVar2) {
        super(mVar);
        this.f210518a = hVar;
        this.f210521e = duration;
        this.f210519b = z;
        this.f210522f = gVar;
        this.f210524h = gVar2;
        this.f210520c = new C83363m();
    }

    /* renamed from: e */
    public final void mo71938e() {
        this.f210520c.mo76661a();
        this.f210523g.ifPresent(C75875ac.f210516a);
        this.f210523g = Optional.empty();
    }

    /* renamed from: f */
    public final int mo71939f() {
        return ((Boolean) this.f210518a.mo76657c()).booleanValue() == this.f210519b ? 3 : 1;
    }

    /* renamed from: i */
    public final void mo71940i() {
        super.mo71940i();
        this.f210524h.mo28212l("[NGA] SubscribeOpaVisibility", new C75905z(this));
        this.f210523g = Optional.m71637of(this.f210522f.mo28208h("[NGA] State timeout", this.f210521e.toMillis(), new C75873aa(this)));
    }
}
