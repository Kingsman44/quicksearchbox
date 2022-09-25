package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.facebook.litho.LithoView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114736f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci */
/* compiled from: PG */
public final class C114839ci {

    /* renamed from: a */
    public static final C59071e f318614a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci");

    /* renamed from: b */
    public final Context f318615b;

    /* renamed from: c */
    private final C68214a f318616c;

    /* renamed from: d */
    private final C86124t f318617d;

    public C114839ci(Context context, C68214a aVar, C86124t tVar) {
        this.f318615b = context;
        this.f318616c = aVar;
        this.f318617d = tVar;
    }

    /* renamed from: g */
    private static ObjectAnimator m190346g(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    /* renamed from: h */
    private static ObjectAnimator m190347h(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo101648a(ViewGroup viewGroup) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{0.0f, 0.0f});
        ofFloat.setDuration(160);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(160);
        ofFloat2.setInterpolator(new C91107f(0.0f, 0.0f, 1.0f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    /* renamed from: b */
    public final AnimatorSet mo101649b(View view) {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildAt(0) instanceof LithoView) {
                viewGroup.getChildAt(0).setVisibility(4);
                view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, LinearLayoutManager.INVALID_OFFSET));
                valueAnimator = ValueAnimator.ofInt(new int[]{0, view.getMeasuredHeight()});
                viewGroup.getChildAt(0).setVisibility(8);
                valueAnimator.addUpdateListener(new C114825bv(view));
                valueAnimator.addListener(new C114826bw(this, view));
                valueAnimator.setStartDelay(130);
                valueAnimator.setDuration(320);
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                animatorArr[0] = valueAnimator;
                animatorArr[1] = m190346g(view, 320);
                animatorSet.playSequentially(animatorArr);
                animatorSet.addListener(new C114736f((C114737g) this.f318616c.mo27525b()));
                return animatorSet;
            }
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, LinearLayoutManager.INVALID_OFFSET));
        valueAnimator = ValueAnimator.ofInt(new int[]{0, view.getMeasuredHeight()});
        valueAnimator.addListener(new C114827bx(view));
        valueAnimator.addUpdateListener(new C114828by(view));
        valueAnimator.setStartDelay(130);
        valueAnimator.setDuration(320);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        animatorArr[0] = valueAnimator;
        animatorArr[1] = m190346g(view, 320);
        animatorSet.playSequentially(animatorArr);
        animatorSet.addListener(new C114736f((C114737g) this.f318616c.mo27525b()));
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo101650c(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = m190347h(view, 160);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredHeight(), 0});
        if (!(view instanceof ViewGroup) || !(((ViewGroup) view).getChildAt(0) instanceof LithoView)) {
            ofInt.addUpdateListener(new C114837cg(view));
            ofInt.addListener(new C114838ch(view));
        } else {
            ofInt.addUpdateListener(new C114835ce(view));
            ofInt.addListener(new C114836cf(this, view));
        }
        ofInt.setStartDelay(130);
        ofInt.setDuration(320);
        ofInt.setInterpolator(new DecelerateInterpolator());
        animatorArr[1] = ofInt;
        animatorSet.playSequentially(animatorArr);
        animatorSet.addListener(new C114736f((C114737g) this.f318616c.mo27525b()));
        return animatorSet;
    }

    /* renamed from: d */
    public final AnimatorSet mo101651d(View view, View view2, C53306j jVar) {
        long alpha = (long) (view.getAlpha() * 160.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 0.0f});
        ofFloat.setDuration(alpha);
        ofFloat.addListener(new C114831ca(view, view2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(320);
        AnimatorSet animatorSet = new AnimatorSet();
        if (jVar.equals(C53306j.MORRIS)) {
            ofFloat2.setStartDelay(alpha);
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        } else {
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        }
        animatorSet.addListener(new C114736f((C114737g) this.f318616c.mo27525b()));
        return animatorSet;
    }

    /* renamed from: e */
    public final AnimatorSet mo101652e(LinearLayout linearLayout) {
        AnimatorSet animatorSet = new AnimatorSet();
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0) {
            C59104x d = f318614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSAnimationUtils");
            ((C59052c) ((C59052c) d).mo56372aa(29576)).mo56386p("#startHighlightCardAnimation(): no card view in the container.");
            return animatorSet;
        }
        View childAt = linearLayout.getChildAt(0);
        View inflate = LayoutInflater.from(this.f318615b).inflate(R.layout.zero_state_card_highlight_view, (ViewGroup) null);
        linearLayout.addView(inflate);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
        marginLayoutParams.height = childAt.getMeasuredHeight();
        marginLayoutParams.width = childAt.getMeasuredWidth();
        int i = -childAt.getMeasuredHeight();
        if (this.f318617d.mo79746e(C90014bt.f247289eO)) {
            inflate.setElevation((float) this.f318615b.getResources().getDimensionPixelSize(R.dimen.zero_state_card_highlight_effect_elevation_v2));
        }
        if (childCount > 1) {
            i -= linearLayout.getChildAt(1).getMeasuredHeight();
        }
        marginLayoutParams.setMargins(0, i, 0, 0);
        inflate.requestLayout();
        inflate.setVisibility(4);
        ObjectAnimator g = m190346g(inflate, 500);
        g.addListener(new C114833cc(inflate));
        ObjectAnimator h = m190347h(inflate, 500);
        h.addListener(new C114834cd(linearLayout, inflate));
        animatorSet.setStartDelay(250);
        animatorSet.playSequentially(new Animator[]{g, h});
        animatorSet.addListener(new C114736f((C114737g) this.f318616c.mo27525b()));
        return animatorSet;
    }

    /* renamed from: f */
    public final void mo101653f(View view) {
        boolean a = C90962a.m148577a(this.f318615b);
        view.setElevation((float) this.f318615b.getResources().getDimensionPixelSize(R.dimen.zero_state_card_elevation_v2));
        view.setOutlineProvider(new C114824bu(this, view));
        if (a) {
            view.setForceDarkAllowed(false);
            view.setOutlineAmbientShadowColor(this.f318615b.getResources().getColor(R.color.zero_state_card_ambient_shadow_color_dark, (Resources.Theme) null));
            view.setOutlineSpotShadowColor(this.f318615b.getResources().getColor(R.color.zero_state_card_spot_shadow_color_dark, (Resources.Theme) null));
            return;
        }
        view.setOutlineAmbientShadowColor(this.f318615b.getResources().getColor(R.color.zero_state_card_ambient_shadow_color, (Resources.Theme) null));
        view.setOutlineSpotShadowColor(this.f318615b.getResources().getColor(R.color.zero_state_card_spot_shadow_color, (Resources.Theme) null));
    }
}
