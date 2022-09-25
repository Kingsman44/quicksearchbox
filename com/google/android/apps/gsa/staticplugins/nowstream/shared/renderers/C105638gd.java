package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105428aa;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105431ad;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.gd */
/* compiled from: PG */
public final class C105638gd extends C22939d {

    /* renamed from: a */
    public static final C59071e f294719a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.gd");

    /* renamed from: b */
    public static final Interpolator f294720b = C91107f.m148859b(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: p */
    private static final Interpolator f294721p = C91107f.m148859b(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c */
    public final C105431ad f294722c;

    /* renamed from: d */
    public final C105428aa f294723d;

    /* renamed from: e */
    public final Context f294724e;

    /* renamed from: f */
    public final C91820a f294725f;

    /* renamed from: g */
    C9251ef f294726g;

    /* renamed from: h */
    TouchInterceptingFrameLayout f294727h;

    /* renamed from: i */
    ViewGroup f294728i;

    /* renamed from: j */
    AnimatorListenerAdapter f294729j;

    /* renamed from: k */
    AnimatorListenerAdapter f294730k;

    /* renamed from: l */
    ViewPropertyAnimator f294731l;

    /* renamed from: m */
    public TextView f294732m;

    /* renamed from: n */
    public final int f294733n;

    /* renamed from: o */
    ImageView f294734o;

    /* renamed from: q */
    private final C105637gc f294735q = new C105637gc(this);

    /* renamed from: r */
    private final C91825b f294736r;

    public C105638gd(C22945j jVar, C105431ad adVar, Context context, C105428aa aaVar, C91825b bVar, C91820a aVar) {
        super(jVar);
        this.f294722c = adVar;
        this.f294724e = context;
        this.f294723d = aaVar;
        this.f294736r = bVar;
        this.f294725f = aVar;
        this.f294733n = context.getResources().getDimensionPixelSize(R.dimen.tooltip_translate_animation_dist);
    }

    /* renamed from: e */
    public final void mo94942e(boolean z) {
        if (this.f294726g != null && this.f294731l != null) {
            this.f294729j = new C105636gb(this, z);
            this.f294731l.alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(240).setInterpolator(f294721p).setListener(this.f294729j);
        }
    }

    /* renamed from: g */
    public final void mo94943g(boolean z) {
        ImageView imageView = (ImageView) this.f294727h.findViewById(R.id.tooltip_arrow_top_start);
        int i = R.drawable.tooltip_arrow_up_dark;
        imageView.setImageResource(z ? R.drawable.tooltip_arrow_up_dark : R.drawable.tooltip_arrow_up);
        ImageView imageView2 = (ImageView) this.f294727h.findViewById(R.id.tooltip_arrow_top_center);
        if (true != z) {
            i = R.drawable.tooltip_arrow_up;
        }
        imageView2.setImageResource(i);
        ((ImageView) this.f294727h.findViewById(R.id.tooltip_arrow_top_end)).setImageResource(i);
        this.f294727h.findViewById(R.id.tooltip_content).setBackgroundResource(true != z ? R.drawable.tooltip_background : R.drawable.tooltip_background_dark);
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f294736r.mo86304c(this.f294735q);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ((C23249a) this.f294722c.mo94658c()).mo28726b(new C105630fw(this));
        ((C23249a) this.f294722c.mo94657b()).mo28726b(new C105631fx(this));
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) LayoutInflater.from(this.f294724e).inflate(R.layout.tooltip_on_monet, (ViewGroup) null);
        this.f294727h = touchInterceptingFrameLayout;
        touchInterceptingFrameLayout.setOnTouchListener(new C105632fy(this));
        ViewGroup viewGroup = (ViewGroup) this.f294727h.findViewById(R.id.tooltip);
        this.f294728i = viewGroup;
        this.f294732m = (TextView) viewGroup.findViewById(R.id.content_container);
        this.f294734o = (ImageView) this.f294728i.findViewById(R.id.button);
        mo28295iC(this.f294727h);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f294736r.mo86302a(this.f294735q);
    }
}
