package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82044d;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58390dg;
import com.google.common.p4575r.C60752i;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.bl */
/* compiled from: PG */
final class C82084bl {

    /* renamed from: n */
    public static final /* synthetic */ int f224386n = 0;

    /* renamed from: o */
    private static final Interpolator f224387o = new PathInterpolator(0.08f, 1.0f, 0.33f, 1.0f);

    /* renamed from: p */
    private static final Interpolator f224388p = new PathInterpolator(0.8f, 0.0f, 1.0f, 0.8f);

    /* renamed from: q */
    private static final Interpolator f224389q = new PathInterpolator(0.43f, 0.62f, 0.4f, 1.0f);

    /* renamed from: A */
    private final View f224390A;

    /* renamed from: B */
    private final View f224391B;

    /* renamed from: C */
    private final View f224392C;

    /* renamed from: D */
    private final View f224393D;

    /* renamed from: E */
    private C82083bk f224394E;

    /* renamed from: F */
    private C147785k f224395F;

    /* renamed from: G */
    private int f224396G;

    /* renamed from: H */
    private int f224397H;

    /* renamed from: I */
    private int f224398I;

    /* renamed from: J */
    private int f224399J;

    /* renamed from: K */
    private final C147783f f224400K;

    /* renamed from: a */
    public boolean f224401a;

    /* renamed from: b */
    public final C83357g f224402b;

    /* renamed from: c */
    public final C83357g f224403c;

    /* renamed from: d */
    public final C83357g f224404d;

    /* renamed from: e */
    public final C83358h f224405e;

    /* renamed from: f */
    public final C83358h f224406f;

    /* renamed from: g */
    public final C22871g f224407g;

    /* renamed from: h */
    public C82083bk f224408h;

    /* renamed from: i */
    public boolean f224409i = true;

    /* renamed from: j */
    public int f224410j;

    /* renamed from: k */
    public float f224411k;

    /* renamed from: l */
    public int f224412l;

    /* renamed from: m */
    public float f224413m;

    /* renamed from: r */
    private final int f224414r;

    /* renamed from: s */
    private final int f224415s;

    /* renamed from: t */
    private final C81819l f224416t;

    /* renamed from: u */
    private final Set f224417u;

    /* renamed from: v */
    private final View f224418v;

    /* renamed from: w */
    private final View f224419w;

    /* renamed from: x */
    private final View f224420x;

    /* renamed from: y */
    private final View f224421y;

    /* renamed from: z */
    private final View f224422z;

