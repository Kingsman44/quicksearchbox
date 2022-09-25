package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.h */
/* compiled from: PG */
public final class C59214h implements Serializable {

    /* renamed from: a */
    public double f157289a;

    /* renamed from: b */
    public double f157290b;

    public C59214h() {
        this(1.0d, C59203do.f157270a);
    }

    public C59214h(double d, double d2) {
        this.f157289a = d;
        this.f157290b = d2;
    }

    /* renamed from: b */
    public static C59214h m91849b() {
        return new C59214h(1.0d, C59203do.f157270a);
    }

    /* renamed from: d */
    public static C59214h m91850d(double d, double d2) {
        C59214h hVar = new C59214h();
        hVar.mo56588e(d, d2);
        return hVar;
    }

    /* renamed from: a */
    public final double mo56586a(double d) {
        return Math.max(this.f157289a, Math.min(this.f157290b, d));
    }

    /* renamed from: c */
    public final C59214h mo56587c(double d) {
        return mo56592h() ? this : new C59214h(this.f157289a - d, this.f157290b + d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo56588e(double d, double d2) {
        if (d <= d2) {
            this.f157289a = d;
            this.f157290b = d2;
            return;
        }
        this.f157289a = d2;
        this.f157290b = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59214h)) {
            return false;
        }
        C59214h hVar = (C59214h) obj;
        if ((this.f157289a != hVar.f157289a || this.f157290b != hVar.f157290b) && (!mo56592h() || !hVar.mo56592h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo56590f(C59214h hVar) {
        if (mo56592h()) {
            this.f157289a = hVar.f157289a;
            this.f157290b = hVar.f157290b;
        } else if (!hVar.mo56592h()) {
            this.f157289a = Math.min(this.f157289a, hVar.f157289a);
            this.f157290b = Math.max(this.f157290b, hVar.f157290b);
        }
    }

    /* renamed from: g */
    public final boolean mo56591g(double d) {
        return d >= this.f157289a && d <= this.f157290b;
    }

    /* renamed from: h */
    public final boolean mo56592h() {
        return this.f157289a > this.f157290b;
    }

    public final int hashCode() {
        if (mo56592h()) {
            return 17;
        }
        long doubleToLongBits = ((Double.doubleToLongBits(this.f157289a) + 629) * 37) + Double.doubleToLongBits(this.f157290b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "[" + this.f157289a + ", " + this.f157290b + "]";
    }

    public C59214h(C59214h hVar) {
        this(hVar.f157289a, hVar.f157290b);
    }
}
