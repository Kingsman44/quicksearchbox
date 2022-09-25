package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83417f;
import com.google.android.apps.gsa.now.shared.p6421ui.CrossfadingWebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.material.aspectratio.FixedAspectRatioFrameLayout;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.n */
/* compiled from: PG */
public final class C105013n implements C91890n {

    /* renamed from: a */
    public final C91189au f292595a;

    /* renamed from: b */
    public final CrossfadingWebImageView f292596b;

    /* renamed from: c */
    public final View f292597c;

    /* renamed from: d */
    public final View f292598d;

    /* renamed from: e */
    public final View f292599e;

    /* renamed from: f */
    public String f292600f;

    /* renamed from: g */
    public String f292601g;

    /* renamed from: h */
    public boolean f292602h;

    /* renamed from: i */
    private final C22871g f292603i;

    /* renamed from: j */
    private final FixedAspectRatioFrameLayout f292604j;

    /* renamed from: k */
    private final View f292605k;

    /* renamed from: l */
    private final View f292606l;

    /* renamed from: m */
    private final View f292607m;

    /* renamed from: n */
    private final TextView f292608n;

    /* renamed from: o */
    private final View f292609o;

    /* renamed from: p */
    private final TextView f292610p;

    /* renamed from: q */
    private boolean f292611q;

    /* renamed from: r */
    private C60870cx f292612r;

    /* renamed from: s */
    private int f292613s;

