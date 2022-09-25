package com.facebook.litho;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.facebook.litho.bg */
/* compiled from: PG */
final class C6126bg implements C6248ev {

    /* renamed from: a */
    public CharSequence f18118a;

    /* renamed from: b */
    public Object f18119b;

    /* renamed from: c */
    public SparseArray f18120c;

    /* renamed from: d */
    public ViewOutlineProvider f18121d;

    /* renamed from: e */
    public boolean f18122e;

    /* renamed from: f */
    public boolean f18123f = true;

    /* renamed from: g */
    public float f18124g = 1.0f;

    /* renamed from: h */
    public float f18125h = 1.0f;

    /* renamed from: i */
    public float f18126i = 0.0f;

    /* renamed from: j */
    public C6154cb f18127j;

    /* renamed from: k */
    public C6154cb f18128k;

    /* renamed from: l */
    public C6154cb f18129l;

    /* renamed from: m */
    public C6154cb f18130m;

    /* renamed from: n */
    public C6154cb f18131n;

    /* renamed from: o */
    public String f18132o;

    /* renamed from: p */
    public C6154cb f18133p;

    /* renamed from: q */
    public int f18134q = 0;

    /* renamed from: r */
    public int f18135r = 0;

    /* renamed from: s */
    public int f18136s = 0;

    /* renamed from: t */
    public int f18137t;

    /* renamed from: u */
    private C6154cb f18138u;

    /* renamed from: v */
    private int f18139v = 0;

    /* renamed from: w */
    private int f18140w = 0;

    /* renamed from: A */
    public final C6154cb mo13031A() {
        return null;
    }

    /* renamed from: B */
    public final C6154cb mo13032B() {
        return null;
    }

    /* renamed from: C */
    public final C6154cb mo13033C() {
        return this.f18130m;
    }

    /* renamed from: D */
    public final CharSequence mo13034D() {
        return null;
    }

    /* renamed from: E */
    public final CharSequence mo13035E() {
        return this.f18118a;
    }

    /* renamed from: F */
    public final Object mo13036F() {
        return this.f18119b;
    }

    /* renamed from: G */
    public final String mo13037G() {
        return this.f18132o;
    }

    /* renamed from: H */
    public final String mo13038H() {
        return null;
    }

    /* renamed from: I */
    public final void mo13039I(C6248ev evVar) {
        if ((this.f18137t & 8) != 0) {
            evVar.mo13043M(this.f18127j);
        }
        if ((this.f18137t & 16) != 0) {
            evVar.mo13053W(this.f18129l);
        }
        if ((this.f18137t & C89885b.S3REQUEST_VALUE) != 0) {
            evVar.mo13050T(this.f18128k);
        }
        if ((this.f18137t & 32) != 0) {
            evVar.mo13061ac(this.f18130m);
        }
        if ((this.f18137t & 134217728) != 0) {
            evVar.mo13048R(this.f18138u);
        }
        if ((this.f18137t & C89885b.HTTP_VALUE) != 0) {
            evVar.mo13052V(this.f18131n);
        }
        if ((this.f18137t & 4194304) != 0) {
            evVar.mo13041K(this.f18132o);
        }
        if ((this.f18137t & 16777216) != 0) {
            evVar.mo13075aq();
        }
        if ((this.f18137t & 64) != 0) {
            evVar.mo13076ar();
        }
        if ((this.f18137t & 128) != 0) {
            evVar.mo13077as();
        }
        if ((this.f18137t & 256) != 0) {
            evVar.mo13054X(this.f18133p);
        }
        if ((this.f18137t & 512) != 0) {
            evVar.mo13078at();
        }
        if ((this.f18137t & 1024) != 0) {
            evVar.mo13079au();
        }
        if ((this.f18137t & 2048) != 0) {
            evVar.mo13080av();
        }
        if ((this.f18137t & 4096) != 0) {
            evVar.mo13083ay();
        }
        if ((this.f18137t & 8192) != 0) {
            evVar.mo13084az();
        }
        boolean z = true;
        if ((this.f18137t & 1) != 0) {
            evVar.mo13047Q(this.f18118a);
        }
        if ((this.f18137t & 16384) != 0) {
            evVar.mo13058aA();
        }
        if ((this.f18137t & 32768) != 0) {
            evVar.mo13055Y(this.f18121d);
        }
        if ((this.f18137t & 65536) != 0) {
            evVar.mo13046P(this.f18122e);
        }
        if ((this.f18137t & 8388608) != 0) {
            evVar.mo13045O(this.f18123f);
        }
        Object obj = this.f18119b;
        if (obj != null) {
            evVar.mo13062ad(obj);
        }
        SparseArray sparseArray = this.f18120c;
        if (sparseArray != null) {
            evVar.mo13063ae(sparseArray);
        }
        int i = this.f18134q;
        if (i != 0) {
            evVar.mo13051U(i == 1);
        }
        int i2 = this.f18139v;
        if (i2 != 0) {
            evVar.mo13044N(i2 == 1);
        }
        int i3 = this.f18135r;
        if (i3 != 0) {
            evVar.mo13049S(i3 == 1);
        }
        int i4 = this.f18136s;
        if (i4 != 0) {
            evVar.mo13060ab(i4 == 1);
        }
        int i5 = this.f18140w;
        if (i5 != 0) {
            if (i5 != 1) {
                z = false;
            }
            evVar.mo13040J(z);
        }
        if ((this.f18137t & 524288) != 0) {
            evVar.mo13059aa(this.f18124g);
        }
        if ((this.f18137t & 1048576) != 0) {
            evVar.mo13042L(this.f18125h);
        }
        if ((this.f18137t & C89885b.NOW_VALUE) != 0) {
            evVar.mo13056Z(this.f18126i);
        }
        if ((this.f18137t & 33554432) != 0) {
            evVar.mo13081aw();
        }
        if ((this.f18137t & 67108864) != 0) {
            evVar.mo13082ax();
        }
    }

