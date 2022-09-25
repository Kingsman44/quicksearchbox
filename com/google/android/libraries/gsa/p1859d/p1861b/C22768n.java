package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.libraries.gsa.p1859d.C22785g;
import com.google.android.libraries.p10922ab.C146710f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.PrintWriter;
import java.util.UUID;

/* renamed from: com.google.android.libraries.gsa.d.b.n */
/* compiled from: PG */
public abstract class C22768n extends C22758d {

    /* renamed from: ad */
    public static final C59071e f62652ad = C59071e.m91332i("com.google.android.libraries.gsa.d.b.n");

    /* renamed from: a */
    private boolean f62653a;

    /* renamed from: aA */
    public int f62654aA = 0;

    /* renamed from: aB */
    public int f62655aB;

    /* renamed from: aC */
    public int f62656aC = 1;

    /* renamed from: ae */
    public final C22785g f62657ae = new C22785g("OverlayController", 40);

    /* renamed from: af */
    public final C22752ab f62658af = new C22765k(this);

    /* renamed from: ag */
    public final String f62659ag = UUID.randomUUID().toString();

    /* renamed from: ah */
    public int f62660ah;

    /* renamed from: ai */
    public boolean f62661ai;

    /* renamed from: aj */
    protected String f62662aj;

    /* renamed from: ak */
    public int f62663ak;

    /* renamed from: al */
    public final C0395p f62664al;

    /* renamed from: am */
    public String f62665am;

    /* renamed from: an */
    Bundle f62666an;

    /* renamed from: ao */
    Bundle f62667ao;

    /* renamed from: ap */
    Bundle f62668ap;

    /* renamed from: aq */
    public C22754ad f62669aq;

    /* renamed from: ar */
    public FrameLayout f62670ar;

    /* renamed from: as */
    public int f62671as = 0;

    /* renamed from: at */
    public long f62672at = 0;

    /* renamed from: au */
    public boolean f62673au = false;

    /* renamed from: av */
    final boolean f62674av = true;

    /* renamed from: aw */
    public C146710f f62675aw;

    /* renamed from: ax */
    public boolean f62676ax;

    /* renamed from: ay */
    public boolean f62677ay;

    /* renamed from: az */
    public float f62678az;

    public C22768n(Context context, int i, int i2, String str) {
        super(context, i, i2);
        this.f62665am = str;
        this.f62664al = new C22762h(this);
        this.f62678az = 0.0f;
        this.f62655aB = 1;
    }

