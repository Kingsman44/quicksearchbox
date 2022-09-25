package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ModularActionCardUnlabeledFooter extends RelativeLayout implements C93584ch, C93576c {

    /* renamed from: a */
    public TintableImageButton f261082a;

    /* renamed from: b */
    public ProgressBar f261083b;

    /* renamed from: c */
    public C93602cz f261084c;

    /* renamed from: d */
    ObjectAnimator f261085d;

    /* renamed from: e */
    boolean f261086e = false;

    /* renamed from: f */
    private TintableImageButton f261087f;

    /* renamed from: g */
    private View f261088g;

    /* renamed from: h */
    private View f261089h;

    /* renamed from: i */
    private View f261090i;

    /* renamed from: j */
    private ProgressBar f261091j;

    /* renamed from: k */
    private TextView f261092k;

    /* renamed from: l */
    private boolean f261093l = true;

    /* renamed from: m */
    private boolean f261094m;

    public ModularActionCardUnlabeledFooter(Context context) {
        super(context);
    }

    /* renamed from: i */
    private static boolean m154142i(int i) {
        return i == 1 || i == 6;
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (m154142i(i2) && getVisibility() == 8) {
            setVisibility(4);
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261084c = czVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0.f239225a.mo82080G() == false) goto L_0x001e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87842e(int r11, com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e r12) {
        /*
            r10 = this;
            android.animation.ObjectAnimator r0 = r10.f261085d
            r1 = 1
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0021
            boolean r0 = m154142i(r11)
            if (r0 == 0) goto L_0x001e
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r10.f261084c
            r0.getClass()
            com.google.android.apps.gsa.search.shared.ui.actions.f r0 = r0.f239225a
            boolean r0 = r0.mo82080G()
            if (r0 != 0) goto L_0x0021
        L_0x001e:
            r10.mo87902g(r1)
        L_0x0021:
            boolean r0 = m154142i(r11)
            r2 = 8
            if (r0 == 0) goto L_0x01ea
            android.widget.ProgressBar r0 = r10.f261083b
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r10.f261084c
            r4.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r4 = r4.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r4 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r4
            boolean r4 = r4.mo81133M()
            if (r4 == 0) goto L_0x0048
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r10.mo87903h()
            android.content.Context r7 = r10.getContext()
            android.graphics.drawable.Drawable r7 = r12.mo82073c(r1, r7)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r8 = r10.f261082a
            r8.setImageDrawable(r7)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r7 = r10.f261084c
            r7.getClass()
            java.lang.String r7 = r7.mo88017L()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0085
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r10.f261084c
            r12.getClass()
            com.google.android.apps.gsa.shared.y.au r12 = r12.mo82040ap()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.google.common.util.concurrent.cx r7 = r12.mo85417d(r7)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cv r8 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.cv
            r8.<init>(r10, r4, r6, r0)
            java.lang.String r9 = "MACUFooter.ImageCallback"
            r12.mo85428r(r7, r9, r8)
            goto L_0x009d
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r7 = r10.f261084c
            r7.getClass()
            int r7 = r7.mo88044am()
            android.content.Context r8 = r10.getContext()
            android.graphics.drawable.Drawable r12 = r12.mo82073c(r7, r8)
            if (r12 == 0) goto L_0x009d
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r7 = r10.f261082a
            r7.setImageDrawable(r12)
        L_0x009d:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r12 = r10.f261082a
            int r7 = r10.mo87901f(r0, r4)
            r12.mo87918a(r7)
            android.view.View r12 = r10.f261090i
            r7 = 4
            if (r5 != 0) goto L_0x00b2
            boolean r5 = r10.f261094m
            if (r5 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r5 = 4
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            r12.setVisibility(r5)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r10.f261084c
            r12.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r12 = r12.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r12 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r12
            com.google.bb.a.nl r12 = r12.mo81219Z()
            com.google.protobuf.cq r5 = r12.f145692b
            int r5 = r5.size()
            r8 = 0
            if (r5 <= 0) goto L_0x00fc
            com.google.protobuf.cq r5 = r12.f145692b
            java.lang.Object r5 = r5.get(r3)
            com.google.bb.a.la r5 = (com.google.p4152bb.p4153a.C55240la) r5
            int r5 = r5.f145451a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x00fc
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = r10.f261084c
            r5.getClass()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r5 = r5.f261317d
            com.google.protobuf.cq r12 = r12.f145692b
            java.lang.Object r12 = r12.get(r3)
            com.google.bb.a.la r12 = (com.google.p4152bb.p4153a.C55240la) r12
            com.google.bb.a.he r12 = r12.f145453c
            if (r12 != 0) goto L_0x00ef
            com.google.bb.a.he r12 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x00ef:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r8 = r10.f261084c
            r8.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r8 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.l r8 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l) r8
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r8 = r5.mo81378a(r12, r8, r1)
        L_0x00fc:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r12 = r10.f261082a
            if (r8 == 0) goto L_0x010b
            boolean r5 = r8.mo81247f()
            if (r5 == 0) goto L_0x010b
            java.lang.String r5 = r8.mo81245d()
            goto L_0x0116
        L_0x010b:
            android.content.res.Resources r5 = r10.getResources()
            r8 = 2132082801(0x7f150071, float:1.9805726E38)
            java.lang.String r5 = r5.getString(r8)
        L_0x0116:
            r12.setContentDescription(r5)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r10.f261084c
            r12.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r12 = r12.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r12 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r12
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r12 = r12.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r12 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r12
            com.google.bb.a.la r12 = r12.f236115a
            if (r12 == 0) goto L_0x0131
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r5 = r10.f261082a
            int r12 = r12.f145457g
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r5, r12)
        L_0x0131:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r10.f261084c
            java.lang.String r12 = r12.mo88020O()
            r5 = 6
            if (r11 == r5) goto L_0x014b
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 != 0) goto L_0x014b
            android.widget.TextView r11 = r10.f261092k
            r11.setText(r12)
            android.widget.TextView r11 = r10.f261092k
            r11.setVisibility(r3)
            goto L_0x0150
        L_0x014b:
            android.widget.TextView r11 = r10.f261092k
            r11.setVisibility(r2)
        L_0x0150:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261087f
            android.content.res.Resources r12 = r10.getResources()
            r2 = 2131232463(0x7f0806cf, float:1.8081036E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r2)
            r11.setImageDrawable(r12)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261087f
            android.content.res.Resources r12 = r10.getResources()
            r2 = 2131099718(0x7f060046, float:1.7811797E38)
            if (r0 == 0) goto L_0x0172
            boolean r5 = r10.f261093l
            if (r5 == 0) goto L_0x0172
            r2 = 2131099719(0x7f060047, float:1.78118E38)
        L_0x0172:
            int r12 = r12.getColor(r2)
            r11.mo87918a(r12)
            android.view.View r11 = r10.f261088g
            if (r0 == 0) goto L_0x0183
            boolean r12 = r10.f261093l
            if (r12 == 0) goto L_0x0183
            r12 = 0
            goto L_0x0184
        L_0x0183:
            r12 = 4
        L_0x0184:
            r11.setVisibility(r12)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261087f
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r10.f261084c
            r12.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r12 = r12.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r12 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r12
            com.google.bb.a.lc r12 = r12.f236109o
            if (r12 == 0) goto L_0x0198
            r12 = 4
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            r11.setVisibility(r12)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261087f
            if (r1 == r0) goto L_0x01a3
            r12 = 8345(0x2099, float:1.1694E-41)
            goto L_0x01a5
        L_0x01a3:
            r12 = 8352(0x20a0, float:1.1704E-41)
        L_0x01a5:
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r11, r12)
            r10.setVisibility(r3)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r11 = r10.f261084c
            r11.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r11 = r11.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r11 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r11
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r11 = r11.f235985a
            boolean r11 = r11.mo81118g()
            if (r11 != 0) goto L_0x01d4
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r11 = r10.f261084c
            r11.getClass()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r11 = r11.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r11 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r11
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r11 = r11.f235985a
            boolean r11 = r11.mo81121i()
            if (r11 == 0) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            android.widget.ProgressBar r11 = r10.f261091j
            r11.setVisibility(r7)
            goto L_0x01d9
        L_0x01d4:
            android.widget.ProgressBar r11 = r10.f261091j
            r11.setVisibility(r3)
        L_0x01d9:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261087f
            r11.setEnabled(r6)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.TintableImageButton r11 = r10.f261082a
            if (r4 == 0) goto L_0x01e5
            if (r6 == 0) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            r11.setEnabled(r1)
            return
        L_0x01ea:
            r10.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.ModularActionCardUnlabeledFooter.mo87842e(int, com.google.android.apps.gsa.search.shared.ui.actions.e):void");
    }

    /* renamed from: f */
    public final int mo87901f(boolean z, boolean z2) {
        return getResources().getColor(!z2 ? R.color.action_card_continue_disabled : (!z || this.f261094m) ? R.color.action_card_continue_highlighted : R.color.action_card_continue_enabled);
    }

    /* renamed from: g */
    public final void mo87902g(boolean z) {
        if (!this.f261086e) {
            ObjectAnimator objectAnimator = this.f261085d;
            int i = 0;
            boolean z2 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f261085d;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f261085d.removeAllListeners();
            }
            if (!z2 || this.f261083b.getVisibility() != 0) {
                this.f261083b.setProgress(0);
                this.f261083b.setVisibility(4);
                return;
            }
            ProgressBar progressBar = this.f261083b;
            int[] iArr = new int[2];
            iArr[0] = progressBar.getProgress();
            if (!z) {
                i = this.f261083b.getMax();
            }
            iArr[1] = i;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", iArr);
            this.f261085d = ofInt;
            ofInt.setDuration(400);
            if (z) {
                this.f261086e = true;
                this.f261085d.addListener(new C93599cw(this));
            }
            this.f261085d.start();
        }
    }

    /* renamed from: h */
    public final boolean mo87903h() {
        C93602cz czVar = this.f261084c;
        czVar.getClass();
        return ((ModularAction) czVar.f239226b).f235985a.mo81122j() || ((ModularAction) czVar.f239226b).mo81229ai();
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        C93612di diVar = new C93612di(0.09f);
        diVar.addTarget(this.f261088g);
        diVar.setInterpolator(C91107f.f254407c);
        transitionSet.addTransition(diVar);
        C93612di diVar2 = new C93612di(0.09f);
        diVar2.addTarget(this.f261090i);
        diVar2.setInterpolator(new OvershootInterpolator());
        transitionSet.addTransition(diVar2);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget(this);
        C93535am amVar = new C93535am();
        amVar.addTarget(this.f261082a);
        amVar.addTarget(this.f261087f);
        Object[] objArr = {this};
        transitionSet.addTransition(C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr));
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(amVar);
        if (i2 != 1 ? i2 != 4 : i != 2) {
            transitionSet.addTransition(C93632eb.m154488c(1, getResources().getDisplayMetrics(), this));
        }
        return new Pair(transitionSet, (Object) null);
    }

    /* renamed from: ik */
    public final void mo87904ik(boolean z, boolean z2) {
        if (this.f261083b.getVisibility() == 0) {
            this.f261093l = !z;
            this.f261094m = z2;
            C93602cz czVar = this.f261084c;
            czVar.getClass();
            czVar.mo82057t();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TintableImageButton tintableImageButton = (TintableImageButton) findViewById(R.id.cancel_button);
        tintableImageButton.getClass();
        this.f261087f = tintableImageButton;
        View findViewById = findViewById(R.id.cancel_button_highlight);
        findViewById.getClass();
        this.f261088g = findViewById;
        View findViewById2 = findViewById(R.id.cancel_button_container);
        findViewById2.getClass();
        this.f261089h = findViewById2;
        TintableImageButton tintableImageButton2 = (TintableImageButton) findViewById(R.id.execute_button);
        tintableImageButton2.getClass();
        this.f261082a = tintableImageButton2;
        View findViewById3 = findViewById(R.id.execute_button_highlight);
        findViewById3.getClass();
        this.f261090i = findViewById3;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.execute_button_spinner);
        progressBar.getClass();
        this.f261091j = progressBar;
        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.action_confirm_countdown_bar);
        progressBar2.getClass();
        this.f261083b = progressBar2;
        progressBar2.setProgressDrawable(new C93603d(getResources(), this));
        TextView textView = (TextView) findViewById(R.id.small_print);
        textView.getClass();
        this.f261092k = textView;
        this.f261087f.setOnClickListener(new C93596ct(this));
        this.f261089h.bringToFront();
        this.f261082a.setOnClickListener(new C93597cu(this));
    }

    public ModularActionCardUnlabeledFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModularActionCardUnlabeledFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
