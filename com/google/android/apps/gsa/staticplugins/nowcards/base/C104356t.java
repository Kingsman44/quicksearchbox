package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import com.google.android.apps.gsa.now.shared.p6421ui.C83421j;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.t */
/* compiled from: PG */
public final class C104356t {

    /* renamed from: m */
    public static final /* synthetic */ int f290384m = 0;

    /* renamed from: n */
    private static final AccelerateDecelerateInterpolator f290385n = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public final Context f290386a;

    /* renamed from: b */
    public final C7718hj f290387b;

    /* renamed from: c */
    public final C105070g f290388c;

    /* renamed from: d */
    public final C58881cr f290389d;

    /* renamed from: e */
    public final C91728l f290390e;

    /* renamed from: f */
    public final C104333bh f290391f;

    /* renamed from: g */
    public final C8194z f290392g;

    /* renamed from: h */
    public final C83421j f290393h;

    /* renamed from: i */
    public final boolean f290394i;

    /* renamed from: j */
    public LinearLayout f290395j;

    /* renamed from: k */
    public LinearLayout f290396k;

    /* renamed from: l */
    public TextSwitcher f290397l;

    /* renamed from: o */
    private final C89291a f290398o;

    /* renamed from: p */
    private ValueAnimator f290399p;

    public C104356t(Context context, C7718hj hjVar, C89291a aVar, C105070g gVar, C58881cr crVar, C91728l lVar, boolean z, C8194z zVar, C83421j jVar) {
        this.f290386a = context;
        this.f290387b = hjVar;
        this.f290398o = aVar;
        this.f290388c = gVar;
        this.f290389d = crVar;
        this.f290390e = lVar;
        this.f290394i = z;
        this.f290392g = zVar;
        this.f290393h = jVar;
        this.f290391f = new C104333bh(context);
    }

