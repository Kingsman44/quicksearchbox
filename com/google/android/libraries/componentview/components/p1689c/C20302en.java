package com.google.android.libraries.componentview.components.p1689c;

import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.en */
/* compiled from: PG */
public final class C20302en implements C20303eo {

    /* renamed from: a */
    private final List f57044a;

    /* renamed from: b */
    private final boolean f57045b;

    /* renamed from: c */
    private int f57046c = 0;

    /* renamed from: d */
    private float f57047d = 0.0f;

    /* renamed from: e */
    private float f57048e = -1.0f;

    public C20302en(List list) {
        boolean z = false;
        this.f57044a = list;
        this.f57045b = !list.isEmpty() ? ((C20303eo) list.get(0)).mo25318f() : z;
    }

    /* renamed from: a */
    public final void mo25304a() {
        for (C20303eo a : this.f57044a) {
            a.mo25304a();
        }
    }

    /* renamed from: b */
    public final void mo25305b() {
        for (C20303eo b : this.f57044a) {
            b.mo25305b();
        }
        this.f57047d = 0.0f;
        this.f57046c = 0;
    }

    /* renamed from: c */
    public final void mo25306c(float f) {
        if (this.f57046c <= this.f57044a.size()) {
            float e = (mo25317e() * f) - this.f57047d;
            C20303eo eoVar = (C20303eo) this.f57044a.get(this.f57046c);
            if (e > eoVar.mo25317e()) {
                eoVar.mo25306c(1.0f);
                this.f57046c++;
                this.f57047d += eoVar.mo25317e();
                mo25306c(f);
                return;
            }
            eoVar.mo25306c(e / eoVar.mo25317e());
        }
    }

    /* renamed from: d */
    public final void mo25307d() {
        for (C20303eo d : this.f57044a) {
            d.mo25307d();
        }
    }

    /* renamed from: e */
    public final float mo25317e() {
        if (this.f57048e < 0.0f) {
            this.f57048e = 0.0f;
            for (C20303eo e : this.f57044a) {
                this.f57048e += e.mo25317e();
            }
        }
        return this.f57048e;
    }

    /* renamed from: f */
    public final boolean mo25318f() {
        return this.f57045b;
    }
}
