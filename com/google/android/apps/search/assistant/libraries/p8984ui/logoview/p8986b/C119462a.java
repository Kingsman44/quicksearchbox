package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119442a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119443b;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119444c;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.b.a */
/* compiled from: PG */
public final class C119462a {

    /* renamed from: a */
    public final C119444c f333031a;

    /* renamed from: b */
    public final C119442a f333032b;

    /* renamed from: c */
    public final C119444c f333033c;

    /* renamed from: d */
    public final C119444c f333034d;

    /* renamed from: e */
    public final C119444c f333035e;

    /* renamed from: f */
    public final C119443b f333036f;

    /* renamed from: g */
    public final C119443b f333037g;

    /* renamed from: h */
    public final C119443b f333038h;

    /* renamed from: i */
    public final C119443b f333039i;

    /* renamed from: j */
    public final C119443b f333040j;

    /* renamed from: k */
    public int f333041k;

    /* renamed from: l */
    public int f333042l;

    /* renamed from: m */
    public float f333043m;

    public C119462a(C119444c cVar, C119442a aVar, C119444c cVar2, C119444c cVar3, C119444c cVar4, C119443b bVar, C119443b bVar2, C119443b bVar3, C119443b bVar4, C119443b bVar5) {
        this.f333031a = cVar;
        this.f333032b = aVar;
        this.f333033c = cVar2;
        this.f333034d = cVar3;
        this.f333035e = cVar4;
        this.f333036f = bVar;
        this.f333037g = bVar2;
        this.f333038h = bVar3;
        this.f333039i = bVar4;
        this.f333040j = bVar5;
    }

    /* renamed from: a */
    public final void mo104374a(boolean z) {
        this.f333032b.mo104362h(!z);
    }

    /* renamed from: b */
    public final void mo104375b(boolean z) {
        this.f333035e.mo104362h(!z);
    }

    /* renamed from: c */
    public final void mo104376c(boolean z) {
        this.f333031a.mo104362h(!z);
    }

    /* renamed from: d */
    public final void mo104377d(boolean z) {
        this.f333033c.mo104362h(!z);
    }

    /* renamed from: e */
    public final void mo104378e(float f, float f2) {
        float f3 = this.f333031a.f332975c;
        double cos = Math.cos((double) this.f333032b.f332975c);
        float f4 = this.f333034d.f332975c;
        float f5 = this.f333031a.f332975c;
        double sin = Math.sin((double) this.f333032b.f332975c);
        float f6 = this.f333035e.f332975c;
        this.f333032b.mo104359e(f);
        this.f333031a.mo104359e(f2);
        float f7 = this.f333031a.f332975c;
        double cos2 = Math.cos((double) this.f333032b.f332975c);
        float f8 = this.f333031a.f332975c;
        double sin2 = Math.sin((double) this.f333032b.f332975c);
        this.f333034d.mo104359e(((f3 * ((float) cos)) + f4) - (f7 * ((float) cos2)));
        this.f333035e.mo104359e(((f5 * ((float) sin)) + f6) - (f8 * ((float) sin2)));
    }

    /* renamed from: f */
    public final boolean mo104379f() {
        return this.f333039i.f332975c > 0.001f;
    }

    /* renamed from: g */
    public final boolean mo104380g() {
        return this.f333037g.f332975c > 0.001f;
    }

    /* renamed from: h */
    public final void mo104381h(float f, float f2, float f3, int i) {
        this.f333031a.mo104359e(f);
        this.f333032b.mo104359e(f2);
        this.f333037g.mo104359e(f3);
        this.f333033c.mo104359e(4.0f);
        this.f333034d.mo104359e(0.0f);
        this.f333035e.mo104359e(0.0f);
        this.f333038h.mo104359e(0.0f);
        this.f333036f.mo104359e(0.0f);
        this.f333040j.mo104359e(1.0f);
        this.f333041k = i;
        this.f333042l = -12828605;
    }
}
