package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ExecutedStateView extends LinearLayout implements C93584ch {

    /* renamed from: a */
    public C93602cz f261034a;

    /* renamed from: b */
    private View f261035b;

    /* renamed from: c */
    private TextView f261036c;

    /* renamed from: d */
    private TextView f261037d;

    /* renamed from: e */
    private TextView f261038e;

    /* renamed from: f */
    private TextView f261039f;

    /* renamed from: g */
    private ImageView f261040g;

    public ExecutedStateView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261034a = czVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87842e(int r13, com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e r14) {
        /*
            r12 = this;
            r0 = 6
            r1 = 8
            r2 = 4
            if (r13 != r2) goto L_0x0012
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r13 = r12.f261034a
            boolean r13 = r13.mo82036A()
            if (r13 == 0) goto L_0x0010
            r13 = 4
            goto L_0x0012
        L_0x0010:
            r13 = 4
            goto L_0x0014
        L_0x0012:
            if (r13 != r0) goto L_0x01e4
        L_0x0014:
            r3 = 0
            r12.setVisibility(r3)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r12.f261034a
            r4.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r4.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r5 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r5
            java.lang.String r6 = r4.mo88022Q()
            if (r13 == r0) goto L_0x0028
            goto L_0x0041
        L_0x0028:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r13 = r5.f235985a
            boolean r13 = r13.mo81122j()
            if (r13 != 0) goto L_0x0036
            java.lang.String r6 = r4.mo88021P()
        L_0x0034:
            r13 = 6
            goto L_0x0041
        L_0x0036:
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L_0x0034
            java.lang.String r6 = r4.mo88021P()
            goto L_0x0034
        L_0x0041:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L_0x004e
            android.view.View r0 = r12.f261035b
            r0.setVisibility(r1)
            goto L_0x00d1
        L_0x004e:
            android.view.View r4 = r12.f261035b
            r4.setVisibility(r3)
            if (r13 != r2) goto L_0x005f
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r2 = r12.f261034a
            r2.getClass()
            java.lang.CharSequence r2 = r2.mo88015J()
            goto L_0x006c
        L_0x005f:
            if (r13 != r0) goto L_0x006b
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r2 = r12.f261034a
            r2.getClass()
            java.lang.String r2 = r2.mo88020O()
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0087
            android.widget.TextView r0 = r12.f261038e
            r0.setText(r6)
            android.widget.TextView r0 = r12.f261038e
            r0.setVisibility(r3)
            android.widget.TextView r0 = r12.f261036c
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.f261037d
            r0.setVisibility(r1)
            goto L_0x00bb
        L_0x0087:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r4 = r5.f235985a
            boolean r4 = r4.mo81115e()
            if (r4 != 0) goto L_0x00a7
            if (r13 != r0) goto L_0x0092
            goto L_0x00a7
        L_0x0092:
            android.widget.TextView r0 = r12.f261037d
            r0.setText(r6)
            android.widget.TextView r0 = r12.f261037d
            r0.setVisibility(r3)
            android.widget.TextView r0 = r12.f261038e
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.f261036c
            r0.setVisibility(r1)
            goto L_0x00bb
        L_0x00a7:
            android.widget.TextView r0 = r12.f261036c
            r0.setText(r6)
            android.widget.TextView r0 = r12.f261036c
            r0.setVisibility(r3)
            android.widget.TextView r0 = r12.f261038e
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.f261037d
            r0.setVisibility(r1)
        L_0x00bb:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00c7
            android.widget.TextView r0 = r12.f261039f
            r0.setVisibility(r1)
            goto L_0x00d1
        L_0x00c7:
            android.widget.TextView r0 = r12.f261039f
            r0.setVisibility(r3)
            android.widget.TextView r0 = r12.f261039f
            r0.setText(r2)
        L_0x00d1:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r12.f261034a
            r0.getClass()
            com.google.bb.a.pn r0 = r0.mo88014I()
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r5.f235985a
            com.google.bb.a.nl r4 = r5.mo81219Z()
            com.google.bb.a.le r2 = r2.mo81111a(r4)
            r4 = 1
            if (r2 == 0) goto L_0x014b
            int r6 = r2.f145468a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x014b
            int r0 = r2.f145473f
            int r0 = com.google.p4152bb.p4153a.C55419v.m87685a(r0)
            if (r0 != 0) goto L_0x00f6
            r0 = 1
        L_0x00f6:
            r2 = 11
            if (r0 != r2) goto L_0x0139
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r14 = r5.mo81212S()
            if (r14 == 0) goto L_0x0134
            boolean r0 = r14.mo81263C()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r14.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r0 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r0
            boolean r0 = r0.mo81543l()
            if (r0 == 0) goto L_0x0134
            com.google.android.apps.gsa.staticplugins.actionsui.c r0 = new com.google.android.apps.gsa.staticplugins.actionsui.c
            android.content.res.Resources r6 = r12.getResources()
            android.widget.ImageView r7 = r12.f261040g
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.google.android.apps.gsa.search.shared.contact.Person[] r2 = new com.google.android.apps.gsa.search.shared.contact.Person[r4]
            java.lang.Object r14 = r14.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r14 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r14
            android.os.Parcelable r14 = r14.f236364c
            r14.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r14 = (com.google.android.apps.gsa.search.shared.contact.Person) r14
            r2[r3] = r14
            r0.execute(r2)
            r14 = 1
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            r0 = r14
            r14 = 0
            goto L_0x01b9
        L_0x0139:
            android.widget.ImageView r2 = r12.f261040g
            android.content.Context r5 = r12.getContext()
            android.graphics.drawable.Drawable r14 = r14.mo82073c(r0, r5)
            r2.setImageDrawable(r14)
            boolean r14 = com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e.m142916d(r0)
            goto L_0x015c
        L_0x014b:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r5.f235985a
            boolean r2 = r2.mo81115e()
            if (r2 == 0) goto L_0x015e
            android.widget.ImageView r14 = r12.f261040g
            r0 = 2131232499(0x7f0806f3, float:1.8081109E38)
            r14.setImageResource(r0)
        L_0x015b:
            r14 = 0
        L_0x015c:
            r0 = 1
            goto L_0x01b9
        L_0x015e:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r5.f235985a
            boolean r2 = r2.mo81119h()
            if (r2 != 0) goto L_0x0190
            if (r0 != 0) goto L_0x0175
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r2 = r5.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r2
            if (r2 == 0) goto L_0x0175
            boolean r2 = r2.mo81436f()
            if (r2 != 0) goto L_0x0175
            goto L_0x0190
        L_0x0175:
            if (r0 == 0) goto L_0x018d
            android.widget.ImageView r2 = r12.f261040g
            android.content.Context r5 = r12.getContext()
            android.graphics.drawable.Drawable r14 = r14.mo82072a(r0, r5)
            r2.setImageDrawable(r14)
            android.widget.ImageView r14 = r12.f261040g
            java.lang.String r0 = r0.f145869b
            r14.setContentDescription(r0)
            r14 = 1
            goto L_0x015c
        L_0x018d:
            r14 = 0
            r0 = 0
            goto L_0x01b9
        L_0x0190:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r14 = r12.f261034a
            boolean r14 = r14.mo82061x()
            if (r14 == 0) goto L_0x01a9
            android.widget.ImageView r14 = r12.f261040g
            r0 = 2131234832(0x7f081010, float:1.808584E38)
            r14.setImageResource(r0)
            android.widget.ImageView r14 = r12.f261040g
            r0 = 1057635697(0x3f0a3d71, float:0.54)
            r14.setAlpha(r0)
            goto L_0x015b
        L_0x01a9:
            android.widget.ImageView r14 = r12.f261040g
            r0 = 2131232648(0x7f080788, float:1.8081411E38)
            r14.setImageResource(r0)
            android.widget.ImageView r14 = r12.f261040g
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.setAlpha(r0)
            goto L_0x015b
        L_0x01b9:
            android.widget.ImageView r2 = r12.f261040g
            if (r4 == r0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            r2.setVisibility(r1)
            if (r14 == 0) goto L_0x01d3
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1094713344(0x41400000, float:12.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r1, r0)
            int r3 = (int) r0
        L_0x01d3:
            android.widget.ImageView r0 = r12.f261040g
            r0.setPadding(r3, r3, r3, r3)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.bg r0 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.bg
            r0.<init>(r12, r13)
            r12.setOnClickListener(r0)
            r12.setClickable(r14)
            return
        L_0x01e4:
            r12.setVisibility(r1)
            android.widget.ImageView r13 = r12.f261040g
            r13.setVisibility(r1)
            android.widget.TextView r13 = r12.f261036c
            r13.setVisibility(r1)
            android.widget.TextView r13 = r12.f261037d
            r13.setVisibility(r1)
            android.widget.TextView r13 = r12.f261038e
            r13.setVisibility(r1)
            android.widget.TextView r13 = r12.f261039f
            r13.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.ExecutedStateView.mo87842e(int, com.google.android.apps.gsa.search.shared.ui.actions.e):void");
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        C93612di diVar = new C93612di(0.6f);
        diVar.addTarget(this.f261040g);
        diVar.setInterpolator(new OvershootInterpolator());
        diVar.setDuration(250);
        diVar.setStartDelay(250);
        Resources resources = getResources();
        TransitionSet a = C93632eb.m154486a(resources.getColor(R.color.action_card_medium_grey), this.f261036c, this.f261038e, this.f261039f, this.f261040g);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(diVar);
        transitionSet.addTransition(a);
        if (!(i == 3 && i2 == 6)) {
            transitionSet.addTransition(C93632eb.m154488c(1, getResources().getDisplayMetrics(), this.f261036c, this.f261038e, this.f261039f, this.f261040g));
        }
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.text_container);
        findViewById.getClass();
        this.f261035b = findViewById;
        TextView textView = (TextView) findViewById(R.id.large_text);
        textView.getClass();
        this.f261036c = textView;
        TextView textView2 = (TextView) findViewById(R.id.centered_text);
        textView2.getClass();
        this.f261037d = textView2;
        TextView textView3 = (TextView) findViewById(R.id.text);
        textView3.getClass();
        this.f261038e = textView3;
        TextView textView4 = (TextView) findViewById(R.id.secondary_text);
        textView4.getClass();
        this.f261039f = textView4;
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        imageView.getClass();
        this.f261040g = imageView;
        C89941l.m146512c(this, 8594);
        C89941l.m146512c(this.f261040g, 8349);
        C89941l.m146512c(this.f261036c, 8350);
        C89941l.m146512c(this.f261037d, 8350);
        C89941l.m146512c(this.f261038e, 8350);
        C89941l.m146512c(this.f261039f, 8351);
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) getBackground()).setColor(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public ExecutedStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExecutedStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
