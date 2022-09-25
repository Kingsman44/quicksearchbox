package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ImmersiveActionsHeader extends RelativeLayout implements C93584ch {

    /* renamed from: a */
    public ImageView f285729a;

    /* renamed from: b */
    public View f285730b;

    /* renamed from: c */
    public ImmersiveActionsExecuteButtonContainer f285731c;

    /* renamed from: d */
    public RelativeLayout f285732d;

    /* renamed from: e */
    public C93602cz f285733e;

    /* renamed from: f */
    public boolean f285734f;

    /* renamed from: g */
    public final int f285735g;

    /* renamed from: h */
    public boolean f285736h;

    /* renamed from: i */
    public int f285737i;

    /* renamed from: j */
    private ImageView f285738j;

    /* renamed from: k */
    private ImageView f285739k;

    /* renamed from: l */
    private WebImageView f285740l;

    /* renamed from: m */
    private View f285741m;

    /* renamed from: n */
    private TextView f285742n;

    /* renamed from: o */
    private LinearLayout f285743o;

    /* renamed from: p */
    private boolean f285744p;

    /* renamed from: q */
    private final int f285745q;

    public ImmersiveActionsHeader(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    private final boolean m169729j(int i) {
        return i == 4 && !this.f285733e.mo82036A();
    }

    /* renamed from: k */
    private final boolean m169730k(int i) {
        if (i == 2 || m169729j(i)) {
            return true;
        }
        return i == 7 && !this.f285733e.mo82039ao().mo81425i();
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f285733e = czVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0262  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87842e(int r13, com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e r14) {
        /*
            r12 = this;
            r12.f285737i = r13
            r0 = 4
            r1 = 0
            r2 = 8
            r3 = 9
            r4 = 0
            r5 = 1
            if (r13 == r5) goto L_0x001a
            if (r13 == r3) goto L_0x001a
            boolean r6 = r12.m169730k(r13)
            if (r6 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            r12.setVisibility(r2)
            goto L_0x0140
        L_0x001a:
            r12.setVisibility(r4)
            if (r13 != r3) goto L_0x0021
            r6 = r1
            goto L_0x0027
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r6 = r12.f285733e
            com.google.bb.a.pn r6 = r6.mo88014I()
        L_0x0027:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r7 = r12.f285733e
            android.content.Context r8 = r12.getContext()
            android.graphics.drawable.Drawable r7 = r7.mo88012G(r8, r14, r6)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r8 = r12.f285733e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r8 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r8 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r8
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r8 = r8.f236102h
            java.util.List r8 = r8.mo81322d()
            if (r6 == 0) goto L_0x0071
            if (r7 != 0) goto L_0x0049
            java.lang.String r9 = r6.f145871d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0071
        L_0x0049:
            if (r7 == 0) goto L_0x0051
            com.google.android.apps.gsa.now.shared.ui.WebImageView r8 = r12.f285740l
            r8.setImageDrawable(r7)
            goto L_0x005e
        L_0x0051:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            java.lang.String r8 = r6.f145871d
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r9 = r12.f285733e
            com.google.android.apps.gsa.shared.y.au r9 = r9.mo82040ap()
            r7.mo76738i(r8, r9)
        L_0x005e:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            java.lang.String r8 = r6.f145869b
            r7.setContentDescription(r8)
            android.view.View r7 = r12.f285730b
            r7.setVisibility(r4)
            android.view.View r7 = r12.f285741m
            r7.setVisibility(r2)
            goto L_0x00e8
        L_0x0071:
            if (r8 == 0) goto L_0x00a1
            int r7 = r8.size()
            if (r7 <= r5) goto L_0x00a1
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            r7.setVisibility(r4)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            r8 = 2131233105(0x7f080951, float:1.8082338E38)
            r7.setImageResource(r8)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            android.content.res.Resources r8 = r12.getResources()
            r9 = 2132088417(0x7f151661, float:1.9817117E38)
            java.lang.String r8 = r8.getString(r9)
            r7.setContentDescription(r8)
            android.view.View r7 = r12.f285741m
            r7.setVisibility(r4)
            android.view.View r7 = r12.f285730b
            r7.setVisibility(r4)
            goto L_0x00e8
        L_0x00a1:
            if (r13 != r3) goto L_0x00e3
            android.content.Context r7 = r12.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131234804(0x7f080ff4, float:1.8085784E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            if (r7 == 0) goto L_0x00dd
            android.content.Context r8 = r12.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131102393(0x7f060ab9, float:1.7817223E38)
            int r8 = r8.getColor(r9)
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r8, r9)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r8 = r12.f285740l
            r8.setImageDrawable(r7)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            r7.setVisibility(r4)
            android.view.View r7 = r12.f285730b
            r7.setVisibility(r4)
            android.view.View r7 = r12.f285741m
            r7.setVisibility(r2)
            goto L_0x00e8
        L_0x00dd:
            android.view.View r7 = r12.f285730b
            r7.setVisibility(r0)
            goto L_0x00e8
        L_0x00e3:
            android.view.View r7 = r12.f285730b
            r7.setVisibility(r0)
        L_0x00e8:
            if (r6 == 0) goto L_0x011e
            int r6 = r6.f145872e
            int r6 = com.google.p4152bb.p4153a.C55419v.m87685a(r6)
            if (r6 != 0) goto L_0x00f3
            goto L_0x011e
        L_0x00f3:
            r7 = 13
            if (r6 != r7) goto L_0x011e
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131169146(0x7f070f7a, float:1.7952614E38)
            int r6 = r6.getDimensionPixelSize(r7)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131169147(0x7f070f7b, float:1.7952616E38)
            int r7 = r7.getDimensionPixelSize(r8)
            android.content.res.Resources r8 = r12.getResources()
            r9 = 2131169145(0x7f070f79, float:1.7952612E38)
            int r8 = r8.getDimensionPixelSize(r9)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r9 = r12.f285740l
            r9.setPadding(r6, r7, r6, r8)
            goto L_0x0140
        L_0x011e:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r6 = r12.f285733e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r6.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.bb.a.x r6 = r6.f236107m
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.ADD_REMINDER
            if (r6 != r7) goto L_0x013b
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131169144(0x7f070f78, float:1.795261E38)
            int r6 = r6.getDimensionPixelSize(r7)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r12.f285740l
            r7.setPadding(r6, r6, r6, r6)
            goto L_0x0140
        L_0x013b:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r6 = r12.f285740l
            r6.setPadding(r4, r4, r4, r4)
        L_0x0140:
            r12.mo93188g(r13)
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsExecuteButtonContainer r6 = r12.f285731c
            boolean r7 = r12.f285734f
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r8 = r12.f285733e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r9 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r9 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r9
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r10 = r9.f235985a
            boolean r10 = r10.mo81118g()
            if (r10 != 0) goto L_0x0160
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r9 = r9.f235985a
            boolean r9 = r9.mo81121i()
            if (r9 == 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r9 = 0
            goto L_0x0161
        L_0x0160:
            r9 = 1
        L_0x0161:
            android.widget.ProgressBar r10 = r6.f285725c
            if (r5 == r9) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r0 = 0
        L_0x0167:
            r10.setVisibility(r0)
            if (r9 != 0) goto L_0x016e
            r6.f285726d = r4
        L_0x016e:
            java.lang.String r0 = r8.mo88017L()
            if (r13 != r3) goto L_0x017d
            android.widget.ImageView r14 = r6.f285723a
            r0 = 2131232623(0x7f08076f, float:1.808136E38)
            r14.setImageResource(r0)
            goto L_0x01ad
        L_0x017d:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x019a
            com.google.android.apps.gsa.shared.y.au r14 = r8.mo82040ap()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.common.util.concurrent.cx r0 = r14.mo85417d(r0)
            com.google.android.apps.gsa.staticplugins.immersiveactions.p r10 = new com.google.android.apps.gsa.staticplugins.immersiveactions.p
            r10.<init>(r6)
            java.lang.String r11 = "IAEBContainer.ImageCallback"
            r14.mo85428r(r0, r11, r10)
            goto L_0x01ad
        L_0x019a:
            int r0 = r8.mo88044am()
            android.content.Context r10 = r6.getContext()
            android.graphics.drawable.Drawable r14 = r14.mo82073c(r0, r10)
            if (r14 == 0) goto L_0x01ad
            android.widget.ImageView r0 = r6.f285723a
            r0.setImageDrawable(r14)
        L_0x01ad:
            if (r13 != r5) goto L_0x01b9
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r14 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r14 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r14
            boolean r14 = r14.mo81133M()
            if (r14 != 0) goto L_0x01bb
        L_0x01b9:
            if (r13 != r3) goto L_0x01ea
        L_0x01bb:
            android.widget.ImageView r14 = r6.f285723a
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.setAlpha(r0)
            r6.mo93185a()
            android.widget.ImageView r14 = r6.f285723a
            r14.setFocusable(r5)
            if (r7 == 0) goto L_0x01e7
            boolean r14 = r6.f285728f
            if (r14 == 0) goto L_0x01d2
            if (r9 == 0) goto L_0x01e7
        L_0x01d2:
            if (r9 == 0) goto L_0x01e0
            boolean r14 = r6.f285726d
            if (r14 != 0) goto L_0x01e7
            r6.f285726d = r5
            android.widget.ProgressBar r14 = r6.f285725c
            com.google.android.apps.gsa.staticplugins.immersiveactions.C102416f.m169817c(r14)
            goto L_0x01e7
        L_0x01e0:
            android.widget.ImageView r14 = r6.f285723a
            android.widget.ImageView r0 = r6.f285724b
            com.google.android.apps.gsa.staticplugins.immersiveactions.C102416f.m169818d(r14, r0)
        L_0x01e7:
            r6.f285728f = r5
            goto L_0x0207
        L_0x01ea:
            android.widget.ImageView r14 = r6.f285724b
            r14.setVisibility(r2)
            android.widget.ImageView r14 = r6.f285723a
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r14.setColorFilter(r0, r7)
            android.widget.ImageView r14 = r6.f285723a
            r0 = 1041865114(0x3e19999a, float:0.15)
            r14.setAlpha(r0)
            android.widget.ImageView r14 = r6.f285723a
            r14.setFocusable(r4)
            r6.f285728f = r4
        L_0x0207:
            if (r13 != r3) goto L_0x021b
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r14 = r12.f285733e
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r14 = r14.mo88011F(r0)
            r0 = 2132088411(0x7f15165b, float:1.9817105E38)
            java.lang.String r14 = r14.getString(r0)
            goto L_0x0221
        L_0x021b:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r14 = r12.f285733e
            java.lang.String r14 = r14.mo88021P()
        L_0x0221:
            android.widget.TextView r0 = r12.f285742n
            r0.setText(r14)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r14 = r12.f285733e
            boolean r14 = r14.mo88038ag()
            if (r14 == 0) goto L_0x0249
            if (r13 == r5) goto L_0x0234
            if (r13 != r3) goto L_0x0249
            r13 = 9
        L_0x0234:
            com.google.android.apps.gsa.staticplugins.immersiveactions.x r14 = new com.google.android.apps.gsa.staticplugins.immersiveactions.x
            r14.<init>(r12)
            android.widget.TextView r0 = r12.f285742n
            r0.setOnClickListener(r14)
            android.view.View r0 = r12.f285730b
            r0.setOnClickListener(r14)
            android.widget.ImageView r0 = r12.f285738j
            r0.setOnClickListener(r14)
            goto L_0x0253
        L_0x0249:
            android.widget.TextView r14 = r12.f285742n
            r14.setOnClickListener(r1)
            android.widget.TextView r14 = r12.f285742n
            r14.setClickable(r4)
        L_0x0253:
            boolean r14 = r12.f285744p
            if (r14 == 0) goto L_0x0262
            android.view.View r14 = r12.f285730b
            r14.setVisibility(r2)
            android.view.View r14 = r12.f285730b
            r14.setOnClickListener(r1)
            goto L_0x0267
        L_0x0262:
            android.view.View r14 = r12.f285730b
            r14.setVisibility(r4)
        L_0x0267:
            boolean r14 = r12.f285734f
            if (r14 != 0) goto L_0x027d
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r14 = r12.f285733e
            boolean r14 = r14.mo88038ag()
            if (r14 == 0) goto L_0x027d
            if (r13 == r5) goto L_0x0277
            if (r13 != r3) goto L_0x027d
        L_0x0277:
            android.widget.ImageView r13 = r12.f285738j
            r13.setVisibility(r4)
            return
        L_0x027d:
            android.widget.ImageView r13 = r12.f285738j
            r13.setVisibility(r2)
            android.widget.ImageView r13 = r12.f285738j
            r13.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsHeader.mo87842e(int, com.google.android.apps.gsa.search.shared.ui.actions.e):void");
    }

    /* renamed from: f */
    public final void mo93187f(boolean z) {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(133);
        animatorSet.setInterpolator(C102396ac.f285790c);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(267);
        animatorSet2.setStartDelay(133);
        animatorSet2.setInterpolator(C102396ac.f285789b);
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) getLayoutParams().height, (float) this.f285745q});
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285732d, View.ALPHA, new float[]{1.0f, 0.0f})});
            animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285729a, View.ALPHA, new float[]{0.0f, 1.0f})});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) getLayoutParams().height, (float) this.f285735g});
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285729a, View.ALPHA, new float[]{1.0f, 0.0f})});
            animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285732d, View.ALPHA, new float[]{0.0f, 1.0f})});
        }
        valueAnimator.addUpdateListener(new C102429s(this));
        valueAnimator.setInterpolator(C102396ac.f285788a);
        valueAnimator.setDuration(400);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{valueAnimator, animatorSet, animatorSet2});
        valueAnimator.addListener(new C102430t(this, z));
        animatorSet3.start();
    }

    /* renamed from: g */
    public final void mo93188g(int i) {
        if (!this.f285736h) {
            if (m169730k(i)) {
                if (i == 2) {
                    if (((ModularAction) this.f285733e.f239226b).mo81222ab().size() != 1 || !(((ModularAction) this.f285733e.f239226b).mo81222ab().get(0) instanceof EntityArgument)) {
                        i = 2;
                    }
                }
                this.f285729a.setVisibility(0);
                this.f285732d.setVisibility(8);
                if (i == 2) {
                    this.f285729a.setOnClickListener(new C102431u(this));
                    return;
                } else if (i == 7) {
                    this.f285729a.setOnClickListener(new C102432v(this));
                    return;
                } else if (m169729j(i)) {
                    this.f285729a.setOnClickListener(new C102452w(this));
                    return;
                } else {
                    return;
                }
            }
            this.f285729a.setVisibility(8);
            this.f285732d.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo93189h(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.immersive_actions_cancel_button_top_margin) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_control_icon_size) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_provider_icon_size);
        int i2 = this.f285735g;
        int i3 = this.f285745q;
        if (i < i2 - i3) {
            i3 = i2 - i;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        setLayoutParams(layoutParams);
        int i4 = layoutParams.height;
        int i5 = this.f285745q;
        float f = ((float) (i4 - i5)) / ((float) (this.f285735g - i5));
        if (!this.f285736h) {
            this.f285730b.setAlpha(f * f);
        }
        if (layoutParams.height > dimensionPixelSize) {
            if (this.f285744p) {
                this.f285744p = false;
                this.f285730b.setVisibility(0);
            }
        } else if (!this.f285744p) {
            this.f285744p = true;
            this.f285730b.setVisibility(8);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_provider_icon_size);
        int dimensionPixelSize3 = ((getResources().getDimensionPixelSize(R.dimen.immersive_actions_cancel_button_top_margin) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_control_icon_size)) + dimensionPixelSize2) - this.f285745q;
        int i6 = getLayoutParams().height;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_header_title_bottom_margin);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_header_arrow_bottom_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f285743o.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f285742n.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f285738j.getLayoutParams();
        if (this.f285744p) {
            int height = (dimensionPixelSize2 - this.f285742n.getHeight()) / 2;
            marginLayoutParams.bottomMargin = dimensionPixelSize4 + (((i6 - this.f285745q) * height) / dimensionPixelSize3);
            marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.immersive_actions_collapsing_header_text_left_margin);
            int i7 = height - dimensionPixelSize5;
            int i8 = this.f285745q;
            if (i6 < i8 + i7) {
                marginLayoutParams3.bottomMargin = i8 - i6;
            } else {
                marginLayoutParams3.bottomMargin = -i7;
            }
        } else {
            marginLayoutParams.bottomMargin = dimensionPixelSize4;
            marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.immersive_actions_header_text_left_margin);
            marginLayoutParams3.bottomMargin = dimensionPixelSize5;
        }
        this.f285743o.setLayoutParams(marginLayoutParams);
        this.f285742n.setLayoutParams(marginLayoutParams2);
        this.f285738j.setLayoutParams(marginLayoutParams3);
    }

    /* renamed from: i */
    public final boolean mo93190i() {
        return ((ModularAction) this.f285733e.f239226b).f235985a.mo81122j() || ((ModularAction) this.f285733e.f239226b).mo81229ai();
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        return null;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ImmersiveActionsExecuteButtonContainer immersiveActionsExecuteButtonContainer = (ImmersiveActionsExecuteButtonContainer) findViewById(R.id.execute_button_container);
        immersiveActionsExecuteButtonContainer.getClass();
        this.f285731c = immersiveActionsExecuteButtonContainer;
        ImageView imageView = (ImageView) findViewById(R.id.immersive_actions_cancel_icon);
        imageView.getClass();
        this.f285739k = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.immersive_actions_back_button);
        imageView2.getClass();
        this.f285729a = imageView2;
        View findViewById = findViewById(R.id.immersive_actions_provider_icon_container);
        findViewById.getClass();
        this.f285730b = findViewById;
        WebImageView webImageView = (WebImageView) findViewById(R.id.immersive_actions_provider_icon);
        webImageView.getClass();
        this.f285740l = webImageView;
        View findViewById2 = findViewById(R.id.unknown_provider_text);
        findViewById2.getClass();
        this.f285741m = findViewById2;
        TextView textView = (TextView) findViewById(R.id.immersive_actions_user_intent_text);
        textView.getClass();
        this.f285742n = textView;
        ImageView imageView3 = (ImageView) findViewById(R.id.arrow);
        imageView3.getClass();
        this.f285738j = imageView3;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.immersive_actions_header_title);
        linearLayout.getClass();
        this.f285743o = linearLayout;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.immersive_actions_control_buttons);
        relativeLayout.getClass();
        this.f285732d = relativeLayout;
        ImageView imageView4 = (ImageView) findViewById(R.id.immersive_actions_execute_icon);
        imageView4.getClass();
        imageView4.setOnClickListener(new C102427q(this));
        this.f285739k.setOnClickListener(new C102428r(this));
        C89941l.m146512c(this, 21988);
        C89941l.m146512c(imageView4, 21991);
        C89941l.m146512c(this.f285739k, 21990);
        C89941l.m146512c(this.f285729a, 21996);
        C89941l.m146512c(this.f285740l, 21995);
        C89941l.m146512c(this.f285742n, 21989);
    }

    public ImmersiveActionsHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImmersiveActionsHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285744p = false;
        this.f285734f = false;
        this.f285736h = false;
        this.f285737i = 0;
        this.f285745q = getResources().getDimensionPixelSize(R.dimen.immersive_actions_collapsing_header_height);
        this.f285735g = getResources().getDimensionPixelSize(R.dimen.gsa_immersive_actions_header_height);
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (i2 == 1 || i2 == 9) {
            if (i == 2) {
                mo93187f(false);
            } else if (i2 == i) {
            } else {
                if (i == 4) {
                    mo93187f(false);
                } else {
                    mo93189h(0);
                }
            }
        } else if (i != 1 && i != 9) {
            mo93189h(this.f285735g - this.f285745q);
        } else if (i2 == 2 || m169729j(i2)) {
            mo93187f(true);
        } else {
            mo93189h(this.f285735g - this.f285745q);
        }
    }
}