    /* renamed from: C */
    public void mo28022C(C22766l lVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo28023E(Bundle bundle) {
        throw null;
    }

    /* renamed from: I */
    public boolean mo28024I() {
        throw null;
    }

    /* renamed from: J */
    public boolean mo28025J() {
        throw null;
    }

    /* renamed from: K */
    public boolean mo28026K() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo28027L() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo28028M() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo28029N() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract boolean mo28030O();

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo28031P(int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo28032Q(int i) {
        throw null;
    }

    /* renamed from: R */
    public void mo28033R(int i) {
        throw null;
    }

    /* renamed from: S */
    public void mo28034S(PrintWriter printWriter) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final Bundle mo28035U() {
        C58976aa aaVar = C58975e.f156826a;
        Bundle bundle = new Bundle();
        if (this.f62656aC == 3) {
            bundle.putBoolean("open", true);
        }
        if (mo28024I()) {
            bundle.putParcelable("android:viewHierarchyState", this.f62668ap);
        } else {
            bundle.putParcelable("android:viewHierarchyState", this.f62639aa.saveHierarchyState());
        }
        bundle.putBundle("OPTIONS", this.f62666an);
        bundle.putBundle("KEY_SAVED_STATE", this.f62667ao);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final C146710f mo28036V() {
        C58976aa aaVar = C58975e.f156826a;
        mo28040Z(0);
        if (mo28024I()) {
            this.f62668ap = this.f62639aa.saveHierarchyState();
        }
        View view = this.f62640ab;
        if (view != null) {
            try {
                this.f62641ac.removeView(view);
            } catch (Exception e) {
                C59104x c = f62652ad.mo56225c();
                c.mo56378ag(C58975e.f156826a, "wo.OverlayController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48560)).mo56386p("Error removing overlay window");
            }
            this.f62640ab = null;
        }
        C22754ad adVar = this.f62669aq;
        if (adVar != null) {
            adVar.mo27969k((C22752ab) null);
            ViewParent parent = this.f62669aq.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f62669aq);
            }
        }
        mo27986T();
        mo28055p();
        this.f62677ay = true;
        return this.f62675aw;
    }

    /* renamed from: W */
    public final void mo28037W(int i, int i2, long j) {
        long j2 = this.f62672at;
        if (this.f62661ai) {
            i2 = -i2;
        }
        MotionEvent obtain = MotionEvent.obtain(j2, j, i, (float) i2, 0.0f, 0);
        obtain.setSource(4098);
        this.f62669aq.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: X */
    public final void mo28038X() {
        if (mo28029N()) {
            C22754ad adVar = this.f62669aq;
            adVar.mo27965g(adVar.f62615f);
        }
    }

    /* renamed from: Y */
    public final void mo28039Y(C22749a aVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C22757c cVar = (C22757c) aVar;
        int i = cVar.f62637b;
        int i2 = cVar.f62636a;
        mo28032Q(i);
        if (z) {
            this.f62669aq.mo27969k(new C22767m(this));
            this.f62669aq.mo27967i(new C22757c(1, 0));
            return;
        }
        this.f62669aq.mo27967i(new C22757c(i, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final void mo28040Z(int i) {
        int i2 = this.f62654aA;
        int i3 = i2 & 1;
        int i4 = 2;
        int i5 = i2 & 2;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = this.f62663ak >= 4 ? (i & 1) != 0 : this.f62669aq.getWindowVisibility() == 0;
        boolean z2 = (i & 2) != 0 || (z && mo28027L());
        int i6 = (z || z2) ? 1 : 0;
        if (true != z2) {
            i4 = 0;
        }
        this.f62654aA = i4 | i6;
        if (i3 == 0 && i6 != 0) {
            mo28044ad();
            mo28061v();
        }
        if (i5 == 0) {
            if (z2) {
                mo28059t();
            }
        } else if (!z2) {
            mo28058s();
        }
        if (i3 != 0 && i6 == 0) {
            mo28062w();
            if (mo28024I()) {
                Bundle bundle = new Bundle();
                this.f62667ao = bundle;
                mo28060u(bundle);
            }
            mo28044ad();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final void mo28041aa(C146710f fVar) {
        this.f62675aw = fVar;
        mo28064y(true);
    }

    /* renamed from: ab */
    public final void mo28042ab(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f62639aa.clearFlags(24);
        } else {
            this.f62639aa.addFlags(24);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo28043ac(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62653a = z;
        if (this.f62676ax) {
            mo28044ad();
            return;
        }
        WindowManager.LayoutParams attributes = this.f62639aa.getAttributes();
        float f = attributes.alpha;
        attributes.alpha = true != z ? 1.0f : 0.0f;
        if (f != attributes.alpha) {
            this.f62639aa.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final void mo28044ad() {
        View view = this.f62640ab;
        if (view != null) {
            int i = this.f62654aA & 1;
            int i2 = 0;
            if (this.f62676ax) {
                if (i == 0 || this.f62653a) {
                    i2 = 4;
                }
                view.setVisibility(i2);
            } else if (i != 0) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final boolean mo28045ae() {
        int i = this.f62656aC;
        return i == 3 || i == 4;
    }

    /* renamed from: af */
    public final boolean mo28046af() {
        return (this.f62654aA & 2) == 2;
    }

    /* renamed from: ag */
    public final void mo28047ag(int i) {
        if (this.f62656aC != i) {
            this.f62656aC = i;
            mo28033R(i);
        }
    }

    /* renamed from: e */
    public void mo28048e(C22749a aVar) {
        if (mo28045ae()) {
            C58976aa aaVar = C58975e.f156826a;
            C22757c cVar = (C22757c) aVar;
            int i = cVar.f62637b;
            int i2 = cVar.f62636a;
            if (i == 2) {
                i = this.f62656aC == 4 ? 1 : 2;
            }
            mo28031P(i);
            C22754ad adVar = this.f62669aq;
            C22757c cVar2 = new C22757c(i, i2);
            int i3 = cVar2.f62636a;
            if (i3 <= 0) {
                i3 = 750;
            }
            adVar.f62607D = 2;
            int i4 = cVar2.f62637b - 1;
            if (i4 == 0) {
                i3 = 0;
            } else if (i4 == 3) {
                adVar.mo27963e();
                adVar.f62613d.animate().setDuration((long) i3).setInterpolator(C22754ad.f62603c).setUpdateListener(new C22777w(adVar)).alpha(0.0f).withEndAction(new C22778x(adVar));
                mo27986T();
            }
            adVar.mo27961c(i3);
            mo27986T();
        }
    }

    /* renamed from: g */
    public void mo28049g(Bundle bundle) {
        throw null;
    }

    public final Object getSystemService(String str) {
        WindowManager windowManager;
        if (!"window".equals(str) || (windowManager = this.f62641ac) == null) {
            return super.getSystemService(str);
        }
        return windowManager;
    }

    public final Window getWindow() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo28052k() {
        throw null;
    }

    /* renamed from: n */
    public void mo28053n(Bundle bundle, Bundle bundle2) {
        throw null;
    }

    /* renamed from: o */
    public void mo28054o() {
        throw null;
    }

    public void onWindowFocusChanged(boolean z) {
        Build.VERSION.CODENAME.equals("Q");
        if (mo28046af()) {
            mo28063x(z);
        }
    }

    /* renamed from: p */
    public void mo28055p() {
        throw null;
    }

    /* renamed from: q */
    public void mo28056q() {
        throw null;
    }

    /* renamed from: r */
    public void mo28057r(float f) {
        throw null;
    }

    /* renamed from: s */
    public void mo28058s() {
        throw null;
    }

    /* renamed from: t */
    public void mo28059t() {
        throw null;
    }

    /* renamed from: u */
    public void mo28060u(Bundle bundle) {
        throw null;
    }

    /* renamed from: v */
    public void mo28061v() {
        throw null;
    }

    /* renamed from: w */
    public void mo28062w() {
        throw null;
    }

    /* renamed from: x */
    public void mo28063x(boolean z) {
        throw null;
    }

    /* renamed from: y */
    public void mo28064y(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo28065z() {
        throw null;
    }
}
