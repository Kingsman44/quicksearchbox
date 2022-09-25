package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gi */
/* compiled from: PG */
final class C6956gi {

    /* renamed from: a */
    private final C6910eq f22177a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public arn f22178b = arn.m19402i();

    /* renamed from: c */
    private ars f22179c = ars.m19427a();

    /* renamed from: d */
    private C7321tw f22180d;

    /* renamed from: e */
    private C7321tw f22181e;

    /* renamed from: f */
    private C7321tw f22182f;

    public C6956gi(C6910eq eqVar) {
        this.f22177a = eqVar;
    }

    /* renamed from: j */
    private final void m20403j(C6912es esVar) {
        arq c = ars.m19429c();
        if (this.f22178b.isEmpty()) {
            m20404k(c, this.f22181e, esVar);
            if (!apz.m19253b(this.f22182f, this.f22181e)) {
                m20404k(c, this.f22182f, esVar);
            }
            if (!apz.m19253b(this.f22180d, this.f22181e) && !apz.m19253b(this.f22180d, this.f22182f)) {
                m20404k(c, this.f22180d, esVar);
            }
        } else {
            for (int i = 0; i < this.f22178b.size(); i++) {
                m20404k(c, (C7321tw) this.f22178b.get(i), esVar);
            }
            if (!this.f22178b.contains(this.f22180d)) {
                m20404k(c, this.f22180d, esVar);
            }
        }
        this.f22179c = c.mo15310a();
    }

    /* renamed from: k */
    private final void m20404k(arq arq, C7321tw twVar, C6912es esVar) {
        if (twVar != null) {
            if (esVar.mo15481i(twVar.f23859a) != -1) {
                arq.mo15311b(twVar, esVar);
                return;
            }
            C6912es esVar2 = (C6912es) this.f22179c.get(twVar);
            if (esVar2 != null) {
                arq.mo15311b(twVar, esVar2);
            }
        }
    }

    /* renamed from: l */
    private static C7321tw m20405l(C6890dx dxVar, arn arn, C7321tw twVar, C6910eq eqVar) {
        C6912es u = dxVar.mo15573u();
        int l = dxVar.mo15564l();
        Object j = u.mo15851u() ? null : u.mo15482j(l);
        int g = (dxVar.mo15569q() || u.mo15851u()) ? -1 : u.mo15856z(l, eqVar).mo15838g(C6821bi.m19755b(dxVar.mo15567o()) - eqVar.mo15832b());
        for (int i = 0; i < arn.size(); i++) {
            C7321tw twVar2 = (C7321tw) arn.get(i);
            if (m20406m(twVar2, j, dxVar.mo15569q(), dxVar.mo15570r(), dxVar.mo15571s(), g)) {
                return twVar2;
            }
        }
        if (arn.isEmpty() && twVar != null) {
            if (m20406m(twVar, j, dxVar.mo15569q(), dxVar.mo15570r(), dxVar.mo15571s(), g)) {
                return twVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    private static boolean m20406m(C7321tw twVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!twVar.f23859a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(twVar.f23860b == i && twVar.f23861c == i2)) {
                return false;
            }
        } else if (!(twVar.f23860b == -1 && twVar.f23863e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C7321tw mo15869a() {
        return this.f22180d;
    }

    /* renamed from: b */
    public final C7321tw mo15870b() {
        return this.f22181e;
    }

    /* renamed from: c */
    public final C7321tw mo15871c() {
        return this.f22182f;
    }

    /* renamed from: d */
    public final C7321tw mo15872d() {
        if (this.f22178b.isEmpty()) {
            return null;
        }
        return (C7321tw) ary.m19448a(this.f22178b);
    }

    /* renamed from: e */
    public final C6912es mo15873e(C7321tw twVar) {
        return (C6912es) this.f22179c.get(twVar);
    }

    /* renamed from: f */
    public final void mo15874f(C6890dx dxVar) {
        this.f22180d = m20405l(dxVar, this.f22178b, this.f22181e, this.f22177a);
    }

    /* renamed from: g */
    public final void mo15875g(C6890dx dxVar) {
        this.f22180d = m20405l(dxVar, this.f22178b, this.f22181e, this.f22177a);
        m20403j(dxVar.mo15573u());
    }

    /* renamed from: h */
    public final void mo15876h(List list, C7321tw twVar, C6890dx dxVar) {
        this.f22178b = arn.m19405l(list);
        if (!list.isEmpty()) {
            this.f22181e = (C7321tw) list.get(0);
            ary.m19467t(twVar);
            this.f22182f = twVar;
        }
        if (this.f22180d == null) {
            this.f22180d = m20405l(dxVar, this.f22178b, this.f22181e, this.f22177a);
        }
        m20403j(dxVar.mo15573u());
    }
}