    /* renamed from: J */
    public final void mo13040J(boolean z) {
        this.f18140w = z ? 1 : 2;
    }

    /* renamed from: K */
    public final void mo13041K(String str) {
        this.f18137t |= 4194304;
        this.f18132o = str;
    }

    /* renamed from: L */
    public final void mo13042L(float f) {
        this.f18125h = f;
        this.f18137t = f == 1.0f ? this.f18137t & -1048577 : this.f18137t | 1048576;
    }

    /* renamed from: M */
    public final void mo13043M(C6154cb cbVar) {
        this.f18137t |= 8;
        this.f18127j = cbVar;
    }

    /* renamed from: N */
    public final void mo13044N(boolean z) {
        this.f18139v = z ? 1 : 2;
    }

    /* renamed from: O */
    public final void mo13045O(boolean z) {
        this.f18137t |= 8388608;
        this.f18123f = z;
    }

    /* renamed from: P */
    public final void mo13046P(boolean z) {
        this.f18137t |= 65536;
        this.f18122e = z;
    }

    /* renamed from: Q */
    public final void mo13047Q(CharSequence charSequence) {
        this.f18137t |= 1;
        this.f18118a = charSequence;
    }

    /* renamed from: R */
    public final void mo13048R(C6154cb cbVar) {
        this.f18137t |= 134217728;
        this.f18138u = cbVar;
    }

    /* renamed from: S */
    public final void mo13049S(boolean z) {
        this.f18135r = z ? 1 : 2;
    }

    /* renamed from: T */
    public final void mo13050T(C6154cb cbVar) {
        this.f18137t |= C89885b.S3REQUEST_VALUE;
        this.f18128k = cbVar;
    }

    /* renamed from: U */
    public final void mo13051U(boolean z) {
        this.f18134q = z ? 1 : 2;
    }

    /* renamed from: V */
    public final void mo13052V(C6154cb cbVar) {
        this.f18137t |= C89885b.HTTP_VALUE;
        this.f18131n = cbVar;
    }

    /* renamed from: W */
    public final void mo13053W(C6154cb cbVar) {
        this.f18137t |= 16;
        this.f18129l = cbVar;
    }

    /* renamed from: X */
    public final void mo13054X(C6154cb cbVar) {
        this.f18137t |= 256;
        this.f18133p = cbVar;
    }

