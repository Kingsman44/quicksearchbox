package org.p5623b.p5624a;

/* renamed from: org.b.a.ad */
/* compiled from: PG */
public abstract class C72018ad extends C72108u implements C72092e, C72084cb {

    /* renamed from: a */
    public final int f191772a;

    /* renamed from: b */
    public final boolean f191773b;

    /* renamed from: c */
    final C72092e f191774c;

    public C72018ad(boolean z, int i, C72092e eVar) {
        if (eVar != null) {
            this.f191772a = i;
            boolean z2 = true;
            if (!z && !(eVar instanceof C72091d)) {
                z2 = false;
            }
            this.f191773b = z2;
            this.f191774c = eVar;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72018ad)) {
            return false;
        }
        C72018ad adVar = (C72018ad) uVar;
        if (this.f191772a != adVar.f191772a || this.f191773b != adVar.f191773b) {
            return false;
        }
        C72108u g = this.f191774c.mo63233g();
        C72108u g2 = adVar.f191774c.mo63233g();
        if (g == g2 || g.mo63219c(g2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final C72108u mo63227e() {
        return this.f191774c.mo63233g();
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72059bl(this.f191773b, this.f191772a, this.f191774c);
    }

    /* renamed from: h */
    public C72108u mo63229h() {
        return new C72073bz(this.f191773b, this.f191772a, this.f191774c);
    }

    public final int hashCode() {
        return (this.f191772a ^ (true != this.f191773b ? 240 : 15)) ^ this.f191774c.mo63233g().hashCode();
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        return this;
    }

    public final String toString() {
        int i = this.f191772a;
        String obj = this.f191774c.toString();
        return "[" + i + "]" + obj;
    }
}
