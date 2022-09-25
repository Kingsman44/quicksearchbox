package com.google.android.libraries.animation;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.animation.k */
/* compiled from: PG */
public class C147785k {

    /* renamed from: c */
    private static final C59071e f398739c = C59071e.m91332i("com.google.android.libraries.animation.k");

    /* renamed from: a */
    public float f398740a = 0.0f;

    /* renamed from: b */
    public Duration f398741b = Duration.ZERO;

    /* renamed from: d */
    private final C147797w f398742d;

    /* renamed from: e */
    private final C147768a f398743e;

    /* renamed from: f */
    private final C147784j f398744f;

    /* renamed from: g */
    private int f398745g = 1;

    protected C147785k(C147797w wVar, C147768a aVar, boolean z, C147784j jVar) {
        C58838bb.m90866a(aVar, "animatable can not be null");
        this.f398742d = wVar;
        this.f398743e = aVar;
        this.f398744f = jVar;
        if (!z) {
            aVar.mo42047a(Float.valueOf(0.0f));
        }
    }

    /* renamed from: g */
    private final void m240873g() {
        C147784j jVar = this.f398744f;
        if (jVar != null) {
            jVar.mo124449a(this.f398745g);
        }
    }

    /* renamed from: h */
    private final void m240874h() {
        C147797w wVar = this.f398742d;
        if (wVar != null) {
            wVar.mo124451b();
        }
    }

    /* renamed from: a */
    public final void mo124459a(float f, float f2, Duration duration) {
        C58838bb.m90869d(!duration.equals(Duration.ZERO), "duration has to be more than zero. Use setValue() to change value without duration.");
        m240874h();
        this.f398741b = duration;
        this.f398742d.mo124450a(f, f2, duration, new C147775h(this), new C147776i(this));
    }

    /* renamed from: b */
    public final void mo124460b(float f, Duration duration) {
        ((C59052c) ((C59052c) f398739c.mo56224b()).mo56372aa(42249)).mo56391u("animateTo: to: %s, duration: %s", f, duration);
        mo124459a(this.f398740a, f, duration);
    }

    /* renamed from: c */
    public final void mo124461c(float f) {
        Float valueOf = Float.valueOf(f);
        this.f398740a = f;
        this.f398743e.mo42047a(valueOf);
    }

    /* renamed from: d */
    public final boolean mo124462d() {
        return this.f398745g == 2;
    }

    /* renamed from: f */
    public final void mo124464f() {
        if (this.f398742d != null) {
            m240874h();
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo124463e(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            this.f398745g = 2;
            m240873g();
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.f398745g = 4;
                m240873g();
            }
        } else if (this.f398745g == 2) {
            this.f398745g = 3;
            m240873g();
        }
    }
}
