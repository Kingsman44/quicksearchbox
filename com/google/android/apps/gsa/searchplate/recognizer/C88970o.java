package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91119r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.o */
/* compiled from: PG */
public final class C88970o {

    /* renamed from: a */
    public static final Interpolator f241088a = C91107f.m148858a(0.8f, 0.0f);

    /* renamed from: b */
    float f241089b = 0.0f;

    /* renamed from: c */
    final ImageView f241090c;

    /* renamed from: d */
    Drawable f241091d;

    /* renamed from: e */
    final Drawable f241092e;

    /* renamed from: f */
    public final int f241093f;

    /* renamed from: g */
    public final boolean f241094g;

    /* renamed from: h */
    public boolean f241095h;

    /* renamed from: i */
    public final ObjectAnimator f241096i;

    /* renamed from: j */
    public final ObjectAnimator f241097j;

    /* renamed from: k */
    public final ValueAnimator f241098k;

    /* renamed from: l */
    public final ValueAnimator f241099l;

    /* renamed from: m */
    public int f241100m;

    /* renamed from: n */
    public final ValueAnimator f241101n;

    /* renamed from: o */
    public int f241102o;

    /* renamed from: p */
    public AnimatorSet f241103p = new AnimatorSet();

    /* renamed from: q */
    public final boolean f241104q;

    /* renamed from: r */
    private final Resources f241105r;

    /* renamed from: s */
    private final ValueAnimator f241106s;

    /* renamed from: t */
    private int f241107t = -1;

    public C88970o(ImageView imageView, Resources resources, boolean z, boolean z2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f241090c = imageView;
        this.f241094g = z;
        this.f241104q = z2;
        this.f241105r = resources;
        int color = resources.getColor(R.color.ic_mic_color);
        this.f241093f = color;
        this.f241100m = color;
        Drawable drawable = resources.getDrawable(R.drawable.ic_mic_large);
        this.f241092e = drawable;
        drawable.mutate();
        this.f241102o = color;
        drawable.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
        this.f241095h = true;
        mo82900b(R.drawable.ic_mic_g_large);
        this.f241096i = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{0.0f, 1.0f});
        this.f241097j = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f});
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{0, 0});
        this.f241099l = ofObject;
        ofObject.addUpdateListener(new C88964i(this));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{0, 0});
        this.f241101n = ofObject2;
        ofObject2.addUpdateListener(new C88965j(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f241098k = ofFloat;
        ofFloat.addUpdateListener(new C88966k(this));
        ofFloat.setInterpolator(C91119r.f254433a);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(2333);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241106s = ofFloat2;
        ofFloat2.addUpdateListener(new C88967l(this));
        ofFloat2.addListener(new C88968m(this));
    }

    /* renamed from: a */
    public final void mo82899a(long j, float f, TimeInterpolator timeInterpolator) {
        C88939k.m144548d(this.f241106s, j, timeInterpolator, this.f241089b, f);
        ValueAnimator valueAnimator = this.f241098k;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f241098k.start();
        }
    }

    /* renamed from: b */
    public final void mo82900b(int i) {
        if (this.f241107t != i) {
            this.f241107t = i;
            Drawable drawable = this.f241105r.getDrawable(i);
            this.f241091d = drawable;
            drawable.mutate();
            this.f241091d.setColorFilter(this.f241100m, PorterDuff.Mode.MULTIPLY);
            if (this.f241095h) {
                this.f241090c.setImageDrawable(this.f241091d);
            }
        }
    }

    /* renamed from: c */
    public final void mo82901c(long j) {
        ValueAnimator valueAnimator = this.f241098k;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            C88939k.m144548d(this.f241106s, j, C91107f.f254408d, this.f241089b, 0.0f);
        }
    }
}
