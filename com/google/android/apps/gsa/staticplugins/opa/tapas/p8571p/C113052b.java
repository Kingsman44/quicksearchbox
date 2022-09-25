package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.b */
/* compiled from: PG */
public final class C113052b {

    /* renamed from: a */
    public int f313249a = 0;

    /* renamed from: b */
    public int f313250b = 0;

    /* renamed from: c */
    public int f313251c = 0;

    /* renamed from: d */
    public int f313252d = 0;

    /* renamed from: e */
    public int f313253e = 0;

    /* renamed from: f */
    public int f313254f = 0;

    /* renamed from: g */
    C113052b f313255g = null;

    /* renamed from: h */
    private C113052b f313256h = null;

    /* renamed from: a */
    public static C113052b m187046a(C113052b bVar) {
        C113052b bVar2 = new C113052b();
        bVar2.f313249a = bVar.f313249a;
        bVar2.f313251c = bVar.f313251c;
        bVar2.f313252d = bVar.f313252d;
        bVar2.f313250b = bVar.f313250b;
        bVar2.f313253e = bVar.f313253e;
        bVar2.f313254f = bVar.f313254f;
        C113052b bVar3 = bVar.f313255g;
        if (bVar3 != null) {
            bVar2.f313255g = m187046a(bVar3);
        }
        return bVar2;
    }

    /* renamed from: c */
    public static C113091d m187047c(C113091d dVar, C113091d dVar2) {
        C113079c cVar = (C113079c) dVar.toBuilder();
        int i = dVar.f313354b;
        int i2 = dVar2.f313354b;
        cVar.copyOnWrite();
        C113091d dVar3 = (C113091d) cVar.instance;
        dVar3.f313353a |= 1;
        dVar3.f313354b = i - i2;
        int i3 = dVar.f313355c;
        int i4 = dVar2.f313355c;
        cVar.copyOnWrite();
        C113091d dVar4 = (C113091d) cVar.instance;
        dVar4.f313353a |= 2;
        dVar4.f313355c = i3 - i4;
        if ((dVar2.f313353a & 4) != 0) {
            C113091d dVar5 = dVar.f313356d;
            if (dVar5 == null) {
                dVar5 = C113091d.f313351e;
            }
            C113091d dVar6 = dVar2.f313356d;
            if (dVar6 == null) {
                dVar6 = C113091d.f313351e;
            }
            C113091d c = m187047c(dVar5, dVar6);
            cVar.copyOnWrite();
            C113091d dVar7 = (C113091d) cVar.instance;
            c.getClass();
            dVar7.f313356d = c;
            dVar7.f313353a |= 4;
        }
        return (C113091d) cVar.build();
    }

    /* renamed from: b */
    public final C113052b mo99832b() {
        if (this.f313255g == null) {
            this.f313255g = new C113052b();
        }
        return this.f313255g;
    }

    /* renamed from: d */
    public final C113091d mo99833d() {
        C113079c cVar = (C113079c) C113091d.f313351e.createBuilder();
        int i = this.f313249a;
        cVar.copyOnWrite();
        C113091d dVar = (C113091d) cVar.instance;
        dVar.f313353a |= 1;
        dVar.f313354b = i;
        int i2 = this.f313250b;
        cVar.copyOnWrite();
        C113091d dVar2 = (C113091d) cVar.instance;
        dVar2.f313353a |= 2;
        dVar2.f313355c = i2;
        C113052b bVar = this.f313255g;
        if (bVar != null) {
            C113091d d = bVar.mo99833d();
            cVar.copyOnWrite();
            C113091d dVar3 = (C113091d) cVar.instance;
            d.getClass();
            dVar3.f313356d = d;
            dVar3.f313353a |= 4;
        }
        return (C113091d) cVar.build();
    }

    /* renamed from: e */
    public final void mo99834e(C113052b bVar) {
        if (bVar != null) {
            this.f313249a += bVar.f313249a;
            this.f313251c += bVar.f313251c;
            this.f313252d += bVar.f313252d;
            this.f313250b += bVar.f313250b;
            this.f313253e += bVar.f313253e;
            this.f313254f += bVar.f313254f;
            if (bVar.f313255g != null) {
                if (this.f313255g == null) {
                    this.f313255g = new C113052b();
                }
                this.f313255g.mo99834e(bVar.f313255g);
            }
        }
    }

    /* renamed from: f */
    public final void mo99835f() {
        if (this.f313256h == null) {
            this.f313256h = new C113052b();
        }
        if (this.f313255g == null) {
            this.f313255g = new C113052b();
        }
        int i = this.f313249a;
        C113052b bVar = this.f313256h;
        if (i > bVar.f313249a) {
            this.f313255g.f313249a++;
        }
        if (this.f313251c > bVar.f313251c) {
            this.f313255g.f313251c++;
        }
        if (this.f313252d > bVar.f313252d) {
            this.f313255g.f313252d++;
        }
        if (this.f313250b > bVar.f313250b) {
            this.f313255g.f313250b++;
        }
        if (this.f313253e > bVar.f313253e) {
            this.f313255g.f313253e++;
        }
        if (this.f313254f > bVar.f313254f) {
            this.f313255g.f313254f++;
        }
        this.f313256h = m187046a(this);
    }

    /* renamed from: g */
    public final void mo99836g(boolean z, boolean z2, boolean z3) {
        this.f313250b++;
        if (z2) {
            this.f313253e++;
        }
        if (z3) {
            this.f313254f++;
        }
        if (z) {
            this.f313249a++;
            if (z2) {
                this.f313251c++;
            }
            if (z3) {
                this.f313252d++;
            }
        }
    }
}