    /* renamed from: a */
    public final Drawable mo94136a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int dimensionPixelSize = this.f290386a.getResources().getDimensionPixelSize(R.dimen.pill_outline_width);
        int color = this.f290386a.getResources().getColor(true != this.f290394i ? R.color.color_pill_outline : R.color.dark_theme_color_pill_outline);
        int color2 = this.f290386a.getResources().getColor(true != this.f290394i ? R.color.color_pill_fill : R.color.dark_theme_color_pill_fill);
        int color3 = this.f290386a.getResources().getColor(true != this.f290394i ? R.color.pill_ripple_color : R.color.dark_theme_pill_ripple_color);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(dimensionPixelSize, color);
        gradientDrawable.setCornerRadius(2.14748365E9f);
        gradientDrawable.setColor(color2);
        LinearLayout linearLayout = this.f290396k;
        if (linearLayout != null) {
            linearLayout.setOnTouchListener(new C104354r(this, color3, color2));
        }
        return gradientDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94137b(com.google.p375ai.p378b.C8194z r12) {
        /*
            r11 = this;
            r0 = 8
            if (r12 != 0) goto L_0x000d
            android.widget.LinearLayout r1 = r11.f290395j
            if (r1 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r1.setVisibility(r0)
            return
        L_0x000d:
            android.widget.TextSwitcher r1 = r11.f290397l
            if (r1 == 0) goto L_0x012a
            if (r12 == 0) goto L_0x0129
            android.widget.LinearLayout r2 = r11.f290395j
            if (r2 == 0) goto L_0x0129
            int r2 = r12.f28779a
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0125
            com.google.ai.b.ax r0 = r12.f28782d
            if (r0 != 0) goto L_0x0023
            com.google.ai.b.ax r0 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x0023:
            int r0 = r0.f26086a
            r0 = r0 & r3
            r2 = 0
            if (r0 == 0) goto L_0x003f
            com.google.ai.b.ax r0 = r12.f28782d
            if (r0 != 0) goto L_0x002f
            com.google.ai.b.ax r0 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x002f:
            int r0 = r0.f26090e
            com.google.ai.b.g r0 = com.google.p375ai.p378b.C7681g.m22802a(r0)
            if (r0 != 0) goto L_0x0039
            com.google.ai.b.g r0 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0039:
            com.google.ai.b.g r4 = com.google.p375ai.p378b.C7681g.FEED_FOLLOW
            if (r0 != r4) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r4 = r0 ^ 1
            android.content.Context r5 = r11.f290386a
            if (r4 == 0) goto L_0x004a
            r6 = 2130772024(0x7f010038, float:1.7147155E38)
            goto L_0x004d
        L_0x004a:
            r6 = 2130772025(0x7f010039, float:1.7147157E38)
        L_0x004d:
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r6)
            r1.setInAnimation(r5)
            android.content.Context r5 = r11.f290386a
            if (r3 == r4) goto L_0x005c
            r6 = 2130772030(0x7f01003e, float:1.7147167E38)
            goto L_0x005f
        L_0x005c:
            r6 = 2130772029(0x7f01003d, float:1.7147165E38)
        L_0x005f:
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r6)
            r1.setOutAnimation(r5)
            java.lang.String r5 = r12.f28780b
            r1.setText(r5)
            android.widget.LinearLayout r5 = r11.f290395j
            if (r5 == 0) goto L_0x0104
            r6 = 2131433016(0x7f0b1638, float:1.8487806E38)
            android.view.View r5 = r5.findViewById(r6)
            com.airbnb.lottie.LottieAnimationView r5 = (com.airbnb.lottie.LottieAnimationView) r5
            android.widget.LinearLayout r6 = r11.f290395j
            r7 = 2131433017(0x7f0b1639, float:1.8487808E38)
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r2)
            java.lang.String r7 = "Follow.json"
            r5.mo9700j(r7)
            r5.mo9693d(r2)
            android.animation.ValueAnimator r7 = r11.f290399p
            if (r7 == 0) goto L_0x009b
            boolean r7 = r7.isRunning()
            if (r7 == 0) goto L_0x009b
            android.animation.ValueAnimator r7 = r11.f290399p
            r7.cancel()
        L_0x009b:
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            if (r4 == 0) goto L_0x00d6
            r9 = 2
            float[] r9 = new float[r9]
            if (r3 == r0) goto L_0x00a7
            r10 = 0
            goto L_0x00a9
        L_0x00a7:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a9:
            r9[r2] = r10
            if (r3 == r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r7 = 0
        L_0x00af:
            r9[r3] = r7
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r9)
            r11.f290399p = r7
            com.google.android.apps.gsa.staticplugins.nowcards.base.p r8 = new com.google.android.apps.gsa.staticplugins.nowcards.base.p
            r8.<init>(r5)
            r7.addUpdateListener(r8)
            android.animation.ValueAnimator r7 = r11.f290399p
            r8 = 540(0x21c, double:2.67E-321)
            r7.setDuration(r8)
            android.animation.ValueAnimator r7 = r11.f290399p
            com.google.android.apps.gsa.staticplugins.nowcards.base.s r8 = new com.google.android.apps.gsa.staticplugins.nowcards.base.s
            r8.<init>(r6, r5, r0)
            r7.addListener(r8)
            android.animation.ValueAnimator r0 = r11.f290399p
            r0.start()
            goto L_0x00df
        L_0x00d6:
            if (r3 == r0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r7 = 0
        L_0x00da:
            com.airbnb.lottie.ac r0 = r5.f15138d
            r0.mo9773j(r7)
        L_0x00df:
            android.widget.LinearLayout r0 = r11.f290396k
            if (r0 == 0) goto L_0x0104
            android.transition.TransitionSet r5 = new android.transition.TransitionSet
            r5.<init>()
            android.transition.ChangeBounds r6 = new android.transition.ChangeBounds
            r6.<init>()
            if (r3 == r4) goto L_0x00f2
            r3 = 0
            goto L_0x00f4
        L_0x00f2:
            r3 = 260(0x104, double:1.285E-321)
        L_0x00f4:
            android.transition.Transition r3 = r6.setDuration(r3)
            android.view.animation.AccelerateDecelerateInterpolator r4 = f290385n
            android.transition.Transition r3 = r3.setInterpolator(r4)
            r5.addTransition(r3)
            android.transition.TransitionManager.beginDelayedTransition(r0, r5)
        L_0x0104:
            int r0 = r12.f28779a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0119
            com.google.ai.b.xj r12 = r12.f28786h
            if (r12 != 0) goto L_0x0110
            com.google.ai.b.xj r12 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0110:
            com.google.android.apps.gsa.shared.au.b.a r0 = r11.f290398o
            android.content.Context r3 = r11.f290386a
            java.lang.String r12 = r0.mo83231a(r3, r12)
            goto L_0x011b
        L_0x0119:
            java.lang.String r12 = r12.f28780b
        L_0x011b:
            r1.setContentDescription(r12)
            r1.announceForAccessibility(r12)
            r1.setVisibility(r2)
            goto L_0x012a
        L_0x0125:
            r1.setVisibility(r0)
            goto L_0x012a
        L_0x0129:
            return
        L_0x012a:
            android.widget.LinearLayout r12 = r11.f290395j
            if (r12 == 0) goto L_0x0135
            android.graphics.drawable.Drawable r0 = r11.mo94136a()
            r12.setBackground(r0)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104356t.mo94137b(com.google.ai.b.z):void");
    }
}
