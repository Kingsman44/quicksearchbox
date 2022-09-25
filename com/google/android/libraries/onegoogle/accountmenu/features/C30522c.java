package com.google.android.libraries.onegoogle.accountmenu.features;

import com.google.android.libraries.onegoogle.accountmenu.features.p2370f.C30603a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.c */
/* compiled from: PG */
public final class C30522c extends C30495a {

    /* renamed from: a */
    public C58833ax f82431a;

    /* renamed from: b */
    public C58833ax f82432b;

    /* renamed from: c */
    public C58833ax f82433c;

    /* renamed from: d */
    public C30639v f82434d;

    /* renamed from: e */
    public C58833ax f82435e;

    /* renamed from: f */
    public C30636s f82436f;

    /* renamed from: g */
    public C30635r f82437g;

    /* renamed from: h */
    public C58833ax f82438h;

    /* renamed from: i */
    public C30603a f82439i;

    /* renamed from: j */
    public C58833ax f82440j;

    /* renamed from: k */
    public byte f82441k;

    /* renamed from: l */
    public int f82442l;

    /* renamed from: m */
    private C58833ax f82443m;

    /* renamed from: n */
    private C58833ax f82444n;

    /* renamed from: o */
    private C58833ax f82445o;

    /* renamed from: p */
    private C58485gu f82446p;

    /* renamed from: q */
    private C58833ax f82447q;

    /* renamed from: r */
    private boolean f82448r;

    /* renamed from: s */
    private boolean f82449s;

    public C30522c() {
        C58836b bVar = C58836b.f156633a;
        this.f82431a = bVar;
        this.f82432b = bVar;
        this.f82433c = bVar;
        this.f82443m = bVar;
        this.f82435e = bVar;
        this.f82444n = bVar;
        this.f82445o = bVar;
        this.f82447q = bVar;
        this.f82438h = bVar;
        this.f82440j = bVar;
    }

    public C30522c(C30518b bVar) {
        C58836b bVar2 = C58836b.f156633a;
        this.f82431a = bVar2;
        this.f82432b = bVar2;
        this.f82433c = bVar2;
        this.f82443m = bVar2;
        this.f82435e = bVar2;
        this.f82444n = bVar2;
        this.f82445o = bVar2;
        this.f82447q = bVar2;
        this.f82438h = bVar2;
        this.f82440j = bVar2;
        C30542d dVar = (C30542d) bVar;
        this.f82431a = dVar.f82496a;
        this.f82432b = dVar.f82497b;
        this.f82433c = dVar.f82498c;
        this.f82443m = dVar.f82499d;
        this.f82434d = dVar.f82500e;
        this.f82435e = dVar.f82501f;
        this.f82436f = dVar.f82502g;
        this.f82444n = dVar.f82503h;
        this.f82445o = dVar.f82504i;
        this.f82446p = dVar.f82505j;
        this.f82437g = dVar.f82506k;
        this.f82447q = dVar.f82507l;
        this.f82438h = dVar.f82508m;
        this.f82448r = dVar.f82509n;
        this.f82442l = 1;
        this.f82439i = dVar.f82510o;
        this.f82449s = dVar.f82511p;
        this.f82440j = dVar.f82512q;
        this.f82441k = 7;
    }

    /* renamed from: a */
    public final C30518b mo36129a() {
        C30639v vVar;
        C30636s sVar;
        C58485gu guVar;
        C30635r rVar;
        C30603a aVar;
        if (this.f82441k != 7 || (vVar = this.f82434d) == null || (sVar = this.f82436f) == null || (guVar = this.f82446p) == null || (rVar = this.f82437g) == null || this.f82442l == 0 || (aVar = this.f82439i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f82434d == null) {
                sb.append(" policyFooterCustomizer");
            }
            if (this.f82436f == null) {
                sb.append(" flavorsFeature");
            }
            if (this.f82446p == null) {
                sb.append(" commonActions");
            }
            if (this.f82437g == null) {
                sb.append(" educationManager");
            }
            if ((this.f82441k & 1) == 0) {
                sb.append(" isLauncherApp");
            }
            if ((this.f82441k & 2) == 0) {
                sb.append(" isExperimental");
            }
            if (this.f82442l == 0) {
                sb.append(" largeScreenDialogAlignment");
            }
            if (this.f82439i == null) {
                sb.append(" materialVersion");
            }
            if ((this.f82441k & 4) == 0) {
                sb.append(" enableQuickProfileSwitching");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C30542d dVar = r3;
        C30542d dVar2 = new C30542d(this.f82431a, this.f82432b, this.f82433c, this.f82443m, vVar, this.f82435e, sVar, this.f82444n, this.f82445o, guVar, rVar, this.f82447q, this.f82438h, this.f82448r, aVar, this.f82449s, this.f82440j);
        return dVar;
    }

    /* renamed from: b */
    public final void mo36130b(C58833ax axVar) {
        this.f82445o = axVar;
    }

    /* renamed from: c */
    public final void mo36131c(C58485gu guVar) {
        if (guVar != null) {
            this.f82446p = guVar;
            return;
        }
        throw new NullPointerException("Null commonActions");
    }

    /* renamed from: d */
    public final void mo36132d(C58833ax axVar) {
        this.f82444n = axVar;
    }

    /* renamed from: e */
    public final void mo36133e(boolean z) {
        this.f82449s = z;
        this.f82441k = (byte) (this.f82441k | 4);
    }

    /* renamed from: f */
    public final void mo36134f(C30636s sVar) {
        if (sVar != null) {
            this.f82436f = sVar;
            return;
        }
        throw new NullPointerException("Null flavorsFeature");
    }

    /* renamed from: g */
    public final void mo36135g(boolean z) {
        this.f82448r = z;
        this.f82441k = (byte) (this.f82441k | 1);
    }

    /* renamed from: h */
    public final void mo36136h(C30638u uVar) {
        this.f82443m = C58833ax.m90834k(uVar);
    }

    /* renamed from: i */
    public final void mo36137i(C30641x xVar) {
        this.f82435e = C58833ax.m90834k(xVar);
    }
}
