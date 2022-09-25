package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class InterpreterListeningBoxesView extends FlexboxLayout {

    /* renamed from: a */
    public static final C59071e f314747a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterListeningBoxesView");

    /* renamed from: b */
    public View f314748b;

    /* renamed from: c */
    public boolean f314749c;

    /* renamed from: d */
    public int f314750d = 50;

    /* renamed from: e */
    private final int f314751e;

    /* renamed from: f */
    private final int f314752f;

    /* renamed from: g */
    private final int f314753g;

    /* renamed from: h */
    private final int f314754h;

    public InterpreterListeningBoxesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_listening_boxes, this, true);
        this.f314751e = context.getResources().getDimensionPixelSize(R.dimen.auto_listening_box_min_width);
        this.f314752f = context.getResources().getDimensionPixelSize(R.dimen.auto_listening_box_max_width);
        this.f314753g = context.getResources().getInteger(R.integer.listening_boxes_min_delay_millis);
        this.f314754h = context.getResources().getInteger(R.integer.listening_boxes_max_delay_millis);
    }

    /* renamed from: A */
    private final void m188181A(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.interpreter_fade_out);
        loadAnimation.setAnimationListener(new C113709z(view));
        view.startAnimation(loadAnimation);
    }

    /* renamed from: a */
    public final void mo100409a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314749c) {
            this.f314749c = false;
            View view = this.f314748b;
            if (view != null) {
                m188181A(view);
            }
            m188181A(this);
        }
    }

    /* renamed from: b */
    public final void mo100410b() {
        double random = Math.random();
        double d = (double) (this.f314752f - this.f314751e);
        Double.isNaN(d);
        long round = Math.round(d * random);
        int i = this.f314751e;
        double d2 = (double) (this.f314754h - this.f314753g);
        Double.isNaN(d2);
        postDelayed(new C113708y(this, ((int) round) + i), Math.round(d2 * random) + ((long) this.f314753g));
    }
}
