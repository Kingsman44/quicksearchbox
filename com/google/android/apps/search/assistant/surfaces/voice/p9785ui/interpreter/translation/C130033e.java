package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.animation.ObjectAnimator;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.e */
/* compiled from: PG */
public final class C130033e {

    /* renamed from: a */
    public static final C59071e f356576a = C59071e.m91331h();

    /* renamed from: b */
    public final Duration f356577b;

    /* renamed from: c */
    public final Interpolator f356578c = new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    public ObjectAnimator f356579d;

    /* renamed from: e */
    public boolean f356580e;

    /* renamed from: f */
    private final C130030b f356581f;

    /* renamed from: g */
    private final int f356582g;

    /* renamed from: h */
    private final int f356583h;

    /* renamed from: i */
    private final Duration f356584i;

    /* renamed from: j */
    private final Duration f356585j;

    /* renamed from: k */
    private final int f356586k;

    /* renamed from: l */
    private final int f356587l;

    /* renamed from: m */
    private final int f356588m;

    public C130033e(C130030b bVar) {
        this.f356581f = bVar;
        this.f356582g = bVar.getResources().getDimensionPixelSize(R.dimen.assistant_auto_listening_box_min_width);
        this.f356583h = bVar.getResources().getDimensionPixelSize(R.dimen.assistant_auto_listening_box_max_width);
        Duration ofMillis = Duration.ofMillis((long) bVar.getResources().getInteger(R.integer.assistant_listening_boxes_min_delay_millis));
        C69664n.m101060f(ofMillis, "ofMillis(\n      fragment…ay_millis).toLong()\n    )");
        this.f356584i = ofMillis;
        Duration ofMillis2 = Duration.ofMillis((long) bVar.getResources().getInteger(R.integer.assistant_listening_boxes_max_delay_millis));
        C69664n.m101060f(ofMillis2, "ofMillis(\n      fragment…ay_millis).toLong()\n    )");
        this.f356585j = ofMillis2;
        this.f356586k = bVar.getResources().getDimensionPixelSize(R.dimen.assistant_interpreter_auto_listening_horizontal_separation);
        this.f356587l = bVar.getResources().getDimensionPixelSize(R.dimen.assistant_interpreter_auto_listening_vertical_separation);
        Duration ofMillis3 = Duration.ofMillis((long) bVar.getResources().getInteger(R.integer.assistant_listening_boxes_fade_in_duration_millis));
        C69664n.m101060f(ofMillis3, "ofMillis(\n      fragment…)\n        .toLong()\n    )");
        this.f356577b = ofMillis3;
        this.f356588m = bVar.getResources().getDimensionPixelSize(R.dimen.assistant_interpreter_auto_listening_box_height);
    }

    /* renamed from: c */
    private final FlexboxLayout m212297c() {
        View findViewById = this.f356581f.requireView().findViewById(R.id.assistant_interpreter_listening_boxes_view);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ter_listening_boxes_view)");
        return (FlexboxLayout) findViewById;
    }

    /* renamed from: a */
    public final ImageView mo109438a() {
        View findViewById = this.f356581f.requireView().findViewById(R.id.assistant_interpreter_auto_listening_box_language_name);
        C69664n.m101060f(findViewById, "fragment\n        .requir…tening_box_language_name)");
        return (ImageView) findViewById;
    }

    /* renamed from: b */
    public final void mo109439b() {
        double random = Math.random();
        double d = (double) (this.f356583h - this.f356582g);
        Double.isNaN(d);
        double d2 = d * random;
        if (!Double.isNaN(d2)) {
            int round = (d2 > 2.147483647E9d ? Integer.MAX_VALUE : d2 < -2.147483648E9d ? LinearLayoutManager.INVALID_OFFSET : (int) Math.round(d2)) + this.f356582g;
            Duration plus = this.f356585j.minus(this.f356584i).multipliedBy((long) random).plus(this.f356584i);
            C69664n.m101060f(plus, "delay");
            if (m212297c().getChildCount() < 50) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.f356581f.requireContext());
                appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                appCompatImageView.setImageDrawable(this.f356581f.requireContext().getDrawable(R.drawable.assistant_interpreter_auto_listening_box));
                appCompatImageView.setBackgroundResource(0);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(round, this.f356588m);
                layoutParams.setMargins(0, 0, this.f356586k, this.f356587l);
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, View.ALPHA, new float[]{0.0f, 0.25f});
                ofFloat.setDuration(this.f356577b.toMillis());
                ofFloat.setInterpolator(this.f356578c);
                ofFloat.setRepeatCount(0);
                ofFloat.setStartDelay(plus.toMillis());
                ofFloat.addListener(new C130031c(appCompatImageView, this));
                ofFloat.start();
                this.f356579d = ofFloat;
                m212297c().addView(appCompatImageView);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