    /* renamed from: Y */
    public final void mo13055Y(ViewOutlineProvider viewOutlineProvider) {
        this.f18137t |= 32768;
        this.f18121d = viewOutlineProvider;
    }

    /* renamed from: Z */
    public final void mo13056Z(float f) {
        this.f18126i = f;
        this.f18137t = f == 0.0f ? this.f18137t & -2097153 : this.f18137t | C89885b.NOW_VALUE;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo13057a(Object obj) {
        C6248ev evVar = (C6248ev) obj;
        if (this == evVar) {
            return true;
        }
        if (evVar != null && this.f18137t == evVar.mo13094k() && C6404n.m17223b(this.f18132o, evVar.mo13037G()) && this.f18125h == evVar.mo13085b() && C6404n.m17224c(this.f18127j, evVar.mo13099p()) && this.f18122e == evVar.mo13065ag() && this.f18123f == evVar.mo13064af() && C6404n.m17223b(this.f18118a, evVar.mo13035E()) && C6404n.m17224c((C6142bw) null, evVar.mo13100q()) && this.f18135r == evVar.mo13093j() && C6404n.m17224c(this.f18128k, evVar.mo13102s()) && this.f18134q == evVar.mo13095l() && C6404n.m17224c(this.f18131n, evVar.mo13103t()) && C6404n.m17224c(this.f18129l, evVar.mo13104u()) && C6404n.m17224c((C6142bw) null, evVar.mo13105v()) && C6404n.m17224c(this.f18133p, evVar.mo13106w()) && C6404n.m17224c((C6142bw) null, evVar.mo13107x()) && C6404n.m17224c((C6142bw) null, evVar.mo13108y()) && C6404n.m17223b(this.f18121d, evVar.mo13098o()) && C6404n.m17224c((C6142bw) null, evVar.mo13109z()) && this.f18126i == evVar.mo13086c() && this.f18124g == evVar.mo13089f() && this.f18136s == evVar.mo13096m() && C6404n.m17224c((C6142bw) null, evVar.mo13031A()) && C6404n.m17224c((C6142bw) null, evVar.mo13032B()) && evVar.mo13090g() == 0.0f && C6404n.m17224c(this.f18130m, evVar.mo13033C()) && C6404n.m17223b(this.f18119b, evVar.mo13036F())) {
            SparseArray sparseArray = this.f18120c;
            SparseArray n = evVar.mo13097n();
            if (sparseArray == n) {
                return true;
            }
            if (!(sparseArray == null || n == null || sparseArray.size() != n.size())) {
                int size = sparseArray.size();
                int i = 0;
                while (i < size) {
                    if (sparseArray.keyAt(i) == n.keyAt(i) && sparseArray.valueAt(i).equals(n.valueAt(i))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: aA */
    public final void mo13058aA() {
        this.f18137t |= 16384;
    }

    /* renamed from: aa */
    public final void mo13059aa(float f) {
        this.f18124g = f;
        this.f18137t = f == 1.0f ? this.f18137t & -524289 : this.f18137t | 524288;
    }

    /* renamed from: ab */
    public final void mo13060ab(boolean z) {
        this.f18136s = z ? 1 : 2;
    }

    /* renamed from: ac */
    public final void mo13061ac(C6154cb cbVar) {
        this.f18137t |= 32;
        this.f18130m = cbVar;
    }

    /* renamed from: ad */
    public final void mo13062ad(Object obj) {
        this.f18137t |= 2;
        this.f18119b = obj;
    }

    /* renamed from: ae */
    public final void mo13063ae(SparseArray sparseArray) {
        this.f18137t |= 4;
        this.f18120c = sparseArray;
    }

    /* renamed from: af */
    public final boolean mo13064af() {
        return this.f18123f;
    }

    /* renamed from: ag */
    public final boolean mo13065ag() {
        return this.f18122e;
    }

    /* renamed from: ah */
    public final boolean mo13066ah() {
        return this.f18128k != null;
    }

    /* renamed from: ai */
    public final boolean mo13067ai() {
        return (this.f18127j == null && this.f18129l == null && this.f18130m == null && this.f18138u == null && this.f18131n == null) ? false : true;
    }

    /* renamed from: aj */
    public final boolean mo13068aj() {
        return (this.f18137t & 1048576) != 0;
    }

    /* renamed from: ak */
    public final boolean mo13069ak() {
        return (this.f18137t & 8388608) != 0;
    }

    /* renamed from: al */
    public final boolean mo13070al() {
        return (this.f18137t & C89885b.NOW_VALUE) != 0;
    }

    /* renamed from: am */
    public final boolean mo13071am() {
        return (this.f18137t & 33554432) != 0;
    }

    /* renamed from: an */
    public final boolean mo13072an() {
        return (this.f18137t & 67108864) != 0;
    }

    /* renamed from: ao */
    public final boolean mo13073ao() {
        return (this.f18137t & 524288) != 0;
    }

    /* renamed from: ap */
    public final boolean mo13074ap() {
        return (this.f18133p == null && this.f18132o == null) ? false : true;
    }

    /* renamed from: aq */
    public final void mo13075aq() {
        this.f18137t |= 16777216;
    }

    /* renamed from: ar */
    public final void mo13076ar() {
        this.f18137t |= 64;
    }

    /* renamed from: as */
    public final void mo13077as() {
        this.f18137t |= 128;
    }

    /* renamed from: at */
    public final void mo13078at() {
        this.f18137t |= 512;
    }

    /* renamed from: au */
    public final void mo13079au() {
        this.f18137t |= 1024;
    }

    /* renamed from: av */
    public final void mo13080av() {
        this.f18137t |= 2048;
    }

    /* renamed from: aw */
    public final void mo13081aw() {
        this.f18137t |= 33554432;
    }

    /* renamed from: ax */
    public final void mo13082ax() {
        this.f18137t |= 67108864;
    }

    /* renamed from: ay */
    public final void mo13083ay() {
        this.f18137t |= 4096;
    }

    /* renamed from: az */
    public final void mo13084az() {
        this.f18137t |= 8192;
    }

    /* renamed from: b */
    public final float mo13085b() {
        return this.f18125h;
    }

    /* renamed from: c */
    public final float mo13086c() {
        return this.f18126i;
    }

    /* renamed from: d */
    public final float mo13087d() {
        return 0.0f;
    }

    /* renamed from: e */
    public final float mo13088e() {
        return 0.0f;
    }

    /* renamed from: f */
    public final float mo13089f() {
        return this.f18124g;
    }

    /* renamed from: g */
    public final float mo13090g() {
        return 0.0f;
    }

    /* renamed from: h */
    public final int mo13091h() {
        return this.f18140w;
    }

    /* renamed from: i */
    public final int mo13092i() {
        return this.f18139v;
    }

    /* renamed from: j */
    public final int mo13093j() {
        return this.f18135r;
    }

    /* renamed from: k */
    public final int mo13094k() {
        return this.f18137t;
    }

    /* renamed from: l */
    public final int mo13095l() {
        return this.f18134q;
    }

    /* renamed from: m */
    public final int mo13096m() {
        return this.f18136s;
    }

    /* renamed from: n */
    public final SparseArray mo13097n() {
        return this.f18120c;
    }

    /* renamed from: o */
    public final ViewOutlineProvider mo13098o() {
        return this.f18121d;
    }

    /* renamed from: p */
    public final C6154cb mo13099p() {
        return this.f18127j;
    }

    /* renamed from: q */
    public final C6154cb mo13100q() {
        return null;
    }

    /* renamed from: r */
    public final C6154cb mo13101r() {
        return this.f18138u;
    }

    /* renamed from: s */
    public final C6154cb mo13102s() {
        return this.f18128k;
    }

    /* renamed from: t */
    public final C6154cb mo13103t() {
        return this.f18131n;
    }

    /* renamed from: u */
    public final C6154cb mo13104u() {
        return this.f18129l;
    }

    /* renamed from: v */
    public final C6154cb mo13105v() {
        return null;
    }

    /* renamed from: w */
    public final C6154cb mo13106w() {
        return this.f18133p;
    }

    /* renamed from: x */
    public final C6154cb mo13107x() {
        return null;
    }

    /* renamed from: y */
    public final C6154cb mo13108y() {
        return null;
    }

    /* renamed from: z */
    public final C6154cb mo13109z() {
        return null;
    }
}
