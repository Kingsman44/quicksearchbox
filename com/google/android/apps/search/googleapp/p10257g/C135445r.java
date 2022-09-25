package com.google.android.apps.search.googleapp.p10257g;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C1877c;
import androidx.core.p098j.C2043bi;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.Set;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.r */
/* compiled from: PG */
public final class C135445r implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C135414ae f369006a;

    /* renamed from: b */
    final /* synthetic */ C135435j f369007b;

    /* renamed from: c */
    final /* synthetic */ ImageView f369008c;

    /* renamed from: d */
    final /* synthetic */ ImageView f369009d;

    /* renamed from: e */
    final /* synthetic */ ViewGroup f369010e;

    public C135445r(C135414ae aeVar, C135435j jVar, ImageView imageView, ImageView imageView2, ViewGroup viewGroup) {
        this.f369006a = aeVar;
        this.f369007b = jVar;
        this.f369008c = imageView;
        this.f369009d = imageView2;
        this.f369010e = viewGroup;
    }

    /* renamed from: c */
    private final void m219607c(int i) {
        View requireView = this.f369007b.f368979g.requireView();
        C135430e a = C135430e.m219591a(this.f369007b.f368977e.f368967b);
        if (a == null) {
            a = C135430e.UNKNOWN;
        }
        View findViewById = requireView.findViewById(a == C135430e.SAMSUNG_MINUS_ONE_POST_MVP ? R.id.googleapp_doodle_container_inner : R.id.googleapp_doodle_container);
        if (this.f369006a.f368931c != null) {
            Set set = C135435j.f368973a;
            C135430e a2 = C135430e.m219591a(this.f369007b.f368977e.f368967b);
            if (a2 == null) {
                a2 = C135430e.UNKNOWN;
            }
            if (set.contains(a2)) {
                GradientDrawable gradientDrawable = (GradientDrawable) C1877c.m5125a(this.f369007b.f368979g.requireContext(), R.drawable.googleapp_doodle_pixel_animated_background);
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i);
                }
                findViewById.setBackground(gradientDrawable);
                return;
            }
        }
        findViewById.setBackground((Drawable) null);
    }

    /* renamed from: d */
    private final void m219608d(int i) {
        ImageView imageView = this.f369008c;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C135435j jVar = this.f369007b;
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) jVar.f368979g.getResources().getDimensionPixelSize(R.dimen.googleapp_minusone_doodle_corner_radius));
        imageView.setBackground(gradientDrawable);
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C69664n.m101061g(obj, "model");
        C69664n.m101061g(nVar, "target");
        C59052c cVar = (C59052c) ((C59052c) C135435j.f368974b.mo56226d()).mo56382g(apVar);
        cVar.mo56378ag(C38505d.f101864b, 149815953);
        Uri uri = this.f369006a.f368930b;
        cVar.mo56379ah(new C59094n(40562));
        cVar.mo56389s("Failed to load doodle image. Doodle image URI: %s", uri);
        this.f369007b.mo112330a(C135423an.f368947a);
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        C69664n.m101061g(obj2, "model");
        C69664n.m101061g(nVar, "target");
        C69664n.m101061g(aVar, "dataSource");
        this.f369008c.setContentDescription(this.f369006a.f368932d);
        ImageView imageView = this.f369008c;
        C135435j jVar = this.f369007b;
        imageView.setOnClickListener(new C47591co(jVar.f368985m, "click on doodle", new C135444q(jVar, this.f369006a)));
        C135430e a = C135430e.m219591a(this.f369007b.f368977e.f368967b);
        if (a == null) {
            a = C135430e.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i = this.f369006a.f368936h;
                C135446s.m219611a(this.f369007b.f368979g, R.id.googleapp_doodle_common).setBackgroundColor(i);
                C135446s.m219611a(this.f369007b.f368979g, R.id.googleapp_doodle_background).setBackgroundColor(i);
                int argb = Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
                C2043bi.m5530X(C135446s.m219611a(this.f369007b.f368979g, R.id.googleapp_gradient_doodle_background), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, argb}));
            } else if (ordinal == 2) {
                C135446s.m219612b(this.f369009d, 0);
                m219608d(this.f369006a.f368936h);
            } else if (ordinal == 3) {
                if (this.f369006a.f368931c != null) {
                    int dimensionPixelSize = this.f369007b.f368979g.requireContext().getResources().getDimensionPixelSize(R.dimen.googleapp_minusone_doodle_extra_bottom_margin);
                    ViewGroup viewGroup = this.f369010e;
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin + dimensionPixelSize);
                    viewGroup.setLayoutParams(marginLayoutParams);
                }
                C135446s.m219612b(this.f369009d, this.f369007b.f368979g.getResources().getDimensionPixelSize(R.dimen.googleapp_minusone_samsung_share_padding));
                m219607c(this.f369006a.f368936h);
                m219608d(this.f369006a.f368936h);
            } else if (ordinal == 4) {
                C135446s.m219612b(this.f369009d, 0);
                m219607c(this.f369006a.f368936h);
                m219608d(this.f369006a.f368936h);
            } else if (ordinal == 5) {
                C135446s.m219612b(this.f369009d, this.f369007b.f368979g.getResources().getDimensionPixelSize(R.dimen.googleapp_minusone_samsung_share_padding));
                m219607c(this.f369006a.f368936h);
                m219608d(this.f369006a.f368936h);
            }
            ImageView imageView2 = this.f369009d;
            C135413ad adVar = this.f369006a.f368935g;
            if (adVar == null) {
                imageView2.setVisibility(4);
            } else {
                C135435j jVar2 = this.f369007b;
                imageView2.setVisibility(0);
                imageView2.setColorFilter(adVar.f368928c);
                imageView2.setOnClickListener(new C47591co(jVar2.f368985m, "click on share doodle", new C135443p(jVar2, adVar)));
            }
            this.f369007b.f368984l.mo112311b(this.f369006a.f368929a);
            nVar.mo11861c(drawable, (C5582f) null);
            C135435j jVar3 = this.f369007b;
            ViewGroup viewGroup2 = (ViewGroup) C135446s.m219611a(jVar3.f368979g, R.id.googleapp_doodle_container);
            ImageView imageView3 = (ImageView) C135446s.m219611a(jVar3.f368979g, R.id.googleapp_logo);
            if (viewGroup2.getVisibility() != 0) {
                viewGroup2.setVisibility(0);
                Duration ofMillis = Duration.ofMillis(300);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView3, View.ALPHA, new float[]{imageView3.getAlpha(), 0.0f}).setDuration(ofMillis.toMillis()), ObjectAnimator.ofFloat(viewGroup2, View.ALPHA, new float[]{viewGroup2.getAlpha(), 1.0f}).setDuration(ofMillis.toMillis())});
                animatorSet.addListener(new C135440m(imageView3));
                animatorSet.start();
            }
            return true;
        }
        throw new IllegalArgumentException("FragmentLocation param must be set");
    }
}