    public C105013n(Context context, C91189au auVar, C22871g gVar, View view, boolean z, C58881cr crVar) {
        View view2;
        View view3;
        TextView textView;
        this.f292595a = auVar;
        this.f292603i = gVar;
        this.f292604j = (FixedAspectRatioFrameLayout) view.findViewById(R.id.photo_frame);
        this.f292605k = view.findViewById(R.id.photo_padding);
        this.f292606l = view.findViewWithTag(context.getString(R.string.video_rounded_corner_frame));
        View view4 = null;
        if (z) {
            view2 = null;
        } else {
            view2 = view.findViewById(R.id.video_black_overlay_for_transition);
        }
        this.f292607m = view2;
        this.f292596b = (CrossfadingWebImageView) view.findViewById(R.id.photo);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.media_icon_animated_layout);
        LayoutTransition layoutTransition = viewGroup != null ? viewGroup.getLayoutTransition() : null;
        boolean z2 = false;
        if (layoutTransition != null) {
            layoutTransition.setAnimateParentHierarchy(false);
        }
        if (z) {
            view3 = null;
        } else {
            view3 = view.findViewById(R.id.video_interception_view);
        }
        this.f292599e = view3;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.load_indicator_small_container);
        LayoutTransition layoutTransition2 = viewGroup2 != null ? viewGroup2.getLayoutTransition() : null;
        if (layoutTransition2 != null) {
            layoutTransition2.setAnimateParentHierarchy(false);
        }
        if (z) {
            textView = null;
        } else {
            textView = (TextView) view.findViewById(R.id.preview_label);
        }
        this.f292610p = textView;
        this.f292608n = (TextView) view.findViewById(R.id.media_caption_fv2);
        View findViewById = view.findViewById(R.id.launch_on_3P_app_icon);
        this.f292609o = findViewById;
        m174156j(0, viewGroup2);
        if (((CardRenderingContext) crVar.mo6453a()).mo49320o()) {
            m174156j(0, viewGroup);
            this.f292597c = !z ? view.findViewById(R.id.media_icon_animated) : view4;
            this.f292598d = view.findViewById(R.id.load_indicator_small);
        } else {
            this.f292597c = !z ? view.findViewById(R.id.media_icon) : view4;
            this.f292598d = view.findViewById(R.id.load_indicator);
        }
        this.f292613s = 1;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z2 = true;
        }
        this.f292602h = z2;
    }

    /* renamed from: j */
    public static void m174156j(int i, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: k */
    private final void m174157k() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f292612r;
        if (cxVar != null && !cxVar.isDone()) {
            this.f292612r.cancel(true);
            this.f292612r = null;
        }
    }

    /* renamed from: l */
    private final void m174158l() {
        if (this.f292602h) {
            m174156j(0, this.f292609o);
            return;
        }
        m174156j(8, this.f292609o);
    }

    /* renamed from: m */
    private final void m174159m() {
        View view = this.f292599e;
        if (view == null || !view.hasOnClickListeners()) {
            m174156j(8, this.f292599e);
            return;
        }
        m174156j(0, this.f292599e);
    }

    /* renamed from: n */
    private final void m174160n() {
        TextView textView;
        TextView textView2;
        View view;
        View view2 = this.f292606l;
        if (view2 != null) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            if (!(viewGroup == null || viewGroup.getChildAt(0) == (view = this.f292606l))) {
                viewGroup.removeView(view);
                viewGroup.addView(this.f292606l, 0);
            }
            if (!(this.f292608n == null || viewGroup == null || viewGroup.getChildAt(4) == (textView2 = this.f292608n))) {
                viewGroup.removeView(textView2);
                viewGroup.addView(this.f292608n, 4);
            }
            if (this.f292610p != null && viewGroup != null && viewGroup.getChildAt(6) != (textView = this.f292610p)) {
                viewGroup.removeView(textView);
                viewGroup.addView(this.f292610p, 6);
            }
        }
    }

    /* renamed from: o */
    private final void m174161o() {
        TextView textView = this.f292610p;
        if (textView != null) {
            if (!this.f292611q) {
                m174156j(8, textView);
            } else if (this.f292613s == 4) {
                m174156j(0, textView);
            } else {
                m174156j(8, textView);
            }
        }
    }

    /* renamed from: a */
    public final void mo86440a() {
        mo86443d(C59203do.f157270a);
        CrossfadingWebImageView crossfadingWebImageView = this.f292596b;
        if (crossfadingWebImageView != null) {
            crossfadingWebImageView.setImageDrawable((Drawable) null);
        }
        this.f292601g = null;
        this.f292600f = null;
        TextView textView = this.f292608n;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        m174156j(8, this.f292608n, this.f292609o, this.f292610p, this.f292599e, this.f292597c);
        View view = this.f292599e;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.f292602h = false;
        mo86447h(2);
    }

    /* renamed from: b */
    public final void mo86441b(int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        View view = this.f292605k;
        if (view instanceof C83417f) {
            ((C83417f) view).mo76724hc(i);
            ((C83417f) this.f292605k).mo76723hb(i2);
        }
    }

    /* renamed from: c */
    public final void mo86442c(String str) {
        this.f292611q = true;
        TextView textView = this.f292610p;
        if (textView != null) {
            textView.setText(str);
        }
        m174161o();
    }

    /* renamed from: d */
    public final void mo86443d(double d) {
        CrossfadingWebImageView crossfadingWebImageView = this.f292596b;
        if (crossfadingWebImageView != null) {
            crossfadingWebImageView.f227360j = d;
        }
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.f292604j;
        if (fixedAspectRatioFrameLayout != null) {
            fixedAspectRatioFrameLayout.f77355a = d != C59203do.f157270a ? (float) (1.0d / d) : 0.0f;
            fixedAspectRatioFrameLayout.invalidate();
        }
    }

    /* renamed from: e */
    public final boolean mo86444e() {
        return this.f292602h;
    }

    /* renamed from: f */
    public final void mo86445f() {
        this.f292602h = true;
        m174158l();
    }

    /* renamed from: g */
    public final int mo86446g() {
        return this.f292613s;
    }

    /* renamed from: h */
    public final void mo86447h(int i) {
        if (i != this.f292613s) {
            this.f292613s = i;
            C58976aa aaVar = C58975e.f156826a;
            int i2 = i - 1;
            if (i2 == 1) {
                m174156j(0, this.f292604j, this.f292596b, this.f292606l, this.f292597c);
                m174156j(8, this.f292609o, this.f292598d);
                m174156j(4, this.f292607m);
                m174161o();
                m174158l();
                mo94471i();
                m174159m();
                m174160n();
                m174157k();
            } else if (i2 == 2) {
                m174156j(0, this.f292604j, this.f292596b, this.f292597c, this.f292607m, this.f292599e, this.f292606l);
                m174156j(8, this.f292598d, this.f292609o);
                m174161o();
                mo94471i();
                m174160n();
                if (!this.f292611q) {
                    this.f292612r = this.f292603i.mo28208h("showLoadIndicator", 500, new C105012m(this));
                }
            } else if (i2 == 3) {
                m174157k();
                m174156j(0, this.f292607m, this.f292599e);
                m174161o();
                m174156j(8, this.f292609o, this.f292598d);
                View view = this.f292606l;
                if (view != null) {
                    view.bringToFront();
                }
                if (this.f292611q) {
                    mo94471i();
                    TextView textView = this.f292608n;
                    if (textView != null) {
                        textView.bringToFront();
                    }
                    TextView textView2 = this.f292610p;
                    if (textView2 != null) {
                        textView2.bringToFront();
                    }
                }
                View view2 = this.f292599e;
                if (view2 != null) {
                    view2.bringToFront();
                }
            } else if (i2 != 5) {
                m174156j(0, this.f292604j, this.f292596b, this.f292597c);
                m174156j(8, this.f292609o, this.f292598d);
                m174156j(4, this.f292606l, this.f292607m, this.f292599e);
                m174157k();
                m174161o();
                mo94471i();
            } else {
                this.f292602h = true;
                m174156j(0, this.f292604j, this.f292596b, this.f292597c);
                m174156j(8, this.f292609o, this.f292598d, this.f292610p);
                m174156j(4, this.f292607m, this.f292606l);
                View view3 = this.f292609o;
                if (view3 != null && !this.f292611q) {
                    view3.setAlpha(0.0f);
                    this.f292609o.setVisibility(0);
                    this.f292609o.animate().alpha(1.0f);
                }
                m174160n();
                m174161o();
                mo94471i();
                m174159m();
                m174157k();
            }
        }
    }

    /* renamed from: i */
    public final void mo94471i() {
        String str;
        String str2 = this.f292600f;
        if (str2 != null && !str2.isEmpty()) {
            m174156j(0, this.f292608n);
            TextView textView = this.f292608n;
            if (textView != null && textView.getText() != (str = this.f292600f)) {
                this.f292608n.setText(str);
            }
        }
    }
}
