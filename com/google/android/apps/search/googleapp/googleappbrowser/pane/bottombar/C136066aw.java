package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44194a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.aw */
/* compiled from: PG */
public final class C136066aw implements C136039a, C44194a, C43854a {

    /* renamed from: l */
    private static final C59071e f370562l = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.aw");

    /* renamed from: m */
    private static final Duration f370563m = Duration.ofMillis(250);

    /* renamed from: a */
    public final boolean f370564a;

    /* renamed from: b */
    public final boolean f370565b;

    /* renamed from: c */
    public final Optional f370566c;

    /* renamed from: d */
    public final LockableBottomSheetBehavior f370567d;

    /* renamed from: e */
    public boolean f370568e;

    /* renamed from: f */
    public boolean f370569f;

    /* renamed from: g */
    public boolean f370570g;

    /* renamed from: h */
    public float f370571h = 0.0f;

    /* renamed from: i */
    public BottomSheetPlaceholderView f370572i;

    /* renamed from: j */
    public View f370573j;

    /* renamed from: k */
    public View f370574k;

    /* renamed from: n */
    private final boolean f370575n;

    /* renamed from: o */
    private final int f370576o;

    /* renamed from: p */
    private final C60888db f370577p;

    /* renamed from: q */
    private C136065av f370578q = C136065av.NOT_ANIMATING;

    /* renamed from: r */
    private boolean f370579r;

    /* renamed from: s */
    private C60872cz f370580s;

    public C136066aw(Context context, boolean z, Optional optional, LockableBottomSheetBehavior lockableBottomSheetBehavior, C60888db dbVar, boolean z2, boolean z3) {
        this.f370564a = z;
        this.f370575n = z2;
        this.f370565b = z3;
        this.f370566c = optional;
        this.f370567d = lockableBottomSheetBehavior;
        this.f370577p = dbVar;
        lockableBottomSheetBehavior.f115861D = !z3;
        this.f370576o = context.getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottomBarElevation);
    }

    /* renamed from: A */
    private final void m221025A(int i) {
        BottomSheetPlaceholderView bottomSheetPlaceholderView = this.f370572i;
        if (bottomSheetPlaceholderView != null) {
            if (!this.f370575n || this.f370579r) {
                bottomSheetPlaceholderView.mo17754z().mo112727a(i);
            }
        }
    }

    /* renamed from: y */
    private final int m221027y() {
        return this.f370567d.mo47504A() - this.f370576o;
    }

    /* renamed from: z */
    private final void m221028z() {
        View view = this.f370574k;
        if (view != null && this.f370565b) {
            this.f370567d.f115861D = true;
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo112532a(View view, float f) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112533b(View view, int i) {
    }

    /* renamed from: c */
    public final void mo46850c(int i) {
        this.f370579r = i == 0;
    }

    /* renamed from: d */
    public final void mo47130d(float f) {
        this.f370571h = f;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo112536e(View view) {
    }

    /* renamed from: f */
    public final void mo112537f(View view) {
        this.f370569f = true;
    }

    /* renamed from: g */
    public final void mo112538g(View view) {
        ((C59052c) ((C59052c) f370562l.mo56224b()).mo56372aa(40668)).mo56386p("On collapse");
        m221025A(m221027y());
        this.f370567d.f115859B = false;
        this.f370578q = C136065av.NOT_ANIMATING;
    }

    /* renamed from: h */
    public final void mo112539h(View view) {
        m221025A(this.f370575n ? m221027y() : 0);
        this.f370578q = C136065av.NOT_ANIMATING;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo112540i(View view) {
    }

    /* renamed from: j */
    public final void mo112541j() {
        int i = 0;
        this.f370568e = false;
        this.f370569f = false;
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.f370567d;
        boolean z = this.f370565b;
        lockableBottomSheetBehavior.f115861D = !z;
        View view = this.f370574k;
        if (view != null) {
            view.setVisibility(true != z ? 0 : 4);
        }
        BottomSheetPlaceholderView bottomSheetPlaceholderView = this.f370572i;
        if (bottomSheetPlaceholderView != null) {
            C136069az a = bottomSheetPlaceholderView.mo17754z();
            if (!this.f370564a) {
                i = m221027y();
            }
            a.mo112727a(i);
        }
    }

    /* renamed from: k */
    public final void mo112542k(View view) {
        m221025A(this.f370575n ? m221027y() : m221026x());
        this.f370567d.f115859B = false;
        m221028z();
        this.f370578q = C136065av.NOT_ANIMATING;
    }

    /* renamed from: l */
    public final /* synthetic */ void mo112543l(View view) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo112544m(View view) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo112545n(View view) {
    }

    /* renamed from: o */
    public final void mo112546o(View view) {
        m221025A(m221026x());
        this.f370567d.f115859B = false;
        m221028z();
        this.f370578q = C136065av.NOT_ANIMATING;
    }

    /* renamed from: p */
    public final /* synthetic */ void mo112547p(float f) {
    }

    /* renamed from: q */
    public final void mo112548q(float f) {
        m221025A(this.f370575n ? m221027y() : m221026x());
    }

    /* renamed from: r */
    public final void mo112549r(float f) {
        m221025A(this.f370575n ? m221027y() : 0);
    }

    /* renamed from: t */
    public final void mo112551t() {
        m221025A(m221027y());
    }

    /* renamed from: u */
    public final void mo112552u() {
        m221025A(this.f370575n ? m221027y() : m221026x());
    }

    /* renamed from: v */
    public final void mo47131v(float f) {
        this.f370571h = f;
    }

    /* renamed from: w */
    public final void mo46851w(int i) {
        if (!this.f370570g) {
            C136065av avVar = i == 0 ? C136065av.ANIMATE_LATER : C136065av.ANIMATE_HIDDEN;
            if (this.f370572i != null && this.f370578q != avVar) {
                this.f370578q = avVar;
                C60872cz czVar = this.f370580s;
                if (czVar != null) {
                    czVar.cancel(false);
                }
                this.f370580s = this.f370577p.mo29164d(new C136064au(this, avVar), f370563m.toMillis(), TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: x */
    private final int m221026x() {
        View view = this.f370573j;
        view.getClass();
        return ((int) (((float) view.getHeight()) * this.f370567d.f115914y)) - this.f370576o;
    }

    /* renamed from: s */
    public final void mo112550s(float f) {
        int i;
        if (this.f370575n) {
            i = m221027y();
        } else {
            int y = m221027y();
            View view = this.f370573j;
            view.getClass();
            i = Math.min((int) (((float) y) + (((float) ((view.getHeight() - this.f370567d.mo47523z()) - y)) * f)), m221026x());
        }
        m221025A(i);
    }
}
