package com.google.android.libraries.gsa.logoview.p1882b;

import com.google.android.libraries.gsa.logoview.p1881a.C22886a;
import com.google.android.libraries.gsa.logoview.p1881a.C22887b;
import com.google.android.libraries.gsa.logoview.p1881a.C22888c;

/* renamed from: com.google.android.libraries.gsa.logoview.b.a */
/* compiled from: PG */
public final class C22903a {

    /* renamed from: a */
    public final C22888c f63065a;

    /* renamed from: b */
    public final C22886a f63066b;

    /* renamed from: c */
    public final C22888c f63067c;

    /* renamed from: d */
    public final C22888c f63068d;

    /* renamed from: e */
    public final C22888c f63069e;

    /* renamed from: f */
    public final C22887b f63070f;

    /* renamed from: g */
    public final C22887b f63071g;

    /* renamed from: h */
    public final C22887b f63072h;

    /* renamed from: i */
    public final C22887b f63073i;

    /* renamed from: j */
    public int f63074j;

    /* renamed from: k */
    public float f63075k;

    public C22903a(C22888c cVar, C22886a aVar, C22888c cVar2, C22888c cVar3, C22888c cVar4, C22887b bVar, C22887b bVar2, C22887b bVar3, C22887b bVar4) {
        this.f63065a = cVar;
        this.f63066b = aVar;
        this.f63067c = cVar2;
        this.f63068d = cVar3;
        this.f63069e = cVar4;
        this.f63070f = bVar;
        this.f63071g = bVar2;
        this.f63072h = bVar3;
        this.f63073i = bVar4;
    }

    /* renamed from: a */
    public final void mo28255a(float f, float f2, float f3, int i) {
        this.f63065a.mo28237e(f);
        this.f63066b.mo28237e(f2);
        this.f63071g.mo28237e(f3);
        this.f63067c.mo28237e(4.0f);
        this.f63068d.mo28237e(0.0f);
        this.f63069e.mo28237e(0.0f);
        this.f63072h.mo28237e(0.0f);
        this.f63070f.mo28237e(0.0f);
        this.f63074j = i;
    }

    /* renamed from: b */
    public final void mo28256b(boolean z) {
        this.f63066b.mo28240h(!z);
    }

    /* renamed from: c */
    public final void mo28257c(boolean z) {
        this.f63069e.mo28240h(!z);
    }

    /* renamed from: d */
    public final void mo28258d(boolean z) {
        this.f63065a.mo28240h(!z);
    }

    /* renamed from: e */
    public final void mo28259e(boolean z) {
        this.f63067c.mo28240h(!z);
    }

    /* renamed from: f */
    public final void mo28260f(float f, float f2) {
        float f3 = this.f63065a.f63013c;
        double cos = Math.cos((double) this.f63066b.f63013c);
        float f4 = this.f63068d.f63013c;
        float f5 = this.f63065a.f63013c;
        double sin = Math.sin((double) this.f63066b.f63013c);
        float f6 = this.f63069e.f63013c;
        this.f63066b.mo28237e(f);
        this.f63065a.mo28237e(f2);
        float f7 = this.f63065a.f63013c;
        double cos2 = Math.cos((double) this.f63066b.f63013c);
        float f8 = this.f63065a.f63013c;
        double sin2 = Math.sin((double) this.f63066b.f63013c);
        this.f63068d.mo28237e(((f3 * ((float) cos)) + f4) - (f7 * ((float) cos2)));
        this.f63069e.mo28237e(((f5 * ((float) sin)) + f6) - (f8 * ((float) sin2)));
    }

    /* renamed from: g */
    public final boolean mo28261g() {
        return this.f63073i.f63013c > 0.001f;
    }

    /* renamed from: h */
    public final boolean mo28262h() {
        return this.f63071g.f63013c > 0.001f;
    }
}
