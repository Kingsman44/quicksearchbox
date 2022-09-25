package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

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
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102396ac;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ValyrianImmersiveActionsHeader extends RelativeLayout implements C93584ch {

    /* renamed from: a */
    public ImageView f285869a;

    /* renamed from: b */
    public View f285870b;

    /* renamed from: c */
    public RelativeLayout f285871c;

    /* renamed from: d */
    public C93602cz f285872d;

    /* renamed from: e */
    public final int f285873e;

    /* renamed from: f */
    public boolean f285874f;

    /* renamed from: g */
    private ImageView f285875g;

    /* renamed from: h */
    private ImageView f285876h;

    /* renamed from: i */
    private ValyrianImmersiveActionsExecuteButtonContainer f285877i;

    /* renamed from: j */
    private WebImageView f285878j;

    /* renamed from: k */
    private View f285879k;

    /* renamed from: l */
    private TextView f285880l;

    /* renamed from: m */
    private LinearLayout f285881m;

    /* renamed from: n */
    private boolean f285882n;

    /* renamed from: o */
    private final int f285883o;

    public ValyrianImmersiveActionsHeader(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private final boolean m169859i(int i) {
        return i == 4 && !this.f285872d.mo82036A();
    }

    /* renamed from: j */
    private final boolean m169860j(int i) {
        if (i == 2 || m169859i(i)) {
            return true;
        }
        return i == 7 && !this.f285872d.mo82039ao().mo81425i();
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f285872d = czVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87842e(int r9, com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 8
            r2 = 9
            r3 = 0
            r4 = 1
            if (r9 == r4) goto L_0x0017
            if (r9 == r2) goto L_0x0017
            boolean r5 = r8.m169860j(r9)
            if (r5 == 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r8.setVisibility(r1)
            goto L_0x013e
        L_0x0017:
            r8.setVisibility(r3)
            if (r9 != r2) goto L_0x001e
            r5 = r0
            goto L_0x0024
        L_0x001e:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = r8.f285872d
            com.google.bb.a.pn r5 = r5.mo88014I()
        L_0x0024:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r6 = r8.f285872d
            android.content.Context r7 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r6.mo88012G(r7, r10, r5)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r6 = r8.f285872d
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r6.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r6 = r6.f236102h
            java.util.List r6 = r6.mo81322d()
            if (r5 == 0) goto L_0x006e
            if (r10 != 0) goto L_0x0046
            java.lang.String r7 = r5.f145871d
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x006e
        L_0x0046:
            if (r10 == 0) goto L_0x004e
            com.google.android.apps.gsa.now.shared.ui.WebImageView r6 = r8.f285878j
            r6.setImageDrawable(r10)
            goto L_0x005b
        L_0x004e:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            java.lang.String r6 = r5.f145871d
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r7 = r8.f285872d
            com.google.android.apps.gsa.shared.y.au r7 = r7.mo82040ap()
            r10.mo76738i(r6, r7)
        L_0x005b:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            java.lang.String r6 = r5.f145869b
            r10.setContentDescription(r6)
            android.view.View r10 = r8.f285870b
            r10.setVisibility(r3)
            android.view.View r10 = r8.f285879k
            r10.setVisibility(r1)
            goto L_0x00e6
        L_0x006e:
            if (r6 == 0) goto L_0x009e
            int r10 = r6.size()
            if (r10 <= r4) goto L_0x009e
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            r10.setVisibility(r3)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            r6 = 2131233105(0x7f080951, float:1.8082338E38)
            r10.setImageResource(r6)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2132088417(0x7f151661, float:1.9817117E38)
            java.lang.String r6 = r6.getString(r7)
            r10.setContentDescription(r6)
            android.view.View r10 = r8.f285879k
            r10.setVisibility(r3)
            android.view.View r10 = r8.f285870b
            r10.setVisibility(r3)
            goto L_0x00e6
        L_0x009e:
            r10 = 4
            if (r9 != r2) goto L_0x00e1
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131234804(0x7f080ff4, float:1.8085784E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            if (r6 == 0) goto L_0x00db
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r7 = 2131102393(0x7f060ab9, float:1.7817223E38)
            int r10 = r10.getColor(r7)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r6.setColorFilter(r10, r7)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            r10.setImageDrawable(r6)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            r10.setVisibility(r3)
            android.view.View r10 = r8.f285870b
            r10.setVisibility(r3)
            android.view.View r10 = r8.f285879k
            r10.setVisibility(r1)
            goto L_0x00e6
        L_0x00db:
            android.view.View r6 = r8.f285870b
            r6.setVisibility(r10)
            goto L_0x00e6
        L_0x00e1:
            android.view.View r6 = r8.f285870b
            r6.setVisibility(r10)
        L_0x00e6:
            if (r5 == 0) goto L_0x011c
            int r10 = r5.f145872e
            int r10 = com.google.p4152bb.p4153a.C55419v.m87685a(r10)
            if (r10 != 0) goto L_0x00f1
            goto L_0x011c
        L_0x00f1:
            r5 = 13
            if (r10 != r5) goto L_0x011c
            android.content.res.Resources r10 = r8.getResources()
            r5 = 2131169146(0x7f070f7a, float:1.7952614E38)
            int r10 = r10.getDimensionPixelSize(r5)
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2131169147(0x7f070f7b, float:1.7952616E38)
            int r5 = r5.getDimensionPixelSize(r6)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131169145(0x7f070f79, float:1.7952612E38)
            int r6 = r6.getDimensionPixelSize(r7)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r7 = r8.f285878j
            r7.setPadding(r10, r5, r10, r6)
            goto L_0x013e
        L_0x011c:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r10 = r8.f285872d
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r10 = r10.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r10 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r10
            com.google.bb.a.x r10 = r10.f236107m
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.ADD_REMINDER
            if (r10 != r5) goto L_0x0139
            android.content.res.Resources r10 = r8.getResources()
            r5 = 2131169144(0x7f070f78, float:1.795261E38)
            int r10 = r10.getDimensionPixelSize(r5)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r5 = r8.f285878j
            r5.setPadding(r10, r10, r10, r10)
            goto L_0x013e
        L_0x0139:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r10 = r8.f285878j
            r10.setPadding(r3, r3, r3, r3)
        L_0x013e:
            r8.mo93235g(r9)
            com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.ValyrianImmersiveActionsExecuteButtonContainer r10 = r8.f285877i
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = r8.f285872d
            r10.mo93232a(r9, r5)
            if (r9 != r2) goto L_0x015c
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r10 = r8.f285872d
            android.content.Context r5 = r8.getContext()
            android.content.res.Resources r10 = r10.mo88011F(r5)
            r5 = 2132088411(0x7f15165b, float:1.9817105E38)
            java.lang.String r10 = r10.getString(r5)
            goto L_0x0162
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r10 = r8.f285872d
            java.lang.String r10 = r10.mo88021P()
        L_0x0162:
            android.widget.TextView r5 = r8.f285880l
            r5.setText(r10)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r10 = r8.f285872d
            boolean r10 = r10.mo88038ag()
            if (r10 == 0) goto L_0x018a
            if (r9 == r4) goto L_0x0175
            if (r9 != r2) goto L_0x018a
            r9 = 9
        L_0x0175:
            com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.f r10 = new com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.f
            r10.<init>(r8)
            android.widget.TextView r5 = r8.f285880l
            r5.setOnClickListener(r10)
            android.view.View r5 = r8.f285870b
            r5.setOnClickListener(r10)
            android.widget.ImageView r5 = r8.f285875g
            r5.setOnClickListener(r10)
            goto L_0x0194
        L_0x018a:
            android.widget.TextView r10 = r8.f285880l
            r10.setOnClickListener(r0)
            android.widget.TextView r10 = r8.f285880l
            r10.setClickable(r3)
        L_0x0194:
            boolean r10 = r8.f285882n
            if (r10 == 0) goto L_0x01a3
            android.view.View r10 = r8.f285870b
            r10.setVisibility(r1)
            android.view.View r10 = r8.f285870b
            r10.setOnClickListener(r0)
            goto L_0x01a8
        L_0x01a3:
            android.view.View r10 = r8.f285870b
            r10.setVisibility(r3)
        L_0x01a8:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r10 = r8.f285872d
            boolean r10 = r10.mo88038ag()
            if (r10 == 0) goto L_0x01ba
            if (r9 == r4) goto L_0x01b4
            if (r9 != r2) goto L_0x01ba
        L_0x01b4:
            android.widget.ImageView r9 = r8.f285875g
            r9.setVisibility(r3)
            return
        L_0x01ba:
            android.widget.ImageView r9 = r8.f285875g
            r9.setVisibility(r1)
            android.widget.ImageView r9 = r8.f285875g
            r9.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.ValyrianImmersiveActionsHeader.mo87842e(int, com.google.android.apps.gsa.search.shared.ui.actions.e):void");
    }

    /* renamed from: f */
    public final void mo93234f(boolean z) {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(133);
        animatorSet.setInterpolator(C102396ac.f285790c);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(267);
        animatorSet2.setStartDelay(133);
        animatorSet2.setInterpolator(C102396ac.f285789b);
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) getLayoutParams().height, (float) this.f285883o});
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285871c, View.ALPHA, new float[]{1.0f, 0.0f})});
            animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285869a, View.ALPHA, new float[]{0.0f, 1.0f})});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) getLayoutParams().height, (float) this.f285873e});
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285869a, View.ALPHA, new float[]{1.0f, 0.0f})});
            animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f285871c, View.ALPHA, new float[]{0.0f, 1.0f})});
        }
        valueAnimator.addUpdateListener(new C102433a(this));
        valueAnimator.setInterpolator(C102396ac.f285788a);
        valueAnimator.setDuration(400);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{valueAnimator, animatorSet, animatorSet2});
        valueAnimator.addListener(new C102434b(this, z));
        animatorSet3.start();
    }

    /* renamed from: g */
    public final void mo93235g(int i) {
        if (!this.f285874f) {
            if (m169860j(i)) {
                if (i == 2) {
                    if (((ModularAction) this.f285872d.f239226b).mo81222ab().size() != 1 || !(((ModularAction) this.f285872d.f239226b).mo81222ab().get(0) instanceof EntityArgument)) {
                        i = 2;
                    }
                }
                this.f285869a.setVisibility(0);
                this.f285871c.setVisibility(8);
                if (i == 2) {
                    this.f285869a.setOnClickListener(new C102435c(this));
                    return;
                } else if (i == 7) {
                    this.f285869a.setOnClickListener(new C102436d(this));
                    return;
                } else if (m169859i(i)) {
                    this.f285869a.setOnClickListener(new C102437e(this));
                    return;
                } else {
                    return;
                }
            }
            this.f285869a.setVisibility(8);
            this.f285871c.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo93236h(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.immersive_actions_cancel_button_top_margin) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_control_icon_size) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_provider_icon_size);
        int i2 = this.f285873e;
        int i3 = this.f285883o;
        if (i < i2 - i3) {
            i3 = i2 - i;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        setLayoutParams(layoutParams);
        int i4 = layoutParams.height;
        int i5 = this.f285883o;
        float f = ((float) (i4 - i5)) / ((float) (this.f285873e - i5));
        if (!this.f285874f) {
            this.f285870b.setAlpha(f * f);
        }
        if (layoutParams.height > dimensionPixelSize) {
            if (this.f285882n) {
                this.f285882n = false;
                this.f285870b.setVisibility(0);
            }
        } else if (!this.f285882n) {
            this.f285882n = true;
            this.f285870b.setVisibility(8);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_provider_icon_size);
        int dimensionPixelSize3 = ((getResources().getDimensionPixelSize(R.dimen.immersive_actions_cancel_button_top_margin) + getResources().getDimensionPixelSize(R.dimen.immersive_actions_control_icon_size)) + dimensionPixelSize2) - this.f285883o;
        int i6 = getLayoutParams().height;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_header_title_bottom_margin);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_header_arrow_bottom_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f285881m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f285880l.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f285875g.getLayoutParams();
        if (this.f285882n) {
            int height = (dimensionPixelSize2 - this.f285880l.getHeight()) / 2;
            marginLayoutParams.bottomMargin = dimensionPixelSize4 + (((i6 - this.f285883o) * height) / dimensionPixelSize3);
            marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.immersive_actions_collapsing_header_text_left_margin);
            int i7 = height - dimensionPixelSize5;
            int i8 = this.f285883o;
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
        this.f285881m.setLayoutParams(marginLayoutParams);
        this.f285880l.setLayoutParams(marginLayoutParams2);
        this.f285875g.setLayoutParams(marginLayoutParams3);
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        return null;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ValyrianImmersiveActionsExecuteButtonContainer valyrianImmersiveActionsExecuteButtonContainer = (ValyrianImmersiveActionsExecuteButtonContainer) findViewById(R.id.execute_button_container);
        valyrianImmersiveActionsExecuteButtonContainer.getClass();
        this.f285877i = valyrianImmersiveActionsExecuteButtonContainer;
        ImageView imageView = (ImageView) findViewById(R.id.immersive_actions_cancel_icon);
        imageView.getClass();
        this.f285876h = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.immersive_actions_back_button);
        imageView2.getClass();
        this.f285869a = imageView2;
        View findViewById = findViewById(R.id.immersive_actions_provider_icon_container);
        findViewById.getClass();
        this.f285870b = findViewById;
        WebImageView webImageView = (WebImageView) findViewById(R.id.immersive_actions_provider_icon);
        webImageView.getClass();
        this.f285878j = webImageView;
        View findViewById2 = findViewById(R.id.unknown_provider_text);
        findViewById2.getClass();
        this.f285879k = findViewById2;
        TextView textView = (TextView) findViewById(R.id.immersive_actions_user_intent_text);
        textView.getClass();
        this.f285880l = textView;
        ImageView imageView3 = (ImageView) findViewById(R.id.arrow);
        imageView3.getClass();
        this.f285875g = imageView3;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.immersive_actions_header_title);
        linearLayout.getClass();
        this.f285881m = linearLayout;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.immersive_actions_control_buttons);
        relativeLayout.getClass();
        this.f285871c = relativeLayout;
        C89941l.m146512c(this, 21988);
        C89941l.m146512c(this.f285876h, 21990);
        C89941l.m146512c(this.f285869a, 21996);
        C89941l.m146512c(this.f285878j, 21995);
        C89941l.m146512c(this.f285880l, 21989);
    }

    public ValyrianImmersiveActionsHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ValyrianImmersiveActionsHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285882n = false;
        this.f285874f = false;
        this.f285883o = (int) getResources().getDimension(R.dimen.immersive_actions_collapsing_header_height);
        this.f285873e = (int) getResources().getDimension(R.dimen.gsa_immersive_actions_header_height);
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (i2 == 1 || i2 == 9) {
            if (i == 2) {
                mo93234f(false);
            } else if (i2 == i) {
            } else {
                if (i == 4) {
                    mo93234f(false);
                } else {
                    mo93236h(0);
                }
            }
        } else if (i != 1 && i != 9) {
            mo93236h(this.f285873e - this.f285883o);
        } else if (i2 == 2 || m169859i(i2)) {
            mo93234f(true);
        } else {
            mo93236h(this.f285873e - this.f285883o);
        }
    }
}
