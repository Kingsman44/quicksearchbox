package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.p098j.p100b.C2034a;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105451u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.du */
/* compiled from: PG */
public final class C105574du extends C22939d {

    /* renamed from: o */
    private static final Interpolator f294507o = new C2300b();

    /* renamed from: p */
    private static final Interpolator f294508p = C2034a.m5471c(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: q */
    private static final Interpolator f294509q = new LinearInterpolator();

    /* renamed from: r */
    private static final Interpolator f294510r = new C105572ds(300.0f, 23.0f);

    /* renamed from: s */
    private static final Interpolator f294511s = new C105572ds(70.0f, 5.0f);

    /* renamed from: a */
    public final C105447q f294512a;

    /* renamed from: b */
    public final Context f294513b;

    /* renamed from: c */
    public int f294514c = 0;

    /* renamed from: d */
    public int f294515d = 0;

    /* renamed from: e */
    public int f294516e = 0;

    /* renamed from: f */
    public int f294517f = 0;

    /* renamed from: g */
    public int f294518g = 0;

    /* renamed from: h */
    public boolean f294519h;

    /* renamed from: i */
    public boolean f294520i = false;

    /* renamed from: j */
    C105554da f294521j;

    /* renamed from: k */
    C105552cz f294522k;

    /* renamed from: l */
    AnimatorSet f294523l;

    /* renamed from: m */
    AnimatorSet f294524m;

    /* renamed from: n */
    public C105653u f294525n;

    /* renamed from: t */
    private final C91820a f294526t;

    /* renamed from: u */
    private final C105451u f294527u;

    /* renamed from: v */
    private final C105573dt f294528v;

    /* renamed from: w */
    private final C91825b f294529w;

    public C105574du(C22945j jVar, C105451u uVar, Context context, C105447q qVar, C91825b bVar, C91820a aVar) {
        super(jVar);
        this.f294527u = uVar;
        this.f294513b = context;
        this.f294512a = qVar;
        this.f294529w = bVar;
        this.f294526t = aVar;
        this.f294528v = new C105573dt(this);
    }

    /* renamed from: A */
    private static final Animator m175593A(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f});
        ofFloat.setInterpolator(f294507o);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f2})});
        ofPropertyValuesHolder.setInterpolator(f294511s);
        ofPropertyValuesHolder.setDuration(1200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofPropertyValuesHolder});
        animatorSet.addListener(new C105568do(view));
        return animatorSet;
    }

    /* renamed from: p */
    private final float m175594p(int i) {
        int paddingLeft = ((C105499b) this.f294521j).f294304c.getPaddingLeft();
        return (((float) i) - (((float) ((this.f294522k.mo94879C() - paddingLeft) - ((C105499b) this.f294521j).f294304c.getPaddingRight())) / 2.0f)) - ((float) paddingLeft);
    }

    /* renamed from: q */
    private final int m175595q(int i) {
        return m175600v() ? -i : i;
    }

    /* renamed from: r */
    private final Animator m175596r() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294304c, View.X, new float[]{m175594p(mo94916e(this.f294514c) + this.f294517f)});
        ofFloat.setInterpolator(f294507o);
        return ofFloat;
    }

    /* renamed from: s */
    private final AnimatorSet m175597s() {
        AnimatorSet animatorSet = new AnimatorSet();
        CardView cardView = ((C105499b) this.f294521j).f294306e;
        Property property = View.SCALE_X;
        C105552cz czVar = this.f294522k;
        float[] fArr = {((float) ((C105470a) czVar).f294134a) / ((float) czVar.f294483B)};
        Property property2 = View.SCALE_Y;
        C105470a aVar = (C105470a) this.f294522k;
        float[] fArr2 = {((float) aVar.f294136c) / ((float) aVar.f294135b)};
        Property property3 = View.TRANSLATION_Y;
        C105470a aVar2 = (C105470a) this.f294522k;
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(cardView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, fArr), PropertyValuesHolder.ofFloat(property2, fArr2), PropertyValuesHolder.ofFloat(property3, new float[]{((float) (aVar2.f294137d + aVar2.f294138e)) / 2.0f})}).setDuration(300);
        Interpolator interpolator = f294507o;
        duration.setInterpolator(interpolator);
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(((C105499b) this.f294521j).f294306e, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}), PropertyValuesHolder.ofFloat("Radius", new float[]{(float) ((C105470a) this.f294522k).f294140g})}).setDuration(160);
        duration2.setStartDelay(200);
        duration2.setInterpolator(interpolator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{duration, duration2});
        ImageView imageView = ((C105499b) this.f294521j).f294305d;
        Property property4 = View.SCALE_X;
        C105552cz czVar2 = this.f294522k;
        float[] fArr3 = {((float) ((C105470a) czVar2).f294134a) / ((float) czVar2.f294483B)};
        Property property5 = View.SCALE_Y;
        C105470a aVar3 = (C105470a) this.f294522k;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property4, fArr3), PropertyValuesHolder.ofFloat(property5, new float[]{((float) aVar3.f294136c) / ((float) aVar3.f294135b)})});
        ofPropertyValuesHolder.setInterpolator(interpolator);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294309h, View.ALPHA, new float[]{0.0f}).setDuration(120);
        duration3.setInterpolator(interpolator);
        C105499b bVar = (C105499b) this.f294521j;
        ImageView imageView2 = bVar.f294314m;
        ImageView imageView3 = bVar.f294316o;
        C105470a aVar4 = (C105470a) this.f294522k;
        float f = (float) aVar4.f294150q;
        C105499b bVar2 = (C105499b) this.f294521j;
        ImageView imageView4 = bVar2.f294315n;
        ImageView imageView5 = bVar2.f294317p;
        C105470a aVar5 = (C105470a) this.f294522k;
        float f2 = (float) aVar5.f294155v;
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294307f, View.ALPHA, new float[]{0.0f}).setDuration(120);
        duration4.setInterpolator(interpolator);
        TextView textView = ((C105499b) this.f294521j).f294307f;
        Property property6 = View.TRANSLATION_Y;
        C105470a aVar6 = (C105470a) this.f294522k;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property6, new float[]{(float) (aVar6.f294137d + aVar6.f294144k)});
        ofFloat.setInterpolator(interpolator);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{duration4, ofFloat});
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294308g, View.ALPHA, new float[]{0.0f}).setDuration(120);
        duration5.setInterpolator(interpolator);
        TextView textView2 = ((C105499b) this.f294521j).f294308g;
        Property property7 = View.TRANSLATION_Y;
        C105470a aVar7 = (C105470a) this.f294522k;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property7, new float[]{(float) (aVar7.f294137d + aVar7.f294146m)});
        ofFloat2.setInterpolator(interpolator);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{duration5, ofFloat2});
        animatorSet.playTogether(new Animator[]{m175596r(), animatorSet2, ofPropertyValuesHolder, duration3, m175602x(imageView2, imageView3, f / ((float) aVar4.f294148o), ((float) aVar4.f294143j) - (f / 2.0f)), m175602x(imageView4, imageView5, f2 / ((float) aVar5.f294148o), ((float) aVar5.f294143j) - (f2 / 2.0f)), animatorSet3, animatorSet4});
        return animatorSet;
    }

    /* renamed from: t */
    private final void m175598t() {
        ((C105499b) this.f294521j).f294303b.setOnTouchListener((View.OnTouchListener) null);
        ((C105499b) this.f294521j).f294303b.setOnClickListener((View.OnClickListener) null);
        ((C105499b) this.f294521j).f294303b.setClickable(false);
    }

    /* renamed from: u */
    private final void m175599u() {
        View view = ((C105499b) this.f294521j).f294310i;
        C105552cz czVar = this.f294522k;
        int i = czVar.f294483B;
        C105470a aVar = (C105470a) czVar;
        view.setLayoutParams(new FrameLayout.LayoutParams(i, aVar.f294143j + aVar.f294142i));
        View view2 = ((C105499b) this.f294521j).f294311j;
        C105552cz czVar2 = this.f294522k;
        int i2 = czVar2.f294483B;
        C105470a aVar2 = (C105470a) czVar2;
        view2.setLayoutParams(new FrameLayout.LayoutParams(i2, (aVar2.f294135b - aVar2.f294143j) - aVar2.f294142i));
    }

    /* renamed from: v */
    private final boolean m175600v() {
        return this.f294513b.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: w */
    private final int[] m175601w() {
        int[] iArr = new int[2];
        ((C105499b) this.f294521j).f294302a.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: x */
    private static final Animator m175602x(View view, View view2, float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(f294507o);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f}).setDuration(280);
        duration.setStartDelay(120);
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{f}).setDuration(300), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{f}).setDuration(300), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f2}).setDuration(300), duration, ObjectAnimator.ofFloat(view2, View.SCALE_X, new float[]{f}).setDuration(300), ObjectAnimator.ofFloat(view2, View.SCALE_Y, new float[]{f}).setDuration(300), ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{f2}).setDuration(300)});
        return animatorSet;
    }

    /* renamed from: y */
    private static final Animator m175603y(View view) {
        view.setAlpha(1.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f}).setDuration(160);
        duration.setInterpolator(f294509q);
        duration.setStartDelay(140);
        return duration;
    }

    /* renamed from: z */
    private static final Animator m175604z(View view, float f, float f2, float f3, float f4) {
        view.setTranslationY(f);
        view.setScaleX(f3);
        view.setScaleY(f3);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f2}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f4}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f4})}).setDuration(3000);
        duration.setInterpolator(f294510r);
        duration.addListener(new C105571dr(view));
        return duration;
    }

    /* renamed from: e */
    public final int mo94916e(int i) {
        if (i == 0) {
            return 0;
        }
        return i - m175601w()[0];
    }

    /* renamed from: g */
    public final int mo94917g(int i) {
        if (i == 0) {
            return 0;
        }
        return i - m175601w()[1];
    }

    /* renamed from: h */
    public final void mo94918h(boolean z) {
        m175598t();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(true != z ? 0 : 100);
        alphaAnimation.setAnimationListener(new C105564dk(this));
        ((C105499b) this.f294521j).f294304c.startAnimation(alphaAnimation);
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f294529w.mo86304c(this.f294528v);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LayoutInflater from = LayoutInflater.from(this.f294513b);
        Context context = this.f294513b;
        LayoutInflater layoutInflater = from;
        this.f294522k = new C105470a((int) context.getResources().getDimension(R.dimen.reaction_pill_width_initial), (int) context.getResources().getDimension(R.dimen.reaction_pill_height), (int) context.getResources().getDimension(R.dimen.reaction_pill_height_initial), (int) context.getResources().getDimension(R.dimen.reaction_pill_margin_top), (int) context.getResources().getDimension(R.dimen.reaction_pill_margin_bottom), (int) context.getResources().getDimension(R.dimen.reaction_pill_margin_left_right), (int) context.getResources().getDimension(R.dimen.reaction_pill_collapsed_radius), (int) context.getResources().getDimension(R.dimen.reaction_pill_expanded_radius), (int) context.getResources().getDimension(R.dimen.reaction_mid_line_height), (int) context.getResources().getDimension(R.dimen.reaction_mid_line_translation_y), (int) context.getResources().getDimension(R.dimen.reaction_more_text_translation_y), (int) context.getResources().getDimension(R.dimen.reaction_more_text_translation_y_initial), (int) context.getResources().getDimension(R.dimen.reaction_less_text_translation_y), (int) context.getResources().getDimension(R.dimen.reaction_less_text_translation_y_initial), (int) context.getResources().getDimension(R.dimen.reaction_dots_diameter_max), (int) context.getResources().getDimension(R.dimen.reaction_more_dot_diameter), (int) context.getResources().getDimension(R.dimen.reaction_more_dot_diameter_initial), (int) context.getResources().getDimension(R.dimen.reaction_more_dot_diameter_toggled), (int) context.getResources().getDimension(R.dimen.reaction_dot_explosion_diameter_initial), (int) context.getResources().getDimension(R.dimen.reaction_dot_explosion_diameter), (int) context.getResources().getDimension(R.dimen.reaction_less_dot_diameter), (int) context.getResources().getDimension(R.dimen.reaction_less_dot_diameter_initial), (int) context.getResources().getDimension(R.dimen.reaction_more_dot_toggling_delta_y), (int) context.getResources().getDimension(R.dimen.reaction_more_dot_translation_y), (int) context.getResources().getDimension(R.dimen.reaction_less_dot_translation_y), (int) context.getResources().getDimension(R.dimen.reaction_outline_dot_diameter_initial), (int) context.getResources().getDimension(R.dimen.reaction_outline_dot_diameter_toggled));
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.reaction, (ViewGroup) null);
        C105499b bVar = r2;
        C105499b bVar2 = new C105499b(frameLayout, (TouchInterceptingFrameLayout) frameLayout.findViewById(R.id.reaction_background_touch_interceptor), (FrameLayout) frameLayout.findViewById(R.id.reaction_inner_layout), (ImageView) frameLayout.findViewById(R.id.reaction_pill), (CardView) frameLayout.findViewById(R.id.reaction_slider_bar), (TextView) frameLayout.findViewById(R.id.reaction_more_text), (TextView) frameLayout.findViewById(R.id.reaction_less_text), frameLayout.findViewById(R.id.reaction_mid_line), frameLayout.findViewById(R.id.reaction_more_touch_target), frameLayout.findViewById(R.id.reaction_less_touch_target), (ImageView) frameLayout.findViewById(R.id.reaction_dot_outline), (ImageView) frameLayout.findViewById(R.id.reaction_more_dot_explosion), (ImageView) frameLayout.findViewById(R.id.reaction_neutral_more_dot), (ImageView) frameLayout.findViewById(R.id.reaction_neutral_less_dot), (ImageView) frameLayout.findViewById(R.id.reaction_more_dot), (ImageView) frameLayout.findViewById(R.id.reaction_less_dot), (ImageView) frameLayout.findViewById(R.id.reaction_slider_bar_image), (ImageView) frameLayout.findViewById(R.id.reaction_icon_hider));
        C105499b bVar3 = bVar;
        this.f294521j = bVar3;
        C105499b bVar4 = bVar3;
        bVar3.f294304c.setLayoutParams(new FrameLayout.LayoutParams(this.f294522k.mo94879C(), this.f294522k.mo94878B()));
        ((C105499b) this.f294521j).f294305d.setLayoutParams(new FrameLayout.LayoutParams(this.f294522k.mo94879C(), this.f294522k.mo94878B()));
        m175599u();
        ((C105499b) this.f294521j).f294310i.setTranslationX((float) m175595q(((C105470a) this.f294522k).f294139f));
        ((C105499b) this.f294521j).f294310i.setTranslationY((float) ((C105470a) this.f294522k).f294137d);
        ((C105499b) this.f294521j).f294311j.setTranslationX((float) m175595q(((C105470a) this.f294522k).f294139f));
        View view = ((C105499b) this.f294521j).f294311j;
        C105470a aVar = (C105470a) this.f294522k;
        view.setTranslationY((float) (aVar.f294137d + aVar.f294143j + aVar.f294142i));
        View view2 = ((C105499b) this.f294521j).f294309h;
        C105470a aVar2 = (C105470a) this.f294522k;
        view2.setTranslationY((float) (aVar2.f294137d + aVar2.f294143j));
        ImageView imageView = ((C105499b) this.f294521j).f294313l;
        C105470a aVar3 = (C105470a) this.f294522k;
        imageView.setTranslationY(((float) (aVar3.f294143j + aVar3.f294156w)) - (((float) aVar3.f294152s) / 2.0f));
        ((C105499b) this.f294521j).f294310i.setOnClickListener(new C105556dc(this));
        ((C105499b) this.f294521j).f294311j.setOnClickListener(new C105557dd(this));
        ((C105587eg) this.f294527u).f294604c.mo28726b(new C105558de(this));
        ((C105587eg) this.f294527u).f294602a.mo28726b(new C105559df(this));
        ((C105587eg) this.f294527u).f294603b.mo28726b(new C105560dg(this));
        mo28295iC(((C105499b) this.f294521j).f294302a);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f294529w.mo86302a(this.f294528v);
    }

    /* renamed from: j */
    public final void mo94919j(int i, boolean z) {
        ((C105499b) this.f294521j).f294304c.setX(m175594p(mo94916e(i) + this.f294517f));
        if (z) {
            m175596r().start();
        }
    }

    /* renamed from: k */
    public final void mo94920k(int i) {
        FrameLayout frameLayout = ((C105499b) this.f294521j).f294304c;
        int g = mo94917g(i);
        int i2 = this.f294518g;
        frameLayout.setY(((float) ((g + i2) - (this.f294522k.mo94878B() / 2))) + C91115n.m148870b(0.1f, this.f294513b));
    }

    /* renamed from: l */
    public final void mo94921l(C58833ax axVar) {
        float f;
        if (axVar.mo56113h()) {
            AnimatorSet animatorSet = this.f294523l;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            C105450t tVar = C105450t.EXPANDING;
            int ordinal = ((C105450t) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                AnimatorSet animatorSet2 = this.f294524m;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                C105653u uVar = this.f294525n;
                if (uVar != null) {
                    uVar.f294753a.f294207o.setEnabled(false);
                }
                this.f294520i = false;
                this.f294519h = true;
                ((C105499b) this.f294521j).f294304c.setVisibility(8);
                ((C105499b) this.f294521j).f294304c.setAlpha(1.0f);
                this.f294517f = 0;
                this.f294518g = 0;
                if (m175600v()) {
                    ((C105499b) this.f294521j).f294304c.setPadding(0, 0, 0, 0);
                }
                ((C105499b) this.f294521j).f294304c.setVisibility(0);
                C105470a aVar = (C105470a) this.f294522k;
                float f2 = ((float) aVar.f294159z) / ((float) aVar.f294148o);
                ((C105499b) this.f294521j).f294312k.setTranslationY(((float) aVar.f294143j) - (((float) aVar.f294150q) / 2.0f));
                ((C105499b) this.f294521j).f294312k.setScaleX(f2);
                ((C105499b) this.f294521j).f294312k.setScaleY(f2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.f294523l = animatorSet3;
                Animator[] animatorArr = new Animator[8];
                mo94919j(this.f294514c, false);
                float x = ((C105499b) this.f294521j).f294304c.getX();
                int l = this.f294526t.mo86288l();
                float a = (((float) (l - C90686c.m148055a(this.f294513b, 4))) / 2.0f) + ((float) this.f294513b.getResources().getDimensionPixelSize(R.dimen.gestalt_card_horizontal_margin));
                if (m175600v()) {
                    f = Math.max(x, a + ((float) this.f294522k.f294484C));
                } else {
                    f = Math.min(x, ((((float) l) - a) - ((float) this.f294522k.mo94879C())) - ((float) this.f294522k.f294484C));
                }
                ObjectAnimator duration = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294304c, View.X, new float[]{f}).setDuration(3000);
                Interpolator interpolator = f294510r;
                duration.setInterpolator(interpolator);
                animatorArr[0] = duration;
                CardView cardView = ((C105499b) this.f294521j).f294306e;
                Property property = View.SCALE_X;
                C105552cz czVar = this.f294522k;
                float[] fArr = {((float) ((C105470a) czVar).f294134a) / ((float) czVar.f294483B), 1.0f};
                Property property2 = View.SCALE_Y;
                C105470a aVar2 = (C105470a) this.f294522k;
                float[] fArr2 = {((float) aVar2.f294136c) / ((float) aVar2.f294135b), 1.0f};
                Property property3 = View.TRANSLATION_Y;
                C105470a aVar3 = (C105470a) this.f294522k;
                int i = aVar3.f294137d;
                ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(cardView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, fArr), PropertyValuesHolder.ofFloat(property2, fArr2), PropertyValuesHolder.ofFloat(property3, new float[]{((float) (aVar3.f294138e + i)) / 2.0f, (float) i})}).setDuration(3000);
                duration2.setInterpolator(interpolator);
                CardView cardView2 = ((C105499b) this.f294521j).f294306e;
                C105470a aVar4 = (C105470a) this.f294522k;
                ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(cardView2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat("Radius", new float[]{(float) aVar4.f294140g, (float) aVar4.f294141h})}).setDuration(80);
                Interpolator interpolator2 = f294507o;
                duration3.setInterpolator(interpolator2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(new Animator[]{duration2, duration3});
                animatorArr[1] = animatorSet4;
                ImageView imageView = ((C105499b) this.f294521j).f294305d;
                mo94922m();
                ((C105499b) this.f294521j).f294304c.getLayoutParams().width = this.f294522k.mo94879C();
                ((C105499b) this.f294521j).f294309h.getLayoutParams().width = this.f294522k.f294483B;
                imageView.getLayoutParams().width = this.f294522k.mo94879C();
                C105552cz czVar2 = this.f294522k;
                imageView.setScaleX(((float) ((C105470a) czVar2).f294134a) / ((float) czVar2.f294483B));
                C105470a aVar5 = (C105470a) this.f294522k;
                imageView.setScaleY(((float) aVar5.f294136c) / ((float) aVar5.f294135b));
                ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f})}).setDuration(3000);
                duration4.setInterpolator(interpolator);
                animatorArr[2] = duration4;
                ((C105499b) this.f294521j).f294309h.setAlpha(0.0f);
                ObjectAnimator duration5 = ObjectAnimator.ofFloat(((C105499b) this.f294521j).f294309h, View.ALPHA, new float[]{1.0f}).setDuration(220);
                duration5.setInterpolator(f294509q);
                duration5.setStartDelay(240);
                duration5.addListener(new C105570dq(this));
                animatorArr[3] = duration5;
                C105499b bVar = (C105499b) this.f294521j;
                ImageView imageView2 = bVar.f294314m;
                ImageView imageView3 = bVar.f294316o;
                C105470a aVar6 = (C105470a) this.f294522k;
                float f3 = (float) aVar6.f294150q;
                float f4 = ((float) aVar6.f294143j) - (f3 / 2.0f);
                float f5 = (float) (aVar6.f294137d + aVar6.f294157x);
                float f6 = (float) aVar6.f294148o;
                float f7 = f3 / f6;
                float f8 = ((float) aVar6.f294149p) / f6;
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(new Animator[]{m175604z(imageView2, f4, f5, f7, f8), m175604z(imageView3, f4, f5, f7, f8), m175603y(imageView2)});
                animatorArr[4] = animatorSet5;
                C105499b bVar2 = (C105499b) this.f294521j;
                ImageView imageView4 = bVar2.f294315n;
                ImageView imageView5 = bVar2.f294317p;
                C105470a aVar7 = (C105470a) this.f294522k;
                int i2 = aVar7.f294143j;
                float f9 = (float) aVar7.f294155v;
                float f10 = ((float) i2) - (f9 / 2.0f);
                float f11 = (float) (aVar7.f294137d + aVar7.f294158y);
                float f12 = (float) aVar7.f294148o;
                float f13 = f9 / f12;
                float f14 = ((float) aVar7.f294154u) / f12;
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.playTogether(new Animator[]{m175604z(imageView4, f10, f11, f13, f14), m175604z(imageView5, f10, f11, f13, f14), m175603y(imageView4)});
                animatorArr[5] = animatorSet6;
                ((C105499b) this.f294521j).f294307f.setAlpha(0.0f);
                TextView textView = ((C105499b) this.f294521j).f294307f;
                C105470a aVar8 = (C105470a) this.f294522k;
                textView.setTranslationY((float) (aVar8.f294137d + aVar8.f294145l));
                TextView textView2 = ((C105499b) this.f294521j).f294307f;
                Property property4 = View.TRANSLATION_Y;
                C105470a aVar9 = (C105470a) this.f294522k;
                ObjectAnimator duration6 = ObjectAnimator.ofPropertyValuesHolder(textView2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}), PropertyValuesHolder.ofFloat(property4, new float[]{(float) (aVar9.f294137d + aVar9.f294144k)})}).setDuration(260);
                duration6.setInterpolator(interpolator2);
                duration6.setStartDelay(100);
                duration6.addListener(new C105562di(this));
                animatorArr[6] = duration6;
                ((C105499b) this.f294521j).f294308g.setAlpha(0.0f);
                TextView textView3 = ((C105499b) this.f294521j).f294308g;
                C105470a aVar10 = (C105470a) this.f294522k;
                textView3.setTranslationY((float) (aVar10.f294137d + aVar10.f294147n));
                TextView textView4 = ((C105499b) this.f294521j).f294308g;
                Property property5 = View.TRANSLATION_Y;
                C105470a aVar11 = (C105470a) this.f294522k;
                ObjectAnimator duration7 = ObjectAnimator.ofPropertyValuesHolder(textView4, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}), PropertyValuesHolder.ofFloat(property5, new float[]{(float) (aVar11.f294137d + aVar11.f294146m)})}).setDuration(260);
                duration7.setInterpolator(interpolator2);
                duration7.setStartDelay(100);
                animatorArr[7] = duration7;
                animatorSet3.playTogether(animatorArr);
                this.f294523l.start();
                ((C105499b) this.f294521j).f294303b.setOnTouchListener(new C105563dj());
                ((C105499b) this.f294521j).f294303b.setOnClickListener(new C105555db(this));
                ((C105499b) this.f294521j).f294303b.setImportantForAccessibility(1);
                ((C105499b) this.f294521j).f294303b.setClickable(true);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        mo94918h(false);
                        C105653u uVar2 = this.f294525n;
                        if (uVar2 != null) {
                            uVar2.mo94945a();
                        }
                        this.f294519h = false;
                        return;
                    } else if (ordinal == 4) {
                        m175598t();
                        ((C105499b) this.f294521j).f294303b.setImportantForAccessibility(2);
                        AnimatorSet s = m175597s();
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        this.f294524m = animatorSet7;
                        C105470a aVar12 = (C105470a) this.f294522k;
                        int i3 = aVar12.f294151r;
                        float f15 = (float) aVar12.f294148o;
                        float f16 = ((float) i3) / f15;
                        float f17 = ((float) (aVar12.f294143j + aVar12.f294156w)) - (((float) aVar12.f294150q) / 2.0f);
                        Animator A = m175593A(((C105499b) this.f294521j).f294312k, f17, ((float) aVar12.f294133A) / f15);
                        ImageView imageView6 = ((C105499b) this.f294521j).f294314m;
                        Animator A2 = m175593A(imageView6, f17, f16);
                        Animator A3 = m175593A(((C105499b) this.f294521j).f294316o, f17, f16);
                        ObjectAnimator duration8 = ObjectAnimator.ofFloat(imageView6, View.ALPHA, new float[]{0.0f}).setDuration(180);
                        duration8.setStartDelay(120);
                        duration8.setInterpolator(f294507o);
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        animatorSet8.setStartDelay(50);
                        C105470a aVar13 = (C105470a) this.f294522k;
                        float f18 = ((float) aVar13.f294152s) / ((float) aVar13.f294148o);
                        ((C105499b) this.f294521j).f294313l.setScaleX(f18);
                        ((C105499b) this.f294521j).f294313l.setScaleY(f18);
                        C105470a aVar14 = (C105470a) this.f294522k;
                        float f19 = ((float) aVar14.f294153t) / ((float) aVar14.f294148o);
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((C105499b) this.f294521j).f294313l, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.6f, 0.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f19}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f19})});
                        ofPropertyValuesHolder.setDuration(300);
                        ofPropertyValuesHolder.setStartDelay(280);
                        ofPropertyValuesHolder.setInterpolator(f294508p);
                        ofPropertyValuesHolder.addListener(new C105569dp(this));
                        animatorSet8.playTogether(new Animator[]{A, A2, duration8, A3, ofPropertyValuesHolder});
                        animatorSet8.addListener(new C105567dn(this));
                        animatorSet7.playSequentially(new Animator[]{s, animatorSet8});
                        this.f294524m.addListener(new C105565dl(this));
                        this.f294524m.start();
                        C105653u uVar3 = this.f294525n;
                        if (uVar3 != null) {
                            uVar3.mo94945a();
                        }
                        this.f294519h = false;
                        return;
                    } else if (ordinal != 5) {
                        return;
                    }
                }
                m175598t();
                ((C105499b) this.f294521j).f294303b.setImportantForAccessibility(2);
                if (axVar.mo56107c() == C105450t.COLLAPSING_FROM_LESS) {
                    ((C105499b) this.f294521j).f294304c.animate().alpha(0.0f).setDuration(200).withEndAction(new C105561dh(this)).start();
                } else {
                    AnimatorSet s2 = m175597s();
                    this.f294524m = s2;
                    s2.addListener(new C105566dm(this));
                    this.f294524m.start();
                }
                C105653u uVar4 = this.f294525n;
                if (uVar4 != null) {
                    uVar4.mo94945a();
                }
                this.f294519h = false;
            } else {
                ((C105499b) this.f294521j).f294310i.requestFocus();
                this.f294519h = true;
            }
        }
    }

    /* renamed from: m */
    public final void mo94922m() {
        int i;
        int i2;
        ImageView imageView = ((C105499b) this.f294521j).f294305d;
        int max = Math.max(1, this.f294516e);
        float f = this.f294513b.getResources().getConfiguration().fontScale;
        if (f > 1.0f) {
            max = f <= 1.15f ? max + 1 : max + 2;
        }
        boolean booleanValue = ((Boolean) ((C105587eg) this.f294527u).f294602a.f63720e).booleanValue();
        int min = Math.min(max, 3);
        if (min == 1) {
            imageView.setBackgroundResource(true != booleanValue ? R.drawable.pill : R.drawable.dark_pill1);
            i2 = R.dimen.reaction_pill_width;
            i = R.dimen.reaction_pill_min_x_offset_to_card_edge;
        } else if (min == 2) {
            imageView.setBackgroundResource(true != booleanValue ? R.drawable.pill2 : R.drawable.dark_pill2);
            i2 = R.dimen.reaction_pill2_width;
            i = R.dimen.reaction_pill2_min_x_offset_to_card_edge;
        } else {
            imageView.setBackgroundResource(true != booleanValue ? R.drawable.pill3 : R.drawable.dark_pill3);
            i2 = R.dimen.reaction_pill3_width;
            i = R.dimen.reaction_pill3_min_x_offset_to_card_edge;
        }
        this.f294522k.f294483B = (int) this.f294513b.getResources().getDimension(i2);
        this.f294522k.f294484C = (int) this.f294513b.getResources().getDimension(i);
        m175599u();
    }
}
