package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113893x;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class UpgradePromoTooltipActivity extends C109942s {

    /* renamed from: g */
    private static final C58528ij f306154g = C58528ij.m90011K("LG-K430", "Pixel C");

    /* renamed from: a */
    public bm f306155a;

    /* renamed from: b */
    public bo f306156b;

    /* renamed from: c */
    AnimatorSet f306157c = null;

    /* renamed from: d */
    public ImageView f306158d;

    /* renamed from: e */
    public View f306159e;

    /* renamed from: f */
    public int f306160f;

    /* renamed from: h */
    private boolean f306161h;

    /* renamed from: b */
    private final ValueAnimator m183009b(int i, int i2, long j, Interpolator interpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(interpolator);
        ofInt.addUpdateListener(new C109922ar(this));
        ofInt.addListener(new C109923as(ofInt));
        ofInt.setDuration(j);
        return ofInt;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        C74504a.m120462a(f.ax);
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f306155a.u()) {
            finish();
            return;
        }
        Bundle B = C87566i.m142227B(getIntent());
        if (B == null || !B.getBoolean("from_tooltip_promo", false)) {
            this.f306156b.o(1, 1);
            if (C113893x.m188579a(getIntent())) {
                C113893x.m188580b(getIntent().getData(), 3);
            }
        } else {
            this.f306156b.o(1, 4);
        }
        View inflate = getLayoutInflater().inflate(R.layout.opa_upgrade_tooltip_view, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.opa_upgrade_tooltip_circle);
        this.f306158d = imageView;
        imageView.setImageResource(R.drawable.upgrade_tooltip_circle);
        this.f306160f = getResources().getDimensionPixelSize(R.dimen.opa_upgrade_tooltip_circle_diameter);
        this.f306159e = inflate.findViewById(R.id.opa_upgrade_tooltip_circle_container);
        ((TextView) inflate.findViewById(R.id.opa_upgrade_tooltip_text)).setText(R.string.opa_upgrade_promo_tooltip_text);
        setContentView(inflate);
        getWindow().getDecorView().setSystemUiVisibility(3844);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (f306154g.contains(Build.MODEL)) {
            this.f306158d.setVisibility(4);
            View findViewById = inflate.findViewById(R.id.opa_upgrade_tooltip_text_container);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            findViewById.setLayoutParams(layoutParams);
            return;
        }
        int identifier = getResources().getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0 || getResources().getBoolean(identifier)) {
            int identifier2 = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            i = identifier2 != 0 ? getResources().getDimensionPixelSize(identifier2) : 0;
        } else {
            i = -70;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f306159e.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, ((-this.f306160f) / 2) + (i / 2));
        this.f306159e.setLayoutParams(layoutParams2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(600);
        double d = (double) this.f306160f;
        Double.isNaN(d);
        int i2 = this.f306160f;
        double d2 = (double) i2;
        Double.isNaN(d2);
        animatorSet.playSequentially(new Animator[]{m183009b(0, (int) (d * 0.85d), 180, AnimationUtils.loadInterpolator(this, R.anim.tooltip_circle_first_phase)), m183009b((int) (d2 * 0.85d), i2, 1300, AnimationUtils.loadInterpolator(this, R.anim.tooltip_circle_middle_phase)), m183009b(this.f306160f, 0, 240, AnimationUtils.loadInterpolator(this, R.anim.tooltip_circle_end_phase))});
        animatorSet.addListener(new C109921aq(animatorSet));
        this.f306157c = animatorSet;
    }

    public final void onPause() {
        super.onPause();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306161h) {
            AnimatorSet animatorSet = this.f306157c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            finish();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C58976aa aaVar = C58975e.f156826a;
        this.f306161h |= z;
        AnimatorSet animatorSet = this.f306157c;
        if (z && animatorSet != null && !animatorSet.isRunning()) {
            animatorSet.start();
        }
    }
}
