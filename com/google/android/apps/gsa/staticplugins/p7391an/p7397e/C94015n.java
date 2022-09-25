package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105481ai;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a.C93981e;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a.C93984h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.n */
/* compiled from: PG */
public final class C94015n {

    /* renamed from: a */
    public final FrameLayout f262592a;

    /* renamed from: b */
    public final C94010i f262593b;

    /* renamed from: c */
    public View f262594c;

    /* renamed from: d */
    public View f262595d;

    /* renamed from: e */
    public C94009h f262596e;

    /* renamed from: f */
    public final int f262597f;

    /* renamed from: g */
    public int f262598g;

    /* renamed from: h */
    public View.OnClickListener f262599h;

    /* renamed from: i */
    public Rect f262600i;

    /* renamed from: j */
    public boolean f262601j = true;

    /* renamed from: k */
    public boolean f262602k;

    /* renamed from: l */
    public boolean f262603l;

    /* renamed from: m */
    public boolean f262604m;

    /* renamed from: n */
    public int f262605n;

    /* renamed from: o */
    public int f262606o = 300;

    /* renamed from: p */
    public boolean f262607p = true;

    /* renamed from: q */
    public boolean f262608q;

    /* renamed from: r */
    public boolean f262609r = true;

    /* renamed from: s */
    public boolean f262610s;

    /* renamed from: t */
    public boolean f262611t;

    /* renamed from: u */
    public Runnable f262612u;

    /* renamed from: v */
    public boolean f262613v;

    /* renamed from: w */
    public C93981e f262614w;

    /* renamed from: x */
    private View.OnAttachStateChangeListener f262615x;

    public C94015n(Context context, C94010i iVar) {
        this.f262593b = iVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f262592a = frameLayout;
        frameLayout.setId(R.id.now_header_doodle_view);
        int color = context.getResources().getColor(R.color.quantum_grey700);
        this.f262597f = color;
        this.f262598g = color;
        frameLayout.setVisibility(4);
    }

    /* renamed from: a */
    public final ViewGroup mo88290a() {
        if (this.f262615x == null) {
            C94012k kVar = new C94012k(this);
            this.f262615x = kVar;
            this.f262592a.addOnAttachStateChangeListener(kVar);
        }
        return this.f262592a;
    }

    /* renamed from: b */
    public final void mo88291b() {
        if (!mo88296g((DoodleData) null)) {
            C94009h hVar = this.f262596e;
            if (hVar != null) {
                hVar.mo88281d();
                this.f262596e = null;
            }
            mo88297h(this.f262594c, this.f262597f);
        }
    }

    /* renamed from: c */
    public final void mo88292c() {
        C94009h hVar = this.f262596e;
        if (hVar != null) {
            hVar.mo88281d();
            this.f262596e = null;
        }
    }

    /* renamed from: d */
    public final void mo88293d() {
        if (!this.f262607p) {
            C58976aa aaVar = C58975e.f156826a;
            this.f262608q = true;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C94009h hVar = this.f262596e;
        if (hVar != null) {
            int i = hVar.f262571n;
            if (this.f262603l) {
                if (i == 14) {
                    i = 46;
                } else if (i == 15) {
                    i = 47;
                } else if (i == 45) {
                    i = 48;
                }
            }
            hVar.f262563f.mo84538a(this.f262595d, hVar.f262559b.f252936b, i);
        } else if (this.f262609r) {
            C89949q.m146522f(this.f262595d);
        }
        this.f262608q = false;
    }

    /* renamed from: e */
    public final void mo88294e() {
        this.f262610s = true;
        C94009h hVar = this.f262596e;
        if (hVar != null) {
            hVar.mo88283f();
        }
    }

    /* renamed from: f */
    public final void mo88295f() {
        this.f262610s = false;
        C94009h hVar = this.f262596e;
        if (hVar != null) {
            C94007f fVar = hVar.f262574q;
            if (fVar != null) {
                fVar.mo88277b();
            }
            hVar.f262572o = false;
        }
    }

    /* renamed from: g */
    public final boolean mo88296g(DoodleData doodleData) {
        if (doodleData == null && this.f262596e == null && this.f262594c.getAlpha() > 0.0f && this.f262592a.getVisibility() == 4) {
            return true;
        }
        C94009h hVar = this.f262596e;
        if (hVar == null || !C58832aw.m90831a(doodleData, hVar.f262559b) || this.f262592a.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo88297h(View view, int i) {
        if (this.f262611t) {
            C58976aa aaVar = C58975e.f156826a;
            this.f262612u = new C94011j(this, view, i);
            return;
        }
        this.f262612u = null;
        C58976aa aaVar2 = C58975e.f156826a;
        boolean z = false;
        for (int i2 = 0; i2 < this.f262592a.getChildCount(); i2++) {
            View childAt = this.f262592a.getChildAt(i2);
            if (childAt != view) {
                childAt.animate().alpha(0.0f).setDuration((long) this.f262606o).setListener(new C94014m(this, childAt));
            }
        }
        if (view != null) {
            View view2 = this.f262594c;
            if (view != view2) {
                if (view.getParent() == null) {
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 81));
                    }
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    this.f262592a.addView(view);
                }
                this.f262594c.animate().alpha(0.0f).setDuration((long) this.f262606o).setListener((Animator.AnimatorListener) null);
                C28295m.m52919e(this.f262594c, (C28292j) null);
                this.f262592a.setVisibility(0);
            } else {
                C28295m.m52919e(view2, new C28292j(53));
                this.f262592a.setVisibility(4);
            }
            view.animate().alpha(1.0f).setDuration((long) this.f262606o).setListener((Animator.AnimatorListener) null);
        }
        if (this.f262596e == null) {
            i = this.f262597f;
        }
        this.f262598g = i;
        View.OnClickListener onClickListener = this.f262599h;
        if (onClickListener != null) {
            this.f262592a.setOnClickListener(onClickListener);
        }
        mo88293d();
        C93981e eVar = this.f262614w;
        if (eVar != null) {
            if (view != this.f262594c) {
                z = true;
            }
            C93984h hVar = eVar.f262450a;
            hVar.f262462h = z;
            C105481ai aiVar = hVar.f262464j;
            if (aiVar != null) {
                aiVar.f294225a.f294226a.mo94841k();
            }
            if (eVar.f262450a.f63126Q.mo28316z()) {
                C93984h hVar2 = eVar.f262450a;
                hVar2.f262456b.mo88251f(hVar2.f262462h);
            }
        }
    }
}