    public C82084bl(View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, Context context, C81819l lVar, Set set, C22871g gVar, C147783f fVar) {
        C83361k kVar = new C83361k(false, C81519a.class);
        this.f224402b = kVar;
        C83361k kVar2 = new C83361k(false, C81519a.class);
        this.f224403c = kVar2;
        C83361k kVar3 = new C83361k(0, C81519a.class);
        this.f224404d = kVar3;
        C82083bk bkVar = C82083bk.GONE;
        this.f224408h = bkVar;
        this.f224394E = bkVar;
        this.f224418v = view;
        this.f224419w = view2;
        this.f224420x = view3;
        this.f224421y = view4;
        this.f224422z = view5;
        this.f224390A = view6;
        this.f224391B = view7;
        this.f224392C = view8;
        this.f224393D = view9;
        this.f224416t = lVar;
        this.f224417u = set;
        this.f224407g = gVar;
        this.f224400K = fVar;
        this.f224415s = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_shelf_shadow_middle_gradient_offset);
        this.f224414r = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_shelf_translation_speed);
        this.f224405e = C83349aj.m132656k(kVar, kVar2, C82077be.f224371a);
        this.f224406f = C83349aj.m132656k(kVar, kVar3, C82078bf.f224372a);
    }

    /* renamed from: f */
    private final Interpolator m130358f() {
        return m130364l() ? f224388p : f224387o;
    }

    /* renamed from: g */
    private final C147785k m130359g(float f, float f2, boolean z, Runnable runnable) {
        Interpolator interpolator;
        C82081bi biVar = new C82081bi(this, f, f2);
        C147783f fVar = this.f224400K;
        C147770c cVar = new C147770c(biVar);
        C147794t b = C147794t.m240888b(0.0f, 1.0f);
        if (z) {
            interpolator = f224389q;
        } else {
            interpolator = m130358f();
        }
        b.mo124468c(interpolator);
        b.f398763c = new C147790p(f, f2);
        C147779b bVar = new C147779b(fVar, cVar.mo124447a(b));
        bVar.f398751e = true;
        bVar.f398748b = new C82082bj(this, runnable);
        return bVar.mo124453a();
    }

    /* renamed from: h */
    private final Duration m130360h() {
        if (this.f224401a) {
            return Duration.ZERO;
        }
        if (this.f224394E.equals(C82083bk.GONE)) {
            return Duration.ofMillis(500);
        }
        if (this.f224408h.equals(C82083bk.GONE)) {
            return Duration.ofMillis(300);
        }
        return Duration.ofMillis(500);
    }

    /* renamed from: i */
    private final void m130361i(float f, float f2, float f3) {
        Duration duration;
        Duration duration2;
        C147785k kVar = this.f224395F;
        if (kVar != null) {
            kVar.mo124464f();
        }
        Duration ofMillis = Duration.ofMillis((long) ((Math.abs(f - f2) / (f3 == 0.0f ? (float) this.f224414r : f3)) * 1000.0f));
        if (f3 == 0.0f) {
            duration = m130360h();
        } else {
            if (this.f224401a) {
                duration2 = Duration.ZERO;
            } else {
                duration2 = Duration.ZERO;
            }
            Duration h = m130360h();
            if (ofMillis.compareTo(h) > 0) {
                ofMillis = h;
            }
            duration = (Duration) C58390dg.m89476a(duration2, ofMillis);
        }
        C147785k g = m130359g(f, f2, f3 > 0.0f, new C82080bh(this));
        if (duration.isZero()) {
            g.mo124464f();
            g.mo124461c(1.0f);
            this.f224409i = true;
            C83349aj.m132647b(this.f224407g, this.f224403c, false, "hasRunningAnimation");
        } else {
            g.mo124460b(1.0f, duration);
            C83349aj.m132647b(this.f224407g, this.f224403c, true, "hasRunningAnimation");
        }
        this.f224395F = g;
    }

    /* renamed from: j */
    private final void m130362j() {
        int i = this.f224410j;
        int i2 = this.f224399J;
        if (i != i2) {
            View view = this.f224419w;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams == null || layoutParams.height == i2)) {
                layoutParams.height = i2;
                view.requestLayout();
            }
            this.f224410j = this.f224399J;
            mo75502d();
            this.f224418v.setVisibility(0);
        }
    }

    /* renamed from: k */
    private final void m130363k(C82083bk bkVar) {
        if (!this.f224408h.equals(bkVar)) {
            this.f224394E = this.f224408h;
            this.f224408h = bkVar;
            m130362j();
        }
    }

    /* renamed from: l */
    private final boolean m130364l() {
        return this.f224408h.equals(C82083bk.GONE);
    }

    /* renamed from: m */
    private final boolean m130365m() {
        return ((Boolean) ((C83361k) this.f224403c).f227199b.get()).booleanValue() && (this.f224408h.equals(C82083bk.GONE) ^ this.f224394E.equals(C82083bk.GONE)) && !this.f224409i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo75499a(C82083bk bkVar) {
        int i;
        int i2;
        C82083bk bkVar2 = C82083bk.GONE;
        int ordinal = bkVar.ordinal();
        if (ordinal == 1) {
            return this.f224398I;
        }
        if (ordinal == 2) {
            i = this.f224398I;
            i2 = this.f224397H;
        } else if (ordinal == 3) {
            i = this.f224398I + this.f224397H;
            i2 = this.f224396G;
        } else if (ordinal != 4) {
            return 0;
        } else {
            C81826s sVar = (C81826s) this.f224416t.mo75168u().mo76657c();
            return this.f224410j - (sVar.mo75359a().top + sVar.mo75359a().bottom);
        }
        return i + i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo75500b(C82083bk bkVar, float f) {
        if (this.f224408h.equals(bkVar)) {
            this.f224394E = bkVar;
        }
        this.f224412l = 0;
        m130363k(bkVar);
        C83349aj.m132647b(this.f224407g, this.f224402b, false, "isUserScrolling");
        float max = Math.max(Math.abs(f / 2.0f), (float) this.f224414r);
        this.f224409i = false;
        m130361i(this.f224411k, (float) mo75499a(this.f224408h), max);
    }

    /* renamed from: c */
    public final void mo75501c() {
        boolean z;
        Duration duration;
        if (this.f224399J != this.f224418v.getHeight()) {
            this.f224399J = this.f224418v.getHeight();
            z = true;
        } else {
            z = false;
        }
        int height = this.f224393D.getHeight();
        if (this.f224396G != height) {
            this.f224396G = height;
            z = true;
        }
        int height2 = this.f224392C.getHeight();
        int i = this.f224397H;
        if (i != height2) {
            this.f224397H = height2;
            z = true;
        } else {
            height2 = i;
        }
        if (height2 != 0) {
            int height3 = this.f224391B.getHeight();
            int i2 = this.f224398I;
            if (i2 != height3) {
                this.f224398I = height3;
                z = true;
            } else {
                height3 = i2;
            }
            if (height3 != 0 && z) {
                m130362j();
                if (!((Boolean) ((C83361k) this.f224402b).f227199b.get()).booleanValue()) {
                    C147785k kVar = this.f224395F;
                    if (kVar == null || !kVar.mo124462d()) {
                        mo75503e(this.f224408h);
                        return;
                    }
                    float f = this.f224411k;
                    float a = (float) mo75499a(this.f224408h);
                    C147785k kVar2 = this.f224395F;
                    float f2 = kVar2.f398740a;
                    if (kVar2.mo124462d()) {
                        duration = kVar2.f398741b;
                    } else {
                        duration = Duration.ZERO;
                    }
                    C147785k kVar3 = this.f224395F;
                    if (kVar3 != null) {
                        kVar3.mo124464f();
                    }
                    float interpolation = m130358f().getInterpolation(f2);
                    float abs = interpolation != 1.0f ? Math.abs(f - a) / (1.0f - interpolation) : 0.0f;
                    int i3 = f > a ? 1 : -1;
                    Duration ofMillis = Duration.ofMillis((long) (((float) duration.toMillis()) * (1.0f - f2)));
                    C147785k g = m130359g((((float) i3) * abs) + a, a, false, new C82079bg(this));
                    if (ofMillis.isZero()) {
                        g.mo124464f();
                        g.mo124461c(1.0f);
                        this.f224409i = true;
                        C83349aj.m132647b(this.f224407g, this.f224403c, false, "hasRunningAnimation");
                    } else {
                        g.mo124459a(f2, 1.0f, ofMillis);
                        C83349aj.m132647b(this.f224407g, this.f224403c, true, "hasRunningAnimation");
                    }
                    this.f224395F = g;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo75502d() {
        float f;
        float f2 = (((float) this.f224410j) - this.f224411k) - this.f224413m;
        this.f224419w.setTranslationY(f2);
        this.f224390A.setTranslationY(f2);
        float f3 = f2 + ((float) this.f224415s);
        int height = this.f224420x.getHeight();
        int height2 = this.f224421y.getHeight();
        this.f224420x.setTranslationY(f3 - ((float) height));
        this.f224421y.setTranslationY(f3);
        this.f224422z.setTranslationY(f3 + ((float) height2));
        float f4 = this.f224413m * (true != m130365m() ? 0.89f : 1.0f);
        float f5 = this.f224411k;
        float f6 = 0.0f;
        if (m130365m() || m130364l()) {
            f = C60752i.m92727a(f5 - ((float) Math.max(mo75499a(this.f224408h), mo75499a(this.f224394E))), -3.4028235E38f, 0.0f) + f4;
        } else if (this.f224408h.equals(C82083bk.SINGLE_CONTENT) || this.f224408h.equals(C82083bk.DOUBLE_CONTENT)) {
            f = C60752i.m92727a((f5 - ((float) mo75499a(this.f224408h))) + f4, -3.4028235E38f, 0.0f);
        } else {
            f = 0.0f;
        }
        float f7 = -f;
        for (C82044d l : this.f224417u) {
            l.mo75208l(f7);
        }
        float f8 = this.f224411k;
        if (m130365m() || m130364l()) {
            f6 = C60752i.m92727a(f8 - ((float) Math.max(mo75499a(this.f224408h), mo75499a(this.f224394E))), -3.4028235E38f, 0.0f) + f4;
        } else if (this.f224408h.equals(C82083bk.SINGLE_CONTENT) || this.f224408h.equals(C82083bk.DOUBLE_CONTENT)) {
            f6 = C60752i.m92727a((f8 - ((float) mo75499a(this.f224408h))) + f4, -3.4028235E38f, 0.0f);
        }
        this.f224391B.setTranslationY(-f6);
        float f9 = this.f224411k;
        float min = Math.min(f9, (float) mo75499a(C82083bk.DOUBLE_CONTENT)) + f4;
        if (this.f224408h.equals(C82083bk.FULL_SCREEN) && ((Boolean) ((C83361k) this.f224402b).f227199b.get()).booleanValue()) {
            min -= ((float) Math.max(mo75499a(this.f224408h), mo75499a(this.f224394E))) - f9;
        }
        this.f224392C.setTranslationY(-min);
        this.f224393D.setTranslationY(-(this.f224411k + f4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo75503e(C82083bk bkVar) {
        this.f224409i = this.f224408h.equals(bkVar);
        m130363k(bkVar);
        if (this.f224410j != 0) {
            m130361i(this.f224411k, (float) mo75499a(this.f224408h), 0.0f);
        }
    }
}
