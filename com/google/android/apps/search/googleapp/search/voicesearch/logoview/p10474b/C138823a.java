package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138811a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138812b;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138813c;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.b.a */
/* compiled from: PG */
public final class C138823a {

    /* renamed from: a */
    public final C138813c f377634a;

    /* renamed from: b */
    public final C138811a f377635b;

    /* renamed from: c */
    public final C138813c f377636c;

    /* renamed from: d */
    public final C138813c f377637d;

    /* renamed from: e */
    public final C138813c f377638e;

    /* renamed from: f */
    public final C138812b f377639f;

    /* renamed from: g */
    public final C138812b f377640g;

    /* renamed from: h */
    public final C138812b f377641h;

    /* renamed from: i */
    public final C138812b f377642i;

    /* renamed from: j */
    public int f377643j;

    /* renamed from: k */
    public float f377644k;

    public C138823a(C138813c cVar, C138811a aVar, C138813c cVar2, C138813c cVar3, C138813c cVar4, C138812b bVar, C138812b bVar2, C138812b bVar3, C138812b bVar4) {
        this.f377634a = cVar;
        this.f377635b = aVar;
        this.f377636c = cVar2;
        this.f377637d = cVar3;
        this.f377638e = cVar4;
        this.f377639f = bVar;
        this.f377640g = bVar2;
        this.f377641h = bVar3;
        this.f377642i = bVar4;
    }

    /* renamed from: a */
    public final void mo114576a(float f, float f2, float f3, int i) {
        this.f377634a.mo114562e(f);
        this.f377635b.mo114562e(f2);
        this.f377640g.mo114562e(f3);
        this.f377636c.mo114562e(4.0f);
        this.f377637d.mo114562e(0.0f);
        this.f377638e.mo114562e(0.0f);
        this.f377641h.mo114562e(0.0f);
        this.f377639f.mo114562e(0.0f);
        this.f377643j = i;
    }

    /* renamed from: b */
    public final void mo114577b(boolean z) {
        this.f377635b.mo114565h(!z);
    }

    /* renamed from: c */
    public final void mo114578c(boolean z) {
        this.f377638e.mo114565h(!z);
    }

    /* renamed from: d */
    public final void mo114579d(boolean z) {
        this.f377634a.mo114565h(!z);
    }

    /* renamed from: e */
    public final void mo114580e(boolean z) {
        this.f377636c.mo114565h(!z);
    }

    /* renamed from: f */
    public final void mo114581f(float f, float f2) {
        float f3 = this.f377634a.f377589c;
        double cos = Math.cos((double) this.f377635b.f377589c);
        float f4 = this.f377637d.f377589c;
        float f5 = this.f377634a.f377589c;
        double sin = Math.sin((double) this.f377635b.f377589c);
        float f6 = this.f377638e.f377589c;
        this.f377635b.mo114562e(f);
        this.f377634a.mo114562e(f2);
        float f7 = this.f377634a.f377589c;
        double cos2 = Math.cos((double) this.f377635b.f377589c);
        float f8 = this.f377634a.f377589c;
        double sin2 = Math.sin((double) this.f377635b.f377589c);
        this.f377637d.mo114562e(((f3 * ((float) cos)) + f4) - (f7 * ((float) cos2)));
        this.f377638e.mo114562e(((f5 * ((float) sin)) + f6) - (f8 * ((float) sin2)));
    }

    /* renamed from: g */
    public final boolean mo114582g() {
        return this.f377642i.f377589c > 0.001f;
    }

    /* renamed from: h */
    public final boolean mo114583h() {
        return this.f377640g.f377589c > 0.001f;
    }
}
