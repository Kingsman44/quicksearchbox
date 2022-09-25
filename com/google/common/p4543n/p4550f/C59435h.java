package com.google.common.p4543n.p4550f;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.common.n.f.h */
/* compiled from: PG */
public final class C59435h {

    /* renamed from: a */
    final boolean f157672a = false;

    /* renamed from: b */
    public double f157673b = 0.05d;

    /* renamed from: c */
    public double f157674c = 1.0d;

    /* renamed from: d */
    public double f157675d = C59203do.f157270a;

    /* renamed from: e */
    public double f157676e = 1.0E9d;

    /* renamed from: f */
    int f157677f = -1;

    /* renamed from: g */
    final boolean f157678g = false;

    /* renamed from: h */
    public int f157679h = 1;

    public C59435h() {
    }

    public C59435h(C59435h hVar) {
        this.f157679h = hVar.f157679h;
        this.f157673b = hVar.f157673b;
        this.f157674c = hVar.f157674c;
        this.f157676e = hVar.f157676e;
        this.f157677f = hVar.f157677f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56949a(C59435h hVar) {
        if (this.f157679h != hVar.f157679h) {
            return false;
        }
        boolean z = hVar.f157672a;
        if (!Double.valueOf(this.f157673b).equals(Double.valueOf(hVar.f157673b)) || !Double.valueOf(this.f157674c).equals(Double.valueOf(hVar.f157674c))) {
            return false;
        }
        Double valueOf = Double.valueOf(C59203do.f157270a);
        double d = hVar.f157675d;
        if (!valueOf.equals(valueOf) || !Double.valueOf(this.f157676e).equals(Double.valueOf(hVar.f157676e)) || this.f157677f != hVar.f157677f) {
            return false;
        }
        boolean z2 = hVar.f157678g;
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59435h) && mo56949a((C59435h) obj);
    }

    public final int hashCode() {
        if (this.f157679h != 0) {
            Boolean bool = false;
            return ((((((((((((bool.hashCode() + 31) * 31) + Double.valueOf(this.f157673b).hashCode()) * 31) + Double.valueOf(this.f157674c).hashCode()) * 31) + Double.valueOf(C59203do.f157270a).hashCode()) * 31) + Double.valueOf(this.f157676e).hashCode()) * 31) + Integer.valueOf(this.f157677f).hashCode()) * 31) + bool.hashCode();
        }
        throw null;
    }
}
